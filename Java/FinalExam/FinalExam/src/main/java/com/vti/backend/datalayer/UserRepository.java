
package com.vti.backend.datalayer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.vti.Utils.JdbcUtils;
import com.vti.entity.Role;
import com.vti.entity.User;
import java.io.*;

public class UserRepository implements IUserRepository{
	private JdbcUtils jdbcUtils;
	private Connection connection;
	
	public UserRepository() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		jdbcUtils = new JdbcUtils();
	}


	public List<User> getListUsers(int projectId) throws SQLException, ClassNotFoundException {
		List<User> users = new ArrayList<>(); 
		
		try {
			// get connect
			connection = jdbcUtils.connect();

			// Step 3: Create a statement object
			

			// Step 4: Execute query
			String listUser ="SELECT id, FullName0 ,Email,`Password`,`ROLE`\r\n"
					+ 		"from `user`\r\n"
					+		 "where projectId = ? ";
			PreparedStatement preparedStatement = connection.prepareStatement(listUser);
			preparedStatement.setInt(1, projectId);
					
			ResultSet resultSet = preparedStatement.executeQuery();

			// Step 5: Handling result set
			while (resultSet.next()) {
				int id1 = resultSet.getInt("Id");
				String fullName2 = resultSet.getString("FullName0");
				String email = resultSet.getString("email");
				String password = resultSet.getString("password");
				Role role = Role.valueOf(resultSet.getString("Role"));

				User user = new User(id1, fullName2, email, password, role);
				users.add(user);

			}
			return users;
		} finally {
			// Step 6: Close connection
			connection.close();
		}
	

	}
// get manager
@Override
	public List<User> getManager() throws SQLException, ClassNotFoundException {
		List<User> users = new ArrayList<>(); 
		try {
			// get connect
			connection = jdbcUtils.connect();
			// Step 3: Create a statement object
			// Step 4: Execute query
			String listUser ="select p.projectId,m.FullName1\r\n"
					+ "from project p\r\n"
					+ "join manager m on m.managerid=p.managerid";
			Statement statement = connection.createStatement();
			
			ResultSet resultSet = statement.executeQuery(listUser);

			// Step 5: Handling result set
			while (resultSet.next()) {
				int id1 = resultSet.getInt("p.projectId");
				String fullName2 = resultSet.getString("m.FullName1");

				User user = new User(id1, fullName2);
				users.add(user);

			}
			return users;
		} finally {
			// Step 6: Close connection
			connection.close();
		}
	}

	@Override
	public User login(String email, String password) throws Exception {

		try {

			// step 2: get connect
			connection = jdbcUtils.connect();

			// Step 3: Create a statement object

			String sql = "SELECT * FROM usermanager.manager " + "WHERE Email = ? AND Password = ? ";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			// set parameter
			preparedStatement.setString(1, email);
			preparedStatement.setString(2, password);

			// Step 4: Execute Query

			ResultSet resultSet = preparedStatement.executeQuery();

			// Step 5: Handling result
			if (resultSet.next()) {
				int userId = resultSet.getInt("managerID");
				String fullName = resultSet.getString("FullName1");
				Role role = Role.valueOf(resultSet.getString("Role"));

				User user = new User(userId, fullName, email, password, role);
				return user;
			} else {
				throw new Exception("Tai khoan hoac mat khau sai!");
			}

		} finally {
			connection.close();
		}
	}
	public boolean isUserIdExits(int id) throws SQLException, ClassNotFoundException {
		try {

			// step 2: get connect
			connection = jdbcUtils.connect();

			// Step 3: Create a statement object

			String sql = "SELECT * FROM usermanager.manager " + " WHERE managerID = ? ";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			// set parameter
			preparedStatement.setInt(1, id);

			// Step 4: Execute Query
			ResultSet resultSet = preparedStatement.executeQuery();

			// Step 5: Handling result set

			if (resultSet.next()) {

				return true;
			}

			return false;
		} finally {
			connection.close();
		}

	}
		
}

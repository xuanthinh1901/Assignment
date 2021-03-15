package com.vti.backend.bussinesslayer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.vti.Utils.JdbcUtils;
import com.vti.backend.datalayer.IUserRepository;
import com.vti.backend.datalayer.UserRepository;
import com.vti.entity.Role;
import com.vti.entity.User;
import java.io.*;
import com.vti.entity.User;

public class UserService implements IUserService{
	private IUserRepository userRepository;
	
	public UserService() throws Exception {
		userRepository = new UserRepository();
	}


	@Override
	public List<User> getListUsers(int projectId) throws SQLException, ClassNotFoundException {
		return userRepository.getListUsers( projectId);
	}


	@Override
	public User login(String email, String password) throws Exception {
		return userRepository.login(email, password);
	}
	@Override
	public boolean isUserIdExits(int id) throws SQLException, ClassNotFoundException {
		return userRepository.isUserIdExits(id);
	}

	@Override
	public List<User> getManager() throws SQLException, ClassNotFoundException {
		return userRepository.getManager();
	}

	
}

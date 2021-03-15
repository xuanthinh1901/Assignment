package com.vti.backend.bussinesslayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.entity.User;

public interface IUserService {

	List<User> getListUsers(int projectId) throws SQLException, ClassNotFoundException;
	
	boolean isUserIdExits(int id) throws SQLException, ClassNotFoundException;
	
	User login(String email, String password) throws Exception;
	
	List<User> getManager() throws SQLException, ClassNotFoundException;
}

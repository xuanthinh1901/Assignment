package com.vti.backend.presentation;

import java.sql.SQLException;
import java.util.List;

import com.vti.backend.bussinesslayer.IUserService;
import com.vti.backend.bussinesslayer.UserService;
import com.vti.entity.User;

public class UserController {
	private IUserService userService;

	public UserController() throws Exception {
		userService = new UserService();
	}

	public List<User> getListUsers(int projectId) throws SQLException, ClassNotFoundException {

		return userService.getListUsers(projectId);
	}

	public User login(String email, String password) throws Exception {
		return userService.login(email, password);
	}
	public boolean isUserIdExits(int id) throws SQLException, ClassNotFoundException {
		return userService.isUserIdExits(id);
	}
	public List<User> getManager() throws SQLException, ClassNotFoundException {
		return userService.getManager();
	}
}

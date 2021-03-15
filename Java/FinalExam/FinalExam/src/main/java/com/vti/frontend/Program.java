package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.Utils.ScannerUtils;
import com.vti.entity.Role;
import com.vti.entity.User;

public class Program {
	public static void main(String[] args)
			throws Exception {
		menuLogin();
	}
	
	private static void menuLogin() throws Exception {
		Function function = new Function();
		System.out.println("MỜI BẠN LOGIN");
		User user = function.login();
		System.out.println("Login successfull!");
		System.out.println("Chào mừng " + user.getFullName() + "!");
		if (user.getRole() == Role.Manager) {
			menuManager(user);
		} else {
			menuUser(user);
		}
	}
	
	private static void menuUser(User user) {
		// TODO
	}
	private static void menuManager(User user)
			throws Exception {
		Function function = new Function();
		System.out.println("Moi ban nhap chuc nang muon su dung:\n" + "1: In ra danh sách các Manager va Employee:\n"
				+ "2: In ra cac Manager cua cac Project \n" + "3: \n" );

		while (true) {
			System.out.print("Moi ban nhap chuc nang: ");
			int choose = ScannerUtils.inputFunction(1, 3, "Ban chi duoc chon tu 1 --> 3. Mời nhập lại!");

			switch (choose) {
			case 1:
				function.getListUser();
				break;
			case 2:
				function.getManager();
				break;
			case 3:
				System.out.println("bạn đã thoát khỏi chương trình!");
				return;
			}
		}
	}
	// nhung11@gmail.com
	// nhungtOng11
	
}

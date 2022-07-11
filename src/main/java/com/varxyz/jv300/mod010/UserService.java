package com.varxyz.jv300.mod010;

public class UserService {
	private AddUserDao addUserDao = AddUserDao.getInstance();
	
	public void addUser(User user) {
		addUserDao.addUser(user);
	}

	public boolean isValidUser(String userId, String passwd) {
		return addUserDao.login(userId, passwd);
	}
	
}

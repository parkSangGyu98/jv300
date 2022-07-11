package com.varxyz.jv300.mod009;

import java.util.List;

public class UserService {
	private static AddUserDao adduserdao = AddUserDao.getInstance();
	
	public void addUser(User user) {
		adduserdao.addUser(user);		
	}
	
}

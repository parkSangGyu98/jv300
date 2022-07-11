package com.varxyz.jv300.mod010;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;

import com.varxyz.jv300.mod009.DataSource;

public class AddUserDao {
	private static AddUserDao adduserdao = new AddUserDao(); //싱글톤

	public static void addUser(User user) {
		String sql = "INSERT INTO User(name, ssn, userid, passwd, email, addr)" +
													"VALUES(?, ?, ?, ?, ?, ?)";
		try {
			Connection con = DataSource.getConnection();
			PreparedStatement stmt = con.prepareStatement(sql);
			try {
				stmt = con.prepareStatement(sql);
				stmt.setString(1, user.getUserName());
				stmt.setString(2, user.getSsn());
				stmt.setString(3, user.getUserId());
				stmt.setString(4, user.getPasswd());
				stmt.setString(5, user.getEmail());
				stmt.setString(6, user.getAddr());
				stmt.executeUpdate();
				System.out.println("INSERTED...");
			} finally {
				stmt.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean login(String userId, String passwd) {
		String sql = "SELECT userid,passwd FROM User WHERE userid=?";
		boolean result = false ;
		
		try {
			Connection con = DataSource.getConnection();
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, userId);
			ResultSet rs = stmt.executeQuery();
			try {
				while(rs.next()) {
					String DBuserId = rs.getString("userid");
					String DBpasswd = rs.getString("passwd");
					System.out.println("입력한 아이디: " + userId + " , DB ID :" + DBuserId);
					System.out.println("입력한 비번: " + passwd + " , DB 비번 :" + DBpasswd);
					if ( DBuserId.equals(userId) && DBpasswd.equals(passwd)) {
						result = true;
					}else {
						result = false; 
					}
				}
			} finally {
				stmt.close();
				con.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result; 
	}
	
	public static AddUserDao getInstance() { //싱글톤
		return adduserdao;
	}
}
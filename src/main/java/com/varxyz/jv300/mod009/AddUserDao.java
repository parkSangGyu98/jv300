package com.varxyz.jv300.mod009;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AddUserDao {
	private static AddUserDao adduserdao = new AddUserDao(); // 싱글톤
	
     public static void addUser(User user) {
         String sql = "INSERT INTO User(name, ssn, userid, passwd, email, addr)"
                  + "VALUES(?, ?, ?, ?, ?, ?)";
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
            } finally{
            	stmt.close();
            	con.close();
            }
         } catch (Exception e) {
            e.printStackTrace();
         }
      }

     
     public static AddUserDao getInstance() { //싱글톤
    	 return adduserdao;
     }
     
}
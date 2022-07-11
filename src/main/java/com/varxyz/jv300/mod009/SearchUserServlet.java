package com.varxyz.jv300.mod009;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mod009/search_user.do")
public class SearchUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private UserService userService;
	
	public void init() {
		userService = new UserService();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String sql = "SELECT * FROM User";

 		RequestDispatcher dispatcher = null;
 		List<String> userName = new ArrayList<>();
 		List<String> userid = new ArrayList<>();
 		try {
 			Connection con = DataSource.getConnection();
 			PreparedStatement stmt = con.prepareStatement(sql);
 			ResultSet rs = stmt.executeQuery();
 			try {
 				while (rs.next()) {
 					String name = rs.getString("name");
 					String id = rs.getString("userid");
 					userName.add(name);
 					userid.add(id);
 				}
 			} finally {
 				stmt.close();
 				con.close();
 			}
 		} catch (Exception e) {
 			e.printStackTrace();
 		}
 		
 		request.setAttribute("userName", userName);
 		request.setAttribute("userid", userid);
 		dispatcher = request.getRequestDispatcher("search_all_user.jsp");
		dispatcher.forward(request, response);
 		
	}

}

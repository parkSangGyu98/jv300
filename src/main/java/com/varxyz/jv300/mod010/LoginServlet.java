package com.varxyz.jv300.mod010;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.varxyz.jv300.mod010.User;

@WebServlet("/mod010/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private UserService userService;
	
	public void init() {
		userService = new UserService();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
											throws ServletException, IOException {
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
											throws ServletException, IOException {
		String userId = request.getParameter("userId");
		String passwd = request.getParameter("passwd");
		
		// 사용자 정보 확인 후 틀리면 login 페이지로 ㄱㄱ
		if( !userService.isValidUser(userId, passwd) ) {
			request.getRequestDispatcher("login.jsp").forward(request, response);
			return;
		}
		// 사용자 정보 확인 후 맞으면 밑에 실행
		HttpSession session = request.getSession(true); 
		session.setAttribute("userId", userId); //MyPageServlet에서 getAttribute해줌 //session에 userId 저장
		response.sendRedirect("mypage"); //로그인 성공 후 mypage로 이동
	}

}

package com.varxyz.jv300.mod004;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
						throws ServletException, IOException {
		String id = request.getParameter("userId");
		String pw = request.getParameter("passwd");
		String name = request.getParameter("userName");
		String ssn = request.getParameter("ssn");
		String email1 = request.getParameter("email1");
		String email2 = request.getParameter("email2");
		String[] concerns = request.getParameterValues("concerns");
		
		String pageTitle = "회원가입";
		response.setContentType("text/html; charset=UTF-8"); 
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>" + pageTitle + "</title></head>");
		out.println("<body>");
		out.println("<h3>회원 아이디 : "+ id +"</h3>");
		out.println("<h3>비밀번호 : "+ pw +"</h3>");
		out.println("<h3>이름 : "+ name +"</h3>");
		out.println("<h3>주민번호 : "+ ssn +"</h3>");
		out.println("<h3>이메일 : "+ email1 + "@" + email2 +"</h3>");
		out.println("<h3>관심분야 : ");
		for(String c : concerns) {
			out.println(c);
		}
		out.println("</h3>");
		out.println("</body></html>");
		out.close(); 
	}
	
	

}


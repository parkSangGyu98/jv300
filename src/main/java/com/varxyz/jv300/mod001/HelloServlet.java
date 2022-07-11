package com.varxyz.jv300.mod001;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request , HttpServletResponse response) // get 방식으로 servlet을 호출할 때 실행
						//HttpServletRequest request -> 요청정보를 캡슐화한다
						//HttpServletResponse response -> 응답정보를 캡슐화한다
					throws ServletException, IOException { 
		
		String pageTitle = "Hello World";
		
		response.setContentType("text/html; charset=UTF-8"); // 응답을 html로 하고 문자를 utf-8로 하겠다. //이거 안하면 한글 깨짐
		PrintWriter out = response.getWriter(); //PrintWriter는 Writer의 자식
		
		out.println("<html>");
		out.println("<head><title>" + pageTitle + "</title></head>");
		out.println("<body>");
		out.println("<h3> Welcome to 서블릿 프로그래밍</h3>");
		out.println("</body></html>");
		out.close(); //IO이기 때문에 끝나면 close 시킨다.
	}
}

package com.varxyz.jv300.mod005;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "HelloServlet2" , urlPatterns = {"/mod005/hello.view"} )
public class HelloServlet extends HttpServlet {
	private static final String DEFAULT_NAME = "World!";
	
	public void init() {
		
	}
	
	@Override
	protected void doGet(HttpServletRequest request , HttpServletResponse response) 
					throws ServletException, IOException { 
		String name = request.getParameter("userName");
		if(name == null || name.length() == 0){
			name = DEFAULT_NAME;
		}
		
		String pageTitle = "Hello World";
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head><title>" + pageTitle + "</title></head>");
		out.println("<body>");
		out.println("<h3> Hello, "+ name +"</h3>");
		out.println("</body></html>");
		out.close(); //IO기 때문에 끝나면 close 시킨다.
	}
}

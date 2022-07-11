package com.varxyz.jv300.mod001;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet , HTML 이용한 구구단 출력
 * @author Administrator
 *
 */
public class GugudanTest extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException { 
		String pageTitle = "gugudan";
		
		response.setContentType("text/html; charset=UTF-8"); // 응답을 html로 하고 문자를 utf-8로 하겠다. //이거 안하면 한글 깨짐
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head><title>" + pageTitle + "</title></head>");
		out.println("<h1> 구구단</h1>");
		out.println("<body>");
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				out.print(j+"*"+i+"="+i*j+"\t");
				if ( j == 9 ) {
					out.println("<br>");
				}
			}
		}
		out.println("</body></html>");
		out.close(); //IO이기 때문에 끝나면 close 시킨다.
	}
}

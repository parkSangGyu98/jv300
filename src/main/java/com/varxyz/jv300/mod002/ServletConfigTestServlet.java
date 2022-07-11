package com.varxyz.jv300.mod002;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletConfigTestServlet extends HttpServlet {
	private static final String DEFAULT_SEASONS = "Spring, Summer, Fall, Winter";
	private String[] seasons;
	
	@Override
	public void init() throws ServletException {
		//getInitParameter 메소드 본인한테 정의되어있지 않은데 . 없이 호출할수 있는 이유 -> 부모꺼라서
		String season_list = getInitParameter("season-list"); // "season-list" 는 web.xml 에 param-name 을 가리킨다 
		if(season_list == null) {
			season_list = DEFAULT_SEASONS;
		}
		seasons = season_list.split(",");
	}
	
	@Override
	protected void doGet(HttpServletRequest request , HttpServletResponse response)
					throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.println("<html><body>");
		out.println("<h3>Servlet Lifecycle Test</h3>");
		out.println("<ul>");
		for(String season : seasons) {
			out.println("<li>"+ season +"</li>");
		}
		out.println("</ul>");
		out.println("</body></html>");
		out.close();
	}
	
}

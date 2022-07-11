<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.net.URLDecoder" %>
<div id="banner">
	<!-- request.getParameter("subtitle") => add_user에서 param값을 받아옴 / decode는 언어 설정 -->
	<h4><%=URLDecoder.decode(request.getParameter("subtitle"), "UTF-8") %></h4>
</div>
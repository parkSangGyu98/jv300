<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.net.URLEncoder" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<style>
  #header {
      width: 100%;
      position: absolute;
      top: 0;
      text-align: center;
      background-color: #f1f1f1;
      font-size: 30px;
   }
   
   #content-wrapper {
      text-align: center;
      margin: 400px 100px;
   }
   
   #footer {
      width: 100%;
      position: absolute;
      bottom: 0;
      padding: 30px 0;
      text-align: center;
      font-size: 34px;
      background-color: #f1f1f1;
   }
</style>

<body>
<div id="wrapper">
<%-- header Area --%>
	<div id="header">
		<jsp:include page="/incl/banner.jsp">
			<jsp:param name="subtitle" value="<%=URLEncoder.encode(\"mod010: mypage.jsp\", \"UTF-8\") %>"/>
		</jsp:include>
	</div>
	
	<%-- content Area --%>
	<div id="content-wrapper">
	<h3>My Page</h3>
	<a href='<c:url value="/mod010/logout" />'>로그아웃</a>
	<br><label>Last Access Time : </label> ${lastAccessTime}
	</div>
	
	<%-- footer Area --%>
	<div id="footer">
		<%@ include file="/incl/footer.jsp" %>
	</div>
</div>
</body>
</html>



























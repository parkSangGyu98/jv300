<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="list_course_contents.do" method="get">
		<c:forEach var="contents" items="${contentList}"> 
			<c:forEach var="content" items="${contents}"> <%-- ${contents} => EL로 받아준것 --%>
				${content}
			</c:forEach>
			<br>
  		</c:forEach>
		<input type="submit" value="./do파일 get" />
	</form>
</body>
</html>
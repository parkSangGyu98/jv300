<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.net.URLEncoder" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div id="wrapper">
	<div id="header">
		<jsp:include page="/incl/banner.jsp">
			<jsp:param name="subtitle" value="mod007 : Java Beans and include"/>
			<jsp:param name="subtitle" value="<%=URLEncoder.encode(\"mod007 : 자바빈즈\", \"UTF-8\") %>"/>
		</jsp:include>
	</div>
	<div id="content-wrapper">
		<form action="add_user.do" method="post">
		회원 아이디 : <input type="text" name="userId"/><br>
		비밀번호 : <input type="password" name="passwd"/><br>
		이름 : <input type="text" name="userName"/><br>
		주민번호 : <input type="text" name="ssn" placeholder="앞 6자리 입력"/><br>
		이메일 : <input type="text" name="email1"/>
				<select name="email2">
					<option value="" >선택</option>
					<option>naver.com</option>
					<option>daum.net</option>
					<option>google.com</option>
				</select>
		<br>
		
		주소 : 
				<select name="addr1">
					<option value="" >선택</option>
					<option>서울</option>
					<option>부산</option>
					<option>대구</option>
				</select>
				<select name="addr2">
					<option value="" >선택</option>
					<option>달서구</option>
					<option>달성군</option>
					<option>수성구</option>
				</select><br>
		<input type="submit" value="확인"/>
	</form>	
	</div>
	<div id="footer">
		<%@ include file="/incl/footer.jsp" %>
	</div>
</div>
	
</body>
</html>
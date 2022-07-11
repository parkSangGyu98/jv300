<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
      margin: 200px 100px;
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
			<jsp:param name="subtitle" value="<%=URLEncoder.encode(\"mod009 : add_user.jsp\", \"UTF-8\") %>"/>
		</jsp:include>
	</div>
	
	<%-- content Area --%>
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
	
	<form action="search_user.do" method="get">
		<h3>모든 회원 보기</h3>
		<input type="submit" value="모든 회원 보기"/>
	</form>
	
	</div>
	
	<%-- footer Area --%>
	<div id="footer">
		<%@ include file="/incl/footer.jsp" %>
	</div>
</div>
	
</body>
</html>
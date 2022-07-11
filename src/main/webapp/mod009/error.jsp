<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.List, java.net.URLEncoder" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><%-- EL을 쓰기위해 선언 --%>
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
         <jsp:param name="subtitle" value="<%=URLEncoder.encode(\"mod009 : 회원정보 DB로 전송\", \"UTF-8\") %>"/>
      </jsp:include>
   </div>
   <div id="content-wrapper">
   		<c:if test="${not empty errorMsgs}">
      		<h4>다음과 같은 에러가 발생했습니다.</h4>
  				<c:forEach var="message" items="${errorMsgs}"> 
					${message}
  				</c:forEach>
   		</c:if>
   </div>
   <div id="footer">
      <%@ include file="/incl/footer.jsp" %>
   </div>
</div>

</body>
</html>
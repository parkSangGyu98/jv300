<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.List, java.net.URLEncoder"%>

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


<div id="wrapper">
	<%-- header Area --%>
	<div id="header">
		<jsp:include page="/incl/banner.jsp">
			<jsp:param name="subtitle" value="<%=URLEncoder.encode(\"mod009: success.jsp\", \"UTF-8\") %>"/>
		</jsp:include>
	</div>
	
	<%-- content Area --%>
	<div id="content-wrapper">
		<h3>회원가입되었습니다.</h3>
		<jsp:useBean id="user" class="com.varxyz.jv300.mod009.User"
			scope="request" />
		아이디 :
		<jsp:getProperty property="userId" name="user" /><br> 이름 :
		<jsp:getProperty property="userName" name="user" /><br>
	</div>
	
	
	<%-- footer Area --%>
	<div id="footer">
		<%@ include file="/incl/footer.jsp" %>
	</div>
</div>





















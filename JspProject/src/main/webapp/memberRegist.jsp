<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %>
<jsp:useBean id="member" class = "vo.MemberVO"></jsp:useBean> 
<jsp:setProperty name = "member" property = "*"></jsp:setProperty>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	아이디 : <jsp:getProperty property="memberId" name = "member"/><br>
	이름 : <jsp:getProperty property="memberName" name = "member"/><br>
	주소 : <jsp:getProperty property="memberAddr" name = "member"/><br>
	이메일 : <jsp:getProperty property="memberEmail" name = "member"/><br>
</body>
</html>
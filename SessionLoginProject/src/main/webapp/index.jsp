<%@page import="vo.MemberVO" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	MemberVO loginMemberVO = (MemberVO)session.getAttribute("loginMemberVO");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		if(loginMemberVO == null){
	%>
	<a href = "LoginForm.html">�α���</a>	
	<a href = "memberRegistForm.html">ȸ������</a><br>	
	<%
		}
		else{
	%>
		<a href = "logout">�α׾ƿ�</a>
	<%	
		}
	 %>
</body>
</html>
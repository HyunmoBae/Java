<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Sub Body</h1>
names:
<%
	String[] nameArray = request.getParameterValues("name");

	for(int i = 0; i<nameArray.length; i++){
%>
name : <%=nameArray[i] %>
<br>
<%
	}
%>

one name : <%=request.getParameter("name") %>
</body>
</html>
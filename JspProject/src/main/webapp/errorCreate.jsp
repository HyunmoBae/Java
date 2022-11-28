<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    errorPage="/error/showError.jsp"
    %>
    <%-- errorPage 속성으로 에러를 처리하는 방식이 우선순위가 제일 높기때문에 다른 방식을 사용하려면 이 속성을 제거해야함.
    	errorPage="/error/showError.jsp"
     --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%= request.getParameter("name").toUpperCase() %>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<%!
	String str2 = "ȭ���� �Դϴ�.";
	//��ũ��Ʈ������ ������ ������ �ݵ�� ���Ǳ� ���� �����ؾ��� �νĵ�.
%>

<%
	String str1 = "������" + str2;
%>

<%-- <%!
	String str2 = "ȭ���� �Դϴ�.";
	//����ο��� �����ϴ� ������ ������ ��ü���� �ν��� �ǹ� ������ ����� �Ŀ� �����ص� ������ �νĵ�.
%> --%>

</body>
<%=str1 %>
</html>

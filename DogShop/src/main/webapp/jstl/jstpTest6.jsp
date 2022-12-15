<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %><!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<sql:query var = "rs" dataSource="jdbc/jsptest">
		SELECT * FROM board
	</sql:query>
	<table border = "1">
		<tr>
			<c:forEach var = "columnName" items="${rs.columnNames}">
				<th><c:out value= "${columnName }"/></th>
			</c:forEach>
		</tr>
		<c:forEach var = "row" items = "${rs.rowsByIndex }">
			<tr>
				<c:forEach var = "column" items = "${row }" >
					<td>
						<c:if test="${column != null }">
							<c:out value="${column }"></c:out>
						</c:if>
						<c:if test="${column == null }">
							<c:out value="${column }"></c:out>
							&nbsp;
						</c:if>
					</td>				
				</c:forEach>
			</tr>
		</c:forEach> 
	</table>
	
	<sql:update dataSource="jdbc/jsptest">
		UPDATE board SET passwd = ? WHERE num = ?
		<sql:param value = "${'2222' }"></sql:param>
		<sql:param value = "${1 }"></sql:param>
	</sql:update>
	<br>
	<sql:query var = "rs" dataSource="jdbc/jsptest">
		SELECT * FROM board
	</sql:query>
	<table border = "1">
		<tr>
			<c:forEach var = "columnName" items="${rs.columnNames}">
				<th><c:out value= "${columnName }"/></th>
			</c:forEach>
		</tr>
		<c:forEach var = "row" items = "${rs.rowsByIndex }">
			<tr>
				<c:forEach var = "column" items = "${row }" >
					<td>
						<c:if test="${column != null }">
							<c:out value="${column }"></c:out>
						</c:if>
						<c:if test="${column == null }">
							<c:out value="${column }"></c:out>
							&nbsp;
						</c:if>
					</td>				
				</c:forEach>
			</tr>
		</c:forEach> 
	</table>
</body>
</html>
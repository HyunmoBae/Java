<%@page import="java.util.Enumeration"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="java.net.URLEncoder"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%
	String realPath = "";
	String savePath = "fileSave";
	String type = "UTF-8";
	int maxSize = 5*1024*1024;
	
	ServletContext context = getServletContext();
	realPath = context.getRealPath(savePath);
	
	ArrayList<String> saveFiles = new ArrayList<String>();
	ArrayList<String> origFiles = new ArrayList<String>();
	
	String user = "";
	String title = "";
	String content = "";
	
	MultipartRequest multi = new MultipartRequest(request, realPath, maxSize, type, new DefaultFileRenamePolicy());
	
	user = multi.getParameter("txtUser");
	title = multi.getParameter("txtTitle");
	content = multi.getParameter("txtContent");
	
	Enumeration files = multi.getFileNames();
	while(files.hasMoreElements()){
		String name = (String)files.nextElement();
		saveFiles.add(multi.getFilesystemName(name));
		origFiles.add(multi.getOriginalFileName(name));
	}
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>
	#downloadArea{
		width: 620px;
		margin: auto;
		border:1px solid red;
	}
	table{
		width:600px;
		margin: auto;
		text-align:center;
	}
</style>
</head>
<body>
	<section id = "downloadArea">
		<table>
			<tr>
				<td>작성자 : </td>
				<td><%=user %></td>
			</tr>
			<tr>
				<td>제목 : </td>
				<td><%=title %></td>
			</tr>
			<tr>
				<td>내용 : </td>
				<td><%=content %></td>
			</tr>
			<tr>
				<td colspan = "2">업로드된 파일 목록</td>
			</tr>
			<%
				for(int i =0; i< saveFiles.size(); i++){
			%>
			<tr>
				<td colspan = "2">
					<%= i+1 %>.<a href = "file_down.jsp?file_name=<%=URLEncoder.encode(saveFiles.get(i),"UTF-8")%>"><%=origFiles.get(i) %></a>
				</td>
			</tr>
			<%
				}
			%>					
		</table>
	</section>
</body>
</html>
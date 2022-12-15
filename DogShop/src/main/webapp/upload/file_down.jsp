<%@page import="java.net.URLEncoder"%>
<%@page import="java.io.FileInputStream"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	String fileName = request.getParameter("file_name");
	
	String fileSave = "fileSave";
	ServletContext context = getServletContext();
	String downloadPath = context.getRealPath(fileSave);
	
	String filePath = downloadPath + "/" + fileName;
	
	byte[] b = new byte[4096]; //�Է½�Ʈ������ �ѹ��� �о���� ũ��
	FileInputStream fis = new FileInputStream(filePath);
	
	String mimeType = getServletContext().getMimeType(filePath);
	if(mimeType == null) mimeType = "application/octet-stream";
	
	response.setContentType(mimeType);
	
	//�ٿ�ε��� ������ �ѱ��϶��� ó��
	//IE�� �ٸ� �������� �����ؼ� ó��
	String userAgent = request.getHeader("User-Agent");

	boolean ie = (userAgent.indexOf("MSIE")>-1) || (userAgent.indexOf("Trident")>-1 );
	
	if(ie){
		fileName = URLEncoder.encode(fileName, "UTF-8");
	}
	else{
		fileName = new String(fileName.getBytes("UTF-8"),"iso-8859-1");
	}
	
	response.setHeader("Content-Disposition", "attachment;fileName="+fileName);
	
	ServletOutputStream out2 = response.getOutputStream();
	
	int numRead = -1; //�о���� ����Ʈ ���� �����ϴ� ����
	while((numRead = fis.read(b,0,b.length)) != -1){
		out2.write(b,0,numRead);
	}
	
	out2.flush();
	out2.close();
	fis.close();
	
%>
</body>
</html>

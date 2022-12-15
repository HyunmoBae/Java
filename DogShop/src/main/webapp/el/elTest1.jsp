<%@page import="java.util.ArrayList"%>
<%@page import="vo.MemberVO"%>
<%@page import="java.util.HashMap" %>
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
	ArrayList<String> a1 = new ArrayList<String>();
	a1.add("aaa");
	a1.add("bbb");
	a1.add("ccc");
	request.setAttribute("a1", a1);
	
	HashMap<String, String> hashMap = new HashMap<String, String>();
	hashMap.put("aaa","aValue");
	hashMap.put("bbb","bValue");
	request.setAttribute("hashMap", hashMap);
	
	String[] strArray = new String[3];
	strArray[0] = "111";
	strArray[1] = "222";
	strArray[2] = "333";
	request.setAttribute("strArray", strArray);
	
	MemberVO member = new MemberVO();
	member.setName("배현모");
	request.setAttribute("member", member);
%>

requestScope : ${requestScope.member.name }<br>
session. : ${session.member.name }<br>
member.name : ${member.name }<br>

빈객체나 Map(. 사용) : ${hashMap.aaa } - ${member.name }<br>
빈객체나 Map([]사용) : ${hashMap["aaa"] } - ${member["name"] }<br>
<%-- 빈객체나 리스트(. 사용) : ${strArray.0 } - ${al.1 }<br> --%>

빈객체나 리스트([] 사용) : ${strArray[0] } - ${a1[1] }<br>

</body>
</html>
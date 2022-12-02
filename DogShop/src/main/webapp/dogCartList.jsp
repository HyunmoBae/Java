<%@page import="java.util.ArrayList"%>
<%@page import="vo.CartVO" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	ArrayList<CartVO> cartList = (ArrayList<CartVO>)request.getAttribute("cartList");
	int totalMoney = (int)request.getAttribute("totalMoney");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>
#cartListArea{
	width: 620px;
	margin : auto;
	border: 1px solid red;
}
table{
	width: 600px;
	margin: auto;
	text-align: center;
}
h1{
	text-align: center;
}
#tr_title{
	background: skyblue;
}
.cartProductImage{
	width: 70px;
	height: 70px;
}
</style>
</head>
<body>
	<section id = "cartListArea">
		<%
			if(cartList == null || cartList.size() == 0){
		%>
			<h1>��ٱ��Ͽ� ��� ��ǰ�� �����ϴ�.</h1>
		<%
			} else{
		%>
			<h1>��ٱ��� ��� <a href = "dogList.dog">���ΰ���ϱ�</a></h1>
			<form action="">
				<table>
					<tr id = "tr_title">
						<td>
							<input type = "checkbox"/>
						</td>
						<td>
							��ȣ
						</td>
						<td>
							��ǰ�̹���
						</td>
						<td>
							��ǰ��
						</td>
						<td>
							����
						</td>
						<td>
							����
						</td>
						<td>
							<input type = "submit" value = "����">
						</td>
					</tr>
					
					<%
						int num = 1;
						for(int i = 0; i<cartList.size(); i++){
					%>
						<tr>
						<td>
							<input type = "checkbox"/>
						</td>
						<td>
							<%=num++ %>
						</td>
						<td>
							<img src = "images/<%=cartList.get(i).getDogImage() %>.jpg"
							class = "cartProductImage"/>
						</td>
						<td>
							<%=cartList.get(i).getDogKind() %>
						</td>
						<td>
							<%=cartList.get(i).getDogPrice() %>
						</td>
						<td>
							<%=cartList.get(i).getQty() %>��
						</td>
						<td>
							<input type = "submit" value = "����">
						</td>
					</tr>
					<%
						}
					%>
				</table>
			</form>
		<%
			}
		%>				
	</section>
</body>
</html>
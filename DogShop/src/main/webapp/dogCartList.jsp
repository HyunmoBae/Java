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
			<h1>장바구니에 담긴 상품이 없습니다.</h1>
		<%
			} else{
		%>
			<h1>장바구니 목록 <a href = "dogList.dog">쇼핑계속하기</a></h1>
			<form action="">
				<table>
					<tr id = "tr_title">
						<td>
							<input type = "checkbox"/>
						</td>
						<td>
							번호
						</td>
						<td>
							상품이미지
						</td>
						<td>
							상품명
						</td>
						<td>
							가격
						</td>
						<td>
							수량
						</td>
						<td>
							<input type = "submit" value = "삭제">
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
							<%=cartList.get(i).getQty() %>개
						</td>
						<td>
							<input type = "submit" value = "삭제">
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
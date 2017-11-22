<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>订单状态</h1>
	<table class="table table-striped">
		<tr>
			<td>订单编号</td>
			<td>下单人ID</td>
			<td>寄件人姓名</td>
			<td>寄件时间</td>
			<td>寄件状态</td>
			<td>修改状态</td>
		</tr>
		<c:forEach items="${orlist }" var="o">
			<tr>
				<td>${o.oNO }</td>
				<td>${o.userId }</td>
				<td>${o.sendName }</td>
				<td>${o.sendTime }</td>
				<td>${o.state eq "1" ? "已付款" :(o.state eq "2" ? "已發貨" : ( o.state eq "3" ? "運輸中" : (o.state eq "4" ? "派送中" : "已簽收")))  }</td>
				<td><form action="/shop/upindent.sw" method="post">
				<input type="hidden" name="oid" value="${o.oid }">
						<input type="radio" value="1" name="state" ${o.state eq "1" ? "checked":"" } >已付款<input
							type="radio" value="2" name="state" ${o.state eq "2" ? "checked":"" }>已发货<input
							type="radio" value="3" name="state" ${o.state eq "3" ? "checked":"" }>运输中<input
							type="radio" value="4" name="state" ${o.state eq "4" ? "checked":"" }>派送中<input
							type="radio" value="5" name="state" ${o.state eq "5" ? "checked":"" }>已签收
							<input type="submit" value="提交">
					</form></td>
			</tr>
		</c:forEach>
	</table>

</body>
<link rel="stylesheet" href="/shop/bootstrap.min.css">
<script src="/shop/jquery-3.2.1.min.js"></script>
<script src="/shop/bootstrap.min.js"></script>
</html>
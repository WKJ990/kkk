<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@ taglib uri="http://jpager.com/taglibs/page" prefix="page"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>


<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Insert title here</title>
 
    
    	<h1>订单</h1>
	
		<table class="table table-hover">
			<tr>
				<td>订单ID</td>
				<td>订单编号</td>
				<td>下单人ID</td>
				<td>寄件人姓名</td>
				<td>寄件地址</td>
				<td>寄件人电话</td>
				<td>寄件时间</td>
				<td>付款方式</td>
				<td>快件状态</td>
				
			</tr>
			<page:pager dz="10">
			<c:forEach items="${orlist }" var="o" varStatus="status">
			<page:item nr="${status.count}" >
			<tr>
				<td>${o.oid }</td>
				<td>${o.oNO }</td>
				<td>${o.userId }</td>
				<td>${o.sendName }</td>
				<td>${o.sendAdress }</td>
				<td>${o.sendTel }</td>
				<td>${o.sendTime }</td>
				<td>${o.payment }</td>
				<td>${o.state eq "1" ? "已付款" :(o.state eq "2" ? "已發貨" : ( o.state eq "3" ? "運輸中" : (o.state eq "4" ? "派送中" : "已簽收")))  }</td>
				
			</tr>
			</page:item>
			</c:forEach>
			</page:pager>
			<tr><td colspan="9" align="center"><page:bt/></td></tr>
		</table>




</body>
<link rel="stylesheet" href="/shop/bootstrap.min.css">
<script src="/shop/jquery-3.2.1.min.js"></script>
<script src="/shop/bootstrap.min.js"></script>

</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Insert title here</title>
 
    <h1>商品信息维护</h1>
<form action="/shop/message.sw" method="post">
商品名稱:<input type="text" name="pname">商品描述:<input type="text" name="introduce">
<select name="sid">
<option value="0">未選擇</option>
<c:forEach items="${solist }" var="s">
<option value="${s.sid }">${s.sname }</option>
</c:forEach>
</select>
<input type="submit" value="查詢">
</form>

		<table class="table table-hover" >
			<tr>
				<td>商品ID</td>
				<td>商品名称</td>
				<td>所屬類別</td>
				<td>销售数量</td>
				<td>图片路径</td>
				<td>原价</td>
				<td>销售价格</td>
				<td>商品描述</td>
				<td>商品种类状态</td>
				<td>管理操作</td>
			</tr>
			<c:forEach items="${ prolist}" var="p">
			<tr>
				<td>${p.pid }</td>
				<td>${p.pname }</td>
				<td>${p.sort.sname }</td>
				<td>${p.saleCount }</td>
				<td>${p.image }</td>
				<td>${p.price }</td>
				<td>${p.saleprice }</td>
				<td>${p.introduce }</td>
				<td>${p.sort.sstate eq "1" ? "上架" : "下架" }</td>
				<td><a href="/shop/toupme.sw?pid=${p.pid }">修改</a></td>
			</tr>
			</c:forEach>
		</table>


</body>
<link rel="stylesheet" href="/shop/bootstrap.min.css">
<script src="/shop/jquery-3.2.1.min.js"></script>
<script src="/shop/bootstrap.min.js"></script>

</html>
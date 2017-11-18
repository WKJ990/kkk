<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Insert title here</title>

    
    
    <h1>商品类别维护</h1>

		<table class="table table-hover" >
			<tr>
				<td>分类ID</td>
				<td>分类名称</td>
				<td>图片</td>
				<td>狀態</td>
				<td>管理操作</td>
			</tr>
			<c:forEach items="${sortlist }" var="s">
			<tr>
				<td>${s.sid }</td>
				<td>${s.sname }</td>
				<td>${s.sPhoto }</td>
				<td>${s.sstate eq "1" ? "上架" : "下架" }</td>
				<td><a href="/shop/delclass.sw?sid=${s.sid }">${s.sstate eq "1" ? "下架" : " " }</a>
				<a href="/shop/sclass.sw?sid=${s.sid }">${s.sstate eq "0" ? "上架" : " " }</a>
				</td>
			</tr>
			</c:forEach>
		</table>
</body>

<link rel="stylesheet" href="/shop/bootstrap.min.css">
<script src="/shop/jquery-3.2.1.min.js"></script>
<script src="/shop/bootstrap.min.js"></script>

</html>
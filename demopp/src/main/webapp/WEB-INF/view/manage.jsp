<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理员管理</title>
</head>
<body>
<h1>管理员管理</h1>
	<table class="table table-hover">
		<tr>
			<td>ID</td>
			<td>用户名</td>
			<td>密码</td>
			<td>权限</td>
			<td>设置权限</td>
		</tr>
		<c:forEach items="${managelist }" var="m">
			<tr>
				<td>${m.aid }</td>
				<td>${m.username }</td>
				<td>${m.password }</td>
				<td>${m.permissions eq "1" ? "管理员" : "无权限" }</td>
				<td><a href="/shop/tomanage.sw?aid=${m.aid }">${m.permissions eq "1" ? "取消管理员" :" " }</a><a href="/shop/tomanages.sw?aid=${m.aid }">${m.permissions eq "0" ? "设置为管理员 " :" " }</a></td>
			</tr>
		</c:forEach>
	</table>

</body>
<link rel="stylesheet" href="/shop/bootstrap.min.css">
<script src="/shop/jquery-3.2.1.min.js"></script>
<script src="/shop/bootstrap.min.js"></script>
</html>
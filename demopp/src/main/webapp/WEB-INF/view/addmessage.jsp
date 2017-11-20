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
	<h2>添加</h2>
	<form action="/shop/addmassage.sw" method="post">
		<table class="table table-striped">

			<tr>
				<td>商品名稱</td>
				<td><input type="text" name="pname"></td>
			</tr>
			<tr>
				<td>銷售數量</td>
				<td><input type="text" name="saleCount"></td>
			</tr>
			<tr>
				<td>商品圖片(主图)</td>
				<td><input type="file" name="image"></td>
			</tr>
			<tr>
				<td>商品圖片(副图)</td>
				<td><input type="file" name="w_img">
				<input type="file" name="s_img">
				<input type="file" name="a_img">
				<input type="file" name="d_img">
				</td>
			</tr>
			<tr>
				<td>原價</td>
				<td><input type="text" name="price"></td>
			</tr>
			<tr>
				<td>銷售價格</td>
				<td><input type="text" name="saleprice"></td>
			</tr>
			<tr>
				<td>描述</td>
				<td><textarea rows="3" cols="15" name="introduce"></textarea></td>
			</tr>
			<tr>
				<td>所屬類別</td>
				<td><select name="sid"><c:forEach items="${solist }"
							var="s">
							<option value="${s.sid }">${s.sname }</option>
						</c:forEach></select></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="保存"></td>
			</tr>
		</table>
	</form>
</body>
<link rel="stylesheet" href="/shop/bootstrap.min.css">
<script src="/shop/jquery-3.2.1.min.js"></script>
<script src="/shop/bootstrap.min.js"></script>
</html>
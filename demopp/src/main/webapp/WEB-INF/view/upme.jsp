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

<form action="/shop/upme.sw" method="post">
<input type="hidden" value="${prolist.pid }" name="pid">

		<table class="table table-striped">

			<tr>
				<td>商品名稱</td>
				<td><input type="text" name="pname" value="${prolist.pname }"></td>
			</tr>
			<tr>
				<td>銷售數量</td>
				<td><input type="text" name="saleCount" value="${prolist.saleCount }" ></td>
			</tr>
			<tr>
				<td>商品圖片(主图)</td>
				<td><input type="file" name="image"></td>
			</tr>
			
			<tr>
				<td>原價</td>
				<td><input type="text" name="price" value="${prolist.price }"></td>
			</tr>
			<tr>
				<td>銷售價格</td>
				<td><input type="text" name="saleprice" value="${prolist.saleprice }"></td>
			</tr>
			<tr>
				<td>描述</td>
				<td><input type="text" name="introduce" value="${prolist.introduce }" ></td>
			</tr>
			<tr>
				<td>所屬類別</td>
				<td><select name="sid"><c:forEach items="${solist }"
							var="s">
							<option value="${s.sid }"   ${s.sid eq prolist.sid ? "selected" : "" }  >${s.sname }</option>
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
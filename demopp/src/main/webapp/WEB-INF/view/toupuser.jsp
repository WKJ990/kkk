<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>修改</title>

		
			<h3>这是管理员界面</h3>
			<table class="table table-striped">
				<form action="/shop/upuser.sw" method="post">
					<tr>
						<td colspan="2"><input type="hidden" name="uid"
							value="${ulist.uid }"><input type="hidden"
							name="userGrade" value="${ulist.userGrade }"></td>
					</tr>
					<tr>
						<td align="right">用户名:</td>
						<td><input type="text" name="username"
							value="${ulist.username }" /></td>
					</tr>
					<tr>
						<td align="right">密 &nbsp;&nbsp;&nbsp;码:</td>
						<td><input type="password" name="password"
							value=${ulist.password } /></td>
					</tr>
					<tr>
						<td align="right">真实姓名:</td>
						<td><input type="text" name="realName"
							value="${ulist.realName }"></td>
					</tr>
					<tr>
						<td align="right">联系电话:</td>
						<td><input type="text" name="tel" value="${ulist.tel }"></td>
					</tr>
					<tr>
						<td align="right">地&nbsp;&nbsp;&nbsp;址:</td>
						<td><input type="text" name="address"
							value="${ ulist.address}"></td>
					</tr>
					<tr>
						<td align="right">邮&nbsp;&nbsp;&nbsp;编:</td>
						<td><input type="text" name="postcode"
							value="${ulist.postcode }"></td>
					</tr>
					<tr>
						<td align="right">头&nbsp;&nbsp;&nbsp;像:</td>
						<td><input type="file" name="userPhoto"
							value="${ulist.userPhoto }"></td>
					</tr>
					<tr>
						<td colspan="2" align="center"><input type="submit"
							value="保存"></td>
					</tr>

				</form>
			</table>
	




</body>
<link rel="stylesheet" href="/shop/bootstrap.min.css">
<script src="/shop/jquery-3.2.1.min.js"></script>
<script src="/shop/bootstrap.min.js"></script>

</html>
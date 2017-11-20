<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>修改附图</h1>
<form action="/shop/futu.sw" method="post">
<table>
<tr><td><input type="hidden" value="${photolist.pid }" name="pid">图一</td><td><input type="file" name="w_img" ></td></tr>
<tr><td>图二</td><td><input type="file" name="s_img" ></td></tr>
<tr><td>图三</td><td><input type="file" name="a_img" ></td></tr>
<tr><td>图四</td><td><input type="file" name="d_img" ></td></tr>
<tr><td colspan="2" ><input type="submit" value="保存"></td></tr>
</table>
</form>
</body>
</html>
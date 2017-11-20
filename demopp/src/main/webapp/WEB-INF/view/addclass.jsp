<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加类别</title>
</head>
<body>
<form action="/shop/addclassify.sw" method="post" >
<table class="table table-striped">
<tr><td>类别名称:</td><td><input type="text" name="sname"></td></tr>
<tr><td>类别图片:</td><td><input type="file" name="sPhoto"></td></tr>
<tr><td>商品狀態:</td><td><input type="radio" name="sstate" value="1" checked="checked">上架<input type="radio" name="sstate" value="0">下架</td></tr>
<tr><td colspan="2"><input type="submit" name="保存"></td></tr>
</table>
</form>
</body>
<link rel="stylesheet" href="/shop/bootstrap.min.css">
<script src="/shop/jquery-3.2.1.min.js"></script>
<script src="/shop/bootstrap.min.js"></script>
</html>
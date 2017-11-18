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
类别名称:<input type="text" name="sname"><br>
类别图片:<input type="file" name="sPhoto"><br>
商品狀態:<input type="radio" name="sstate" value="1" checked="checked">上架<input type="radio" name="sstate" value="0">下架<br>
<input type="submit" name="保存">
</form>
</body>
</html>
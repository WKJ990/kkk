<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Insert title here</title>
     <h3>这是管理员界面</h3>
    <h3>添加用户</h3>
<form action="/shop/adduser.sw" method="post">
用户名:<input type="text" name="username" /><br>
密 &nbsp;&nbsp;&nbsp;码:<input type="password" name="password" /><br>
姓 &nbsp;&nbsp;&nbsp;名:<input type="text" name="realName" placeholder="真实姓名"><br>
电 &nbsp;&nbsp;&nbsp;话:<input type="text" name="tel"><br>
地 &nbsp;&nbsp;&nbsp;址:<input type="text" name="address"><br>
邮 &nbsp;&nbsp;&nbsp;编:<input type="text" name="postcode" placeholder="8位数以内"><br>
头 &nbsp;&nbsp;&nbsp;像:<input type="file" name="userPhoto"><br>
<input type="submit" value="保存" >
</form>
</body>
<link rel="stylesheet" href="/shop/bootstrap.min.css">
<script src="/shop/jquery-3.2.1.min.js"></script>
<script src="/shop/bootstrap.min.js"></script>

</html>
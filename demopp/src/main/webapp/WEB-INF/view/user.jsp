<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
       <%@ taglib uri="http://jpager.com/taglibs/page" prefix="page"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Insert title here</title>    
     <h3>用户</h3>
     <div>
     <form action="/shop/user.sw" method="post">
     用户名:<input type="text" name="username">姓名:<input type="text" name="realName"><input type="submit" value="查询">
     </form>
     </div>
    
		<table class="table table-hover" >
			<tr>
				<td>用户ID</td>
				<td>用户名</td>
				<td>密码</td>
				<td>真实姓名</td>
				<td>联系电话</td>
				<td>地址</td>
				<td>邮编</td>
				<td>头像路径</td>
				<td>等级</td>
				<td>积分</td>
			</tr>
			<page:pager dz="10">
			<c:forEach items="${userlist }" var="u" varStatus="status">
			<page:item nr="${status.count}">
			<tr>
				<td>${u.uid }</td>
				<td>${u.username }</td>
				<td>${u.password }</td>
				<td>${u.realName }</td>
				<td>${u.tel }</td>
				<td>${u.address }</td>
				<td>${u.postcode }</td>
				<td>${u.userPhoto }</td>
				<td>${u.userGrade }</td>
				<td>${u.userintegral }</td>
			</tr>
			</page:item>
			</c:forEach>
			</page:pager>
			<tr><td colspan="10" align="center"><page:bt/></td></tr>
		</table>
</body>

<link rel="stylesheet" href="/shop/bootstrap.min.css">
<script src="/shop/jquery-3.2.1.min.js"></script>
<script src="/shop/bootstrap.min.js"></script>

</html>
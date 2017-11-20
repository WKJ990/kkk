<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0">
<meta name="keywords"
	content="admin, dashboard, bootstrap, template, flat, modern, theme, responsive, fluid, retina, backend, html5, css, css3">
<meta name="description" content="">
<meta name="author" content="ThemeBucket">
<link rel="shortcut icon" href="#" type="image/png">

<title>AdminEx</title>
<style type="text/css">
.frame{
 height: 100%;
 width: 100%
}
.container{
height: 100%;
width: 100%
}

</style>

<script type="text/javascript">
     
      <% String na = request.getParameter("name");
      session.setAttribute("name1", na);
      %>
     
     
 
</script>




<!--dashboard calendar-->
<link href="/shop/css/clndr.css" rel="stylesheet">



<!--common-->
<link href="/shop/css/style.css" rel="stylesheet">
<link href="/shop/css/style-responsive.css" rel="stylesheet">




<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
  <script src="js/html5shiv.js"></script>
  <script src="js/respond.min.js"></script>
  <![endif]-->
</head>

<body class="sticky-header">

	<section>
		<!-- left side start-->
		<div class="left-side sticky-left-side">

			<!--logo and iconic logo start logo -->
			<div class="logo">
				<a href="index.html"><img src="images/logo.png" alt=""></a>
			</div>

			<div class="logo-icon text-center">
				<a href="index.html"><img src="images/logo_icon.png" alt=""></a>
			</div>
			<!--logo and iconic logo end-->

			<div class="left-side-inner">

				<!-- visible to small devices only -->
				<div class="visible-xs hidden-sm hidden-md hidden-lg">
					<div class="media logged-user">
						<img alt="" src="images/photos/user-avatar.png"
							class="media-object">
						<div class="media-body">
							<h4>
								<a href="#">John Doe</a>
							</h4>
							<span>"Hello There..."</span>
						</div>
					</div>

					<h5 class="left-nav-title">Account Information</h5>
					<ul class="nav nav-pills nav-stacked custom-nav">
						<li><a href="#"><i class="fa fa-user"></i> <span>Profile</span></a></li>
						<li><a href="#"><i class="fa fa-cog"></i> <span>Settings</span></a></li>
						<li><a href="#"><i class="fa fa-sign-out"></i> <span>Sign
									Out</span></a></li>
					</ul>
				</div>

				<!--sidebar nav start-->
				<ul class="nav nav-pills nav-stacked custom-nav">
					<li class="active"><a href="index.jsp"><i
							class="fa fa-home"></i> <span>主页</span></a></li>
					<li class="menu-list"><a href=""> <span>商品类别维护</span></a>
						<ul class="sub-menu-list">
							<li><a target="myiframe" href="/shop/classify.sw">类别维护</a></li>
							<li><a target="myiframe" href="/shop/toaddclassify.sw" >添加类别</a></li>
							
						</ul></li>
					<li class="menu-list"><a href=""></i> <span>商品信息维护</span></a>
						<ul class="sub-menu-list">
							<li><a target="myiframe" href="/shop/message.sw">信息维护</a></li>
							<li><a target="myiframe" href="/shop/toaddmessage.sw" >添加信息</a></li>
						</ul></li>
					<li class="menu-list"><a href=""> <span>用户管理</span></a>
						<ul class="sub-menu-list">
							<li><a target="myiframe" href="/shop/user.sw">用户管理</a></li>
							<li><a target="myiframe" href="/shop/toadduser.sw">添加用户</a></li>
						
						</ul></li>
					<li class="menu-list"><a href=""><span>订单管理</span></a>
						<ul class="sub-menu-list">
							<li><a target="myiframe" href="/shop/indent.sw">订单管理</a></li>
							<li><a target="myiframe" href="/shop/toindent.sw">修改状态</a></li>
						</ul></li>
					<li class="menu-list"><a href=""><span>管理员管理</span></a>
						<ul class="sub-menu-list">
							<li><a target="myiframe" href="/shop/manage.sw">管理员</a></li>
							
						</ul></li>

				</ul>
				<!--sidebar nav end-->

			</div>
		</div>
		<!-- main content start-->
		<div class="main-content">

			<!-- header section start-->
			<div class="header-section">

				<!--toggle button start-->
				<a class="toggle-btn"><i class="fa fa-bars"></i></a>
				<!--toggle button end-->

				<!--search start-->
				<form class="searchform" action="index.html" method="post">
					<input type="text" class="form-control" name="keyword"
						placeholder="Search here..." />
				</form>
				<!--search end-->

				<!--notification menu start -->
				<div class="menu-right">
					<ul class="notification-menu">
						<li><a href="#" class="btn btn-default dropdown-toggle"
							data-toggle="dropdown"> <img
								src="images/photos/user-avatar.png" alt="" /> <%= session.getAttribute("name1") %> <span
								class="caret"></span>
						</a>
							<ul class="dropdown-menu dropdown-menu-usermenu pull-right">
								<li><a href="/shop/login/login.jsp"><i class="fa fa-user"></i>退出</a></li>
							</ul></li>

					</ul>
				</div>
			</div>
			<div class="container">
				<div class="frame">
					<iframe width=100%; height=100%; name="myiframe" frameborder=0
						marginheight=0 marginwidth=0 scrolling=no
						src='/shop/main.jsp'></iframe>
				</div>
			</div>
		</div>
	</section>

	<!-- Placed js at the end of the document so the pages load faster -->
	<script src="/shop/js/jquery-1.10.2.min.js"></script>
	<script src="/shop/js/jquery-ui-1.9.2.custom.min.js"></script>
	<script src="/shop/js/jquery-migrate-1.2.1.min.js"></script>
	<script src="/shop/js/bootstrap.min.js"></script>
	<script src="/shop/js/modernizr.min.js"></script>
	<script src="/shop/js/jquery.nicescroll.js"></script>


	<!--Calendar-->
	<script src="/shop/js/calendar/clndr.js"></script>
	<script src="/shop/js/calendar/evnt.calendar.init.js"></script>
	<script src="/shop/js/calendar/moment-2.2.1.js"></script>


	<!--common scripts for all pages-->
	<script src="/shop/js/scripts.js"></script>

	<script type="text/javascript">

</script>

</body>
</html>

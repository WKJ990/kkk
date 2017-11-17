<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0">
<meta name="keywords"
	content="admin, dashboard, bootstrap, template, flat, modern, theme, responsive, fluid, retina, backend, html5, css, css3">
<meta name="description" content="">
<meta name="author" content="ThemeBucket">
<link rel="shortcut icon" href="#" type="image/png">
<title>Insert title here</title>
  <!--dashboard calendar-->
  <link href="/demopp/css/clndr.css" rel="stylesheet">



  <!--common-->
  <link href="/demopp/css/style.css" rel="stylesheet">
  <link href="/demopp/css/style-responsive.css" rel="stylesheet">




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
                    <img alt="" src="images/photos/user-avatar.png" class="media-object">
                    <div class="media-body">
                        <h4><a href="#">John Doe</a></h4>
                        <span>"Hello There..."</span>
                    </div>
                </div>

                <h5 class="left-nav-title">Account Information</h5>
                <ul class="nav nav-pills nav-stacked custom-nav">
                  <li><a href="#"><i class="fa fa-user"></i> <span>Profile</span></a></li>
                  <li><a href="#"><i class="fa fa-cog"></i> <span>Settings</span></a></li>
                  <li><a href="#"><i class="fa fa-sign-out"></i> <span>Sign Out</span></a></li>
                </ul>
            </div>

            <!--sidebar nav start-->
            <ul class="nav nav-pills nav-stacked custom-nav">
                <li class="active"><a href="index.html"><i class="fa fa-home"></i> <span>主页</span></a></li>
                <li class="menu-list"><a href=""> <span>商品类别维护</span></a>
                    <ul class="sub-menu-list">
                        <li><a href="/demopp/classify.sw">类别维护</a></li>
                        <li><a >添加类别</a></li>
                        <li><a >类别维护</a></li>
                        <li><a >查询类别</a></li>
                    </ul>
                </li>
                <li class="menu-list"><a href=""></i> <span>商品信息维护</span></a>
                    <ul class="sub-menu-list">
                        <li><a href="/demopp/message.sw" >信息维护</a></li>
                        <li><a >添加信息</a></li>
                        <li><a >信息维护</a></li>
                        <li><a >查询信息</a></li>
                    </ul>
                </li>
                <li class="menu-list"><a href=""> <span>用户管理</span></a>
                    <ul class="sub-menu-list">
                        <li><a href="/demopp/user.sw" >用户管理</a></li>
                        <li><a href="/demopp/toadduser.sw" >添加用户</a></li>
                        <li><a >删除用户</a></li>
                        <li><a >查询用户</a></li>
                    </ul>
                </li>
                <li class="menu-list"><a href=""><span>订单管理</span></a>
                    <ul class="sub-menu-list">
                        <li><a href="/demopp/indent.sw" >订单管理</a></li>
                        <li><a >订单查询</a></li>
                        <li><a >订单管理</a></li>
                    </ul>
                </li>
                <li class="menu-list"><a href=""><span>管理员管理</span></a>
                    <ul class="sub-menu-list">
                        <li><a href="#" >管理员</a></li>
                        <li><a >管理员</a></li>
                        <li><a >管理员</a></li>
                    </ul>
                </li>

            </ul>
            <!--sidebar nav end-->

        </div>
    </div>  <!-- main content start-->
    <div class="main-content" >

        <!-- header section start-->
        <div class="header-section">

            <!--toggle button start-->
            <a class="toggle-btn"><i class="fa fa-bars"></i></a>
            <!--toggle button end-->

            <!--search start-->
            <form class="searchform" action="index.html" method="post">
                <input type="text" class="form-control" name="keyword" placeholder="Search here..." />
            </form>
            <!--search end-->

            <!--notification menu start -->
            <div class="menu-right">
                <ul class="notification-menu">   
                    <li>
                        <a href="#" class="btn btn-default dropdown-toggle" data-toggle="dropdown">
                            <img src="images/photos/user-avatar.png" alt="" />
                            管理员
                            <span class="caret"></span>
                        </a>
                        <ul class="dropdown-menu dropdown-menu-usermenu pull-right">
                            <li><a href="#"><i class="fa fa-user"></i>  Profile</a></li>
                            <li><a href="#"><i class="fa fa-cog"></i>  Settings</a></li>
                            <li><a href="#"><i class="fa fa-sign-out"></i> Log Out</a></li>
                        </ul>
                    </li>

                </ul>
            </div> 
        </div>
     <div style="min-height: 800px">
     <h3>这是管理员界面</h3>
    <h1>商品信息维护</h1>

<div class="container ">
		<table class="table table-hover" >
			<tr>
				<td>商品ID</td>
				<td>商品名称</td>
				<td>销售数量</td>
				<td>商品图片</td>
				<td>原价</td>
				<td>销售价格</td>
				<td>商品描述</td>
				<td>管理操作</td>
			</tr>
			<c:forEach items="${ prolist}" var="p">
			<tr>
				<td>${p.pid }</td>
				<td>${p.pname }</td>
				<td>${p.saleCount }</td>
				<td>${p.image }</td>
				<td>${p.price }</td>
				<td>${p.saleprice }</td>
				<td>${p.introduce }</td>
				<td><a href="#">D</a></td>
			</tr>
			</c:forEach>
		</table>
	</div>
     </div>
    </div>
</section>

<!-- Placed js at the end of the document so the pages load faster -->
<script src="/demopp/js/jquery-1.10.2.min.js"></script>
<script src="/demopp/js/jquery-ui-1.9.2.custom.min.js"></script>
<script src="/demopp/js/jquery-migrate-1.2.1.min.js"></script>
<script src="/demopp/js/bootstrap.min.js"></script>
<script src="/demopp/js/modernizr.min.js"></script>
<script src="/demopp/js/jquery.nicescroll.js"></script>


<!--Calendar-->
<script src="/demopp/js/calendar/clndr.js"></script>
<script src="/demopp/js/calendar/evnt.calendar.init.js"></script>
<script src="/demopp/js/calendar/moment-2.2.1.js"></script>


<!--common scripts for all pages-->
<script src="/demopp/js/scripts.js"></script>

<script type="text/javascript">

</script>


</body>

</html>
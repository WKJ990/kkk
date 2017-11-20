<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en" class="no-js">
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge"> 
<meta name="viewport" content="width=device-width, initial-scale=1"> 
<title>login</title>
<link rel="stylesheet" type="text/css" href="css/normalize.css" />
<link rel="stylesheet" type="text/css" href="css/demo.css" />
<!--必要样式-->
<link rel="stylesheet" type="text/css" href="css/component.css" />
<!--[if IE]>
<script src="js/html5.js"></script>
<![endif]-->
<link rel="stylesheet" type="text/css" href="/shop/themes/default/easyui.css">   
<link rel="stylesheet" type="text/css" href="/shop/themes/icon.css">   
<script type="text/javascript" src="/shop/jquery-1.8.0.min.js"></script>   
<script type="text/javascript" src="/shop/jquery.easyui.min.js"></script>
<script type="text/javascript" src="/shop/locale/easyui-lang-zh_CN.js"></script>
<style type="text/css">
     h2{text-align: center;}
</style>
<script type="text/javascript">
   function getRanNum(){  
    var result = [];  
     for(var i=0;i<4;i++){  
        var ranNum = Math.ceil(Math.random() * 25); //生成一个0到25的数字  
         //大写字母'A'的ASCII是65,A~Z的ASCII码就是65 + 0~25;然后调用String.fromCharCode()传入ASCII值返回相应的字符并push进数组里  
         result.push(String.fromCharCode(65+ranNum));  
     }  
      document.getElementById("suiji").innerHTML=result.join('');   
 }   
   
   function buttonlogin(){
	   console.log($('#yz').val());
	   console.log($('#suiji').text());
	   console.log($('#logname').val());
	   var name = $('#logname').val();
	   
	 if($('#yz').val()==$('#suiji').text()){
		   	$('#uform').form('submit',{
		   		
		   		url: '/shop/login.sw',
		   	    success : function(data){
		   	    	console.log('data',data);
		   	    	
		   	        console.log('123456');
		   	    	   if(data=="WU"){
		   	    		   alert('不是管理员，没有权限！');
		   	       }else if(data=="OK"){
		   	    	
		   	    	alert('登陆成功！');
		   	    		window.location.href='/shop/index.jsp?name='+name;
		   	       }
		   	    	 else if(data=="ERR"){
		   	    	    alert('用户名或密码错误！');  
		   	    	 $('#uform').form('clear');
		   	       }else if(data=="NULL"){
		   	    	    alert('用户名或密码不能为空！');
		  	    	  
		   	       }
		   	}});
		 
	 }else{
		 alert('验证码输入错误！');
	 }

   }
</script>
</head>
<body onload="getRanNum()">
		<div class="container demo-1">
			<div class="content">
				<div id="large-header" class="large-header">
					<canvas id="demo-canvas"></canvas>
					<div class="logo_box">
						<h2>后&nbsp;&nbsp;台&nbsp;&nbsp;管&nbsp;理&nbsp;</h2>
						<form id="uform" method="post">
							<div class="input_outer">
								<span class="u_user"></span>
								<input id="logname" name="logname" class="text" style="color: #FFFFFF !important" type="text" placeholder="请输入账户">
							</div>
							<div class="input_outer">
								<span class="us_uer"></span>
								<input name="logpass" class="text" style="color: #FFFFFF !important; position:absolute; z-index:100;"value="" type="password" placeholder="请输入密码">
							  
							</div>
							<div class="input_outer">
								<span class="us_uer"></span>
								<input name="yanzheng" id="yz" class="text" style="color: #FFFFFF !important; position:absolute; z-index:100;"value="" type="text" placeholder="请输入验证码">
							</div>
							<table align="center">
							   <tr>
							      <td align="center" width="85"><div id="suiji" style="font-style:oblique;font-weight:bold;font-weight:normal;font-size:30px;color: pink;" ></div></td>
                                  <td align="center" width="150"> 
                                    <a href="javascript:getRanNum()"><font color="white">看不清,换一张</font></a>
                                   </td>
							   </tr>
							</table>
							<div class="mb2"><a class="act-but submit" href="javascript:buttonlogin();" style="color: #FFFFFF">登录</a></div>
						</form>
					</div>
				</div>
			</div>
		</div><!-- /container -->
		<script src="js/TweenLite.min.js"></script>
		<script src="js/EasePack.min.js"></script>
		<script src="js/rAF.js"></script>
		<script src="js/demo-1.js"></script>
		<div style="text-align:center;">

</div>
	</body>
</html>
</html>
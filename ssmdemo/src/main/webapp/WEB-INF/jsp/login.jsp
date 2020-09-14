<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<meta charset="UTF-8">
<title>登录页面</title>
<!-- Bootstrap -->
<link href="css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-info">
	<div class="container">
	  	<div class="bg-primary"  style="width:100%; height: 70px;padding-top: 10px;">
	       <h2 align="center">用户登录</h2>
	   </div>
		<br>
		<br>
		<form action="login" name="myform" method="post"  class="form-horizontal" role="form" >
			<div class="form-group has-success">
				<label class="col-sm-2 col-md-2 control-label">用户名</label>
				<div class="col-sm-4 col-md-4">
					<input type="text" class="form-control"
					 placeholder="请输入您的用户名"
					 name="uname">
				</div>
			</div>
		
			<div class="form-group has-success">
				  <label class="col-sm-2 col-md-2 control-label">密码</label>
				  <div class="col-sm-4 col-md-4">
		  				<input type="password" class="form-control"
					 placeholder="请输入您的密码" name="pwd">
				  </div>
			 </div>
			 
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-success" >登录</button>
					<button type="reset" class="btn btn-primary" >重置</button>
				</div>
			</div>
		</form>
		${erroMessage }
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title></title>
		<link rel="stylesheet" type="text/css" href="css/login.css"/>
		<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>
		<link rel="stylesheet" type="text/css" href="css/font-awesome.css"/>
	</head>
	<body>
		<canvas id="canvas" width="" height=""></canvas>
		<div class="container-fluid">
			<div class="row">
				<div class= "content col-lg-6 col-sm-8 col-xs-8 ml-auto">
				<header><h2>计算机专业课程考试系统</h2></header>
                <form class="form-horizontal">
                	<!--学校-->
                	<div class="form-group">
					    <label for="inputUser" class="col-sm-2 control-label">
					    	<span class="glyphicon glyphicon-education"></span>  
					    </label>
					    <div class="col-sm-10">
					    	<select class="select">
						  	    <option value="volvo">衡阳师范学院</option>
							    <option value="saab">华南师范大学</option>
							    <option value="opel">湖南师范大学</option>
							    <option value="audi">暨南大学</option>
							    <option value="audi">剑桥大学</option>
							</select>
					    </div>
					</div>
                	<!--学号-->
					<div class="form-group">
					    <label for="inputUser" class="col-sm-2 control-label">
					    	<span class="glyphicon glyphicon-user"></span>  
					    </label>
					    <div class="col-sm-10">
					        <input type="text" class="form-control" id="inputUser" placeholder="请输入学号">
					    </div>
					</div>
					<!--密码-->
					<div class="form-group">
					    <label for="inputPassword3" class="col-sm-2 control-label">
					    	<span class="glyphicon glyphicon-lock"></span>
					    </label>
					    <div class="col-sm-10">
					        <input type="password" class="form-control" id="inputPassword3" placeholder="请输入密码">
					    </div>
					</div>
					<!--验证码-->
					<div class="form-group">
					    <label for="inputPassword3" class="col-sm-2 control-label">
					    	<span class="glyphicon glyphicon-barcode"></span>
					    </label>
					    <div class="col-sm-10">
					        <input type="image" class="form-control" id="inputImage" placeholder="请输入验证码">
					    </div>
					</div>
					<!--忘记密码-->
					<div class="form-group">
					    <div class="col-sm-offset-2 col-sm-10">
					        <div class="checkbox">
						        <label>
						          <input type="checkbox"> 记住密码
						        </label>
						        <label id="fg">
						          <input type="checkbox"> 忘记密码
						        </label>
					        </div>
					    </div>
					</div>
					<!--登录，注册-->
					<div class="form-group">
					    <div class="col-sm-offset-2 col-sm-10">
					        <button id="log" type="submit" class="btn btn-default" onclick="window.location.href='main.html'">登录</button>
					        <button id="reg" type="submit" class="btn btn-default" onclick="window.location.href='register.html'">注册</button>
					    </div>
					</div>
				</form>
                </div>
            </div>
        </div>
	</body>
	<script type="text/javascript" src="js/login.js"></script>
</html>

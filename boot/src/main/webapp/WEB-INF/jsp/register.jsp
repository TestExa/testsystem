<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
		<link rel="stylesheet" type="text/css" href="css/register.css"/>
		<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>
		<link rel="stylesheet" type="text/css" href="css/font-awesome.css"/>
	</head>
	<body>
		<canvas id="canvas1" width="" height=""></canvas>
		<div class="container-fluid">
			<div class="row">
				<div class= "content col-lg-6 col-sm-8 col-xs-8 ml-auto">
                <form class="form-horizontal">
                	<!--学校-->
                	<div class="form-group">
					    <label for="inputSchool" class="col-sm-2 control-label">
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
					<!--用户名-->
					<div class="form-group">
					    <label for="inputUsername" class="col-sm-2 control-label">
					    	<span class="glyphicon glyphicon-star"></span>  
					    </label>
					    <div class="col-sm-10">
					        <input type="text" class="form-control" id="inputUsername" placeholder="请输入姓名">
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
					<!--确认密码-->
					<div class="form-group">
					    <label for="inputConfir" class="col-sm-2 control-label">
					    	<span class="glyphicon glyphicon-check"></span>  
					    </label>
					    <div class="col-sm-10">
					        <input type="text" class="form-control" id="inputConfir" placeholder="请确认密码">
					    </div>
					</div>
					<!--手机号码-->
					<div class="form-group">
					    <label for="inputTel" class="col-sm-2 control-label">
					    	<span class="glyphicon glyphicon-th"></span>  
					    </label>
					    <div class="col-sm-10">
					        <input type="text" class="form-control" id="inputTel" placeholder="请输入手机号码">
					    </div>
					</div>
					<!--邮箱-->
					<div class="form-group">
					    <label for="inputEmail" class="col-sm-2 control-label">
					    	<span class="glyphicon glyphicon-envelope"></span>  
					    </label>
					    <div class="col-sm-10">
					        <input type="text" class="form-control" id="inputEmail" placeholder="请确认邮箱">
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
					<!--注册-->
					<div class="form-group">
					    <div class="col-sm-offset-2 col-sm-10">
					        <button id="reg" type="submit" class="btn btn-default">注册</button>
					    </div>
					</div>
				</form>
                </div>
            </div>
        </div>
	</body>
	<script type="text/javascript" src="js/register.js"></script>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<link rel="stylesheet" type="text/css" href="css/login.css"/>
		<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>
		<link rel="stylesheet" type="text/css" href="css/font-awesome.css"/>
		<link rel="stylesheet" type="text/css" href="css/lgymove.css"/>
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
					    	<select class="select" id="exsid">
					    		<c:forEach items="${list}" var="l">
						  	    	<option value="${l.exsid}">${l.exsname}</option>
							    </c:forEach>
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
					    <div id="imgscode" class="col-sm-10">
					        <input type="text" class="form-control" id="inputImage" placeholder="点击验证" readonly="readonly">
					    </div>
					</div>
					<!--忘记密码-->
					<div class="form-group">
					    <div class="col-sm-offset-2 col-sm-10">
					        <div class="checkbox">
						        <label>
						          <input type="checkbox"> 记住密码
						        </label>
						        <a href="#" style="float:right">忘记密码</a>
					        </div>
					    </div>
					</div>
					<h4 id="error" style="color:red;margin-left:50px;"></h4>
					<!--登录，注册-->
					<div class="form-group">
					    <div class="col-sm-offset-2 col-sm-10">
					        <button id="log" type="button" class="btn btn-default">登录</button>
					        <button id="reg" type="button" class="btn btn-default" onclick="window.location.href='register.do'">注册</button>
					    </div>
					</div>
				</form>
                </div>
            </div>
        </div>
	</body>
	<script type="text/javascript" src="js/login.js"></script>
	<script type="text/javascript" src="js/jquery-1.11.3.min.js"></script>
	<script type="text/javascript" src="js/jquery.lgymove.js"></script>
	
	<script type="text/javascript">
		$("#log").click(function() {
			var status = "${status}";
			var name = $("#inputUser").val();
			var pwd = $("#inputPassword3").val();
			var exsid = $("#exsid option:selected").val();
			console.log(status);
			console.log(name);
			console.log(pwd);
			console.log(exsid);
			
			$.post("logining.do",{
				status:status,
				name:name,
				pwd:pwd,
				exsid:exsid
			},function(data){
				if (data == "OK1") {
					winhtmlw.location.href="main.html";
				} else if (data == "OK2") {
					window.location.href="manage.html";
				} else {
					$("#error").html(data);
				}
			});
		});
		
		$("#inputImage").click(function(){
			$("#imgscode").imgcode(); 
		});
	</script>
</html>
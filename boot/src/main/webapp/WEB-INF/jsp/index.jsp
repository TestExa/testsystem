<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title></title>
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
   		<meta name="viewport" content="width=device-width, initial-scale=1">
   		<link href="css/bootstrap.min.css" rel="stylesheet">
   		<link rel="stylesheet" href="css/font-awesome.min.css" />
   		<link rel="stylesheet" type="text/css" href="owl-carousel/owl.carousel.css"/>
   		<link rel="stylesheet" type="text/css" href="owl-carousel/owl.theme.css"/>
   		<link rel="stylesheet" type="text/css" href="css/style.css"/>
		<link rel="stylesheet" type="text/css" href="css/font-awesome.css"/>
		<link rel="stylesheet" href="owl-carousel/owl.transitions.css" />
	</head>
	<body style="height: 1720px;">
		<!--导航栏-->
		<nav id="menu" class="navbar navbar-default navbar-fixed-top">
			<div class="container">
				<div class="navbar-header">
					<button class="navbar-toggle" data-toggle="collapse" data-target='#navbar-collapse'>
						<span class="icon-bar"></span>
              			<span class="icon-bar"></span>
                		<span class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="#">专业课在线考试系统</a>
				</div>
				<div class="navbar-collapse collapse" id="navbar-collapse">
					<ul class="nav navbar-nav navbar-right">
						<li class="active"><a href="#home" >主页</a></li>
						<li><a href="#function">功能</a></li>
						<li><a href="#team">团队</a></li>
						<li><a href="login.do?index=1">学生登录</a></li>
						<li><a href="login.do?index=2">管理员登录</a></li>
					</ul>
				</div>
			</div>
		</nav>
		<!--主页-->
		<div id="home" class="text-center">
			<!--<img src="img/bg4.jpg"/>-->
			<div class="overlay">
				<div class="content">
					<h1><strong class="colors">欢迎使用！</strong></h1>
					<a href="#function" class="fa fa-angle-down"></a>
				</div>
			</div>
		</div>
		<!--功能介绍-->
		<div id="function">
			<div class="container">
				<div class="row">
					<div class="col-lg-6">
						<img src="img/bg2.jpg" alt="" class="img-responsive" />
					</div>
					<div class="col-lg-6">
						<div class="section-title">
							<h2><strong>既然选择，便风雨兼程</strong></h2>
							<h4>既然选择，便风雨兼程</h4>
							<!--<hr />分隔线-->
						</div>
						<!--<div class="clearfix"></div>-->
						<p class="intro">既然选择，便风雨兼程</p>
						<ul class="list-unstyled about-list"><!--bootstrap清除圆点-->
							<li><i class="fa fa-dot-circle-o"></i><strong> 功能</strong>-<em></em>既然选择，便风雨兼程</li>
							<li><i class="fa fa-dot-circle-o"></i><strong> 技术点</strong>-<em></em>既然选择，便风雨兼程</li>
							<li><i class="fa fa-dot-circle-o"></i><strong> 创新</strong>-<em></em>既然选择，便风雨兼程</li>
						</ul>
					</div>
				</div>
			</div>
		</div>
		<!--团队-->
		<div id="team" class="text-center">
			<div class="overlay">
				<div class="container">
					<div class="section-title center">
						<h2><strong>忽而今夏</strong></h2>
						<div id="team">
							<div class="item">
								<div class="row">
									<div class="col-md-4">
										<div class="thumbnail">
											<img src="img/bg3.jpg" alt=""class="img-circle img-item"/>
											<div class="caption">
												<h3>李宏坤</h3>
												<p>组长</p>
												<p>集帅气与才华于一身的组长</p>
										    </div>
										</div>
									</div>
									<div class="col-md-4">
										<div class="thumbnail">
										<img src="img/bg3.jpg" alt=""class="img-circle img-item"/>
											<div class="caption">
												<h3>彭承辉</h3>
												<p>组员</p>
												<p>集帅气与机智于一身的组员</p>
											</div>
										</div>
									</div>
									<div class="col-md-4">
										<div class="thumbnail">
										<img src="img/bg3.jpg" alt=""class="img-circle img-item"/>
											<div class="caption">
												<h3>谢舞</h3>
												<p>组员</p>
												<p>低调低调</p>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</body>
	<script type="text/javascript" src='js/jquery-2.1.0.js'></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="owl-carousel/owl.carousel.js"></script>
    <script>
    	$(window).bind("scroll",function(){
    		var navHeight=$(window).height()-100;//获取当前窗口的高度
    		var	scrollTop=$(window).scrollTop()//获取滚动条top值
    		if(scrollTop>navHeight){
    			$('.navbar-default').addClass("on")
    		}else{
    			$('.navbar-default').removeClass('on')
    		}
    	})
    
    </script>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
		<style type="text/css">
			*{
				margin: 0;
				padding: 0;
			}
			.container{
				width: 790px;
				margin: 0 auto;
				letter-spacing: 1px;
				border: 1px solid lightblue;
			}
			.zhuguanti{
				font-size: 16px;
				margin-top: 6px;
				border: 1px solid lightblue;
			}
			.title{
				background-color: lightblue;
				
			}
		</style>
	</head>
	<body>
		<div class="container">
			<p>注：每题10分，共20分</p>
			<div class="zhuguanti">
				<p class="title">1.现有如下关系模式：借阅（图书编号，书名，作者名，出版社，读者编号，读者姓名，借阅日期，归还日期），
					基本函数依赖F={图书编号——>（书名，作者名，出版社），读者编号——>读者姓名，（图书编号，读者编号，借阅日期）——>归还日期}
				</p><br />
				<p>
					(1)读者编号是候选码吗？<br />
					(2)写出该关系模式的主码。<br />
					(3)该关系模式中是否存在非主属性对码的部分函数依赖？如果存在，请写出一个。<br />
					(4)该关系模式满足第几范式？并说明理由。<br />
				</p><br />
				<p>解：<span contenteditable="true">()</span></p>
			</div>
			<input class="jiaojuan" type="button" value="交卷" style="width: 70px; height: 40px; background: cornflowerblue;color: #FFFFFF;margin-left:330px;margin-top: 20px;"  />	
			
		</div>
	</body>
</html>

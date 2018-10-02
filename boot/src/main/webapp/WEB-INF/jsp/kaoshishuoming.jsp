<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
		<style type="text/css">
			.container{
				width: 500px;
				height: 300px;
				border: 2px solid cornflowerblue;
				margin-left: 250px;
				/*padding:5px 0;*/
				
			}
			input{
				background-color: cornflowerblue;
				color: white;
				width: 148px;
				height: 40px;
				margin-left: 180px;
				margin-top: 20px;
			}
			h3{
				height: 30px;
				color: white;
				background-color:cornflowerblue;
				text-align: center;
				margin-top: auto;
			}
			p{
				margin-left: 6px;
				letter-spacing: 1px;
				/*border: 1px solid #4169E1;*/
			}
		</style>
	</head>
	<body>
		<div class="container">
			<h3>考试说明</h3>
			<!--<hr style="color: darkgray;width: 400px;">-->
			<p>
				1、本次考试时长为2小时<br />
				2、试卷题型有单选题、多选题、判断题、填空题、主观题，共100分<br />
				3、诚信考试，严禁舞弊
			</p>
			<hr style="color: darkgray;width: 400px;">
			<input type="button" value="我已阅读并同意该说明"/>
		</div>
	</body>
</html>

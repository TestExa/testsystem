<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
		<style type="text/css">
			form{
				text-align: center;
				margin-top: 70px;
			}
			.select{
				color: #000000;
				width: 262px;
				height: 34px;
				border-radius: 5px;
			}
			#classname{
				color: #000000;
				width: 260px;
				height: 29px;
				border-radius: 5px;
				margin-top: 10px;
			}
			#chaxun{
				color: black;
				/*border: 1px solid gray;*/
				border-radius: 5px;
				margin-top: 20px;
			}
		</style>
	</head>
	<body>
		<form action="">
			<!--考试时间：<input type="" name="" id="" value="" placeholder="请输入考试科目" /><br />-->
			考试时间：<select class="select">
				  	    <option value="volvo">2018-2019-第一学期</option>
					    <option value="saab">2017-2018-第二学期</option>
					    <option value="opel">2017-2018-第一学期</option>
					    <option value="audi">2016-2017-第二学期</option>
					    <option value="audi">2016-2017-第一学期</option>
					</select><br />
			课程名称：<input type="text" id="classname"/><br />
			<input type="button" name="" id="chaxun" value="查询" />
		</form>
	</body>
</html>

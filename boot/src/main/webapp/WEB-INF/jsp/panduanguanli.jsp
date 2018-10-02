<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
		<style type="text/css">
			.container{
				width: 480px;
				height: 90px;
				border: 1px solid lightblue;
				margin-top: 30px;
				position: absolute;
				left: 300px;
				
			}
			#kemu{
				width: 399px;
				border: 1px solid black;
				border-radius: 2px;
				height: 25px;

			}
			#confir{
				position: absolute;
				left: 200px;
				top: 45px;
			}
		</style>
	</head>
	<body>
		<div class="container">
			<table border="1">
				<tr>
				  <td>考试科目</td>
				  <td>
				  	<select id="kemu">
					  	<option>数据库</option>
					  	<option>操作系统</option>
					  	<option>数据结构</option>
					  	<option>通信原理</option>
				  </select>
				  </td>
				</tr>
			</table>
			<input type="button" name="" id="confir" value="确定" style="position: absolute;left: 240px;margin-top: 5px;margin-bottom:5px;width: 70px;height: 38px;background-color: cornflowerblue;color: white;"/>
		</div>
	</body>
</html>

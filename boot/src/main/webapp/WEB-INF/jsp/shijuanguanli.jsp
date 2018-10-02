<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
	</head>
	<link rel="stylesheet" type="text/css" href="style/authority/bootstrap.css"/>
	<style type="text/css">
		*{
			margin: 0;
			padding: 0;
		}
		.container{
				width: 478px;
				margin: 0 auto;
				/*border: 1px solid lightblue;*/
				margin-top: 30px;
				margin-bottom: 30px;
				position: absolute;
				left: 260px;
			}
			/*.left{
				width: 387px;
				margin-left: 10px;
				margin-top: 10px;
			}*/
			#kemu{
				width: 401px;
				border: 1px solid black;
				border-radius: 2px;
				height: 25px;
			}
			#examname{
				width: 399px;
				/*margin-top: 20px;*/
				/*margin-bottom: 5px;*/
				border: 1px solid black;
				/*border-radius: 2px;*/
				height: 25px;
				/*width: ;
				height: auto;*/
			}
			/*.datetime{
				margin-top: 20px;
				border: 1px solid black;
				border-radius: 2px;
				height: 20px;
			}*/
			#begintime{
				width: 173px;
			}
			#endtime{
				position: absolute;
				left: 293px;
				width: 175px;
			}
			.tm{
				/*margin-top:20px ;*/
				/*width: 390px;*/
				border: 1px solid black;
				border-radius: 2px;
				height: 25px;
			}
			#pass{
				width: 399px;
				/*margin-top: 20px;*/
				/*margin-bottom: 5px;*/
				border: 1px solid black;
				border-radius: 2px;
				height: 25px;
			}
			table{
				width:477px;
				
			}
			tr{
				border: 1px solid #4169E1;
			}
			tr,td,th{
				border: none;
			}
			.num{
				text-align: center;
			}
	</style>
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
				<tr>
				  <td>试卷名称</td>
				  <td><input type="text" id="examname"/></td>
				</tr>
				<tr>
					<td>考试时间</td>
					<td><input type="datetime-local" id="begintime" class="tm" />&nbsp;至<input type="datetime-local" id="endtime" class="tm"/></td>
				</tr>
				<tr>
					<td>及格分数</td>
					<td><input type="text" id="pass" /></td>
				</tr>
				<!--单选题-->
				<table border="1">
				<caption><b>单选题</b></caption>
				<tr>
				  <th>题目数</th>
				  <th colspan="2">每题分值</th>
				</tr>
				<tr class="num">
				  <td>
				  	<select>
				  	   <option value="">10</option>
				  	   <option value="">11</option>
				  	   <option value="">12</option>
				  	   <option value="">13</option>
				  	   <option value="">14</option>
				  	   <option value="">15</option>
				  	</select>
				  </td>
				  <td>
				  	<select>
				  	   <option value="">1</option>
				  	   <option value="">1.5</option>
				  	   <option value="">2</option>
				  	</select>
				  </td>
				</tr>
				</table>
				<!--多选题-->
				<table border="1">
				<caption><b>多选题</b></caption>
				<tr>
				  <th>题目数</th>
				  <th colspan="2">每题分值</th>
				</tr>
				<tr class="num">
				  <td>
				  	<select>
				  	   <option value="">10</option>
				  	   <option value="">11</option>
				  	   <option value="">12</option>
				  	   <option value="">13</option>
				  	   <option value="">14</option>
				  	   <option value="">15</option>
				  	</select>
				  </td>
				  <td>
				  	<select>
				  	   <option value="">1</option>
				  	   <option value="">1.5</option>
				  	   <option value="">2</option>
				  	</select>
				  </td>
				</tr>
				</table>
				<!--判断题-->
				<table border="1">
				<caption><b>判断题</b></caption>
				<tr>
				  <th>题目数</th>
				  <th colspan="2">每题分值</th>
				</tr>
				<tr class="num">
				  <td>
				  	<select>
				  	   <option value="">10</option>
				  	   <option value="">11</option>
				  	   <option value="">12</option>
				  	   <option value="">13</option>
				  	   <option value="">14</option>
				  	   <option value="">15</option>
				  	</select>
				  </td>
				  <td>
				  	<select>
				  	   <option value="">1</option>
				  	   <option value="">1.5</option>
				  	   <option value="">2</option>
				  	</select>
				  </td>
				</tr>
				</table>
				<!--填空题-->
				<table border="1">
				<caption><b>填空题</b></caption>
				<tr>
				  <th>题目数</th>
				  <th colspan="2">每题分值</th>
				</tr>
				<tr class="num">
				  <td>
				  	<select>
				  	   <option value="">10</option>
				  	   <option value="">9</option>
				  	   <option value="">8</option>
				  	   <option value="">7</option>
				  	   <option value="">6</option>
				  	   <option value="">5</option>
				  	</select>
				  </td>
				  <td>
				  	<select>
				  	   <option value="">1</option>
				  	   <option value="">1.5</option>
				  	   <option value="">2</option>
				  	</select>
				  </td>
				</tr>
				</table>
				<!--主观题-->
				<table border="1">
				<caption><b>主观题</b></caption>
				<tr>
				  <th>题目数</th>
				  <th colspan="2">每题分值</th>
				</tr>
				<tr class="num">
				  <td>
				  	<select>
				  	   <option value="">1</option>
				  	   <option value="">2</option>
				  	   <option value="">3</option>
				  	   <option value="">4</option>
				  	   <option value="">5</option>
				  	</select>
				  </td>
				  <td>
				  	<select>
				  	   <option value="">6</option>
				  	   <option value="">7</option>
				  	   <option value="">8</option>
				  	   <option value="">9</option>
				  	   <option value="">10</option>
				  	   <option value="">11</option>
				  	   <option value="">12</option>
				  	   <option value="">13</option>
				  	   <option value="">14</option>
				  	   <option value="">15</option>
				  	</select>
				  </td>
				</tr>
				</table>
			</table>
			<input type="button" name="" id="" value="确定" style="position: absolute;left: 240px;margin-top: 5px;margin-bottom:5px;width: 70px;height: 38px;background-color: cornflowerblue;color: white;"/>
		</div>	
	</body>
</html>

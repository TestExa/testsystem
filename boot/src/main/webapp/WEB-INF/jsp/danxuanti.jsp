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
				/*text-align: center;*/
				width: 790px;
				margin: 0 auto;
				letter-spacing: 1px;
				border: 1px solid lightblue;
			}
			h4{
				background-color:lightblue ;
				/*background-color:lightskyblue ;*/
			}
			#ti1,#ti2,#ti3{
				margin-left: 0;
			}
			input{
				margin-left: 5px;
			}
			.radio{
				margin-top: 6px;
			}
			p{
				font-size: 16px;
			}
		</style>
	</head>
	<!--单选题：
		1.在数据管理技术的发展过程中，经历了人工管理阶段、文件系统阶段和数据库系统阶段。在这几个阶段中，数据独立性最高的是（）阶段
		A.数据库系统	B.文件系统	C.人工管理	D.数据项管理
	-->
	<body>
		<div class="container">
			<p>注：每题2分，共20分</p>
			<div class="option">
				<h4 id="ti1">1.在数据管理技术的发展过程中，经历了人工管理阶段、文件系统阶段和数据库系统阶段。在这几个阶段中，数据独立性最高的是（）阶段</h4>
				<div class="radio">
				    <label>
				   	   <input type="radio" name="radio1" id="radio11" value="option11" checked>
				    	A.数据库系统
				    </label>
				</div>
				<div class="radio">
				    <label>
				    	<input type="radio" name="radio1" id="radio12" value="option12">
				    	B.文件系统
				    </label>
				</div>
				<div class="radio">
				    <label>
				   	    <input type="radio" name="radio1" id="radio13" value="option13">
				    	C.人工管理
				    </label>
				</div>
				<div class="radio">
				    <label>
				    	<input type="radio" name="radio1" id="radio14" value="option14">
				    	D.数据项管理
				    </label>
				</div>
			</div><!--A--><br />
			
			<div class="option">
				<h4 id="ti2">2.数据库中，数据的物理独立性是指（）</h4>
				<div class="radio">
				    <label>
				   	   <input type="radio" name="radio21" id="radio21" value="option21" checked>
				    	A.数据库与数据库管理系统的相互独立
				    </label>
				</div>
				<div class="radio">
				    <label>
				    	<input type="radio" name="radio22" id="radio22" value="option22">
				    	B.用户程序与DBMS的相互独立
				    </label>
				</div>
				<div class="radio">
				    <label>
				   	    <input type="radio" name="radio23" id="radio23" value="option23">
				    	C.用户的应用程序与存储在磁盘上的数据库的数据是相互独立的
				    </label>
				</div>
				<div class="radio">
				    <label>
				    	<input type="radio" name="radio24" id="radio24" value="option24">
				    	D.应用程序与数据库中的数据的逻辑结构相互独立
				    </label>
				</div>
			</div><!--C--><br />
			
			<div class="option">
				<h4 id="ti3">3.关系模式的任何属性（）</h4>
				<div class="radio">
				    <label>
				   	   <input type="radio" name="radio31" id="radio31" value="option31" checked>
				    	A.不可再分
				    </label>
				</div>
				<div class="radio">
				    <label>
				    	<input type="radio" name="radio32" id="oradio32" value="option32">
				    	B.可再分
				    </label>
				</div>
				<div class="radio">
				    <label>
				   	    <input type="radio" name="radio33" id="radio33" value="option33">
				    	C.命名在改关系模式中可以不唯一
				    </label>
				</div>
				<div class="radio">
				    <label>
				    	<input type="radio" name="radio34" id="radio34" value="option34">
				    	D.以上都不是
				    </label>
				</div>
			</div><!--A--><br />
			<input class="jiaojuan" type="button" value="交卷" style="width: 70px; height: 40px; background: cornflowerblue;color: #FFFFFF;margin-left:330px;margin-top: 20px;"  />	
		</div>
	</body>
</html>

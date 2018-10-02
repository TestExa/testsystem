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
			#t1,#t2,#t3{
				margin-left: 0;
			}
			input{
				margin-left: 5px;
			}
			.option{
				margin-top: 6px;
			}
			p{
				font-size: 16px;
			}
		</style>
	</head>
	<body>
		<div class="container">
			<p>注：每题2分，共20分</p>
			<div class="duoxuanti">
				<h4 id="t1">
					1.下列关于数据库系统与文件系统的主要区别说法中错误的是（）
				</h4>
				<div class="option">
		        	<label>
		        		<input type="checkbox" name="checkbox1" id="checkbox11"/>
		        		A.数据库系统复杂，而文件系统简单
		        	</label>
				</div>
				<div class="option">
		        	<label>
		        		<input type="checkbox" name="checkbox12" id="checkbox12"/>
		        		B.文件系统不能解决数据冗余和数据独立性问题，而数据库系统可以解决
		        	</label>
				</div>
				<div class="option">
		        	<label>
		        		<input type="checkbox" name="checkbox13" id="checkbox13"/>
		        		C.文件系统只能管理程序文件，而数据库系统能够管理各种类型的文件
		        	</label>
				</div>
				<div class="option">
		        	<label>
		        		<input type="checkbox" name="checkbox1" id="checkbox14"/>
		        		D.文件系统管理的数据量少，而数据库系统可以管理庞大的数据量
		        	</label>
				</div>
			</div><!--ACD--><br />
			
			<div class="duoxuanti">
				<h4 id="t2">
					2.下列关于模型中3NF的说法错误的是（）
				</h4>
				<div class="option">
		        	<label>
		        		<input type="checkbox" name="checkbox21" id="checkbox21"/>
		        		A.满足2NF切不存在传递依赖现象
		        	</label>
				</div>
				<div class="option">
		        	<label>
		        		<input type="checkbox" name="checkbox22" id="checkbox22"/>
		        		B.满足2NF切不存在部分依赖现象
		        	</label>
				</div>
				<div class="option">
		        	<label>
		        		<input type="checkbox" name="checkbox23" id="checkbox23"/>
		        		C.满足2NF切不存在非主属性
		        	</label>
				</div>
				<div class="option">
		        	<label>
		        		<input type="checkbox" name="checkbox24" id="checkbox24"/>
		        		D.满足2NF切不存在组合属性
		        	</label>
				</div>
			</div><!--BCD--><br />
			
			<div class="duoxuanti">
				<h4 id="t3">
					3.下列关于性质的叙述中，正确的是（）
				</h4>
				<div class="option">
		        	<label>
		        		<input type="checkbox" name="checkbox31" id="checkbox31"/>
		        		A.关系中元组的次序不重要
		        	</label>
				</div>
				<div class="option">
		        	<label>
		        		<input type="checkbox" name="checkbox32" id="checkbox32"/>
		        		B.关系中列的次序不重要
		        	</label>
				</div>
				<div class="option">
		        	<label>
		        		<input type="checkbox" name="checkbox33" id="checkbox33"/>
		        		C.关系中元组不可以重复
		        	</label>
				</div>
				<div class="option">
		        	<label>
		        		<input type="checkbox" name="checkbox34" id="checkbox34"/>
		        		D.关系不可以为空关系
		        	</label>
				</div>
			</div><!--ABC-->
			<input class="jiaojuan" type="button" value="交卷" style="width: 70px; height: 40px; background: cornflowerblue;color: #FFFFFF;margin-left:330px;margin-top: 20px;"  />	
			
		</div>
	</body>
</html>

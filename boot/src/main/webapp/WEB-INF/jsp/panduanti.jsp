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
			h4{
				background-color:lightblue ;
			}
			#timu1,#timu2{
				margin-left: 0;
			}
			input{
				margin-left: 5px;
				margin-right: 5px;
			}
			.panduan{
				margin-top: 10px;
			}
			p{
				font-size: 16px;
			}
		</style>
	</head>
	<body>
		<div class="container">
			<p>注：每题2分，共10分</p>
			<div class="panduanti">
				<h4 id="timu1">1.候选码中的属性可以有一个或多个</h4>
				<div class="panduan">
					<label>
						<input type="radio" name="panduan1" id="panduan1" value="" />
						&radic;&nbsp;&nbsp;&nbsp;
						<input type="radio" name="panduan1" id="panduan1" value="" />
						&times;
					</label>
				</div>
			</div><!--对-->
			<div class="panduanti">
				<h4 id="timu2">2.取出关系中的某些列，并消去重复元组的关系代数运算称为投影运算</h4>
				<div class="panduan">
					<label>
						<input type="radio" name="panduan2" id="panduan2" value="" />
						&radic;&nbsp;&nbsp;&nbsp;
						<input type="radio" name="panduan2" id="panduan2" value="" />
						&times;
					</label>
				</div>
			</div><!--对-->
			<input class="jiaojuan" type="button" value="交卷" style="width: 70px; height: 40px; background: cornflowerblue;color: #FFFFFF;margin-left:330px;margin-top: 20px;"  />	
			
		</div>
	</body>
</html>

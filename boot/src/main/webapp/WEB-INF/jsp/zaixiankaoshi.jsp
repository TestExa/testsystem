<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="content-type" content="text/html;charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>在线考试</title>
<link href="css/kaoshi_css/main.css" rel="stylesheet" type="text/css" />
<link href="css/kaoshi_css/test.css" rel="stylesheet" type="text/css" />
<style>
.hasBeenAnswer {
	background: #5d9cec;
	color:#fff;
}
</style>

</head>
<body>
<div class="main">
	<!--nr start-->
	<div class="test_main">
		<!--试卷左边-->
		<div class="nr_left">
			<div class="test">
				<form action="" method="post">
					<!--考试倒计时-->
					<div class="test_title">
						<font><input type="button" name="test_jiaojuan" value="交卷"></font>
					</div>
					<!--单选题-->
					<div class="test_content">
						<div class="test_content_title">
							<h2>单选题</h2>
							<p>
								<span>共</span><i class="content_lit">15</i><span>题，</span><span>合计</span><i class="content_fs">15</i><span>分</span>
							</p>
						</div>
					</div>
					<!--单选题题目-->
					<div class="test_content_nr">
						<ul>
							<!--第一题-->
							<li id="qu_0_0">
								<div class="test_content_nr_tt"><!--题目-->
									<i>1</i><span>(1分)</span><font>在数据管理技术的发展过程中，经历了人工管理阶段、文件系统阶段和数据库系统阶段。在这几个阶段中，数据独立性最高的是（）阶段</font>
								</div>
								<div class="test_content_nr_main"><!--选项-->
									<ul>
										<li class="option">
											<input type="radio" class="radioOrCheck" name="answer1"id="0_answer_1_option_1"/>
											<label for="0_answer_1_option_1">
												A.<p class="ue" style="display: inline;">数据库系统</p>
											</label>
										</li>
										<li class="option">
											<input type="radio" class="radioOrCheck" name="answer1"id="0_answer_1_option_2"/>
											<label for="0_answer_1_option_2">
												B.<p class="ue" style="display: inline;">文件系统</p>
											</label>
										</li>
										<li class="option">
											<input type="radio" class="radioOrCheck" name="answer1"id="0_answer_1_option_3"/>
											<label for="0_answer_1_option_3">
												C.<p class="ue" style="display: inline;">人工管理</p>
											</label>
										</li>
										<li class="option">
											<input type="radio" class="radioOrCheck" name="answer1"id="0_answer_1_option_4"/>
											<label for="0_answer_1_option_4">
												D.<p class="ue" style="display: inline;">数据项管理</p>
											</label>
										</li>
									</ul>
								</div>
							</li>
							<!--第二题-->
							<li id="qu_0_1">
								<div class="test_content_nr_tt">
									<i>2</i><span>(1分)</span><font>数据库中，数据的物理独立性是指（）</font>
								</div>
								<div class="test_content_nr_main">
									<ul>
										<li class="option">
											<input type="radio" class="radioOrCheck" name="answer2"id="0_answer_2_option_1"/>
											<label for="0_answer_2_option_1">
												A.<p class="ue" style="display: inline;">数据库与数据库管理系统的相互独立</p>
											</label>
										</li>
										<li class="option">
											<input type="radio" class="radioOrCheck" name="answer2"id="0_answer_2_option_2"/>
											<label for="0_answer_2_option_2">
												B.<p class="ue" style="display: inline;">用户程序与DBMS的相互独立</p>
											</label>
										</li>
										<li class="option">
											<input type="radio" class="radioOrCheck" name="answer2"id="0_answer_2_option_3"/>
											<label for="0_answer_2_option_3">
												C.<p class="ue" style="display: inline;">用户的应用程序与存储在磁盘上的数据库的数据是相互独立的</p>
											</label>
										</li>
										<li class="option">
											<input type="radio" class="radioOrCheck" name="answer2"id="0_answer_2_option_4"/>
											<label for="0_answer_2_option_4">
												D.<p class="ue" style="display: inline;">应用程序与数据库中的数据的逻辑结构相互独立</p>
											</label>
										</li>
									</ul>
								</div>
							</li>
						</ul>
					</div>
					<!--多选题-->
					<div class="test_content">
						<div class="test_content_title">
							<h2>多选题</h2>
							<p>
								<span>共</span><i class="content_lit">15</i><span>题，</span><span>合计</span><i class="content_fs">15</i><span>分</span>
							</p>
						</div>
					</div>
					<!--多选题题目-->
					<div class="test_content_nr">
						<ul>
							<li id="qu_1_0">
								<div class="test_content_nr_tt">
									<i>1</i><span>(1分)</span><font>下列关于数据库系统与文件系统的主要区别说法中错误的是（）</font>
								</div>
								<div class="test_content_nr_main">
									<ul>
										<li class="option">
											<input type="checkbox" class="radioOrCheck" name="answer1"id="1_answer_1_option_1"/>
											<label for="1_answer_1_option_1">
												A.<p class="ue" style="display: inline;">数据库系统复杂，而文件系统简单</p>
											</label>
										</li>
										
										<li class="option">
											<input type="checkbox" class="radioOrCheck" name="answer1"id="1_answer_1_option_2"/>
												<label for="1_answer_1_option_2">
													B.<p class="ue" style="display: inline;">文件系统不能解决数据冗余和数据独立性问题，而数据库系统可以解决</p>
												</label>
										</li>
										
										<li class="option">
											<input type="checkbox" class="radioOrCheck" name="answer1"id="1_answer_1_option_3"/>
											<label for="1_answer_1_option_3">
												C.<p class="ue" style="display: inline;">文件系统只能管理程序文件，而数据库系统能够管理各种类型的文件</p>
											</label>
										</li>
										
										<li class="option">
											<input type="checkbox" class="radioOrCheck" name="answer1"id="1_answer_1_option_4"/>
											<label for="1_answer_1_option_4">
												D.<p class="ue" style="display: inline;">文件系统管理的数据量少，而数据库系统可以管理庞大的数据量</p>
											</label>
										</li>
									</ul>
								</div>
							</li>
						
							<li id="qu_1_1">
								<div class="test_content_nr_tt">
									<i>2</i><span>(1分)</span><font>下列关于模型中3NF的说法错误的是（）</font>
								</div>
								<div class="test_content_nr_main">
									<ul>
										<li class="option">
											<input type="checkbox" class="radioOrCheck" name="answer2"id="1_answer_2_option_1"/>
											<label for="1_answer_2_option_1">
												A.<p class="ue" style="display: inline;">满足2NF切不存在传递依赖现象</p>
											</label>
										</li>
										<li class="option">
											<input type="checkbox" class="radioOrCheck" name="answer2"id="1_answer_2_option_2"/>
											<label for="1_answer_2_option_2">
												B.<p class="ue" style="display: inline;">满足2NF切不存在部分依赖现象</p>
											</label>
										</li>
										<li class="option">
											<input type="checkbox" class="radioOrCheck" name="answer2"id="1_answer_2_option_3"/>
											<label for="1_answer_2_option_3">
												C.<p class="ue" style="display: inline;">满足2NF切不存在非主属性</p>
											</label>
										</li>
										<li class="option">
											<input type="checkbox" class="radioOrCheck" name="answer2"id="1_answer_2_option_4"/>
											<label for="1_answer_2_option_4">
												D.<p class="ue" style="display: inline;">满足2NF切不存在组合属性</p>
											</label>
										</li>
									</ul>
								</div>
							</li>
						
							<li id="qu_1_2">
								<div class="test_content_nr_tt">
									<i>3</i><span>(1分)</span><font>下列关于性质的叙述中，正确的是（）</font>
								</div>

								<div class="test_content_nr_main">
									<ul>
										<li class="option">
											<input type="checkbox" class="radioOrCheck" name="answer3"id="1_answer_3_option_1"/>
											<label for="1_answer_3_option_1">
												A.<p class="ue" style="display: inline;">关系中元组的次序不重要</p>
											</label>
										</li>
										<li class="option">
											<input type="checkbox" class="radioOrCheck" name="answer3"id="1_answer_3_option_2"/>
											<label for="1_answer_3_option_2">
												B.<p class="ue" style="display: inline;">关系中列的次序不重要</p>
											</label>
										</li>
										<li class="option">
											<input type="checkbox" class="radioOrCheck" name="answer3"id="1_answer_3_option_3"/>
											<label for="1_answer_3_option_3">
												C.<p class="ue" style="display: inline;">关系中元组不可以重复</p>
											</label>
										</li>
										<li class="option">
											<input type="checkbox" class="radioOrCheck" name="answer3"id="1_answer_3_option_4"/>
											<label for="1_answer_3_option_4">
												D.<p class="ue" style="display: inline;">关系不可以为空关系 </p>
											</label>
										</li>
									</ul>
								</div>
							</li>
						</ul>
					</div>
					<!--判断题-->
					<div class="test_content">
						<div class="test_content_title">
							<h2>判断题</h2>
							<p>
								<span>共</span><i class="content_lit">10</i><span>题，</span><span>合计</span><i class="content_fs">20</i><span>分</span>
							</p>
						</div>
					</div>
					<!--判断题题目-->
					<div class="test_content_nr">
						<ul>
							<li id="qu_2_0">
								<div class="test_content_nr_tt"><!--题目-->
									<i>1</i><span>(2分)</span><font>文件系统不能解决数据冗余和数据独立性问题，而数据库系统可以解决</font>
								</div>
								<div class="test_content_nr_main"><!--选项-->
									<ul>
										<li class="option">
											<input type="radio" class="radioOrCheck" name="answer1"id="2_answer_4_option_1"/>
											<label for="2_answer_4_option_1">
												A.
											</label>
										</li>
										<li class="option">
											<input type="radio" class="radioOrCheck" name="answer1"id="2_answer_4_option_2"/>
											<label for="2_answer_4_option_2">
												B.
											</label>
										</li>
									</ul>
								</div>
							</li>
						</ul>
					</div>
					<!--填空题-->
					<div class="test_content">
						<div class="test_content_title">
							<h2>填空题</h2>
							<p>
								<span>共</span><i class="content_lit">10</i><span>题，</span><span>合计</span><i class="content_fs">20</i><span>分（请将答案填在括号内）</span>
							</p>
						</div>
					</div>
					<!--填空题题目-->
					<div class="test_content_nr">
						<ul>
							<li id="qu_3_0">
								<div class="test_content_nr_tt"><!--题目-->
									<i>1</i><span>(2分)</span><font>候选码中的属性称为<span contenteditable="true">()</span><!--主属性--></font>
								</div>
								<div class="test_content_nr_tt"><!--题目-->
									<i>2</i><span>(2分)</span><font>用树形结构表示实体类型及实体间联系的数据模型称为<span contenteditable="true">()</span><!--层次模型--><!--主属性--></font>
								</div>
						</ul>
					</div>
					<!--主观题-->
					<div class="test_content">
						<div class="test_content_title">
							<h2>主观题</h2>
							<p>
								<span>共</span><i class="content_lit">2</i><span>题，</span><span>合计</span><i class="content_fs">30</i><span>分</span>
							</p>
						</div>
					</div>
					<!--主观题题目-->
					<div class="test_content_nr">
						<ul>
							<div class="test_content_nr_tt"><!--题目-->
								<i>1</i><span>(15分)</span><font>现有如下关系模式：借阅（图书编号，书名，作者名，出版社，读者编号，读者姓名，借阅日期，归还日期），
				基本函数依赖F={图书编号——>（书名，作者名，出版社），读者编号——>读者姓名，（图书编号，读者编号，借阅日期）——>归还日期}<br />
								(1)读者编号是候选码吗？<br />
								(2)写出该关系模式的主码。<br />
								(3)该关系模式中是否存在非主属性对码的部分函数依赖？如果存在，请写出一个。<br />
								(4)该关系模式满足第几范式？并说明理由。<br />
								解：<span contenteditable="true">()</span></font>
							</div>
						</ul>
					</div>
				</form>
			</div>
		</div>
		<!--试卷右边-->
		<div class="nr_right">
			<div class="nr_rt_main">
				<div class="rt_nr1">
					<div class="rt_nr1_title">
						<h1>
							答题卡
						</h1>
						<p class="test_time">
							<b class="alt-1">02:00</b>
						</p>
					</div>
					
					<div class="rt_content">
						<div class="rt_content_tt">
							<h2>单选题</h2>
							<p>
								<span>共</span><i class="content_lit">60</i><span>题</span>
							</p>
						</div>
						<div class="rt_content_nr answerSheet">
							<ul>
								<li><a href="#qu_0_0">1</a></li>
								<li><a href="#qu_0_1">2</a></li>
								<li><a href="#qu_0_2">3</a></li>
								<li><a href="#qu_0_3">4</a></li>
								<li><a href="#qu_0_4">5</a></li>
								<li><a href="#qu_0_5">6</a></li>
								<li><a href="#qu_0_6">7</a></li>
								<li><a href="#qu_0_7">8</a></li>
								<li><a href="#qu_0_8">9</a></li>
								<li><a href="#qu_0_9">10</a></li>
								<li><a href="#qu_0_10">11</a></li>
								<li><a href="#qu_0_11">12</a></li>
								<li><a href="#qu_0_12">13</a></li>
								<li><a href="#qu_0_13">14</a></li>
								<li><a href="#qu_0_14">15</a></li>
							</ul>
						</div>
					</div>
					
					<div class="rt_content">
						<div class="rt_content_tt">
							<h2>多选题</h2>
							<p>
								<span>共</span><i class="content_lit">30</i><span>题</span>
							</p>
						</div>
						<div class="rt_content_nr answerSheet">
							<ul>
								<li><a href="#qu_1_0">1</a></li>
								<li><a href="#qu_1_1">2</a></li>
								<li><a href="#qu_1_2">3</a></li>
								<li><a href="#qu_1_3">4</a></li>
								<li><a href="#qu_1_4">5</a></li>
								<li><a href="#qu_1_5">6</a></li>
								<li><a href="#qu_1_6">7</a></li>
								<li><a href="#qu_1_7">8</a></li>
								<li><a href="#qu_1_8">9</a></li>
								<li><a href="#qu_1_9">10</a></li>
								<li><a href="#qu_1_10">11</a></li>
								<li><a href="#qu_1_11">12</a></li>
								<li><a href="#qu_1_12">13</a></li>
								<li><a href="#qu_1_13">14</a></li>
								<li><a href="#qu_1_14">15</a></li>
							</ul>
						</div>
					</div>
					
					<div class="rt_content">
						<div class="rt_content_tt">
							<h2>判断题</h2>
							<p>
								<span>共</span><i class="content_lit">5</i><span>题</span>
							</p>
						</div>
						<div class="rt_content_nr answerSheet">
							<ul>
								<li><a href="#qu_2_0">1</a></li>
								<li><a href="#qu_2_1">2</a></li>
								<li><a href="#qu_2_2">3</a></li>
								<li><a href="#qu_2_3">4</a></li>
								<li><a href="#qu_2_4">5</a></li>
							</ul>
						</div>
					</div>
					
				</div>
			</div>
		</div>
	</div>
	<!--nr end-->
	<div class="foot"></div>
</div>

<script src="js/jquery-1.11.3.min.js"></script>
<!--<script src="jss/jquery.easy-pie-chart.js"></script>-->
<!--倒计时js-->
<script src="js/jquery.countdown.js"></script>
<script>
	window.jQuery(function($) {
		"use strict"; //指定代码在严格条件下执行，严格模式下不能使用未声明的变量。
		
		$('time').countDown({
			with_separators : false
		});
		$('.alt-1').countDown({
			css_class : 'countdown-alt-1'
		});
		$('.alt-2').countDown({
			css_class : 'countdown-alt-2'
		});
		
	});
	
	
	$(function() {
		$('li.option label').click(function() {
		debugger;
			var examId = $(this).closest('.test_content_nr_main').closest('li').attr('id'); // 得到题目ID
			var cardLi = $('a[href=#' + examId + ']'); // 根据题目ID找到对应答题卡
			// 设置已答题
			if(!cardLi.hasClass('hasBeenAnswer')){
				cardLi.addClass('hasBeenAnswer');
			}
			
		});
	});
</script>
</div>
</body>
</html>

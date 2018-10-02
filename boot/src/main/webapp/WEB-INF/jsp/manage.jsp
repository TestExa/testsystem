<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!DOCTYPE html>
<html lang="zh-CN">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>管理员登录</title>
	<link href="css/main_css.css" rel="stylesheet" type="text/css" />
	<link href="css/zTreeStyle.css" rel="stylesheet" type="text/css">
	<script type="text/javascript" src="js/jquery-1.7.1.js"></script>
	<script type="text/javascript" src="zTree/jquery.ztree.all-3.2.js"></script>
	<script type="text/javascript" src="js/commonAll.js"></script>
	<script type="text/javascript">
		/**退出系统**/
		function logout(){
			if(confirm("您确定要退出本系统吗？")){
				window.location.href = "login.html";
			}
		}
		
		/**获得当前日期**/
		function  getDate01(){
			var time = new Date();
			var myYear = time.getFullYear();
			var myMonth = time.getMonth()+1;
			var myDay = time.getDate();
			if(myMonth < 10){
				myMonth = "0" + myMonth;
			}
			document.getElementById("day_day").innerHTML =  myYear + "." + myMonth + "." + myDay;
		}
	</script>
	<script type="text/javascript">
		/* zTree插件加载目录的处理  */
		var zTree;
		
		var setting = {
				view: {
					dblClickExpand: false,
					showLine: false,
					expandSpeed: ($.browser.msie && parseInt($.browser.version)<=6)?"":"fast"
				},
				data: {
					key: {
						name: "resourceName"
					},
					simpleData: {
						enable:true,
						idKey: "resourceID",
						pIdKey: "parentID",
						rootPId: ""
					}
				},
				callback: {
					onClick: zTreeOnClick			
				}
		};
		 
		var curExpandNode = null;
		function beforeExpand(treeId, treeNode) {
			var pNode = curExpandNode ? curExpandNode.getParentNode():null;
			var treeNodeP = treeNode.parentTId ? treeNode.getParentNode():null;
			for(var i=0, l=!treeNodeP ? 0:treeNodeP.children.length; i<l; i++ ) {
				if (treeNode !== treeNodeP.children[i]) {
					zTree.expandNode(treeNodeP.children[i], false);
				}
			}
			while (pNode) {
				if (pNode === treeNode) {
					break;
				}
				pNode = pNode.getParentNode();
			}
			if (!pNode) {
				singlePath(treeNode);
			}
	
		}
		function singlePath(newNode) {
			if (newNode === curExpandNode) return;
			if (curExpandNode && curExpandNode.open==true) {
				if (newNode.parentTId === curExpandNode.parentTId) {
					zTree.expandNode(curExpandNode, false);
				} else {
					var newParents = [];
					while (newNode) {
						newNode = newNode.getParentNode();
						if (newNode === curExpandNode) {
							newParents = null;
							break;
						} else if (newNode) {
							newParents.push(newNode);
						}
					}
					if (newParents!=null) {
						var oldNode = curExpandNode;
						var oldParents = [];
						while (oldNode) {
							oldNode = oldNode.getParentNode();
							if (oldNode) {
								oldParents.push(oldNode);
							}
						}
						if (newParents.length>0) {
							for (var i = Math.min(newParents.length, oldParents.length)-1; i>=0; i--) {
								if (newParents[i] !== oldParents[i]) {
									zTree.expandNode(oldParents[i], false);
									break;
								}
							}
						}else {
							zTree.expandNode(oldParents[oldParents.length-1], false);
						}
					}
				}
			}
			curExpandNode = newNode;
		}
	
		function onExpand(event, treeId, treeNode) {
			curExpandNode = treeNode;
		}
		
		/** 用于捕获节点被点击的事件回调函数  **/
		function zTreeOnClick(event, treeId, treeNode) {
			var zTree = $.fn.zTree.getZTreeObj("dleft_tab1");
			zTree.expandNode(treeNode, null, null, null, true);
	// 		zTree.expandNode(treeNode);
			// 规定：如果是父类节点，不允许单击操作
			if(treeNode.isParent){
	// 			alert("父类节点无法点击哦...");
				return false;
			}
			// 如果节点路径为空或者为"#"，不允许单击操作
			if(treeNode.accessPath=="" || treeNode.accessPath=="#"){
				//alert("节点路径为空或者为'#'哦...");
				return false;
			}
		    // 跳到该节点下对应的路径, 把当前资源ID(resourceID)传到后台，写进Session
		    rightMain(treeNode.accessPath);
		    
		    //当前位置
		    if( treeNode.isParent ){
			    $('#here_area').html('当前位置：'+treeNode.getParentNode().resourceName+'&nbsp;>&nbsp;<span style="color:#1A5CC6">'+treeNode.resourceName+'</span>');
		    }else{
			    $('#here_area').html('当前位置：系统&nbsp;>&nbsp;<span style="color:#1A5CC6">'+treeNode.resourceName+'</span>');
		    }
		};
		/* 上方菜单 */
		function switchTab(tabpage,tabid){
		var oItem = document.getElementById(tabpage).getElementsByTagName("li"); 
		    for(var i=0; i<oItem.length; i++){
		        var x = oItem[i];    
		        x.className = "";
			}
			if('left_tab1' == tabid){
				$(document).ajaxStart(onStart).ajaxSuccess(onStop);
				$("#test1").text("管理数据");
				// 异步加载"管理数据"下的菜单
			  	loadMenu('GUANLISHUJU', 'dleft_tab1');
			}else  if('left_tab2' == tabid){
				$(document).ajaxStart(onStart).ajaxSuccess(onStop);
				$("#test1").text("查看数据");
				// 异步加载"查看数据"下的菜单
				loadMenu('CHAKANSHUJU', 'dleft_tab2');
			}else  if('left_tab3' == tabid){
				$(document).ajaxStart(onStart).ajaxSuccess(onStop);
				$("#test1").text("统计分数");
				// 异步加载"统计分数"下的菜单
				loadMenu('TONGJIFENSHU', 'dleft_tab3');
			}else if('left_tab4' == tabid){
				$(document).ajaxStart(onStart).ajaxSuccess(onStop);
				$("#test1").text("个人主页");
				loadMenu('GERENZHUYE', 'dleft_tab4');
			}
		}
		
		
		$(document).ready(function(){
			$(document).ajaxStart(onStart).ajaxSuccess(onStop);
			/** 默认异步加载"管理数据"目录  **/
			loadMenu('GUANLISHUJU', "dleft_tab1");
//			 默认展开所有节点
			if( zTree ){
				// 默认展开所有节点
				zTree.expandAll(true);
			}
		});
		
		function loadMenu(resourceType, treeObj){
			var data;
			// 判断treeObj，获取文字数据data
			if('dleft_tab1' == treeObj){
				// 设置ul显示和隐藏
				$("#dleft_tab1").css('display','block');
				$("#dleft_tab2").css('display','none');
				$("#dleft_tab3").css('display','none');
				$("#dleft_tab4").css('display','none');
				
				// 二级目录	所有的数据，添加两次就可以了，这样我就知道怎么继续往后添加了，没必要写太多了
				// 如果是要改成其他的只需要注意
				// 1、resourceGrade的值代表目录等级，如二级目录对应"resourceGrade":2
				// 2、二级目录中的resourceID对应三级目录parentID，其他的都可以自己设置
				data = [
				{"accessPath":"","checked":false,"delFlag":0,"parentID":1,"resourceCode":"","resourceDesc":"","resourceGrade":2,"resourceID":71,"resourceName":"试卷管理","resourceOrder":0,"resourceType":""},
				{"accessPath":"shijuanguanli.html","checked":false,"delFlag":0,"parentID":71,"resourceCode":"","resourceDesc":"","resourceGrade":3,"resourceID":12,"resourceName":"试卷制定","resourceOrder":0,"resourceType":""},
				//三级目录	二级目录中的resourceID对应parentID
				{"accessPath":"shijuanguanli.html","checked":false,"delFlag":0,"parentID":3,"resourceCode":"","resourceDesc":"","resourceGrade":2,"resourceID":70,"resourceName":"试题管理","resourceOrder":0,"resourceType":""},
				{"accessPath":"danxuanguanli.html","checked":false,"delFlag":0,"parentID":70,"resourceCode":"","resourceDesc":"","resourceGrade":3,"resourceID":72,"resourceName":"单选题管理","resourceOrder":0,"resourceType":""},
				{"accessPath":"duoxuanguanli.html","checked":false,"delFlag":0,"parentID":70,"resourceCode":"","resourceDesc":"","resourceGrade":3,"resourceID":73,"resourceName":"多选题管理","resourceOrder":0,"resourceType":""},
				{"accessPath":"panduanguanli.html","checked":false,"delFlag":0,"parentID":70,"resourceCode":"","resourceDesc":"","resourceGrade":3,"resourceID":74,"resourceName":"判断题管理","resourceOrder":0,"resourceType":""},
				{"accessPath":"tiankongguanli.html","checked":false,"delFlag":0,"parentID":70,"resourceCode":"","resourceDesc":"","resourceGrade":3,"resourceID":75,"resourceName":"填空题管理","resourceOrder":0,"resourceType":""},
				{"accessPath":"zhuguantiguanli.html","checked":false,"delFlag":0,"parentID":70,"resourceCode":"","resourceDesc":"","resourceGrade":3,"resourceID":76,"resourceName":"主观题管理","resourceOrder":0,"resourceType":""},
				];
			}else  if('dleft_tab2' == treeObj){
				$("#dleft_tab1").css('display','none');
				$("#dleft_tab2").css('display','block');
				$("#dleft_tab3").css('display','none');
				$("#dleft_tab4").css('display','none');
				data = [
				{"accessPath":"","checked":false,"delFlag":0,"parentID":2,"resourceCode":"","resourceDesc":"","resourceGrade":2,"resourceID":70,"resourceName":"浏览试卷","resourceOrder":0,"resourceType":""},
				{"accessPath":"zaixiankaoshi.html","checked":false,"delFlag":0,"parentID":70,"resourceCode":"","resourceDesc":"","resourceGrade":3,"resourceID":71,"resourceName":"数据库","resourceOrder":0,"resourceType":""},
				{"accessPath":"","checked":false,"delFlag":0,"parentID":70,"resourceCode":"","resourceDesc":"","resourceGrade":3,"resourceID":72,"resourceName":"数据结构","resourceOrder":0,"resourceType":""},
				];
			}else  if('dleft_tab3' == treeObj){
				$("#dleft_tab1").css('display','none');
				$("#dleft_tab2").css('display','none');
				$("#dleft_tab3").css('display','block');
				$("#dleft_tab4").css('display','none');
				data = [{"accessPath":"chengji.html","checked":false,"delFlag":0,"parentID":1,"resourceCode":"","resourceDesc":"","resourceGrade":2,"resourceID":3,"resourceName":"JAVA网络编程","resourceOrder":0,"resourceType":""},
				{"accessPath":"","checked":false,"delFlag":0,"parentID":1,"resourceCode":"","resourceDesc":"","resourceGrade":2,"resourceID":2,"resourceName":"C语言程序设计","resourceOrder":0,"resourceType":""},
				];
			}else if('dleft_tab4' == treeObj){
				$("#dleft_tab1").css('display','none');
				$("#dleft_tab2").css('display','none');
				$("#dleft_tab3").css('display','none');
				$("#dleft_tab4").css('display','block');
				data = [
				{"accessPath":"","checked":false,"delFlag":0,"parentID":2,"resourceCode":"","resourceDesc":"","resourceGrade":2,"resourceID":81,"resourceName":"修改密码","resourceOrder":0,"resourceType":""},
				{"accessPath":"","checked":false,"delFlag":0,"parentID":2,"resourceCode":"","resourceDesc":"","resourceGrade":3,"resourceID":82,"resourceName":"管理人数","resourceOrder":0,"resourceType":""},
				];
			}
			
            // 如果返回数据不为空，加载"管理数据"目录
            if(data != null){
                // 将返回的数据赋给zTree
                $.fn.zTree.init($("#"+treeObj), setting, data);
                zTree = $.fn.zTree.getZTreeObj(treeObj);
                if( zTree ){
                    // 默认展开所有节点
                    zTree.expandAll(true);
                }
            }
		}
		
		//ajax start function
		function onStart(){
			$("#ajaxDialog").show();
		}
		
		//ajax stop function
		function onStop(){
	// 		$("#ajaxDialog").dialog("close");
			$("#ajaxDialog").hide();
		}
	</script>
	
</head>
<body onload="getDate01()">
    <div id="top">
		<div id="top_logo">
			<span class="glyphicon glyphicon-home" style="color: #FFFFFF;font-size: 26px;margin-left: 14px;"></span>
			<strong style="color: #FFFFFF;font-size: 28px;">MANAGE</strong>
		</div>
		<div id="top_links">
			<div id="top_op">
				<ul>
					<li>
						<img alt="当前用户" src="images/common/user.jpg">：
						<span>admin</span>
					</li>
					<li>
						<img alt="今天是" src="images/common/date.jpg">：
						<span id="day_day"></span>
					</li>
				</ul> 
			</div>
			<div id="top_close">
				<a href="login.html" onclick="logout();" target="_parent">
					<img alt="退出系统" title="退出系统" src="images/common/close.jpg" style="position: relative; top: 10px; left: 25px;">
				</a>
			</div>
		</div>
	</div>
    <!-- side menu start -->
	<div id="side">
		<div id="left_menu">
		 	<ul id="TabPage2" style="height:200px; margin-top:50px;">
				<li id="left_tab1" class="selected" onClick="javascript:switchTab('TabPage2','left_tab1');" title="管理数据">
					<img alt="管理数据" title="管理数据" src="images/common/1_hover.jpg" width="33" height="31">
				</li>
				<li id="left_tab2" onClick="javascript:switchTab('TabPage2','left_tab2');" title="查看数据">
					<img alt="查看数据" title="查看数据" src="images/common/2.jpg" width="33" height="31">
				</li>		
				<li id="left_tab3" onClick="javascript:switchTab('TabPage2','left_tab3');" title="统计分数">
					<img alt="统计分数" title="统计分数" src="images/common/3.jpg" width="33" height="31">
				</li>
				<li id="left_tab4" onClick="javascript:switchTab('TabPage2','left_tab4');" title="个人主页">
					<span id="person" style="color: white;">个人主页</span>
				</li>
			</ul>
			
			
			<div id="nav_show" style="position:absolute; bottom:0px; padding:10px;">
				<a href="javascript:;" id="show_hide_btn">
					<img alt="显示/隐藏" title="显示/隐藏" src="images/common/nav_hide.png" width="35" height="35">
				</a>
			</div>
		</div>
		<div id="left_menu_cnt">
		 	<div id="nav_module">
		 		<h3 id="test1" style="text-align: center;margin-left: 20px;margin-top: 18px;">管理数据</h3>
		 		<hr style="width: 188px;color: #000000;margin-top: 9px;"/>
		 	</div>
		 	
		 	<div id="nav_resource">
		 		<ul id="dleft_tab1" class="ztree"></ul>
				<ul id="dleft_tab2" class="ztree"></ul>
				<ul id="dleft_tab3" class="ztree"></ul>
				<ul id="dleft_tab4" class="ztree"></ul>
		 	</div>
		</div>
	</div>
	<script type="text/javascript">
		$(function(){
			$('#TabPage2 li').click(function(){
				var index = $(this).index();
				$(this).find('img').attr('src', 'images/common/'+ (index+1) +'_hover.jpg');
				$(this).css({background:'#fff'});
				$('#nav_module').find('img').attr('src', 'images/common/module_'+ (index+1) +'.png');
				$('#TabPage2 li').each(function(i, ele){
					if( i!=index ){
						$(ele).find('img').attr('src', 'images/common/'+ (i+1) +'.jpg');
						$(ele).css({background:'#044599'});
					}
				});
				// 显示侧边栏
				switchSysBar(true);
			});
			
			// 显示隐藏侧边栏
			$("#show_hide_btn").click(function() {
		        switchSysBar();
		    });
		});
		
		/**隐藏或者显示侧边栏**/
		function switchSysBar(flag){
			var side = $('#side');
	        var left_menu_cnt = $('#left_menu_cnt');
			if( flag==true ){	// flag==true
				left_menu_cnt.show(500, 'linear');
				side.css({width:'280px'});
				$('#top_nav').css({width:'77%', left:'304px'});
	        	$('#main').css({left:'280px'});
			}else{
		        if ( left_menu_cnt.is(":visible") ) {
					left_menu_cnt.hide(10, 'linear');
					side.css({width:'60px'});
		        	$('#top_nav').css({width:'100%', left:'60px', 'padding-left':'28px'});
		        	$('#main').css({left:'180px',width:'87%'});
		        	$("#show_hide_btn").find('img').attr('src', 'images/common/nav_show.png');
		        } else {
					left_menu_cnt.show(500, 'linear');
					side.css({width:'280px'});
					$('#top_nav').css({width:'77%', left:'304px', 'padding-left':'0px'});
		        	$('#main').css({left:'280px'});
		        	$("#show_hide_btn").find('img').attr('src', 'images/common/nav_hide.png');
		        }
			}
		}
	</script>
    <!-- side menu start -->
    <div id="top_nav">
	 	<span id="here_area">当前位置：系统&nbsp;>&nbsp;注意</span>
	</div>
    <div id="main">
      	<iframe name="right" id="rightMain" src="notice.html" width="100%" height="100%" ></iframe>
    </div>

</body>
</html>
   
 
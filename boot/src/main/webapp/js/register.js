var can=document.getElementById("canvas1");
var cxt=can.getContext('2d');
var w=can.width=window.innerWidth;
var h=can.height=window.innerHeight;

var num=100;//生成点的个数
var data=[];//定义一个数组，准备存坐标
var move={};//定义一个对象存储鼠标的坐标
document.onmousemove=function(e){
	e=e||window.event;
	move.x=e.clientX;
	move.y=e.clientY
}


for(var i=0;i<num;i++){
	data[i]={
		x:Math.random()*w,
		y:Math.random()*h,
		cX:Math.random()*1-0.5,///取一个随机数-3到3
		cY:Math.random()*1-0.5
	}
	
	Circle(data[i].x,data[i].y);
}//生成num个圆

//绘画方法,重新绘制
!function draw(){
	cxt.clearRect(0,0,w,h) //擦除画布;起始点的xy轴位置，擦除的宽高
	for(var i=0;i<num;i++){
		data[i].x+=data[i].cX;
		data[i].y+=data[i].cY;
		if(data[i].x>w||data[i].x<0){
			data[i].cX=-data[i].cX; //从左往右会弹回左边
		}
		if(data[i].y>h||data[i].y<0){
			data[i].cY=-data[i].cY; //从上往下会弹回上边
		}
		for(var j=0;j<num;j++){
			if((data[i].x-data[j].x)*(data[i].x-data[j].x)+(data[i].y-data[j].y)*(data[i].y-data[j].y)<=60*60){
				line(data[i].x,data[i].y,data[j].x,data[j].y)
			}
		}
		if(move.x){
			if ((data[i].x-move.x)*(data[i].x-move.x)+(data[i].y-move.y)*(data[i].y-move.y)<=80*80) {
				line(data[i].x,data[i].y,move.x,move.y);
			}
		}
		Circle(data[i].x,data[i].y);
	}
	requestAnimationFrame(draw)
}();//自执行

//画圆的方法
function Circle(x,y){
	cxt.save();  //把状态保存
	
	cxt.fillStyle='pink';//颜色
	cxt.beginPath(); //开始绘图
	cxt.arc(x,y,1,0,2*Math.PI,true);//开始画圆，第一个参数是圆心的x值；y值，半径，开始角度，终止角度,逆时针画圆
	cxt.closePath();//结束绘图，圆闭合
	cxt.fill();//绘画
	cxt.restore(); //把状态恢复
}

//画线
function line(x1,y1,x2,y2){
	cxt.save();
	var lin=cxt.createLinearGradient(x1,y1,x2,y2)//创建一个渐变色
//			lin.addColorStop(0,'#00ffff')//添加色点
//			lin.addColorStop(1,'#9900cc')//结束添加色点，第一个参数是结束
	lin.addColorStop(0,'#9d9d9d')//添加色点
	lin.addColorStop(1,'#ffffff')//结束添加色点，第一个参数是结束
	cxt.strokeStyle=lin
	cxt.beginPath()
	cxt.moveTo(x1,y1)
	cxt.lineTo(x2,y2)
	cxt.stroke()//画线
	cxt.restore();
}
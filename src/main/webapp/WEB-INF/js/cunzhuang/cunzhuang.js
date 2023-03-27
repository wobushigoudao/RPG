window.onload = function() {
var shifou = parent.frames["zuobian"].document.getElementById("shifou").value;
var a=document.getElementById("yongshis");
if(shifou=="2"){
a.type="button"
}
}

function tanxian(){
top.location = "/RPG/cunzhuang/tanxian";

}
function fa(obj){
var els =document.getElementsByName("1");
		for (var i = 0, j = els.length; i < j; i++){
				els[i].disabled="disabled";
		}
var k=document.getElementById("div");
var tu=document.getElementById("tu");
tu.src="/RPG/image/cunzhuang/"+obj.value+".png"
k.style.display="";
var a=document.getElementById("sp");
var b="";
var shifou = parent.frames["zuobian"].document.getElementById("shifou").value;
if(obj.value=="乞丐"){
b="你愿意给我10块钱吗?";

}
if(obj.value=="你的雕像"){
b="这是村民给你做的雕像，来纪念你的伟大事迹";

}
if(obj.value=="一位厉害的人"){
if(shifou!="2"){
b="不要以为你能破了魔王的防御，就可以打败魔王了，还要有足够多的血量";
}else{
b="你竟然可以打败魔王，真厉害";
}
}
if(obj.value=="年轻的冒险者"){
b="在探险的时候，一定不要忘记调查，调查的东西，对你以后的探险有很大的帮助";
}
if(obj.value=="林二"){
b="大风车真好玩，嘻嘻嘻";
}
if(obj.value=="林克"){
if(shifou!="2"){
b="我儿子林二，是个天真善良的孩子，我能每天陪他就足够了，可是魔王不打败，这一天就不会到来";
}else{
b="谢谢你打败了魔王，真的谢谢你（^——^）"
}
}
if(obj.value=="肖思"){
if(shifou!="2"){
b="我要锻炼，打倒魔王，嘿嘿嘿";
}else{
b="你竟然打败魔王了，我要以你为目标锻炼"
}
}
if(obj.value=="肖德"){
b="有些装备是有专属特技的，拥有这些装备，在战斗时有很大的帮助";
}
if(obj.value=="村长"){
if(shifou!="2"){
b="这个村子受魔王的影响，已经不如以前繁荣了，恳求你去打败魔王，我们会为你祝福的";
}else{
b="勇士，感谢你为我们除掉魔王，村子中央是我们村子给你做的雕像，我们会祝福你的";
}
}
if(obj.value=="旅馆店老板"){
b="这位勇士，这里只要10金币就可以睡一晚，请问你需要吗？";
}
if(obj.value=="装备店老板"){
b="这位勇士，我这里有很多装备，需要购买吗？";
}
if(obj.value=="道具店老板"){
b="这位勇士，我这里有很多道具，需要购买吗？";
}
xun(a,b,obj.value);

}
function xun(a,b,c){
var j=0;
var xun = window.setInterval(function() {
		a.innerHTML = a.innerHTML + b[j];
		j++;

		if (j >= b.length) {	
			clearInterval(xun);
			a.innerHTML = a.innerHTML +"<br>"
			var yuan=document.getElementById("yuanyi");
			var buyuan=document.getElementById("buyuanyi");
			var queding=document.getElementById("queding");
			if(c=="乞丐"){
			yuan.type="button";
			yuan.name=c;
			yuan.value="愿意";
			buyuan.type="button";
			buyuan.name=c;
			buyuan.value="不愿意";
			}
			if(c=="旅馆店老板"){
			yuan.type="button";
			yuan.name=c;
			yuan.value="需要";
			buyuan.type="button";
			buyuan.name=c;
			buyuan.value="不需要";
			}
			if(c=="装备店老板"||c=="道具店老板"){
				var gou=document.getElementById("gou");
			var bu=document.getElementById("bu");
		    gou.type="button";
			gou.name=c;
			bu.type="button";
			bu.name=c;
			}
			if(c=="一位厉害的人"||c=="年轻的冒险者"||c=="林二"||c=="林克"||c=="肖思"||c=="肖德"||c=="村长"||c=="你的雕像"){
			queding.type="button";
			}
			if(c=="1"){
			queding.type="button";
			yuan.name="";
			buyuan.name="";
			yuan.value="";
			buyuan.value="";
			
			}
			if(c=="2"){
			queding.type="button";
			gou.name="";
			bu.name="";

			}
 }

 },50);
}

function shuijiao(){
var j=0;
var a=document.getElementById("sp");
var b="（睡觉中）";
var xunn = window.setInterval(function() {
		a.innerHTML = a.innerHTML + b[j];
		j++;
		if (j >= b.length) {	
		clearInterval(xunn);	
b="......"
j=0;
var xun = window.setInterval(function() {
		a.innerHTML = a.innerHTML + b[j];
		j++;

		if (j >= b.length) {	
			clearInterval(xun);
			b="整个人都精神了"
			j=0;
			var xu = window.setInterval(function() {
		       a.innerHTML = a.innerHTML + b[j];
		      j++;

		       if (j >= b.length) {	
		     	clearInterval(xu);
			var yuan=document.getElementById("yuanyi");
			var buyuan=document.getElementById("buyuanyi");
			var queding=document.getElementById("queding");
			queding.type="button";
			yuan.type="hidden";
			buyuan.type="hidden";
			yuan.name="";
			buyuan.name="";
			yuan.value="";
			buyuan.value="";
			}

 },50);
			}

 },1000);
 
 }
 },50);
}
function yuanyi(){
var yuan=document.getElementById("yuanyi");
var buyuan=document.getElementById("buyuanyi");
yuan.type="hidden";
buyuan.type="hidden";

	$.ajax({
	url:"/RPG/cunzhuang/yuanyi",
	type:"post",
	 contentType:'application/x-www-form-urlencoded;charset=UTF-8',
	data:{
		yuan:yuan.name
	},
	dataType:"text",
	success:function(data){
	top.zuobian.location.href="/RPG/tanxian/jueseshuxing"
			var a=document.getElementById("sp");
			if(data=="睡觉"){
			shuijiao()
			}else{
	         xun(a,data,"1")
	          }
	}
	
		
		
		
	})

}

function buyuanyi(){
var buyuan=document.getElementById("buyuanyi");
var yuan=document.getElementById("yuanyi");
yuan.type="hidden";
buyuan.type="hidden";
$.ajax({
	url:"/RPG/cunzhuang/buyuanyi",
	type:"post",
	 contentType:'application/x-www-form-urlencoded;charset=UTF-8',
	data:{
		buyuan:buyuan.name
	},
	dataType:"text",
	success:function(data){
	top.zuobian.location.href="/RPG/tanxian/jueseshuxing"
			var a=document.getElementById("sp");
	xun(a,data,"1")
	}
	
		
		
		
	})
}
function gou(){
var gou=document.getElementById("gou");
var bu=document.getElementById("bu");
gou.type="hidden";
bu.type="hidden";
var k=document.getElementById("div");
k.style.display="none";
if(gou.name=="装备店老板"){
var j=document.getElementById("zhuangbei");
}
if(gou.name=="道具店老板"){
var j=document.getElementById("daoju");
}
j.style.display="";

}
function bu(){
var gou=document.getElementById("gou");
var bu=document.getElementById("bu");
gou.type="hidden";
bu.type="hidden";
var a=document.getElementById("sp");
xun(a,"欢迎下次再来","2")
}
function bule(){
	var ss=document.getElementById("ss");
			ss.innerHTML="";
var zhuangbei=document.getElementById("zhuangbei");
zhuangbei.style.display="none";
var k=document.getElementById("div");
k.style.display="";
var a=document.getElementById("sp");
a.innerHTML="";
xun(a,"欢迎下次再来","2")
}
function bule1(){
	var sss=document.getElementById("sss");
	sss.innerHTML="";
var daoju=document.getElementById("daoju");
daoju.style.display="none";
var k=document.getElementById("div");
k.style.display="";
var a=document.getElementById("sp");
a.innerHTML="";
xun(a,"欢迎下次再来","2")
}
function goumai(obj){
$.ajax({
	url:"/RPG/cunzhuang/goumai",
	type:"post",
	 contentType:'application/x-www-form-urlencoded;charset=UTF-8',
	data:{
		wu:obj.id
	},
	dataType:"text",
	success:function(data){
	top.zuobian.location.href="/RPG/tanxian/jueseshuxing"
			var ss=document.getElementById("ss");
			ss.innerHTML="";
			var j=0;
			var xun = window.setInterval(function() {
		ss.innerHTML = ss.innerHTML + data[j];
		j++;
		if (j >= data.length) {	
			clearInterval(xun);
			}
			},50);
	}
	
		
		
		
	})
}
function goumai1(obj){
$.ajax({
	url:"/RPG/cunzhuang/goumai1",
	type:"post",
	 contentType:'application/x-www-form-urlencoded;charset=UTF-8',
	data:{
		wu:obj.id
	},
	dataType:"text",
	success:function(data){
	top.zuobian.location.href="/RPG/tanxian/jueseshuxing"
			var ss=document.getElementById("sss");
			ss.innerHTML="";
			var j=0;
			var xun = window.setInterval(function() {
		ss.innerHTML = ss.innerHTML + data[j];
		j++;
		if (j >= data.length) {	
			clearInterval(xun);
			}
			},50);
	}
	
		
		
		
	})
}
function queding(){
var k=document.getElementById("div");
k.style.display="none";
var a=document.getElementById("sp");
a.innerHTML="";
var queding=document.getElementById("queding");
queding.type="hidden";
var els =document.getElementsByName("1");
for (var i = 0, j = els.length; i < j; i++){
			els[i].disabled="";
		}
}

function qucunkou() {
	top.location = "/RPG/cunzhuang/fanhuishengmocuncunkou";
}



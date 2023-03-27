<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
		<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>路人</title>
<link rel="stylesheet" type="text/css"
	href="/RPG/css/luren.css" charset="utf-8" />
	<%@ include file="/WEB-INF/js/luren-js"%>
	<link rel="stylesheet" type="text/css"
	href="/RPG/css/tanxian/miwusenlin/qugundong.css" charset="utf-8" />
</head>
<body class="qugundong">
<input type="hidden" value="0" id="cun">
<span id="cunhua" class="cunhua">
<%
String ren=(String)request.getAttribute("ren");
int diyi=(int)request.getAttribute("diyi");
request.setAttribute("ren", ren);
request.setAttribute("diyi", diyi);
String[] sh=(String[])request.getAttribute("sh");
request.setAttribute("sh", sh);

%>
<script type="text/javascript">
var a="${ren}";
var b="${diyi}";
if(a=="闯荡者"){
	if(b==0){
	
	fahua("你愿意给我一个草药吗（只拿你背包的第一个草药）",a,b);
}
	if(b==1){
	fahua("你是不是想再听我说一遍我的秘密，但我就不告诉你，你求求我啊",a,b);
	}
	if(b==2){
		var ll = new Array();
		<c:forEach var="sh" items="${sh}">

		ll.push("${sh}");
		</c:forEach >
		var k=document.getElementById("cun").value;
		shengyu(ll[k]);
	}

}
if(a=="蜥蜴王"){
	if(b==0){
		fahua("愚蠢的人类，竟敢挑衅我，准备受死吧",a,b);
	}
	if(b==1){
		ju("闪光剑的攻击力非常大，记得装备上");
	}
	if(b==2){
		var pp=new Array();
		<c:forEach var="sh" items="${sh}">
		pp.push("${sh}");
		</c:forEach>
		var k=document.getElementById("cun").value;
		shengyu(pp[k]);
	}
	
}
if(a=="黑商"){
	if(b==0){
		fahua("亲爱的勇士，我这里有一件装备-鳞甲，他拥有防御特技，需要1000枚金钱，请问要购买吗",a,b);
	}
	if(b==1){
		ju("我现在没有存货了，请以后再来")
	}
	if(b==2){
		var pp=new Array();
		<c:forEach var="sh" items="${sh}">
		pp.push("${sh}");
		</c:forEach>
		var k=document.getElementById("cun").value;
		shengyu(pp[k]);
	}
}
if(a=="打猎人"){
	if(b==0){
		ju("你没有大与40的攻击力，千万不要去挑衅道路十的象精")
	}
}
if(a=="失败的勇者"){
	if(b==0){
		ju("魔王实在是太可怕了，我都破不了他的防御，听说在大草原的象精，有个可以破防御的宝物")
	}
}
if(a=="冒险者"){
	if(b==0){
		ju("魔王的速度是非常夸张的，所以说，你的防御力也必须足够，我听说在某个地方，有个商人，他好象有一个防御力超高的宝物")
	}
}
if(a=="象精"){
	if(b==0){
		fahua("这是我的领地，闯入者都得死",a,b);
	}
	if(b==1){
		ju("刺锥一定要对魔王使用，否则你会很难打赢魔王的");
	}
	if(b==2){
		var pp=new Array();
		<c:forEach var="sh" items="${sh}">
		pp.push("${sh}");
		</c:forEach>
		var k=document.getElementById("cun").value;
		shengyu(pp[k]);
	}
}
if(a=="魔王"){
	if(b==0){
		fahua("被我打败的冒险者，可不只你一个",a,b);
	}
	if(b==1){
		ju("你现在可以去管理员模式了");
	}
	if(b==2){
		var pp=new Array();
		<c:forEach var="sh" items="${sh}">
		pp.push("${sh}");
		</c:forEach>
		var k=document.getElementById("cun").value;
		shengyu(pp[k]);
	}
}
</script>
</span>
<input type="hidden" value="" name="" id="yuanyi" class="yuanyi" onclick="yuanyi()">
<input type="hidden" value="" name="" id="buyuanyi" class="buyuanyi" onclick="buyuanyi()">
<input type="hidden" value="确定" name="" id="bugao" class="bugao" onclick="bugao()">
<input type="hidden" value="不说我就打你" name="" id="zhunda" class="zhunda" onclick="zhunda()">
<input type="hidden" value="确定" onclick="queding()" id="que" class="qu">
<input type="hidden" value="${cunxuehao}" id="xue">
<input type="hidden" value="${dalu}" id="dalu">
<input type="hidden" value="开始战斗" name="" id="zhan" class="zhan" onclick="zhan()">
<input type="hidden" value="确定" onclick="dan()" id="dan" class="dan">
</body>
</html>
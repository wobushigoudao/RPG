<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>剩余话</title>
<link rel="stylesheet" type="text/css"
	href="/RPG/css/shengyu.css" charset="utf-8" />

	<%@ include file="/WEB-INF/js/shengyu-js"%>
	<link rel="stylesheet" type="text/css"
	href="/RPG/css/tanxian/miwusenlin/qugundong.css" charset="utf-8" />
</head>

<body class="qugundong">
<input type="hidden" value="0" id="cun">
<input type="hidden" value="确定" onclick="dan()" id="dan" class="dan">
<input type="hidden" value="确定" onclick="queding()" id="que" class="qu">
<input type="hidden" value="确定" name="" id="bugao" class="bugao" onclick="bugao()">
<input type="hidden" value="你才是傻逼" name="" id="zhunda" class="zhunda" onclick="zhunda()">
<span id="cunhua" class="cunhua">
<%
String[] sh=(String[])request.getAttribute("sh");
String bu=(String)request.getAttribute("bu");
String name=(String)request.getAttribute("name");
request.setAttribute("sh", sh);
request.setAttribute("bu", bu);
request.setAttribute("name", name);

%>

<script type="text/javascript">
var name1="${name}";
var bu="${bu}";
var a = new Array();
<c:forEach var="sh" items="${sh}">

a.push("${sh}");
</c:forEach >
if(name1=="闯荡者"){
if(bu=="愿意"){
	var k=document.getElementById("cun").value;
	shengyu(a[k]);
}
if(bu=="不愿意"){
	var shuo="哪算了，就一个草药我不稀罕";
	ju(shuo);
}
if(bu=="没有"){
	var mei="你明明没有草药，真晦气";
	ju(mei);
}
}
if(name1=="黑商"){
	if(bu=="购买"){
		var mai="你真是个土豪，赚大发了";
		ju(mai);
	}
	if(bu=="没钱"){
		fahua("他妈的，你个傻逼没钱，就别来烦我",name1,bu);
	}
	if(bu=="不购买"){
		var bumai="我一看你就是个穷鬼";
		ju(bumai);
	}
}
</script>
</span>
</body>
</html>
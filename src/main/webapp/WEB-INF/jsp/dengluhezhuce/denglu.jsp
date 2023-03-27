<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
	href="/RPG/css/dengluhezhuce/denglu.css" charset="utf-8" />
<script type="text/javascript" src="/RPG/js/dengluhezhuce/denglu.js"
	charset="utf-8"></script>
<title>探险网</title>
</head>
<body class="qugundong">
	<span class="zhucechenggong" id="zhucechenggong"> <%
 	String zhucechenggong = (String) request.getAttribute("zhucechenggong");
 if (zhucechenggong != null) {
	 request.setAttribute("zhucechenggong", zhucechenggong);

 %> <script type="text/javascript">
 var a="${zhucechenggong}";
var r = document.getElementById("zhucechenggong");
var j=0;
 var xun = window.setInterval(function() {
 if(a.length==0){
	 clearInterval(xun);
 }else{
		r.innerHTML = r.innerHTML + a[j];
		j++;

		if (j >= a.length) {	
			clearInterval(xun)
 }
 }
 },50);
 
 </script>
  <%
 }
 %>
 
	</span>
	
	
	<span class="mimacuowu" id="mimacuowu"> <%
			String mimacuowu = (String) request.getAttribute("mimacuowu");
 if (mimacuowu != null) {
	 request.setAttribute("mimacuowu", mimacuowu);

 %> <script type="text/javascript">
 var a="${mimacuowu}";
var r = document.getElementById("mimacuowu");
var j=0;
 var xun = window.setInterval(function() {
 if(a.length==0){
	 clearInterval(xun);
 }else{
		r.innerHTML = r.innerHTML + a[j];
		j++;

		if (j >= a.length) {	
			clearInterval(xun)
 }
 }
 },50);
 
 </script>
  <%
 }
 %>
 
	</span>
	
	
		<span class="meiyouzhanghao" id="meiyouzhanghao"> <%
				String meiyouzhanghao = (String) request.getAttribute("meiyouzhanghao");
 if (meiyouzhanghao != null) {
	 request.setAttribute("meiyouzhanghao", meiyouzhanghao);

 %> <script type="text/javascript">
 var a="${meiyouzhanghao}";
var r = document.getElementById("meiyouzhanghao");
var j=0;
 var xun = window.setInterval(function() {
 if(a.length==0){
	 clearInterval(xun);
 }else{
		r.innerHTML = r.innerHTML + a[j];
		j++;

		if (j >= a.length) {	
			clearInterval(xun)
 }
 }
 },50);
 
 </script>
  <%
 }
 %>
 
	</span>
	
	<form name="dengluform" method="post">
		<table width="450px" height="300px" border="1" cellspacing="0">
			<tr>
				<td align="center" class="zitidaxiao">登录探险网</td>
			</tr>
			<tr>
				<td align="center" class="zitidaxiao"><span class="xuehao">学号：</span><input
					class="input" style="width:150px" type="text" id="xuehao" name="xuehao"></td>
			</tr>
			<tr>
				<td align="center" class="zitidaxiao"><span class="mima">密码：</span><input
					class="input" style="width:150px" type="password" id="mima" name="mima"></td>
			</tr>
			<tr>
				<td align="center"><input class="denglu" type="button"
					value="登录" onclick="denglu()"> <input class="zhucezhanghao"
					type="button" value="注册帐号" onclick="zhucezhanghao()"></td>
			</tr>
		</table>
	</form>


</body>
</html>
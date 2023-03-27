<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
	href="/RPG/css/shengmocuncunkou/shengmocuncunkou.css" charset="utf-8" />
<title>圣魔村村口</title>

</head>
<body>
	<form action="/RPG/shengmocuncunkou/tanxiandalu?xuehao=${xuehao}"
		method="post">

		<input class="tanxiandalu" type="submit" value="探险大陆">

	</form>


	<form action="/RPG/shengmocuncunkou/cunzhuang?xuehao=${xuehao}"
		method="post">

		<input class="cunzhuang" type="submit" value="村庄">

	</form>
	<form action="/RPG/shengmocuncunkou/chuangjianjuese?xuehao=${xuehao}"
		method="post">

		<input class="chuangjianjuese" type="submit" value="创建角色">

	</form>
<form action="/RPG/shengmocuncunkou/guanliyuanmoshi?xuehao=${xuehao}"
		method="post">
		<input class="guangliyuan" type="submit" value="管理员模式">

	</form>

<span class="meida" id="meida"> <%
			String meida = (String) request.getAttribute("meida");
 if (meida != null) {
	 request.setAttribute("meida", meida);

 %> <script type="text/javascript">
 var a="${meida}";
var r = document.getElementById("meida");
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




	<span class="meiyouguaiwu" id="meiyouguaiwu"> <%
			String meiyouguaiwu = (String) request.getAttribute("meiyouguaiwu");
 if (meiyouguaiwu != null) {
	 request.setAttribute("meiyouguaiwu", meiyouguaiwu);

 %> <script type="text/javascript">
 var a="${meiyouguaiwu}";
var r = document.getElementById("meiyouguaiwu");
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


		<span class="meiyoujuese" id="meiyoujuese"> <%
				String meiyoujuese = (String) request.getAttribute("meiyoujuese");
 if (meiyoujuese != null) {
	 request.setAttribute("meiyoujuese", meiyoujuese);

 %> <script type="text/javascript">
 var a="${meiyoujuese}";
var r = document.getElementById("meiyoujuese");
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

		<span class="jueseyichuangjian" id="jueseyichuangjian"> <%
				String jueseyichuangjian = (String) request.getAttribute("jueseyichuangjian");
 if (jueseyichuangjian != null) {
	 request.setAttribute("jueseyichuangjian", jueseyichuangjian);

 %> <script type="text/javascript">
 var a="${jueseyichuangjian}";
var r = document.getElementById("jueseyichuangjian");
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
	<span class="chuangjianljuese" id="chuangjianljuese"> <%
				String chuangjianljuese = (String) request.getAttribute("chuangjianljuese");
 if (chuangjianljuese != null) {
	 request.setAttribute("chuangjianljuese", chuangjianljuese);

 %> <script type="text/javascript">
 var a="${chuangjianljuese}";
var r = document.getElementById("chuangjianljuese");
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



	

	


</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
	href="/RPG/css/tanxian/tishihefanhuishengmocuncunkou.css"
	charset="utf-8" />
<%@ include file="/WEB-INF/js/tanxian/tishihefanhuishengmocuncunkou-js"%>

<title>提示和返回圣魔村村口</title>
</head>
<body>
<span class="tishi" id="cuntishi"> <%
String[] tishi = (String[]) request.getAttribute("tishi");
 if (tishi != null) {
	 int suijishu = (int) (Math.random() * 5);
	 request.setAttribute("suijishu", tishi[suijishu]);

 %> <script type="text/javascript">
 var a="${suijishu}";
var r = document.getElementById("cuntishi");
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


	<input type="button" value="返回圣魔村村口" class="fanhuishengmocuncunkou"
		onclick="fanhuishengmocuncunkou()">
		<input type="button" value="直接进入村庄" class="cunzhuang"
		onclick="cunzhuang()">
</body>
</html>
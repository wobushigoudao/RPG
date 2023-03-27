<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>提示</title>
<link rel="stylesheet" type="text/css"
	href="/RPG/css/tanxian/miwusenlin/tishi.css" charset="utf-8" />
<%@ include file="/WEB-INF/js/tanxian/miwusenlin/tishi-js"%>
	<link rel="stylesheet" type="text/css"
	href="/RPG/css/tanxian/miwusenlin/qugundong.css" charset="utf-8" />
</head>
<body class="qugundong">

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
</body>
</html>
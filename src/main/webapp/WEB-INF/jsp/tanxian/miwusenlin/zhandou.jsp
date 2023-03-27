<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>战斗日志</title>
<link rel="stylesheet" type="text/css"
	href="/RPG/css/tanxian/miwusenlin/zhandourizhi.css" charset="utf-8" />
</head>
<body class="qugundong">
<a class="zhongjian" href="/RPG/tanxian/miwusenlin/gongjihetaopao">返回</a>
<span class="zhandouxinxi" id="daodibu">
<%
String[] cunxinxi = (String[]) request.getAttribute("cunxinxi");

 		for (int i = 0; i < cunxinxi.length; i++) {
 	out.print(cunxinxi[i] + "<br>");
 		}
 	

%>

</span>
</body>
</html>
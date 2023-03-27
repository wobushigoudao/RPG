<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="/RPG/css/tanxian/ditu.css"
	charset="utf-8" />
<script type="text/javascript" src="/RPG/js/tanxian/ditu.js"
	charset="utf-8"></script>
<title>地图</title>
</head>
<body>
	<input type="button" value="迷雾森林" class="miwusenlin"
		onclick="miwusenlin()">
	<input type="button" value="大草原" class="dacaoyuan"
		onclick="dacaoyuan()">
	<input type="button" value="魔王城堡" class="mowangchengbao"
		onclick="mowangchengbao()">
	<input type="hidden" value="${xuehao}" id="xuehao">
</body>
</html>
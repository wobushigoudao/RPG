<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>攻击和逃跑</title>
<link rel="stylesheet" type="text/css"
	href="/RPG/css/tanxian/miwusenlin/gongjihetaopao.css" charset="utf-8" />
	<link rel="stylesheet" type="text/css"
	href="/RPG/css/tanxian/miwusenlin/qugundong.css" charset="utf-8" />
<script type="text/javascript"
	src="/RPG/js/tanxian/miwusenlin/gongjihetaopao.js" charset="utf-8"></script>
</head>
<body class="qugundong">
	<input type="button" value="攻击" class="gongji" onclick="gongji()">
	<input type="button" value="逃跑" class="taopao" onclick="taopao()">
	<input type="button" value="物品" class="wupin" onclick="wupin()">
	<input type="button" value="装备" class="zhuangbei" onclick="zhuangbei()">
	<input type="button" value="查看战斗日志" class="zhandou" onclick="zhandou()">
	<input type="button" value="武器特技" class="wuqiteji" onclick="wuqiteji()">
	<input type="button" value="防具特技" class="fangjuteji" onclick="fangjuteji()">
	<input type="hidden" value="${tejilenque}" id="lenque">
	<input type="hidden" value="${tejifanglenque}" id="fanglenque">
</body>
</html>
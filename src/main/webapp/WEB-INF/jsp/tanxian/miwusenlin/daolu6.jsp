<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>道路六</title>
<link rel="stylesheet" type="text/css"
	href="/RPG/css/tanxian/miwusenlin/daolu6.css" charset="utf-8" />
	<link rel="stylesheet" type="text/css"
	href="/RPG/css/tanxian/miwusenlin/qugundong.css" charset="utf-8" />
<script type="text/javascript"
	src="/RPG/js/tanxian/miwusenlin/daolu6.js" charset="utf-8"></script>
	<%@ include file="/WEB-INF/js/tanxian/miwusenlin/laihua-js"%>
</head>
<body class="qugundong">
<span class="daoluliu">道路六</span>
<input type="button" value="闯荡者" class="chuangdangzhe" onclick="chuangdangzhe()" id="chuangdangzhe">
	<input type="button" value="道路三" class="zuo" onclick="daolusan()">
	<input type="button" value="道路四" class="xia" onclick="daolusi()">
		<input type="button" value="道路八" class="shang" onclick="daoluba()">
	<input type="button" value="调查" class="diaocha" onclick="diaocha()">
			<input type="hidden" value="${guai}" id="guai">
	



</body>
</html>
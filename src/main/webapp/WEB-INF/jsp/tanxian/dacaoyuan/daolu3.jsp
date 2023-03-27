<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>道路3</title>
<link rel="stylesheet" type="text/css"
	href="/RPG/css/tanxian/dacaoyuan/daolu3.css" charset="utf-8" />
	<link rel="stylesheet" type="text/css"
	href="/RPG/css/tanxian/miwusenlin/qugundong.css" charset="utf-8" />
<script type="text/javascript"
	src="/RPG/js/tanxian/dacaoyuan/daolu3.js" charset="utf-8"></script>
	<%@ include file="/WEB-INF/js/tanxian/miwusenlin/laihua-js"%>
</head>
<body class="qugundong">
	<span class="daolusan">道路三</span>
	<input type="button" value="黑商" class="heishang" onclick="heishang()" id="heishang">
	<input type="button" value="道路一" class="xia" onclick="daoluyi()">
	<input type="button" value="道路四" class="zuo" onclick="daolusi()">
	<input type="button" value="道路六" class="you" onclick="daoluliu()">
	<input type="button" value="道路九" class="shang" onclick="daolujiu()">
	<input type="button" value="调查" class="diaocha" onclick="diaocha()">
			<input type="hidden" value="${guai}" id="guai">
	

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>道路10</title>
<link rel="stylesheet" type="text/css"
	href="/RPG/css/tanxian/miwusenlin/daolu10.css" charset="utf-8" />
	<link rel="stylesheet" type="text/css"
	href="/RPG/css/tanxian/miwusenlin/qugundong.css" charset="utf-8" />
<script type="text/javascript"
	src="/RPG/js/tanxian/miwusenlin/daolu10.js" charset="utf-8"></script>
	<%@ include file="/WEB-INF/js/tanxian/miwusenlin/laihua-js"%>
</head>
<body class="qugundong">
<span class="daolushi">道路十</span>
	<input type="button" value="调查" class="diaocha" onclick="diaocha()">
<input type="button" value="蜥蜴王" class="shang" id="boss" onclick="boss()">
<input type="button" value="道路八" class="xia" onclick="daoluba()">
<input type="hidden" value="${guai}" id="guai">
</body>
</html>
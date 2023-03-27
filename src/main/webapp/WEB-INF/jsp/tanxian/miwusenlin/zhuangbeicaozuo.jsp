<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>装备操作</title>
<link rel="stylesheet" type="text/css"
	href="/RPG/css/tanxian/miwusenlin/zhuangbeicaozuo.css" charset="utf-8" />
	<link rel="stylesheet" type="text/css"
	href="/RPG/css/tanxian/miwusenlin/qugundong.css" charset="utf-8" />
<script type="text/javascript" src="/RPG/js/xiangqing.js"
	charset="utf-8"></script>
<script type="text/javascript" src="/RPG/js/zhuangbei.js"
	charset="utf-8"></script>
<script type="text/javascript" src="/RPG/js/diuqi.js" charset="utf-8"></script>
<script type="text/javascript" src="/RPG/js/fanhui.js" charset="utf-8"></script>
</head>
<body class="qugundong">
	<table align="center" width="80" height="100%" cellspacing="0"
		cellpadding="0">

		<tr>
			<td align="center" width="40px" height="30px"><a
				style="color: red;" href="#" onclick="zhuangbei()">装备</a></td>
		</tr>
		<tr>
			<td align="center" height="30px"><a style="color: red;" href="#"
				onclick="fanhui()">返回</a></td>
		</tr>
		<tr>
			<td align="center" height="30px"><a onclick="xiangqing()"
				href="#" style="color: red;">物品详情</a></td>
		</tr>
		<tr>
			<td align="center" height="30px"><a onclick="diuqizhuangbei()"
				href="#" style="color: red;">丢弃</a></td>
		</tr>


	</table>
	<input type="hidden" value="${cunxuehao}" id="cunxuehao">
	<input type="hidden" value="战斗内" id="zhandouwai">
	<input type="hidden" value="装备" id="wu">
</body>
</html>
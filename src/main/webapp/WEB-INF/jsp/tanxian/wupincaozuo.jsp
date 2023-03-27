<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
	href="/RPG/css/tanxian/wupincaozuo.css" charset="utf-8" />
<script type="text/javascript" src="/RPG/js/xiangqing.js"
	charset="utf-8"></script>
<script type="text/javascript" src="/RPG/js/shiyong.js" charset="utf-8"></script>
<script type="text/javascript" src="/RPG/js/diuqi.js" charset="utf-8"></script>
<script type="text/javascript" src="/RPG/js/fanhui.js" charset="utf-8"></script>
<title>物品操作</title>
</head>
<body>
	<table align="center" width="140" height="100%" cellspacing="0"
		cellpadding="0">

		<tr>
			<td align="center" width="60px" height="29px"><a onclick="diuqiwupin()"
				href="#" style="color: red;">丢弃</a></td>
			<td align="center" width="60px" height="29px"><a onclick="xiangqing()"
				href="#" style="color: red;">物品详情</a></td>


		</tr>
		<tr>
		
			<td align="center" height="29px"><a style="color: red;" href="#"
				onclick="waifanhui()">返回</a></td>
			<td align="center" height="29px"><a
				style="color: red;" href="#" onclick="shiyong()">使用</a></td>

		</tr>


	</table>
	<input type="hidden" value="${cunxuehao}" id="cunxuehao">
	<input type="hidden" value="战斗外" id="zhandouwai">
	<input type="hidden" value="物品" id="wu">
</body>
</html>
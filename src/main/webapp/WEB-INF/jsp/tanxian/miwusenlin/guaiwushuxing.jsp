<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
	href="/RPG/css/tanxian/miwusenlin/guaiwushuxing.css" charset="utf-8" />
<link rel="stylesheet" type="text/css"
	href="/RPG/css/tanxian/miwusenlin/qugundong.css" charset="utf-8" />
<title>怪物属性</title>
</head>
<body class="qugundong">
	<table align="center" width="140px" height="100%" cellspacing="0"
		cellpadding="0">
		<tr>

			<td colspan="2" height="25px" align="center">${guaiwushuxing.xingMing}</td>
		</tr>
		<tr>
			<td width="60px" height="25px" align="center">等级：</td>
			<td width="60px" height="25px" align="center">${guaiwuji}</td>
		</tr>
		<tr>
			<td align="center" height="25px">血量：</td>
			<td align="center" height="25px">${guaiwushuxing.xueLiang}</td>
		</tr>
		<tr>
			<td align="center" height="25px">攻击：</td>
			<td align="center" height="25px">${guaiwushuxing.gongJi}</td>
		</tr>
		<tr>
			<td align="center" height="25px">防御：</td>
			<td align="center" height="25px">${guaiwushuxing.fangYu}</td>
		</tr>
		<tr>
			<td align="center" height="25px">速度：</td>
			<td align="center" height="25px">${guaiwushuxing.suDu}</td>
		</tr>
		<tr>
			<td align="center" height="25px">金钱：</td>
			<td align="center" height="25px">${guaiwushuxing.jinQian}</td>
		</tr>
		<tr>
			<td align="center" height="25px">经验：</td>
			<td align="center" height="25px">${guaiwushuxing.jingYan}</td>
		</tr>

	</table>

</body>
</html>
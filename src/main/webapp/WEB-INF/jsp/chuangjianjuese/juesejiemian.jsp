<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
	href="/RPG/css/chuangjianjuese/juesejiemian.css" charset="utf-8" />
<script type="text/javascript"
	src="/RPG/js/chuangjianjuese/juesejiemian.js" charset="utf-8"></script>
<title>角色界面</title>

</head>
<body class="qugundong">
	<table align="center" width="450px" height="300px">
		<tr>
			<td width="200px" align="right" class="zitidaxiao">姓名：</td>
			<td width="200px" align="left"><input type="text" id="xingming"
				value="${jueseshuju.xingMing}"></td>
		</tr>
		<tr>
			<td align="right" class="zitidaxiao">血量：</td>
			<td align="left"><input type="text"
				value="${jueseshuju.xueLiang}" id="xueliang" disabled></td>
		</tr>
		<tr>
			<td align="right" class="zitidaxiao">攻击：</td>
			<td align="left"><input type="text" value="${jueseshuju.gongJi}"
				id="gongji" disabled></td>
		</tr>
		<tr>
			<td align="right" class="zitidaxiao">防御：</td>
			<td align="left" class="zitidaxiao"><input type="text"
				id="fangyu" value="${jueseshuju.fangYu}" disabled></td>
		</tr>
		<tr>
			<td align="right" class="zitidaxiao">速度：</td>
			<td align="left"><input type="text" value="${jueseshuju.suDu}"
				id="sudu" disabled></td>
		</tr>
		<tr>
			<td align="right" class="zitidaxiao">金钱：</td>
			<td align="left"><input type="text"
				value="${jueseshuju.jinQian}" id="jinqian" disabled></td>
		</tr>
		<tr>
			<td align="right" class="zitidaxiao">经验：</td>
			<td align="left"><input type="text"
				value="${jueseshuju.jingYan}" id="jingyan" disabled></td>
		</tr>


	</table>

</body>
</html>
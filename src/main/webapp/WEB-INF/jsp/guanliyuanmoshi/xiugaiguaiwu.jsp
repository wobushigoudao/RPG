<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
	href="/RPG/css/guanliyuanmoshi/xiugaiguaiwu.css" charset="utf-8" />
<script type="text/javascript"
	src="/RPG/js/guanliyuanmoshi/xiugaiguaiwu.js" charset="utf-8"></script>
<title>修改</title>


</head>
<body class="qugundong">


	<table align="center" width="450px" height="300px">
		<tr>
			<td width="200px" align="right" class="zitidaxiao">怪物编号：</td>
			<td width="200px" align="left"><input type="text" id="id"
				value="${guaiwuidshuju.iD}" disabled></td>
		</tr>
		<tr>
			<td align="right" class="zitidaxiao">怪物名：</td>
			<td align="left"><input type="text" id="xingming"
				value="${guaiwuidshuju.xingMing}" disabled></td>
		</tr>
		<tr>
			<td align="right" class="zitidaxiao">血量：</td>
			<td align="left"><input type="text" id="xueliang"
				value="${guaiwuidshuju.xueLiang}"></td>
		</tr>
		<tr>
			<td align="right" class="zitidaxiao">攻击：</td>
			<td align="left"><input type="text" id="gongji"
				value="${guaiwuidshuju.gongJi}"></td>
		</tr>
		<tr>
			<td align="right" class="zitidaxiao">防御：</td>
			<td align="left"><input type="text" id="fangyu"
				value="${guaiwuidshuju.fangYu}"></td>
		</tr>
		<tr>
			<td align="right" class="zitidaxiao">速度：</td>
			<td align="left"><input type="text" id="sudu"
				value="${guaiwuidshuju.suDu}"></td>
		</tr>
		<tr>
			<td align="right" class="zitidaxiao">金钱：</td>
			<td align="left"><input type="text" id="jinqian"
				value="${guaiwuidshuju.jinQian}"></td>
		</tr>
		<tr>
			<td align="right" class="zitidaxiao">经验：</td>
			<td align="left"><input type="text" id="jingyan"
				value="${guaiwuidshuju.jingYan}"></td>
		</tr>

	</table>

</body>
</html>
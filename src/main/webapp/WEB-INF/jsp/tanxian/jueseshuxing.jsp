<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
	href="/RPG/css/tanxian/jueseshuxing.css" charset="utf-8" />
<title>角色属性</title>

</head>
<body class="qugundong">
	<table align="center" width="140px" height="100%" cellspacing="0"
		cellpadding="0">
		<tr>

			<td colspan="2" height="25px" align="center">${juesexuehaoshuju.xingMing}</td>
		</tr>
		<tr>
			<td width="60px" height="25px" align="center">等级：</td>
			<td width="60px" height="25px" align="center">${juesexuehaoshuju.dengJi}</td>
		</tr>
		<tr>
			<td align="center" height="25px">血量：</td>
			<td align="center" height="25px">${juesexuehaoshuju.xueLiang}/${juesexuehaoshuju.xueliangMax}</td>
		</tr>
		<tr>
			<td align="center" height="25px">攻击：</td>
			<td align="center" height="25px">${juesexuehaoshuju.gongJi}</td>
		</tr>
		<tr>
			<td align="center" height="25px">防御：</td>
			<td align="center" height="25px">${juesexuehaoshuju.fangYu}</td>
		</tr>
		<tr>
			<td align="center" height="25px">速度：</td>
			<td align="center" height="25px">${juesexuehaoshuju.suDu}</td>
		</tr>
		<tr>
			<td align="center" height="25px">金钱：</td>
			<td align="center" height="25px">${juesexuehaoshuju.jinQian}</td>
		</tr>
		<tr>
			<td align="center" height="25px">经验：</td>
			<td align="center" height="25px">${juesexuehaoshuju.jingYan}/${juesexuehaoshuju.jingyanMax}</td>
		</tr>
		<tr>
			<td align="center" height="25px">武器：</td>
			<td align="center" height="25px">${zhuangbei.wuQi}</td>
		</tr>
		<tr>
			<td align="center" height="25px">防具：</td>
			<td align="center" height="25px">${zhuangbei.fangJu}</td>
		</tr>

		<tr>
			<td align="center" height="25px" colspan="2">背包</td>
		</tr>
		<tr>
			<td align="center" height="25px"><a href="/RPG/tanxian/wupinzong"
				style="position: relative; left: -8px; text-decoration: none;">物品</a></td>
			<td align="center" height="25px"><a
				href="/RPG/tanxian/zhuangbeizong" style="text-decoration: none;">装备</a></td>
		</tr>
			<tr>
			<td align="center" height="25px"><a href="/RPG/tanxian/xiexiawuqi"
				style="position: relative; left: -8px; text-decoration: none;">卸下武器</a></td>
			<td align="center" height="25px"><a
				href="/RPG/tanxian/xiexiafangju" style="text-decoration: none;">卸下防具</a></td>
		</tr>
		

	</table>
	<input type="hidden" value="${juesexuehaoshuju.shiFou}" id="shifou">

</body>
</html>
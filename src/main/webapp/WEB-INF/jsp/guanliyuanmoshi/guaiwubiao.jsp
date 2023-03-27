<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
	href="/RPG/css/guanliyuanmoshi/guaiwubiao.css" charset="utf-8" />
<script type="text/javascript"
	src="/RPG/js/guanliyuanmoshi/guaiwubiao.js" charset="utf-8"></script>

<title>怪物表</title>


</head>
<body class="qugundong">
<span id="cunkuanggao" class="zhongjiankuang"> <%
String zhongjiankuang = (String) request.getAttribute("zhongjiankuang");
 if (zhongjiankuang != null) {
	 request.setAttribute("zhongjiankuang", zhongjiankuang);

 %> <script type="text/javascript">
 var a="${zhongjiankuang}";
var r = document.getElementById("cunkuanggao");
var j=0;
 var xun = window.setInterval(function() {
 if(a.length==0){
	 clearInterval(xun);
 }else{
		r.innerHTML = r.innerHTML + a[j];
		j++;

		if (j >= a.length) {	
			clearInterval(xun)
 }
 }
 },50);
 
 </script>
  <%
 }
 %>
 
	</span>
	<h3 align="center">怪物表</h3>
	<table width="900px" align="center" cellspacing="0" cellpadding="0"
		border="1">

		<tr>
			<td width="10%" height="30" align="center">编号</td>
			<td width="10%" height="30" align="center">姓名</td>
			<td width="10%" height="30" align="center">血量</td>
			<td width="10%" height="30" align="center">攻击</td>
			<td width="10%" height="30" align="center">防御</td>
			<td width="10%" height="30" align="center">速度</td>
			<td width="10%" height="30" align="center">金钱</td>
			<td width="10%" height="30" align="center">经验</td>
			<td height="30" align="center">相关操作</td>

		</tr>
		<c:forEach var="guaiwubiaoshuju" items="${guaiwubiaoshuju}">
			<tr>
				<td width="10%" height="30" align="center">${guaiwubiaoshuju.iD}</td>
				<td width="10%" height="30" align="center">${guaiwubiaoshuju.xingMing}</td>
				<td width="10%" height="30" align="center">${guaiwubiaoshuju.xueLiang}</td>

				<td width="10%" height="30" align="center">${guaiwubiaoshuju.gongJi}</td>
				<td width="10%" height="30" align="center">${guaiwubiaoshuju.fangYu}</td>
				<td width="10%" height="30" align="center">${guaiwubiaoshuju.suDu}</td>
				<td width="10%" height="30" align="center">${guaiwubiaoshuju.jinQian}</td>
				<td width="10%" height="30" align="center">${guaiwubiaoshuju.jingYan}</td>
				<td height="30" align="center"><a class="qudiaoyangshi"
					href="/RPG/guanliyuanmoshi/xiugaijiemian?id=${guaiwubiaoshuju.iD}">修改</a>
					<a class="qudiaoyangshi"
					href="/RPG/guanliyuanmoshi/shanchu?id=${guaiwubiaoshuju.iD}"
					onclick=" return shanchu()">删除</a></td>
			</tr>
		</c:forEach>
	</table>


	<input type="hidden" value="${zuihouyiye}" id="zuihouyiye">



</body>
</html>
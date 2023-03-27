<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
	href="/RPG/css/guanliyuanmoshi/tianjiaguaiwu.css" charset="utf-8" />
<script type="text/javascript"
	src="/RPG/js/guanliyuanmoshi/tianjiaguaiwu.js" charset="utf-8"></script>
<title>添加</title>



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



	<table align="center" width="450px" height="300px">
		<tr>
			<td width="200px" align="right" class="zitidaxiao">怪物编号：</td>
			<td width="200px" align="left"><input type="text" id="id"
				value="${guaiwushuju.iD}"></td>
		</tr>
		<tr>
			<td align="right" class="zitidaxiao">怪物名：</td>
			<td align="left"><input type="text" id="xingming"
				value="${guaiwushuju.xingMing}"></td>
		</tr>
		<tr>
			<td align="right" class="zitidaxiao">血量：</td>
			<td align="left"><input type="text" id="xueliang"
				value="${guaiwushuju.xueLiang}"></td>
		</tr>
		<tr>
			<td align="right" class="zitidaxiao">攻击：</td>
			<td align="left"><input type="text" id="gongji"
				value="${guaiwushuju.gongJi}"></td>
		</tr>
		<tr>
			<td align="right" class="zitidaxiao">防御：</td>
			<td align="left"><input type="text" id="fangyu"
				value="${guaiwushuju.fangYu}"></td>
		</tr>
		<tr>
			<td align="right" class="zitidaxiao">速度：</td>
			<td align="left"><input type="text" id="sudu"
				value="${guaiwushuju.suDu}"></td>
		</tr>
		<tr>
			<td align="right" class="zitidaxiao">金钱：</td>
			<td align="left"><input type="text" id="jinqian"
				value="${guaiwushuju.jinQian}"></td>
		</tr>
		<tr>
			<td align="right" class="zitidaxiao">经验：</td>
			<td align="left"><input type="text" id="jingyan"
				value="${guaiwushuju.jingYan}"></td>
		</tr>
	</table>

</body>
</html>

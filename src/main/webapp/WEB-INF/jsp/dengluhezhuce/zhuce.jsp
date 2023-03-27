<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
	href="/RPG/css/dengluhezhuce/zhuce.css" charset="utf-8" />
<script type="text/javascript" src="/RPG/js/dengluhezhuce/zhuce.js"
	charset="utf-8"></script>
<title>注册帐号</title>


</head>
<body class="qugundong">

	<span class="yizhucexuehao" id="yizhucexuehao"> <%
			String yizhucexuehao = (String) request.getAttribute("yizhucexuehao");
 if (yizhucexuehao != null) {
	 request.setAttribute("yizhucexuehao", yizhucexuehao);

 %> <script type="text/javascript">
 var a="${yizhucexuehao}";
var r = document.getElementById("yizhucexuehao");
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
	


	<form name="zhuceform" method="post">
		<table width="450px" height="300px" border="1" cellspacing="0">
			<tr>
				<td align="center" class="zitidaxiao">注册界面</td>
			</tr>
			<tr>
				<td align="center" class="zitidaxiao"><span class="xuehao">学号：</span><input
					class="input" type="text" id="xuehao" name="xuehao"></td>
			</tr>
			<tr>
				<td align="center" class="zitidaxiao"><span class="mima">密码：</span><input
					class="input" type="text" id="mima" name="mima"></td>
			</tr>
			<tr>
				<td align="center"><input class="zhuce" type="button"
					value="注册" onclick="zhuce()"> <input
					class="fanhuitanxianwang" type="button" value="返回探险网"
					onclick="fanhuitanxianwang()"></td>
			</tr>
		</table>
	</form>


</body>
</html>
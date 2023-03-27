<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
	href="/RPG/css/guanliyuanmoshi/shangxiaye.css" charset="utf-8" />

<script type="text/javascript"
	src="/RPG/js/guanliyuanmoshi/shangxiaye.js" charset="utf-8"></script>
<title>上下页</title>




</head>
<body>

	<input type="button" onclick="shangyiye()" value="上一页"
		class="shanganniuzhongjian">
	<input type="button" onclick="xiayiye()" value="下一页"
		class="xiaanniuzhongjian">
	<input type="hidden" value="${cunsuiji}" id="cunsuiji">
	<input type="hidden" value="${zuihouyiye}" id="zuihouyiye">

</body>
</html>
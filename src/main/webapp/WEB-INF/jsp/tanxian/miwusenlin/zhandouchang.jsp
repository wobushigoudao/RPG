<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>战斗场</title>
<link rel="stylesheet" type="text/css"
	href="/RPG/css/tanxian/miwusenlin/zhandouchang.css" charset="utf-8" />
	<script type="text/javascript" src="/RPG/js/cunzhuang/jquery-3.3.1.js" charset="utf-8"></script>
	<script type="text/javascript">
	window.onload=function(){
		setTimeout(function(){
	
			$.ajax({
				url:"/RPG/tanxian/miwusenlin/cuntu4",
				type:"post",
				contentType:'application/x-www-form-urlencoded;charset=UTF-8',
				dataType:"text",
				success:function(data){
				var a=document.getElementById("a2")
				a.src="/RPG/image/tanxian/"+data+".png";
				}
				})
			$.ajax({
				url:"/RPG/tanxian/miwusenlin/cuntu3",
				type:"post",
				contentType:'application/x-www-form-urlencoded;charset=UTF-8',
				dataType:"text",
				success:function(data){
				var a=document.getElementById("a1")
				a.src="/RPG/image/tanxian/miwusenlin/"+data+".png";
				}
				})
			
			
		}, 500);

		
	}
	
	
	
	</script>
</head>
<body class="qugundong">
<div style="position:absolute;top:0px;left:50%;width:550px;height:100px;margin:0 0 0 -275px;">
	<img id="a1" style="position:absolute;top:0px;left:20px;" width="150px" height="100px" src="/RPG/image/tanxian/miwusenlin/yingxiong.png">
	<img id="a2" style="position:absolute;top:0px;left:390px;" width="150px" height="100px"  src="">
	<img id="feng1" style="position:absolute;top:0px;left:170px;display:none;" width="30px" height="30px" src="/RPG/image/tanxian/miwusenlin/fengbao.png">
	<img id="feng2" style="position:absolute;top:40px;left:170px;display:none;" width="30px" height="30px" src="/RPG/image/tanxian/miwusenlin/fengbao.png">
	<img id="feng3" style="position:absolute;top:80px;left:170px;display:none;" width="30px" height="30px" src="/RPG/image/tanxian/miwusenlin/fengbao.png">
	<img id="feng4" style="position:absolute;top:30px;left:170px;display:none;" width="80px" height="80px" src="/RPG/image/tanxian/miwusenlin/cizhui.png">
</div>
</body>
</html>
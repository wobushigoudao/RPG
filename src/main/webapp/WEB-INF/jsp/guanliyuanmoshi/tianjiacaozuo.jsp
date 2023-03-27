<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
	href="/RPG/css/guanliyuanmoshi/tianjiacaozuo.css" charset="utf-8" />
<script type="text/javascript"
	src="/RPG/js/guanliyuanmoshi/tianjiacaozuo.js" charset="utf-8"></script>
	<script type="text/javascript"
	src="/RPG/js/guanliyuanmoshi/jquery-3.3.1.js" charset="utf-8"></script>
<title>添加和返回怪物表</title>
<script type="text/javascript">
function yanzheng(){
	var a = parent.frames["zhongjian"].document.getElementById("id").value;
	if(a==""){
		alert("请输入怪物编号");
	}else{
	$.ajax({
	url:"/RPG/guanliyuanmoshi/yanzheng",
	type:"post",
	 contentType:'application/x-www-form-urlencoded',
	data:{
		id:a
	},
	dataType:"text",
	success:function(data){
		
		if(data=="yes"){
			alert("该怪物编号已存在");
		}
		if(data=="no"){
			alert("该怪物编号不存在");
		}
	}
	
		
		
		
	})
	}
	
	
	
	
	
}




</script>
</head>
<body>
	<input type="button" onclick="tianjia()" value="添加" class="tianjia">
	<input type="button" onclick="tianjiafanhuiguaiwubiao()" value="返回怪物表"
		class="fanhuiguaiwubiao">
		<input type="button" id="bian" onclick="yanzheng()" value="验证怪物编号" class="yanzheng">


</body>
</html>
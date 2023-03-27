<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.wdbao.juesexinxi"%>
<%@ page import="com.wdbao.guaiwushuxing"%>
<%@ page import="java.util.*"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>角色vs怪物</title>
<link rel="stylesheet" type="text/css"
	href="/RPG/css/tanxian/dacaoyuan/juesevsguaiwu.css" charset="utf-8" />
	<link rel="stylesheet" type="text/css"
	href="/RPG/css/tanxian/miwusenlin/qugundong.css" charset="utf-8" />
<script type="text/javascript"
	src="/RPG/js/tanxian/dacaoyuan/juesevsguaiwu.js" charset="utf-8"></script>
	<script type="text/javascript" src="/RPG/js/cunzhuang/jquery-3.3.1.js" charset="utf-8"></script>
</head>
<body  class="qugundong">
<input type="hidden" value="${guaiwuming}" id="guaiwuming">
<input type="hidden" value="${wulenque}" id="wulenque">
	<span class="zhandouxinxi" id="daodibu"> <%
			String wupin = (String) request.getAttribute("wupin");
			String tejihua = (String) request.getAttribute("tejihua");
		 	String pan = (String) request.getAttribute("pan");
 	String cunzi = (String) request.getAttribute("gudingci");
 String[] cunsheng = (String[]) request.getAttribute("cunsheng");
 if (cunsheng==null&&pan==null) {
	 cunsheng = new String[1];
 	juesexinxi juese = (juesexinxi) request.getAttribute("juese");
 	guaiwushuxing guaiwu = (guaiwushuxing) request.getAttribute("guaiwu");
 	cunsheng[0] = "你遇到了" + guaiwu.getXingMing();
 	int shanghai = 0;
 	if (juese.getSuDu() < Integer.valueOf(guaiwu.getSuDu())) {
 		shanghai = Integer.parseInt(guaiwu.getGongJi()) - juese.getFangYu();
 		if (shanghai < 0) {
 	shanghai = 0;
 		}
 		cunsheng = Arrays.copyOf(cunsheng, cunsheng.length + 1);
 		cunsheng[1] = guaiwu.getXingMing() + "发动攻击，对你造成" + shanghai + "点的伤害";
 	} else if (juese.getSuDu() == Integer.valueOf(guaiwu.getSuDu())) {
 		int k = (int) (Math.random() * 6 + 1);
 		if (k == 4 || k == 5 || k == 6) {
 	shanghai = Integer.parseInt(guaiwu.getGongJi()) - juese.getFangYu();
 	if (shanghai < 0) {
 		shanghai = 0;
 	}
 	cunsheng = Arrays.copyOf(cunsheng, cunsheng.length + 1);
 	cunsheng[1] = guaiwu.getXingMing() + "发动攻击，对你造成" + shanghai + "点的伤害";
 		}
 	}
 	request.setAttribute("cunsheng", cunsheng);
 	request.setAttribute("shanghai", shanghai);
 %> <script type="text/javascript">
	var shanghai = "${shanghai}"
	var a = new Array();
	<c:forEach var="cunsheng" items="${cunsheng}">

	a.push("${cunsheng}");
	</c:forEach >
	location.href = "/RPG/tanxian/miwusenlin/cunxinxi?cunsheng="
			+ encodeURI(encodeURI(a[0])) + "&cunsheng="
			+ encodeURI(encodeURI(a[1])) + "&shanghai=" + shanghai;
</script> <%
 	} else {
 

 if (cunzi == null) {
 	cunzi = "没有";
 }
 int cunshi=0;
 if(cunzi=="发动攻击"||cunzi=="怪物先攻击"||cunzi=="怪物攻击"){
	 cunshi=400;
 }else{
	 cunshi=50;
 }
 if(tejihua!=null){
	 cunshi=800;
 }
 if(wupin!=null){
	 cunshi=800;
 }

 request.setAttribute("cunsheng", cunsheng);
 request.setAttribute("cunzi", cunzi);
 request.setAttribute("cunshi", cunshi);
 request.setAttribute("tejihua", tejihua);
 request.setAttribute("wupin", wupin);
 %> 
 
 <script type="text/javascript">
	var a = new Array();
	var wulenque="${wulenque}";
	var wupin="${wupin}";
	var cunzi = "${cunzi}";
	var cunshi="${cunshi}";
	var tejihua="${tejihua}";
	<c:forEach var="cunsheng" items="${cunsheng}">

	a.push("${cunsheng}");
	</c:forEach >
	var r = document.getElementById("daodibu");
	var k = 0;
	var j = 0
	 if(cunzi=="发动攻击"&&tejihua==""){

		 gongji();
	 }
	if(tejihua=="闪光剑"){
		 tejifadong(tejihua);
	 }
	if(tejihua=="鳞甲"){
		tejifadong(tejihua);
	}
	if(wupin!=""){
		wupinshiyong(wupin);
	}
	 if(cunzi=="怪物攻击"||cunzi=="怪物先攻击"){
	
		 guaigongji(wulenque);

	 }
	 setTimeout(function(){
	var xun = window
			.setInterval(
					function() {
				
						if (a.length > 0) {
							r.innerHTML = r.innerHTML + a[k][j];
							r.scrollIntoView(false);
							j++;

							if (j >= a[k].length) {
								k++;
								j = 0;
								r.innerHTML = r.innerHTML + "<br>";
							}
							if (k >= a.length) {
								clearInterval(xun);
								setTimeout(function(){
								if (cunzi == "怪物先攻击") {
									top.zhongshang.frames["jieguo"].location.href = "/RPG/tanxian/miwusenlin/guaiwuxiangongji";
								}
								if (cunzi == "发动攻击") {
													
									top.zhongshang.frames["jieguo"].location.href = "/RPG/tanxian/miwusenlin/fadonggongji";
								}
								if (cunzi == "怪物攻击") {
									
									top.zhongshang.frames["jieguo"].location.href = "/RPG/tanxian/miwusenlin/guaiwugongji";
								}
								if (cunzi == "打败怪物") {
									setTimeout(function(){
									top.zhongshang.location.href = "/RPG/tanxian/miwusenlin/dabaiguaiwu";
									},100);
									
								}
								if (cunzi == "气绝了") {
									top.zhongshang.frames["jieguo"].location.href = "/RPG/tanxian/miwusenlin/qijue";
								}
								if (cunzi == "逃跑成功") {
									top.zhongshang.location.href = "/RPG/tanxian/miwusenlin/taopaochenggong";
								}
								if (cunzi == "逃跑失败") {
									top.zhongshang.frames["jieguo"].location.href = "/RPG/tanxian/miwusenlin/taopaoshibai";
								}
								if (cunzi == "开始") {
									top.zhongshang.frames["jieguo"].location.href = "/RPG/tanxian/miwusenlin/kaishi";
								}
								if (cunzi == "草药" || cunzi == "血药"
										|| cunzi == "力丸"||cunzi=="刺锥"||cunzi=="大补药"||cunzi=="小补药"||cunzi=="灵芝"||cunzi=="人参") {
									top.zhongshang.frames["jieguo"].location.href = "/RPG/tanxian/miwusenlin/wupinshiyong?";
								}
								if (cunzi == "匕首" || cunzi == "大剑"
										|| cunzi == "铜甲" || cunzi == "铁甲"||cunzi=="闪光剑"||cunzi=="金甲"||cunzi=="鳞甲"||cunzi=="小剑"||cunzi=="刺剑"||cunzi=="铁剑"||cunzi=="板甲"||cunzi=="精铁甲"||cunzi=="秘银甲") {
									top.zhongshang.frames["jieguo"].location.href = "/RPG/tanxian/miwusenlin/wupinzhuangbei?";
								}
								},100);
								setTimeout(function(){
								top.zhongxia.location.href = "/RPG/tanxian/miwusenlin/gongjihetaopao";
								},200);
							}

						} else {
							r.scrollIntoView(false);
							clearInterval(xun);
							setTimeout(function(){
								top.zhongxia.location.href = "/RPG/tanxian/miwusenlin/gongjihetaopao";
								},200);
						}
						
					}, 50);
	 },cunshi);
					
</script> <%
 	}
 %>
	</span>
</body>
</html>
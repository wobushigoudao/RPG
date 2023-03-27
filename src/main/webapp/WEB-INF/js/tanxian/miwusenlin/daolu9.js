window.onload = function() {
	top.zuobian.location.href = "/RPG/tanxian/jueseshuxing";
	top.zhongxia.location.href = "/RPG/tanxian/miwusenlin/tishi";
	top.youbian.location.href = "/RPG/tanxian/guaiwushuxing";



}

function daoluqi() {
	var lu = 7;
	var dalu="迷雾森林"
	top.zhongshang.location.href = "/RPG/tanxian/miwusenlin/miwusenlin?lu=" + lu+"&dalu="+encodeURI(encodeURI(dalu));

}

function diaocha() {
	top.zhongshang.location.href = "/RPG/tanxian/miwusenlin/diaocha";

}
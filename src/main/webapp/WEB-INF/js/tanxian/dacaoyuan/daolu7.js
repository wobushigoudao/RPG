window.onload = function() {
	top.zuobian.location.href = "/RPG/tanxian/jueseshuxing";
	top.zhongxia.location.href = "/RPG/tanxian/miwusenlin/tishi";
	top.youbian.location.href = "/RPG/tanxian/guaiwushuxing";



}
function daolusi() {
	var lu = 4;
	var dalu="大草原"
	top.zhongshang.location.href = "/RPG/tanxian/miwusenlin/miwusenlin?lu=" + lu+"&dalu="+encodeURI(encodeURI(dalu));

}

function daolujiu() {
	var lu = 9;
	var dalu="大草原"
	top.zhongshang.location.href = "/RPG/tanxian/miwusenlin/miwusenlin?lu=" + lu+"&dalu="+encodeURI(encodeURI(dalu));

}

function diaocha() {
	top.zhongshang.location.href = "/RPG/tanxian/miwusenlin/diaocha";

}
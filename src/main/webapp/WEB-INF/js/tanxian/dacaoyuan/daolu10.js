window.onload = function() {
	top.zuobian.location.href = "/RPG/tanxian/jueseshuxing";
	top.zhongxia.location.href = "/RPG/tanxian/miwusenlin/tishi";
	top.youbian.location.href = "/RPG/tanxian/guaiwushuxing";
	var v=document.getElementById("guai").value;
if(v=="象精"){
top.zhongxia.location.href="/RPG/tanxian/miwusenlin/bosswuqi"
}
}

function daolujiu() {
	var lu = 9;
	var dalu="大草原"
	top.zhongshang.location.href = "/RPG/tanxian/miwusenlin/miwusenlin?lu=" + lu+"&dalu="+encodeURI(encodeURI(dalu));

}
function diaocha() {
	top.zhongshang.location.href = "/RPG/tanxian/miwusenlin/diaocha";

}
function xiangjing(){
	var a = document.getElementsByTagName('input');
	for(var i=0;i<a.length;i++){
		a[i].disabled="disabled";
	}
var xiangjing=document.getElementById("xiangjing").value;
top.zhongxia.location.href = "/RPG/tanxian/miwusenlin/luren?ren="+encodeURI(encodeURI(xiangjing));


}

window.onload = function() {
	top.zuobian.location.href = "/RPG/tanxian/jueseshuxing";
	top.zhongxia.location.href = "/RPG/tanxian/miwusenlin/tishi";
	top.youbian.location.href = "/RPG/tanxian/guaiwushuxing";



}
function chukou() {
	top.zhongxia.location.href = "/RPG/tanxian/tishihefanhuishengmocuncunkou"

}
function daoluer() {
	var lu = 2;
	var dalu="魔王城堡";
	top.zhongshang.location.href = "/RPG/tanxian/miwusenlin/miwusenlin?lu=" + lu+"&dalu="+encodeURI(encodeURI(dalu));

}
function shibaideyongzhe(){
	var a = document.getElementsByTagName('input');
	for(var i=0;i<a.length;i++){
		a[i].disabled="disabled";
	}
var shibaideyongzhe=document.getElementById("shibaideyongzhe").value;
top.zhongxia.location.href = "/RPG/tanxian/miwusenlin/luren?ren="+encodeURI(encodeURI(shibaideyongzhe));


}
function maoxianzhe(){
	var a = document.getElementsByTagName('input');
	for(var i=0;i<a.length;i++){
		a[i].disabled="disabled";
	}
var maoxianzhe=document.getElementById("maoxianzhe").value;
top.zhongxia.location.href = "/RPG/tanxian/miwusenlin/luren?ren="+encodeURI(encodeURI(maoxianzhe));


}

function diaocha() {
	top.zhongshang.location.href = "/RPG/tanxian/miwusenlin/diaocha";

}


window.onload = function() {
	top.zuobian.location.href = "/RPG/tanxian/jueseshuxing";
	top.zhongxia.location.href = "/RPG/tanxian/miwusenlin/tishi";
	top.youbian.location.href = "/RPG/tanxian/guaiwushuxing";

var v=document.getElementById("guai").value;
if(v=="黑商"){
top.zhongxia.location.href="/RPG/tanxian/miwusenlin/duibu"
}

}
function heishang(){
	var a = document.getElementsByTagName('input');
	for(var i=0;i<a.length;i++){
		a[i].disabled="disabled";
	}
var heishang=document.getElementById("heishang").value;
top.zhongxia.location.href = "/RPG/tanxian/miwusenlin/luren?ren="+encodeURI(encodeURI(heishang));


}
function daoluyi() {
	var lu = 1;
		var dalu="大草原"
	top.zhongshang.location.href = "/RPG/tanxian/miwusenlin/miwusenlin?lu=" + lu+"&dalu="+encodeURI(encodeURI(dalu));

}
function daoluliu() {
	var lu = 6;
		var dalu="大草原"
	top.zhongshang.location.href = "/RPG/tanxian/miwusenlin/miwusenlin?lu=" + lu+"&dalu="+encodeURI(encodeURI(dalu));

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

window.onload = function() {
	top.zuobian.location.href = "/RPG/tanxian/jueseshuxing";
	top.zhongxia.location.href = "/RPG/tanxian/miwusenlin/tishi";
	top.youbian.location.href = "/RPG/tanxian/guaiwushuxing";
var v=document.getElementById("guai").value;
if(v=="蜥蜴王"){
top.zhongxia.location.href="/RPG/tanxian/miwusenlin/bosswuqi"
}


}
function boss() {
var a = document.getElementsByTagName('input');
	for(var i=0;i<a.length;i++){
		a[i].disabled="disabled";
	}
	var boss=document.getElementById("boss").value;
top.zhongxia.location.href = "/RPG/tanxian/miwusenlin/luren?ren="+encodeURI(encodeURI(boss));

}
function daoluba() {
	var lu = 8;
	var dalu="迷雾森林"
	top.zhongshang.location.href = "/RPG/tanxian/miwusenlin/miwusenlin?lu=" + lu+"&dalu="+encodeURI(encodeURI(dalu));

}
function diaocha() {
	top.zhongshang.location.href = "/RPG/tanxian/miwusenlin/diaocha";

}

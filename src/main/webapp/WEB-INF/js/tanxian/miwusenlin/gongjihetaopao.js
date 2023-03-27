function gongji() {
top.zhongshang.frames["jieguo"].location.href="/RPG/tanxian/miwusenlin/gongji";
}
function taopao() {
	top.zhongshang.frames["jieguo"].location.href = "/RPG/tanxian/miwusenlin/taopao";
}
function wupin() {
	top.zhongxia.location.href = "/RPG/tanxian/miwusenlin/wupinzong";
}
function zhuangbei() {
	top.zhongxia.location.href= "/RPG/tanxian/miwusenlin/zhuangbeizong";
}
function zhandou() {
	top.zhongxia.location.href= "/RPG/tanxian/miwusenlin/zhandou";
}
function wuqiteji(){
var lenque=document.getElementById("lenque").value;
var a = parent.frames["zuobian"].document.getElementById("wuqi").innerText;

if(a=="闪光剑"){
if(lenque==""||parseInt(lenque)==1){
var msg=a+"的特技-闪光风暴：每个风暴都造成自己基础攻击力的伤害，有三个风暴，冷却时间3回合，是否确定发动？";
if (confirm(msg) == true) {
top.zhongxia.location.href="/RPG/tanxian/miwusenlin/teji?teji="+encodeURI(encodeURI(a));
}
}else{
alert(a+"特技的冷却时间还有"+parseInt(lenque-1)+"回合");
}
}else if(a==""){
alert("你没有装备武器");
}else{
alert("该武器没有特技");
}


}
function fangjuteji(){
var lenque=document.getElementById("fanglenque").value;
var a = parent.frames["zuobian"].document.getElementById("fangju").innerText;

if(a=="鳞甲"){
if(lenque==""||parseInt(lenque)==1){

var msg=a+"的特技-绝对防御：让自己防御力增加16点，持续4回合，冷却时间10回合，是否确定发动？";
if (confirm(msg) == true) {
top.zhongxia.location.href="/RPG/tanxian/miwusenlin/teji?teji="+encodeURI(encodeURI(a));
}
}else{
alert(a+"特技的冷却时间还有"+parseInt(lenque-1)+"回合");
}
}else if(a==""){
alert("你没有装备防具");
}else{
alert("该防具没有特技");
}
}

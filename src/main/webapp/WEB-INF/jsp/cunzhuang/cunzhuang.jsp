<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>村庄</title>
<link rel="stylesheet" type="text/css"
	href="/RPG/css/cunzhuang/cunzhuang.css" charset="utf-8" />
	<link rel="stylesheet" type="text/css"
	href="/RPG/css/tanxian/miwusenlin/qugundong.css" charset="utf-8" />
	<script type="text/javascript" src="/RPG/js/cunzhuang/cunzhuang.js" charset="utf-8"></script>
	<script type="text/javascript" src="/RPG/js/cunzhuang/jquery-3.3.1.js" charset="utf-8"></script>
	
</head>
<body class="qugundong">
<input id="yongshis" type="hidden" value="你的雕像" onclick="fa(this)" class="diaoxiang">
<input name="1" type="button" value="村长" onclick="fa(this)" class="cunzhang">
<input name="1" type="button" value="林克" onclick="fa(this)" class="linke">
<input name="1" type="button" value="肖思" onclick="fa(this)" class="xiaosi">
<input name="1" type="button" value="肖德" onclick="fa(this)" class="xiaode">
<input name="1" type="button" value="林二" onclick="fa(this)" class="liner">
<input name="1" type="button" value="旅馆店老板" onclick="fa(this)" class="lvguang">
<input name="1" type="button" value="装备店老板" onclick="fa(this)" class="zhuangbei">
<input name="1" type="button" value="道具店老板" onclick="fa(this)" class="daoju">
<input name="1" type="button" value="年轻的冒险者" onclick="fa(this)" class="maoxianzhe">
<input name="1" type="button" value="一位厉害的人" onclick="fa(this)" class=lihai>
<input name="1" type="button" value="乞丐" onclick="fa(this)" class="qigai">
<input name="1" type="button" value="去探险" onclick="tanxian()" class="tanxian">
<input name="1" type="button" value="去圣魔村村口" onclick="qucunkou()" class="qucunkou">
<div style="
position:absolute;
display:none;
width:720px;
height:100px;
border:1px solid blue;
left: 50%;
top:50%;
margin: 120px 0 0 -360px;
background: url('/RPG/image/cunzhuang/beijingtu.png');
font-size: 20px;" id="div">
<img src="" id="tu"  style="position:absolute;width:150px;height:95px;top:1px;">
<img src="/RPG/image/cunzhuang/beijingtu.png" style="position:absolute;left:155px;height:95px;width:100px;top:1px;">
<img src="/RPG/image/cunzhuang/beijingtu.png" style="position:absolute;left:555px;height:95px;width:100px;top:1px;">
<div style="position:absolute;left:160px;width:400px;top:10px;"><span id="sp"></span></div>
<div><input style="position:absolute;left:600px;width:80px;height:30px;top:10px;" type="hidden" value="购买" id="gou" name="" onclick="gou()"></div>
<div><input style="position:absolute;left:600px;width:80px;height:30px;top:50px;" type="hidden" value="不了" id="bu" name="" onclick="bu()"></div>
<div><input style="position:absolute;left:600px;width:80px;height:30px;top:10px;" type="hidden" value="" id="yuanyi" name="" onclick="yuanyi()"></div>
<div><input style="position:absolute;left:600px;width:80px;height:30px;top:50px;" type="hidden" value="" id="buyuanyi" name="" onclick="buyuanyi()"></div>
<div><input style="position:absolute;left:600px;width:80px;height:30px;top:30px;" type="hidden" value="确定" id="queding" name="" onclick="queding()"></div>
</div>
<div style="position:absolute;
display:none;
width:720px;
height:300px;
border:1px solid blue;
left:50%;
top:50%;
margin: -220px 0 0 -360px;
background: url('/RPG/image/cunzhuang/beijingtu.png');
font-size: 20px;" id="zhuangbei">
<div><input style="position:absolute;left:50%;width:80px;height:30px;top:50%;margin:105px 0 0 -40px;" type="button" value="退出" id="bule" name="" onclick="bule()"></div>
<div style="position:absolute;left:460px;width:200px;top:257px;text-align:center;"><span id="ss"></span></div>
<img src="/RPG/image/cunzhuang/beijingtu.png" style="position:absolute;left:455px;height:40px;width:60px;top:250px;">
<img src="/RPG/image/cunzhuang/beijingtu.png" style="position:absolute;left:460px;width:200px;top:248px;height:10px;">
<img src="/RPG/image/cunzhuang/beijingtu.png" style="position:absolute;left:37px;width:40px;top:1px;height:260px;">
<table align="center" width="600px" height="250px" cellspacing="0" cellpadding="0">
<tr>
<td align="center">装备</td>
<td align="center">介绍</td>
<td align="center">金钱</td>
<td align="center">操作</td>
</tr>
<tr>
<td align="center">小剑</td>
<td align="center">增加7点攻击力</td>
<td align="center">30金钱</td>
<td align="center"><input style="width:80px;height:30px" type="button" value="购买"  id="小剑" onclick="goumai(this)"></td>
</tr>
<tr>
<tr>
<td align="center">铁剑</td>
<td align="center">增加12点攻击力</td>
<td align="center">200金钱</td>
<td align="center"><input style="width:80px;height:30px" type="button" value="购买"  id="铁剑" onclick="goumai(this)"></td>
</tr>
<tr>
<td align="center">刺剑</td>
<td align="center">增加15点攻击力</td>
<td align="center">500金钱</td>
<td align="center"><input style="width:80px;height:30px" type="button" value="购买"  id="刺剑" onclick="goumai(this)"></td>
</tr>
<tr>
<td align="center">板甲</td>
<td align="center">增加6点防御力</td>
<td align="center">50金钱</td>
<td align="center"><input style="width:80px;height:30px" type="button" value="购买"  id="板甲" onclick="goumai(this)"></td>
</tr>

<tr>
<td align="center">精铁甲</td>
<td align="center">增加17点防御力</td>
<td align="center">300金钱</td>
<td align="center"><input style="width:80px;height:30px" type="button" value="购买"  id="精铁甲" onclick="goumai(this)"></td>
</tr>
<tr>
<td align="center">秘银甲</td>
<td align="center">增加20点防御力</td>
<td align="center">500金钱</td>
<td align="center"><input style="width:80px;height:30px" type="button" value="购买"  id="秘银甲" onclick="goumai(this)"></td>
</tr>

</table>



</div>

<div style="position:absolute;
display:none;
width:720px;
height:300px;
border:1px solid blue;
left:50%;
top:50%;
margin: -220px 0 0 -360px;
background: url('/RPG/image/cunzhuang/beijingtu.png');
font-size: 20px;" id="daoju">
<div><input style="position:absolute;left:50%;width:80px;height:30px;top:50%;margin:105px 0 0 -40px;" type="button" value="退出" id="bule1" name="" onclick="bule1()"></div>
<div style="position:absolute;left:460px;width:200px;top:257px;text-align:center;"><span id="sss"></span></div>
<img src="/RPG/image/cunzhuang/beijingtu.png" style="position:absolute;left:455px;height:40px;width:60px;top:250px;">
<img src="/RPG/image/cunzhuang/beijingtu.png" style="position:absolute;left:460px;width:200px;top:248px;height:10px;">
<img src="/RPG/image/cunzhuang/beijingtu.png" style="position:absolute;left:37px;width:40px;top:1px;height:260px;">
<table align="center" width="600px" height="250px" cellspacing="0" cellpadding="0">
<tr>
<td align="center">道具</td>
<td align="center">介绍</td>
<td align="center">金钱</td>
<td align="center">操作</td>
</tr>
<tr>
<td align="center">血药</td>
<td align="center">增加20点血量</td>
<td align="center">10金钱</td>
<td align="center"><input style="width:80px;height:30px" type="button" value="购买"  id="血药" onclick="goumai1(this)"></td>
</tr>
<tr>
<tr>
<td align="center">草药</td>
<td align="center">增加30点血量</td>
<td align="center">30金钱</td>
<td align="center"><input style="width:80px;height:30px" type="button" value="购买"  id="草药" onclick="goumai1(this)"></td>
</tr>
<tr>
<td align="center">小补药</td>
<td align="center">增加50点血量</td>
<td align="center">50金钱</td>
<td align="center"><input style="width:80px;height:30px" type="button" value="购买"  id="小补药" onclick="goumai1(this)"></td>
</tr>
<tr>
<td align="center">大补药</td>
<td align="center">增加100点血量</td>
<td align="center">100金钱</td>
<td align="center"><input style="width:80px;height:30px" type="button" value="购买"  id="大补药" onclick="goumai1(this)"></td>
</tr>

<tr>
<td align="center">灵芝</td>
<td align="center">增加150点血量</td>
<td align="center">300金钱</td>
<td align="center"><input style="width:80px;height:30px" type="button" value="购买"  id="灵芝" onclick="goumai1(this)"></td>
</tr>
<tr>
<td align="center">人参</td>
<td align="center">增加200点血量</td>
<td align="center">500金钱</td>
<td align="center"><input style="width:80px;height:30px" type="button" value="购买"  id="人参" onclick="goumai1(this)"></td>
</tr>

</table>



</div>



</body>
</html>
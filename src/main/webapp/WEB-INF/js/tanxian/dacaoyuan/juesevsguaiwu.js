window.onload = function() {
	top.zuobian.location.href = "/RPG/tanxian/miwusenlin/jueseshuxing";
	top.zhongxia.location.href = "/RPG/tanxian/miwusenlin/dengdai";
	top.youbian.location.href = "/RPG/tanxian/miwusenlin/guaiwushuxing";
	
	var ming=document.getElementById("guaiwuming").value;
	var wulenque=document.getElementById("wulenque").value;
	if(ming!=null){
	var a=parent.frames["zhandouchang"].document.getElementById("a2");
	a.src="/RPG/image/tanxian/dacaoyuan/"+ming+".png";
	
	$.ajax({
	url:"/RPG/tanxian/miwusenlin/cuntu2",
	type:"post",
	 contentType:'application/x-www-form-urlencoded;charset=UTF-8',
	data:{
		tu:"dacaoyuan/"+ming
	},
	dataType:"text",
	success:function(data){
	console.log(data);
	}
	})
	
	
	
	}
	if(wulenque==""){

	var a=parent.frames["zhandouchang"].document.getElementById("a1");
	a.src="/RPG/image/tanxian/miwusenlin/yingxiong.png";
	
	$.ajax({
	url:"/RPG/tanxian/miwusenlin/cuntu1",
	type:"post",
	 contentType:'application/x-www-form-urlencoded;charset=UTF-8',
	data:{
		tu:"yingxiong"
	},
	dataType:"text",
	success:function(data){
	console.log(data);
	}
	})
	
	}
}
function gongji(){
	
	var a=parent.frames["zhandouchang"].document.getElementById("a1");
	setTimeout(function(){
		a.style.left="220px";
		var b=0;
	var xu=window.setInterval(function() {
		fa();
		b++;
		if(b==10){
			clearInterval(xu);
			
		}
	},20)
	
		setTimeout(function(){
			a.style.left="20px";
		}, 200);
	
	}, 200);
}
function fa(){
	var ming=document.getElementById("guaiwuming").value;
	var a=parent.frames["zhandouchang"].document.getElementById("a2");
	if(decodeURI(a.src).indexOf(ming+".png")>0){
	a.src="/RPG/image/tanxian/dacaoyuan/"+ming+"shoushang.png";
	}
	else{
		a.src="/RPG/image/tanxian/dacaoyuan/"+ming+".png"
	}
}
function guaigongji(wu){
	var a=parent.frames["zhandouchang"].document.getElementById("a2");
	
	setTimeout(function(){
		a.style.left="190px";
		var b=0;
	var xu=window.setInterval(function() {
		fb(wu);
		b++;
		if(b==10){
			clearInterval(xu);
			
		}
	},20)
	
		setTimeout(function(){
			a.style.left="390px";
		}, 200);
	
	}, 200);
}
function fb(wu){
if(wu==""){

	var a=parent.frames["zhandouchang"].document.getElementById("a1");
	if(a.src.indexOf("yingxiong.png")>0){
	a.src="/RPG/image/tanxian/miwusenlin/yingxiongshoushang.png";
	}
	else{
		a.src="/RPG/image/tanxian/miwusenlin/yingxiong.png"
	}
	}else{
	var a=parent.frames["zhandouchang"].document.getElementById("a1");
	if(a.src.indexOf("yingxiongdun.png")>0){
	a.src="/RPG/image/tanxian/miwusenlin/yingxiongdunshoushang.png"
	}
	else{
			a.src="/RPG/image/tanxian/miwusenlin/yingxiongdun.png";
	}
	}
	
}
function tejifadong(wu){
if(wu=="闪光剑"){
var a=parent.frames["zhandouchang"].document.getElementById("a1");
setTimeout(function(){
		a.style.left="40px";
		fc(wu);
		setTimeout(function(){
			a.style.left="20px";
		}, 200);
	
	}, 200);
	}
	if(wu=="鳞甲"){
	var a=parent.frames["zhandouchang"].document.getElementById("a1");
setTimeout(function(){
		a.style.left="40px";

	a.src="/RPG/image/tanxian/miwusenlin/yingxiongdun.png";
	
		$.ajax({
	url:"/RPG/tanxian/miwusenlin/cuntu5",
	type:"post",
	 contentType:'application/x-www-form-urlencoded;charset=UTF-8',
	data:{
		tu:"yingxiongdun"
	},
	dataType:"text",
	success:function(data){
	console.log(data);
	}
	})
	
		setTimeout(function(){
			a.style.left="20px";
		}, 200);
	
	}, 200);
	}


}
function fc(wu){
if(wu=="闪光剑"){
var feng1=parent.frames["zhandouchang"].document.getElementById("feng1");
var feng2=parent.frames["zhandouchang"].document.getElementById("feng2");
var feng3=parent.frames["zhandouchang"].document.getElementById("feng3");
feng1.style.display="inline";
feng2.style.display="inline";
feng3.style.display="inline";
var c=feng1.style.left;
var b="";
for(var i=0;i<c.length-2;i++){
b=b+c[i]
}
var d=parseInt(b);
var chu=d;
var xu=window.setInterval(function() {
d+=20;
feng1.style.left=d+"px";
feng2.style.left=d+"px";
feng3.style.left=d+"px";
	if(d>=370){
	clearInterval(xu);
	feng1.style.display="none";
feng2.style.display="none";
feng3.style.display="none";
feng1.style.left=chu+"px";
feng2.style.left=chu+"px";
feng3.style.left=chu+"px";
var bb=0;
var xuu=window.setInterval(function() {
tejidonghua();
		bb++;
		if(bb==10){
			clearInterval(xuu);
			
		}
	},40)
		}
},20)
}
if(wu=="刺锥"){
var feng4=parent.frames["zhandouchang"].document.getElementById("feng4");
feng4.style.display="inline";
var c=feng4.style.left;
var b="";
for(var i=0;i<c.length-2;i++){
b=b+c[i]
}
var d=parseInt(b);
var chu=d;
var xu=window.setInterval(function() {
d+=20;
feng4.style.left=d+"px";
if(d>=370){
	clearInterval(xu);
	feng4.style.display="none";
    feng4.style.left=chu+"px";
    var bb=0;
    var xuu=window.setInterval(function() {
wupindonghua();
		bb++;
		if(bb==10){
			clearInterval(xuu);
			
		}
	},40)
	}
},20)
}


}

function wupindonghua(){
	var ming=document.getElementById("guaiwuming").value;
	var a=parent.frames["zhandouchang"].document.getElementById("a2");
	if(a.src.indexOf(ming+".png")>0){
	a.src="/RPG/image/tanxian/dacaoyuan/"+ming+"cizhuida.png";
	}
	else{
		a.src="/RPG/image/tanxian/dacaoyuan/"+ming+".png"
	}

}
function tejidonghua(){
	var ming=document.getElementById("guaiwuming").value;
	var a=parent.frames["zhandouchang"].document.getElementById("a2");
	if(a.src.indexOf(ming+".png")>0){
	a.src="/RPG/image/tanxian/dacaoyuan/"+ming+"shanguangjianda.png";
	}
	else{
		a.src="/RPG/image/tanxian/dacaoyuan/"+ming+".png"
	}

}
function wupinshiyong(wu){
var a=parent.frames["zhandouchang"].document.getElementById("a1");
setTimeout(function(){
		a.style.left="40px";
		fc(wu);
		setTimeout(function(){
			a.style.left="20px";
		}, 200);
	
	}, 200);

}


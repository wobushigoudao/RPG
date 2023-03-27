function shiyong() {
	var zhan = document.getElementById("zhandouwai").value;
	var cunxuehao = document.getElementById("cunxuehao").value;
	if (zhan == "战斗外") {
		var as = parent.frames["xia"].document.getElementsByTagName('a');
	}
	if (zhan == "战斗内") {
		var as = parent.frames["you"].document.getElementsByTagName("a");
	}
	var k = 0;
	var j;
	var p = 0;
	var o;
	for (var i = 0; i < as.length; i++) {
		if (i >= 0) {
			j = as[i];
			if (j.style.color == "red") {
				k = j.innerText;
				o = j.name;
				p++;
				break;
			}
		}
	}
	if (p == 1) {
		if (zhan == "战斗外") {
			if (k == "血药" || k == "草药" || k == "力丸"||k=="大补药"||k=="小补药"||k=="灵芝"||k=="人参") {
				top.zuobian.location.href = "/RPG/shiyong?wupin=" + encodeURI(encodeURI(k)) + "&cunxuehao=" + cunxuehao + "&weizhi=" + o;
			}else{
			alert("该物品只可在战斗中使用");
			}
		}
		if (zhan == "战斗内") {
			if (k == "血药" || k == "草药" || k == "力丸"||k=="刺锥"||k=="大补药"||k=="小补药"||k=="灵芝"||k=="人参") {
				top.zhongshang.frames["jieguo"].location.href = "/RPG/tanxian/miwusenlin/shiyong?wupin=" + encodeURI(encodeURI(k)) + "&weizhi=" + o;
			}

		}
	} else {
		alert("请选择一个物品");

	}
}

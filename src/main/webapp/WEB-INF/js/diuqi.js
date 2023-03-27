function diuqiwupin() {
	var msg = "您确定要丢掉这个物品吗？";
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
		if (confirm(msg) == true) {
			if (zhan == "战斗外") {
				top.zuobian.location.href = "/RPG/duiqiwupin?wupin=" + encodeURI(encodeURI(k)) + "&cunxuehao=" + cunxuehao + "&weizhi=" + o + "&zhan=" + encodeURI(encodeURI(zhan));
			}
			if (zhan == "战斗内") {
				top.zhongxia.location.href = "/RPG/duiqiwupin?wupin=" + encodeURI(encodeURI(k)) + "&cunxuehao=" + cunxuehao + "&weizhi=" + o + "&zhan=" + encodeURI(encodeURI(zhan));
			}
		}

	} else {
		alert("请选择一个物品");
	}

}
function diuqizhuangbei() {
	var msg = "您确定要丢掉这个装备吗？";
	var zhan = document.getElementById("zhandouwai").value;
	var cunxuehao = document.getElementById("cunxuehao").value;
	if (zhan == "战斗外") {
		var as =parent.frames["xia"].document.getElementsByTagName('a');
	}
	if (zhan == "战斗内") {
		var as =parent.frames["you"].document.getElementsByTagName('a');
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
		if (confirm(msg) == true) {
			if (zhan == "战斗外") {
				top.zuobian.location.href = "/RPG/duiqizhuangbei?zhuangbei=" + encodeURI(encodeURI(k)) + "&cunxuehao=" + cunxuehao + "&weizhi=" + o + "&zhan=" + encodeURI(encodeURI(zhan));
			}
			if (zhan == "战斗内") {
				top.zhongxia.location.href = "/RPG/duiqizhuangbei?zhuangbei=" + encodeURI(encodeURI(k)) + "&cunxuehao=" + cunxuehao + "&weizhi=" + o + "&zhan=" + encodeURI(encodeURI(zhan));
			}
		}

	} else {
		alert("请选择一个装备");
	}

}
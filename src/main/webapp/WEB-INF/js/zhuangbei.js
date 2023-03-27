function zhuangbei() {
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
			if (k == "匕首" || k == "大剑" || k == "铜甲" || k == "铁甲"||k=="闪光剑"||k=="金甲"||k=="鳞甲"||k=="小剑"||k=="刺剑"||k=="铁剑"||k=="板甲"||k=="精铁甲"||k=="秘银甲") {
				top.zuobian.location.href = "/RPG/zhuangbei?zhuangbei=" + encodeURI(encodeURI(k)) + "&cunxuehao=" + cunxuehao + "&weizhi=" + o
			}

		}
		if (zhan == "战斗内") {
		
			if (k == "匕首" || k == "大剑" || k == "铜甲" || k == "铁甲"||k=="闪光剑"||k=="金甲"||k=="鳞甲"||k=="小剑"||k=="刺剑"||k=="铁剑"||k=="板甲"||k=="精铁甲"||k=="秘银甲") {
				top.zhongshang.frames["jieguo"].location.href = "/RPG/tanxian/miwusenlin/zhuangbei?zhuangbei=" + encodeURI(encodeURI(k)) + "&weizhi=" + o
			}


		}
	} else {
		alert("请选择一个装备");

	}
}

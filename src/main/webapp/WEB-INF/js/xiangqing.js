function xiangqing() {
	var zhan = document.getElementById("zhandouwai").value;
	var wu = document.getElementById("wu").value;
	if (zhan == "战斗外") {
		var as = parent.frames["xia"].document.getElementsByTagName('a');
	}
	if (zhan == "战斗内") {
		var as = parent.frames["you"].document.getElementsByTagName("a");
	}
	var k = 0;
	var j;
	var p = 0;
	for (var i = 0; i < as.length; i++) {
		if (i >= 0) {
			j = as[i];

			if (j.style.color == "red") {
				k = j.innerText
				p++;
				break;
			}
		}
	}
	if (p == 1) {
		if (k == "血药") {
			alert(k + "：增加20点血量");
		}
		if (k == "草药") {
			alert(k + "：增加30点血量");
		}
		if (k == "力丸") {
			alert(k + "：战斗时使用，增加4点攻击力，若再次使用，增加10点血量，战斗结束后，增加的攻击力失效，不战斗时使用，增加10点血量");
		}
		if (k == "小补药") {
			alert(k + "：增加50点血量");
		}
		if (k == "大补药") {
			alert(k + "：增加100点血量");
		}
		if (k == "灵芝") {
			alert(k + "：增加150点血量");
		}
		if (k == "人参") {
			alert(k + "：增加200点血量");
		}
		if (k == "匕首") {
			alert(k + "：增加6点攻击力");
		}
		if (k == "刺锥") {
			alert(k + "：降低对方30点防御力，最低降到0点防御力，若还有余力，则造成剩余数值伤害，只可在战斗中使用");
		}
		if (k == "大剑") {
			alert(k + "：增加10点攻击力");
		}
		if (k == "铜甲") {
			alert(k + "：增加8点防御力");
		}
		if (k == "铁甲") {
			alert(k + "：增加12点防御力");
		}
		if (k == "闪光剑") {
			alert(k + "：增加20点攻击力，特技-闪光风暴：每个风暴都造成自己基础攻击力的伤害，有三个风暴，冷却时间3回合");
		}
		if (k == "金甲") {
			alert(k + "：增加15点防御力");
		}
		if (k == "鳞甲") {
			alert(k + "：增加25点防御力，特技-绝对防御：让自己防御力增加6点，持续4回合，若战斗结束，防御效果消除，冷却时间10回合");
		}
		if (k == "小剑") {
			alert(k + "：增加7点攻击力");
		}
		if (k == "铁剑") {
			alert(k + "：增加12点攻击力");
		}
		if (k == "刺剑") {
			alert(k + "：增加15点攻击力");
		}
		if (k == "板甲") {
			alert(k + "：增加6点防御力");
		}
		if (k == "精铁甲") {
			alert(k + "：增加17点防御力");
		}
		if (k == "秘银甲") {
			alert(k + "：增加20点防御力");
		}
	} else {
		if (wu == "物品") {
			alert("请选择一个物品");
		}
		if (wu == "装备") {
			alert("请选择一个装备");
		}
	}
}

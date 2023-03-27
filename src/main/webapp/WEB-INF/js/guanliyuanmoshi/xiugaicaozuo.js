function xiugai() {
	var a = parent.frames["zhongjian"].document.getElementById("xueliang").value;
	var b = parent.frames["zhongjian"].document.getElementById("gongji").value;
	var c = parent.frames["zhongjian"].document.getElementById("fangyu").value;
	var d = parent.frames["zhongjian"].document.getElementById("sudu").value;
	var e = parent.frames["zhongjian"].document.getElementById("jinqian").value;
	var f = parent.frames["zhongjian"].document.getElementById("jingyan").value;
	if ((a == "" || b == "" || c == "" || d == "" || e == "" || f == "")
		|| (!(/(^[1-9]\d*$)/.test(a)) || !(/(^[1-9]\d*$)/.test(b))
			|| !(/(^[1-9]\d*$)/.test(c))
			|| !(/(^[1-9]\d*$)/.test(d))
			|| !(/(^[1-9]\d*$)/.test(e)) || !(/(^[1-9]\d*$)/
				.test(f)))) {
		var zong = "";
		if (a == "") {
			a = "请输入血量，";
			zong += a;
		} else if (!(/(^[1-9]\d*$)/.test(a))) {
			a = "血量必须是正整数，";
			zong += a;
		}
		if (b == "") {
			b = "请输入攻击，";
			zong += b;
		} else if (!(/(^[1-9]\d*$)/.test(b))) {
			b = "攻击必须是正整数，";
			zong += b;
		}
		if (c == "") {
			c = "请输入防御，";
			zong += c;
		} else if (!(/(^[1-9]\d*$)/.test(c))) {
			c = "防御必须是正整数，";
			zong += c;
		}
		if (d == "") {
			d = "请输入速度，";
			zong += d;
		} else if (!(/(^[1-9]\d*$)/.test(d))) {
			d = "速度必须是正整数，";
			zong += d;
		}
		if (e == "") {
			e = "请输入金钱，";
			zong += e;
		} else if (!(/(^[1-9]\d*$)/.test(e))) {
			e = "金钱必须是正整数，";
			zong += e;
		}
		if (f == "") {
			f = "请输入经验，";
			zong += f;
		} else if (!(/(^[1-9]\d*$)/.test(f))) {
			f = "经验必须是正整数，";
			zong += f;
		}
		zong = zong.slice(0, zong.length - 1);
		alert(zong);
	} else {

		top.zhongjian.location.href = "/RPG/guanliyuanmoshi/xiugai?xueliang="
			+ a
			+ "&gongji="
			+ b
			+ "&fangyu="
			+ c
			+ "&sudu="
			+ d
			+ "&jinqian="
			+ e
			+ "&jingyan="
			+ f;

	}
}

function xiugaifanhuiguaiwubiao() {
	top.zhongjian.location.href = "/RPG/guanliyuanmoshi/xiugaifanhuiguaiwubiao";
}
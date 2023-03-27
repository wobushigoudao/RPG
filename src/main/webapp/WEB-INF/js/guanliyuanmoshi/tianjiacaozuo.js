function tianjia() {
	var reg = /^[\u4E00-\u9FA5]+$/;
	var a = parent.frames["zhongjian"].document.getElementById("id").value;
	var b = parent.frames["zhongjian"].document.getElementById("xingming").value;
	var c = parent.frames["zhongjian"].document.getElementById("xueliang").value;
	var d = parent.frames["zhongjian"].document.getElementById("gongji").value;
	var e = parent.frames["zhongjian"].document.getElementById("fangyu").value;
	var f = parent.frames["zhongjian"].document.getElementById("sudu").value;
	var g = parent.frames["zhongjian"].document.getElementById("jinqian").value;
	var h = parent.frames["zhongjian"].document.getElementById("jingyan").value;
	if ((a == "" || b == "" || c == "" || d == "" || e == "" || f == ""
		|| g == "" || h == "")
		|| (!(/(^[1-9]\d*$)/.test(a)) || !reg.test(b)
			|| !(/(^[1-9]\d*$)/.test(c))
			|| !(/(^[1-9]\d*$)/.test(d))
			|| !(/(^[1-9]\d*$)/.test(e))
			|| !(/(^[1-9]\d*$)/.test(f))
			|| !(/(^[1-9]\d*$)/.test(g)) || !(/(^[1-9]\d*$)/
				.test(h)))) {
		var zong = "";
		if (a == "") {
			a = "请输入怪物编号，";
			zong += a;
		} else if (!(/(^[1-9]\d*$)/.test(a))) {
			a = "怪物编号必须是正整数，";
			zong += a;
		}
		if (b == "") {
			b = "请输入怪物名，";
			zong += b;
		} else if (!reg.test(b)) {
			b = "怪物名必须全是汉字，";
			zong += b;
		}
		if (c == "") {
			c = "请输入血量，";
			zong += c;
		} else if (!(/(^[1-9]\d*$)/.test(c))) {
			c = "血量必须是正整数，";
			zong += c;
		}
		if (d == "") {
			d = "请输入攻击，";
			zong += d;
		} else if (!(/(^[1-9]\d*$)/.test(d))) {
			d = "攻击必须是正整数，";
			zong += d;
		}
		if (e == "") {
			e = "请输入防御，";
			zong += e;
		} else if (!(/(^[1-9]\d*$)/.test(e))) {
			e = "防御必须是正整数，";
			zong += e;
		}
		if (f == "") {
			f = "请输入速度，";
			zong += f;
		} else if (!(/(^[1-9]\d*$)/.test(f))) {
			f = "速度必须是正整数，";
			zong += f;
		}
		if (g == "") {
			g = "请输入金钱，";
			zong += g;
		} else if (!(/(^[1-9]\d*$)/.test(g))) {
			g = "金钱必须是正整数，";
			zong += g;
		}
		if (h == "") {
			h = "请输入经验，";
			zong += h;
		} else if (!(/(^[1-9]\d*$)/.test(h))) {
			h = "经验必须是正整数，";
			zong += h;
		}
		zong = zong.slice(0, zong.length - 1);
		alert(zong);
	} else {

		top.zhongjian.location.href = "/RPG/guanliyuanmoshi/tianjia?id="
			+ a
			+ "&xingming="
			+ encodeURI(encodeURI(b))
			+ "&xueliang="
			+ c
			+ "&gongji="
			+ d
			+ "&fangyu="
			+ e
			+ "&sudu="
			+ f
			+ "&jinqian=" + g + "&jingyan=" + h;
	}
}

function tianjiafanhuiguaiwubiao() {
	top.zhongjian.location.href = "/RPG/guanliyuanmoshi/tianjiafanhuiguaiwubiao";

}
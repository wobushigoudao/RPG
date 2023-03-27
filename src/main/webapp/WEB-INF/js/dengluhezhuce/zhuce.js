function zhuce() {
	var a = document.getElementById("xuehao").value;
	var b = document.getElementById("mima").value;
	if ((a == "" || b == "") || (!(/(^[1-9]\d*$)/.test(a)) || !(/(^[1-9]\d*$)/.test(b)))) {
		var zong = "";
		if (a == "") {
			a = "请输入学号，";
			zong += a;
		} else if (!(/(^[1-9]\d*$)/.test(a))) {
			a = "学号必须是正整数，";
			zong += a;
		}
		if (b == "") {
			b = "请输入密码，";
			zong += b;
		} else if (!(/(^[1-9]\d*$)/.test(b))) {
			b = "密码必须是正整数，";
			zong += b;
		}
		zong = zong.slice(0, zong.length - 1);
		alert(zong);
	} else {
		document.zhuceform.action = "/RPG/dengluhezhuce/zhuce";
		document.zhuceform.submit();

	}

}

function fanhuitanxianwang() {
	document.zhuceform.action = "/RPG/dengluhezhuce/fanhuitanxianwang";
	document.zhuceform.submit();
}
function quedingshuxing() {
	var msg = "以后重新开始也是这个角色，您确定要这个角色吗？";
	if (confirm(msg) == true) {
		var a = parent.frames["dingbu"].document.getElementById("xingming").value;
		var b = parent.frames["dingbu"].document.getElementById("xueliang").value;
		var c = parent.frames["dingbu"].document.getElementById("gongji").value;
		var d = parent.frames["dingbu"].document.getElementById("fangyu").value;
		var e = parent.frames["dingbu"].document.getElementById("sudu").value;
		var f = parent.frames["dingbu"].document.getElementById("jinqian").value;
		var g = parent.frames["dingbu"].document.getElementById("jingyan").value;
		var reg = /^[\u4E00-\u9FA5]+$/;
		if (a == "" || !reg.test(a)) {
			var zong = "";
			if (a == "") {
				a = "请输入姓名";
				zong += a;
			} else if (!reg.test(a)) {
				a = "姓名必须全是汉字";
				zong += a;
			}
			alert(zong);
		} else {
			top.location = "/RPG/chuangjianjuese/juesequeding?xingming="
				+ encodeURI(encodeURI(a));
		}
	} else {

	}
}
function chongzhi() {
	top.dingbu.location.href = "/RPG/chuangjianjuese/juesechongzhi";
}
function fanhuishengmocuncunkou() {
	top.location = "/RPG/chuangjianjuese/fanhuishengmocuncunkou";
}
function shangyiye() {

	var diyiye = document.getElementById("cunsuiji").value;
	if (diyiye == 0) {
		alert("这已经是第一页了")
	} else {

		top.zhongjian.location.href = "/RPG/guanliyuanmoshi/shangyiye";

	}

}
function xiayiye() {
	var zuihouyiye = document.getElementById("zuihouyiye").value;
	if (zuihouyiye == "最后一页") {
		alert("这已经是最后一页了")
	} else {

		top.zhongjian.location.href = "/RPG/guanliyuanmoshi/xiayiye";

	}

}
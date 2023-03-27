function shanchu() {
	var msg = "您确定要删除吗？";
	if (confirm(msg) == true) {
		return true;
	} else {
		return false;
	}
}

window.onload = function() {

	var a = document.getElementById("cunkuanggao");
	var zuihouyiye = document.getElementById("zuihouyiye").value;
	if (a.innerText == "") {
		a.style.width = "0px"
		a.style.height = "0px"
	}
	

top.dingbu.location.href = "/RPG/guanliyuanmoshi/shangxiaye?zuihouyiye=" + encodeURI(encodeURI(zuihouyiye));
	top.dibu.location.href = "/RPG/guanliyuanmoshi/tianjiahefanhuishengmocuncunkou";

}

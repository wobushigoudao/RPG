package com.javabao;



import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import com.diaoshujukujiekoubao.diaojiekou;
import com.wdbao.daojuhezhuangbei;
import com.wdbao.juesexinxi;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping({ "/cunzhuang" })
public class javacunzhuang {
	@Resource
	diaojiekou jiekou;
	String cunxuehao = "";
	int yunxingyici = 1;
	int zhi=0;
	panduanlei pan=new panduanlei();
	@RequestMapping(value = "/cunzhuang")
	public String cunzhuang(HttpServletRequest request, Model model) throws Exception {
		if (yunxingyici == 1) {
			String xuehao = request.getParameter("xuehao");
			cunxuehao = xuehao;
			yunxingyici++;
		}
		return "cunzhuang/cunzhuang";

	}
	@RequestMapping(value = "/fanhuishengmocuncunkou")
	public String fanhuishengmocuncunkou(HttpServletRequest request, Model model) throws Exception {

		return "shengmocuncunkou/shengmocuncunkou";

	}

	@RequestMapping(value = "/tanxian")
	public String tanxian(HttpServletRequest request, Model model) throws Exception {
		if (yunxingyici == 1) {
			String xuehao = request.getParameter("xuehao");
			cunxuehao = xuehao;
			yunxingyici++;
		}
		System.out.println("欢饮来到圣魔村村外");
		return "tanxian/zongkuang";

	}
	@RequestMapping(value = "/yuanyi", method = RequestMethod.POST,produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String yuanyi(HttpServletRequest request, Model model) throws Exception {
		juesexinxi jue=jiekou.chaxuehao(cunxuehao);
		String yuan=request.getParameter("yuan");
		String l="";
if(yuan.equals("乞丐")) {
	int qian=jue.getJinQian()-10;
	if(qian>=0) {
	jue.setJinQian(jue.getJinQian()-10);
	jiekou.xiugai(jue);
	l="谢谢你的小钱钱";
	zhi++;
	}else {
		l="以后记得赚钱哦";
	}
if(zhi==10) {
l="乞丐丢下一个力丸，转身就走了";
daojuhezhuangbei daoju=jiekou.chadaozhuang(cunxuehao);
if (daoju.getDaoJ() == null) {
	daoju.setDaoJ("力丸，");
} else {
	String cund = daoju.getDaoJ() +"力丸，";
	daoju.setDaoJ(cund);
}
jiekou.xiugaidaozhuang(daoju);
zhi=0;
}

}
if(yuan.equals("旅馆店老板")) {
	int qi=jue.getJinQian()-10;
	if(qi>=0) {
	jue.setXueLiang(jue.getXueliangMax());
	jue.setJinQian(jue.getJinQian()-10);
	jiekou.xiugai(jue);
	l="睡觉";
	}else {
		l="你的钱不够";
	}
}
		return l;

	}
	@RequestMapping(value = "/buyuanyi", method = RequestMethod.POST,produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String buyuanyi(HttpServletRequest request, Model model) throws Exception {
		String buyuan=request.getParameter("buyuan");
		String l="";
if(buyuan.equals("乞丐")) {
l="打扰了";
}
if(buyuan.equals("旅馆店老板")) {
	l="欢迎下次再来";
}
		return l;

	}
	@RequestMapping(value = "/goumai", method = RequestMethod.POST,produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String goumai(HttpServletRequest request, Model model) throws Exception {
		String wu=request.getParameter("wu");
		String l="";
		daojuhezhuangbei daoju=jiekou.chadaozhuang(cunxuehao);
		juesexinxi jue=jiekou.chaxuehao(cunxuehao);
		int qian=jue.getJinQian()-pan.qian(wu);
		if(qian>=0) {
		jue.setJinQian(qian);
		l="购买成功";
		if (daoju.getZhuangB() == null) {
			daoju.setZhuangB(wu+"，");
		} else {
			String cund = daoju.getZhuangB() +wu+"，";
			daoju.setZhuangB(cund);
		}
		jiekou.xiugai(jue);
		jiekou.xiugaidaozhuang(daoju);
		}else {
			l="金钱不够";
		}
		return l;

	}
	@RequestMapping(value = "/goumai1", method = RequestMethod.POST,produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String goumai1(HttpServletRequest request, Model model) throws Exception {
		String wu=request.getParameter("wu");
		String l="";
		daojuhezhuangbei daoju=jiekou.chadaozhuang(cunxuehao);
		juesexinxi jue=jiekou.chaxuehao(cunxuehao);
		int qian=jue.getJinQian()-pan.qian(wu);
		if(qian>=0) {
		jue.setJinQian(qian);
		l="购买成功";
		if (daoju.getDaoJ()== null) {
			daoju.setDaoJ(wu+"，");
		} else {
			String cund = daoju.getDaoJ() +wu+"，";
			daoju.setDaoJ(cund);
		}
		jiekou.xiugai(jue);
		jiekou.xiugaidaozhuang(daoju);
		}else {
			l="金钱不够";
		}
		return l;

	}
	



}
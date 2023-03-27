package com.javabao;

import java.net.URLDecoder;
import java.util.Arrays;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import com.diaoshujukujiekoubao.diaojiekou;
import com.wdbao.daojuhezhuangbei;
import com.wdbao.juesexinxi;
import com.wdbao.shuxingmax;
import com.wdbao.teshulei;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class javashoulei {
	@Resource
	diaojiekou jiekou;
	String cunxuehao = "";
	int yunxingyici = 1;
	String st = "";
	String zhonglei = null;
	String zh = null;
	yongwupinhezhuangbei yong = new yongwupinhezhuangbei();

	@RequestMapping({ "/denglu" })
	public String denglu() {
		System.out.println("欢迎进入登录页面");
		return "dengluhezhuce/denglu";
	}

	@RequestMapping({ "/shibaihuancun" })
	public String shibaihuancun(HttpServletRequest request, Model model) throws Exception {
		if (yunxingyici == 1) {
			String xuehao = request.getParameter("cunxuehao");
			cunxuehao = xuehao;
			yunxingyici++;
		}
		System.out.println("你被击败了");
		return "shibai";
	}

	@RequestMapping({ "/shengmocuncunkou" })
	public String shengmocuncunkou(HttpServletRequest request, Model model) throws Exception {
		shuxingmax shuxing = jiekou.chamaxxuehao(cunxuehao);
		juesexinxi juese = new juesexinxi();
		juese.setXueHao(cunxuehao);
		juese.setDengJi(1);
		juese.setXueLiang(shuxing.getXueliangMax());
		juese.setGongJi(shuxing.getGongjiMax());
		juese.setFangYu(shuxing.getFangyuMax());
		juese.setSuDu(shuxing.getSuduMax());
		juese.setJinQian(0);
		juese.setJingYan(0);
		juese.setXueliangMax(shuxing.getXueliangMax());
		juese.setJingyanMax(juese.getDengJi() * 100);
		jiekou.xiugaishuxing(juese);
		daojuhezhuangbei daoju = jiekou.chadaozhuang(cunxuehao);
		daoju.setDaoJ(null);
		daoju.setZhuangB(null);
		daoju.setWuQi(null);
		daoju.setFangJu(null);
		String miwu = "";
		for (int i = 0; i < 10; i++) {
			miwu = miwu + "0，";
		}
		daoju.setMiwusenLin(miwu);
		daoju.setDacaoyuan(miwu);
		daoju.setMowangchengbao(miwu);
		jiekou.xiugaidaozhuang(daoju);
		teshulei teshu = jiekou.chalu(cunxuehao);
		teshu.setMiwusenlinluren(null);
		teshu.setDacaoyuan(null);
		teshu.setMowangchengbao(null);
		jiekou.xiugailu(teshu);
		return "shengmocuncunkou/shengmocuncunkou";
	}

	@RequestMapping({ "/shiyong" })
	public String shiyong(HttpServletRequest request, Model model) throws Exception {
		if (yunxingyici == 1) {
			String xuehao = request.getParameter("cunxuehao");
			cunxuehao = xuehao;
			yunxingyici++;
		}
		st = "";
		String wupin = URLDecoder.decode(request.getParameter("wupin"), "utf-8");
		int weizhi = Integer.parseInt(request.getParameter("weizhi"));
		juesexinxi shuxing = jiekou.chaxuehao(cunxuehao);
		daojuhezhuangbei dz = jiekou.chadaozhuang(cunxuehao);
		if (wupin.equals("草药") || wupin.equals("血药")||wupin.equals("大补药")||wupin.equals("小补药")||wupin.equals("灵芝")||wupin.equals("人参")) {
			zhonglei = "加血量";
			yong.wupin(jiekou, wupin, weizhi, shuxing, dz, zhonglei, st);
		}

		if (wupin.equals("力丸")) {
			zh = "战斗外";
			yong.teshu(jiekou, wupin, weizhi, shuxing, dz, st, zh);

		}
		model.addAttribute("zhuangbei", dz);
		model.addAttribute("juesexuehaoshuju", shuxing);
		return "tanxian/jueseshuxing";
	}

	@RequestMapping({ "/zhuangbei" })
	public String zhuangbei(HttpServletRequest request, Model model) throws Exception {
		if (yunxingyici == 1) {
			String xuehao = request.getParameter("cunxuehao");
			cunxuehao = xuehao;
			yunxingyici++;
		}
		daojuhezhuangbei dz = jiekou.chadaozhuang(cunxuehao);
		st = "";
		String zhuangbei = URLDecoder.decode(request.getParameter("zhuangbei"), "utf-8");
		int weizhi = Integer.parseInt(request.getParameter("weizhi"));
		juesexinxi shuxing = jiekou.chaxuehao(cunxuehao);
		if (zhuangbei.equals("匕首") || zhuangbei.equals("大剑")||zhuangbei.equals("闪光剑")||zhuangbei.equals("小剑")||zhuangbei.equals("铁剑")||zhuangbei.equals("刺剑")) {
			zhonglei = "装备武器";
			yong.zhuangbei(jiekou, zhuangbei, weizhi, shuxing, dz, zhonglei, st);

		}

		if (zhuangbei.equals("铜甲") || zhuangbei.equals("铁甲")||zhuangbei.equals("金甲")||zhuangbei.equals("鳞甲")||zhuangbei.equals("板甲")||zhuangbei.equals("精铁甲")||zhuangbei.equals("秘银甲")) {
			zhonglei = "装备防具";
			yong.zhuangbei(jiekou, zhuangbei, weizhi, shuxing, dz, zhonglei, st);

		}

		model.addAttribute("juesexuehaoshuju", shuxing);
		model.addAttribute("zhuangbei", dz);
		return "tanxian/jueseshuxing";
	}

	@RequestMapping({ "/duiqiwupin" })
	public String duiqiwupin(HttpServletRequest request, Model model) throws Exception {
		if (yunxingyici == 1) {
			String xuehao = request.getParameter("cunxuehao");
			cunxuehao = xuehao;
			yunxingyici++;
		}
		String qu = "";
		String zh = URLDecoder.decode(request.getParameter("zhan"), "utf-8");
		if (zh.equals("战斗外")) {
			qu = "wupinzong";
		}
		if (zh.equals("战斗内")) {
			qu = "miwusenlin/wupinzong";
		}
		String wupin = URLDecoder.decode(request.getParameter("wupin"), "utf-8");
		int weizhi = Integer.parseInt(request.getParameter("weizhi"));
		daojuhezhuangbei dz = jiekou.chadaozhuang(cunxuehao);
		String[] daoju = dz.getDaoJ().split("，");
		String[] dao = new String[daoju.length];
		st = "";
		int sd = 0;
		int l = 0;
		for (int i = 0; i < daoju.length; i++) {
			if (wupin.equals(daoju[i])) {
				if (weizhi == sd) {
					dao = Arrays.copyOf(dao, dao.length - 1);
					sd++;
					continue;
				}
				sd++;

			}
			dao[l] = daoju[i];
			l++;
			st = st + daoju[i] + "，";
		}
		if (st == "") {
			dz.setDaoJ(null);

		} else {
			dz.setDaoJ(st);
		}
		jiekou.xiugaidaozhuang(dz);
		model.addAttribute("daoju", dao);
		return "tanxian/" + qu;
	}

	@RequestMapping({ "/duiqizhuangbei" })
	public String duiqizhuangbei(HttpServletRequest request, Model model) throws Exception {
		if (yunxingyici == 1) {
			String xuehao = request.getParameter("cunxuehao");
			cunxuehao = xuehao;
			yunxingyici++;
		}
		String qu = "";
		String zh = URLDecoder.decode(request.getParameter("zhan"), "utf-8");
		if (zh.equals("战斗外")) {
			qu = "zhuangbeizong";
		}
		if (zh.equals("战斗内")) {
			qu = "miwusenlin/zhuangbeizong";
		}
		String zhuangbei = URLDecoder.decode(request.getParameter("zhuangbei"), "utf-8");
		int weizhi = Integer.parseInt(request.getParameter("weizhi"));
		daojuhezhuangbei dz = jiekou.chadaozhuang(cunxuehao);
		String[] daoju = dz.getZhuangB().split("，");
		String[] dao = new String[daoju.length];
		st = "";
		int sd = 0;
		int l = 0;
		for (int i = 0; i < daoju.length; i++) {
			if (zhuangbei.equals(daoju[i])) {
				if (weizhi == sd) {
					dao = Arrays.copyOf(dao, dao.length - 1);
					sd++;
					continue;
				}
				sd++;

			}
			dao[l] = daoju[i];
			l++;
			st = st + daoju[i] + "，";
		}
		if (st == "") {
			dz.setZhuangB(null);

		} else {
			dz.setZhuangB(st);
		}
		jiekou.xiugaidaozhuang(dz);
		model.addAttribute("daoju", dao);
		return "tanxian/" + qu;
	}

}

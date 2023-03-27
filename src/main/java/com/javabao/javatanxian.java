package com.javabao;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import com.diaoshujukujiekoubao.diaojiekou;
import com.wdbao.daojuhezhuangbei;
import com.wdbao.juesexinxi;
import com.wdbao.wuyong;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping({ "/tanxian" })
public class javatanxian {
	@Resource
	diaojiekou jiekou;
	String cunxuehao = "";
	int yunxingyici = 1;
panduanlei pan=new panduanlei();
	@RequestMapping(value = "/tishihefanhuishengmocuncunkou")
	public String tishihefanhuishengmocuncunkou(HttpServletRequest request, Model model) throws Exception {
		if (yunxingyici == 1) {
			String xuehao = request.getParameter("xuehao");
			cunxuehao = xuehao;
			yunxingyici++;
		}
		String[] tishi = { "遇到比你强的怪物，最好选择逃跑", "有钱了，记得去村庄里买武器", "战斗中防御高于对方攻击，则不会掉血", "村庄里有特殊道具，记得去看看",
				"管理员模式只有打败魔王，才可开启" };

		model.addAttribute("tishi", tishi);

		return "tanxian/tishihefanhuishengmocuncunkou";

	}

	@RequestMapping(value = "/fanhuishengmocuncunkou")
	public String fanhuishengmocuncunkou(HttpServletRequest request, Model model) throws Exception {

		return "shengmocuncunkou/shengmocuncunkou";

	}

	@RequestMapping(value = "/cunzhuang")
	public String cunzhuang(HttpServletRequest request, Model model) throws Exception {
		model.addAttribute("xuehao", cunxuehao);
		return "cunzhuang/cunzong";

	}

	@RequestMapping(value = "/jueseshuxing")
	public String jueseshuxing(HttpServletRequest request, Model model) throws Exception {
		if (yunxingyici == 1) {
			String xuehao = request.getParameter("xuehao");
			cunxuehao = xuehao;
			yunxingyici++;
		}
		juesexinxi juesexuehaoshuju = jiekou.chaxuehao(cunxuehao);
		daojuhezhuangbei d = jiekou.chadaozhuang(cunxuehao);
		wuyong yo=jiekou.chacao(cunxuehao);
		
		if(cunxinxilei.cunli==1||yo.getLiWan().equals("1")) {
			juesexuehaoshuju.setGongJi(juesexuehaoshuju.getGongJi() - 4);
			jiekou.xiugai(juesexuehaoshuju);
			cunxinxilei.cunli=0;
			yo.setLiWan("2");
			
		}
		if(cunxinxilei.jafang==1||yo.getFangteJi().equals("1")) {
			juesexuehaoshuju.setFangYu(juesexuehaoshuju.getFangYu()-16);
			jiekou.xiugai(juesexuehaoshuju);
			cunxinxilei.jafang=0;
			yo.setFangteJi("2");
		}
		jiekou.xiucao(yo);
		
		model.addAttribute("zhuangbei", d);
		model.addAttribute("juesexuehaoshuju", juesexuehaoshuju);
		return "tanxian/jueseshuxing";

	}
	@RequestMapping(value = "/wupinzong")
	public String wupinzong(HttpServletRequest request, Model model) throws Exception {
		
			return "tanxian/wupinzong";
		

	}
	@RequestMapping(value = "/zhuangbeizong")
	public String zhuangbeizong(HttpServletRequest request, Model model) throws Exception {
		
			return "tanxian/zhuangbeizong";
		

	}
	@RequestMapping(value = "/wupincaozuo")
	public String wupincaozuo(HttpServletRequest request, Model model) throws Exception {
		model.addAttribute("cunxuehao", cunxuehao);
		return "tanxian/wupincaozuo";

	}

	@RequestMapping(value = "/zhuangbeicaozuo")
	public String zhuangbeicaozuo(HttpServletRequest request, Model model) throws Exception {
		model.addAttribute("cunxuehao", cunxuehao);
		return "tanxian/zhuangbeicaozuo";

	}


	@RequestMapping(value = "/wupinneirong")
	public String wupinneirong(HttpServletRequest request, Model model) throws Exception {
		daojuhezhuangbei dz = jiekou.chadaozhuang(cunxuehao);
		if (dz.getDaoJ() != null) {
			String[] daoju = dz.getDaoJ().split("，");
			model.addAttribute("daoju", daoju);
			return "tanxian/wupinneirong";
		} else {
			return "tanxian/wupinneirong";
		}
		
		

	}

	@RequestMapping(value = "/zhuangbeineirong")
	public String zhuangbeineirong(HttpServletRequest request, Model model) throws Exception {
		daojuhezhuangbei dz = jiekou.chadaozhuang(cunxuehao);
		if (dz.getZhuangB() != null) {
			String[] daoju = dz.getZhuangB().split("，");
			model.addAttribute("daoju", daoju);
			return "tanxian/zhuangbeineirong";
		} else {
			return "tanxian/zhuangbeineirong";
		}

	}
	@RequestMapping(value = "/xiexiawuqi")
	public String xiexiawuqi(HttpServletRequest request, Model model) throws Exception {
		daojuhezhuangbei dz = jiekou.chadaozhuang(cunxuehao);
		juesexinxi juese=jiekou.chaxuehao(cunxuehao);
		String de=dz.getWuQi();
		if(de!=null) {
		if(dz.getZhuangB()==null) {
			dz.setZhuangB(de+"，");
		}else {
			dz.setZhuangB(dz.getZhuangB()+de+"，");
		}
		dz.setWuQi(null);
		juese.setGongJi(juese.getGongJi()-pan.zhuang(de));
		jiekou.xiugai(juese);
		jiekou.xiugaidaozhuang(dz);
		}
		return "tanxian/juehuan";

	}
	@RequestMapping(value = "/xiexiafangju")
	public String xiexiafangju(HttpServletRequest request, Model model) throws Exception {
		daojuhezhuangbei dz = jiekou.chadaozhuang(cunxuehao);
		juesexinxi juese=jiekou.chaxuehao(cunxuehao);
		String de=dz.getFangJu();
		if(de!=null) {
		if(dz.getZhuangB()==null) {
			dz.setZhuangB(de+"，");
		}else {
			dz.setZhuangB(dz.getZhuangB()+de+"，");
		}
		dz.setFangJu(null);
		juese.setFangYu(juese.getFangYu()-pan.zhuang(de));
		jiekou.xiugai(juese);
		jiekou.xiugaidaozhuang(dz);
		}
		
		return "tanxian/juehuan";

	}

	@RequestMapping(value = "/ditu")
	public String ditu(HttpServletRequest request, Model model) throws Exception {
		model.addAttribute("xuehao", cunxuehao);
		return "tanxian/ditu";

	}

	@RequestMapping(value = "/guaiwushuxing")
	public String guaiwushuxing(HttpServletRequest request, Model model) throws Exception {

		return "tanxian/guaiwushuxing";

	}

}

package com.javabao;

import java.net.URLDecoder;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import com.diaoshujukujiekoubao.diaojiekou;
import com.wdbao.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping({ "/chuangjianjuese" })
public class javachuangjianjuese {

	@Resource
	diaojiekou jiekou;
	int xueliang = 0;
	int gongji = 0;
	int fangyu =0;
	
	int sudu = 0;
	int jinqian = 0;
	int jingyan = 0;
	String cunxuehao = "";
	juesexinxi jue = null;
String chuangjianljuese=null;
	@RequestMapping(value = "/juesejiemian")
	public String juesejiemian(HttpServletRequest request, Model model) throws Exception {
		String xuehao = request.getParameter("xuehao");
		cunxuehao = xuehao;
		String[] cunxingming = { "张三", "李四", "王五" };
		int suijishuxingming = (int) (Math.random() * 3);
		String xingming = cunxingming[suijishuxingming];
		int suijishuxueliang = (int) (Math.random() * 50 + 50);
		 xueliang = suijishuxueliang;
		int suijishugongji = (int) (Math.random() * 10 + 4);
		 gongji = suijishugongji;
		int suijishufangyu = (int) (Math.random() * 10 + 3);
		 fangyu = suijishufangyu;
		int suijishusudu = (int) (Math.random() * 10 + 1);
		 sudu = suijishusudu;
		 jinqian = 0;
		 jingyan = 0;
		juesexinxi jueseshuju = new juesexinxi();
		jueseshuju.setXingMing(xingming);
		jueseshuju.setXueLiang(xueliang);
		jueseshuju.setGongJi(gongji);
		jueseshuju.setFangYu(fangyu);
		jueseshuju.setSuDu(sudu);
		jueseshuju.setJinQian(jinqian);
		jueseshuju.setJingYan(jingyan);
		jue = jueseshuju;
		return "chuangjianjuese/juesehuancun";

	}

	@RequestMapping(value = "/juesehuancun")
	public String juesehuancun(HttpServletRequest request, Model model) throws Exception {
		model.addAttribute("jueseshuju", jue);

		return "chuangjianjuese/juesejiemian";
	}

	@RequestMapping(value = "/juesequedinghechongzhihetuichu")
	public String juesequedinghechongzhihetuichu(HttpServletRequest request, Model model) throws Exception {

		return "chuangjianjuese/juesequedinghechongzhihetuichu";
	}

	@RequestMapping(value = "/juesequeding")
	public String juesequeding(HttpServletRequest request, Model model) throws Exception {

		String xingming = URLDecoder.decode(request.getParameter("xingming"), "utf-8");
		juesexinxi jueseshuju = new juesexinxi();
		jueseshuju.setXueHao(cunxuehao);
		jueseshuju.setXingMing(xingming);
		jueseshuju.setDengJi(1);
		jueseshuju.setXueLiang(xueliang);
		jueseshuju.setGongJi(gongji);
		jueseshuju.setFangYu(fangyu);
		jueseshuju.setSuDu(sudu);
		jueseshuju.setJinQian(jinqian);
		jueseshuju.setJingYan(jingyan);
		jueseshuju.setShiFou(1);
		jueseshuju.setXueliangMax(xueliang);
		jueseshuju.setJingyanMax(100 + jueseshuju.getDengJi() * 100);
		jiekou.xiugai(jueseshuju);
		shuxingmax max = new shuxingmax();
		max.setXueHao(cunxuehao);
		max.setXueliangMax(xueliang);
		max.setGongjiMax(gongji);
		max.setFangyuMax(fangyu);
		max.setSuduMax(sudu);
		jiekou.tianjiamax(max);
		daojuhezhuangbei daozhuang = new daojuhezhuangbei();
		daozhuang.setXueHao(cunxuehao);
		String miwu = "";
		for (int i = 0; i < 10; i++) {
			miwu = miwu + "0，";
		}
		daozhuang.setMiwusenLin(miwu);
		daozhuang.setDacaoyuan(miwu);
		daozhuang.setMowangchengbao(miwu);
		jiekou.tianjiadaozhuang(daozhuang);
		teshulei teshu = new teshulei();
		teshu.setXueHao(cunxuehao);
		jiekou.tianjialu(teshu);
		wuyong yo=new wuyong();
		yo.setXueHao(cunxuehao);
		yo.setLiWan("2");
		yo.setFangteJi("2");
		jiekou.jiacao(yo);
		tupian tu=new tupian();
		tu.setXueHao(cunxuehao);
		jiekou.jiatu(tu);
		chuangjianljuese="创建角色成功";
		return "chuangjianjuese/huancun";
	}

	@RequestMapping(value = "/huancun")
	public String huancun(HttpServletRequest request, Model model) throws Exception {
		model.addAttribute("chuangjianljuese", chuangjianljuese);
		return "shengmocuncunkou/shengmocuncunkou";
	}
	@RequestMapping(value = "/juesechongzhi")
	public String juesechongzhi(HttpServletRequest request, Model model) throws Exception {
		String[] cunxingming = { "张三", "李四", "王五" };
		int suijishuxingming = (int) (Math.random() * 3);
		String xingming = cunxingming[suijishuxingming];
		int suijishuxueliang = (int) (Math.random() * 50 + 50);
		 xueliang = suijishuxueliang;
		int suijishugongji = (int) (Math.random() * 10 + 4);
		 gongji = suijishugongji;
		int suijishufangyu = (int) (Math.random() * 10 + 3);
		 fangyu = suijishufangyu;
		int suijishusudu = (int) (Math.random() * 10 + 1);
		 sudu = suijishusudu;
		 jinqian = 0;
		 jingyan = 0;
		juesexinxi jueseshuju = new juesexinxi();
		jueseshuju.setXingMing(xingming);
		jueseshuju.setXueLiang(xueliang);
		jueseshuju.setGongJi(gongji);
		jueseshuju.setFangYu(fangyu);
		jueseshuju.setSuDu(sudu);
		jueseshuju.setJinQian(jinqian);
		jueseshuju.setJingYan(jingyan);
		jue = jueseshuju;
		return "chuangjianjuese/juesehuancun";

	}

	@RequestMapping(value = "/fanhuishengmocuncunkou")
	public String fanhuishengmocuncunkou(HttpServletRequest request, Model model) throws Exception {
		return "shengmocuncunkou/shengmocuncunkou";
	}
}

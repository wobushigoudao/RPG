package com.javabao;


import com.diaoshujukujiekoubao.diaojiekou;
import com.wdbao.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.HashMap;

@Controller
@RequestMapping({ "/tanxian/miwusenlin" })
public class javatanxianmiwusenlin {
	@Resource
	diaojiekou jiekou;
	String cunxuehao = "";
	int yunxingyici = 1;
	String st = "";
	String wu=null;
	String cunguai=null;
	guaiwushuxing cunguaiwu = null;
	String[] cunxinxi = null;
	String[] cunsheng = null;
	int lu = 0;
	int guaiwuji = 0;
	String taopao = "";
	int sui = 0;
	String du=null;
	int[] dz = new int[10];
	String jieguo = null;
	String gudingci = "";
	int shn = 0;
	int jueseshanghai = 0;
	int guaiwushanghai = 0;
	String daibaixinxi = null;
	String huancun = null;
	int weizhi = 0;
	String wupin = "";
	String zhuangbei = null;
	int jishiqi = 0;
	String zhonglei = null;
	String zh = null;
	juesexinxi juju = null;
	String pan = null;
	int diyi=0;
	String [] hua=null;
	String ren="";
	String tejihua="";
	int kai=0;
	String dalu="";
	String ming=null;
	int wulenque=0;
	static HashMap<String,Integer> ha=null;
	yongwupinhezhuangbei yong = new yongwupinhezhuangbei();
	panduanlei pann=new panduanlei();
	@RequestMapping(value = "/daomiwu")
	public String daomiwu(HttpServletRequest request, Model model) throws Exception {
		if (yunxingyici == 1) {
			String xuehao = request.getParameter("xuehao");
			cunxuehao = xuehao;
			yunxingyici++;
		}
		System.out.println("进入了迷雾森林，请务必小心");
		return "tanxian/miwusenlin/daomiwu";

	}

	@RequestMapping(value = "/miwusenlin")
	public String miwusenlin(HttpServletRequest request, Model model) throws Exception {
		dalu = URLDecoder.decode(request.getParameter("dalu"), "utf-8");
		if(dalu.equals("迷雾森林")) {
			du="miwusenlin";
			daojuhezhuangbei ss = jiekou.chadaozhuang(cunxuehao);
			String[] daoju = ss.getMiwusenLin().split("，");
			for (int i = 0; i < daoju.length; i++) {
				dz[i] = Integer.parseInt(daoju[i]);
			}
			
		}
		if(dalu.equals("大草原")) {
			if (yunxingyici == 1) {
				String xuehao = request.getParameter("xuehao");
				cunxuehao = xuehao;
				yunxingyici++;
			}
			du="dacaoyuan";
			daojuhezhuangbei ss = jiekou.chadaozhuang(cunxuehao);
			String[] daoju = ss.getDacaoyuan().split("，");
			for (int i = 0; i < daoju.length; i++) {
				dz[i] = Integer.parseInt(daoju[i]);
			}
			
		}
		if(dalu.equals("魔王城堡")) {
			if (yunxingyici == 1) {
				String xuehao = request.getParameter("xuehao");
				cunxuehao = xuehao;
				yunxingyici++;
			}
			du="mowangchengbao";
			daojuhezhuangbei ss = jiekou.chadaozhuang(cunxuehao);
			String[] daoju = ss.getMowangchengbao().split("，");
			for (int i = 0; i < daoju.length; i++) {
				dz[i] = Integer.parseInt(daoju[i]);
			}
			
		}
		gudingci = null;
		int luu = Integer.parseInt(request.getParameter("lu"));
		lu = luu;
		guaiwushuxing guaiwu=null; 
		int jibie=0;
		if(cunxinxilei.guai=="") {
			if(dalu.equals("迷雾森林")) {
		int b = (int) (Math.random() * 5 + 1);
		String c = Integer.toString(b);
		guaiwu = jiekou.chaguaiwuid(c);
		jibie = (int) (Math.random() * 3 + 1);
			}else if(dalu.equals("大草原")) {
				
				int b =pann.zhongjian(6, 10);
				String c = Integer.toString(b);
				guaiwu = jiekou.chaguaiwuid(c);
				jibie = (int) (Math.random() * 6 + 1);
			}else if(dalu.equals("魔王城堡")) {
				int b =pann.zhongjian(11, 12);
				String c = Integer.toString(b);
				guaiwu = jiekou.chaguaiwuid(c);
				jibie = (int) (Math.random() * 10 + 1);
			}
		guaiwuji = jibie;
		int xue = 0;
		int g = 0;
		int f = 0;
		int s = 0;
		int q = 0;
		int y = 0;
		if(dalu.equals("迷雾森林")) {
		while ((jibie - 1) > 0) {
			xue += (int) (Math.random() * 4 + 1);
			g += (int) (Math.random() * 2 + 1);
			f += (int) (Math.random() + 1);
			s += (int) (Math.random() + 1);
			q += (int) (Math.random() * 5 + 1);
			y += (int) (Math.random() * 3 + 1);
			jibie--;
		}
		}else if(dalu.equals("大草原")) {
			while ((jibie - 1) > 0) {
				xue += (int) (Math.random() * 5 + 1);
				g += (int) (Math.random() * 7 + 1);
				f += (int) (Math.random() + 3);
				s += (int) (Math.random() + 2);
				q += (int) (Math.random() * 6 + 1);
				y += (int) (Math.random() * 5 + 1);
				jibie--;
			}
		}else if(dalu.equals("魔王城堡")) {
			while ((jibie - 1) > 0) {
				xue += (int) (Math.random() * 10 + 1);
				g += (int) (Math.random() * 10 + 1);
				f += (int) (Math.random() + 5);
				s += (int) (Math.random() + 4);
				q += (int) (Math.random() * 10 + 1);
				y += (int) (Math.random() * 9 + 1);
				jibie--;
			}
		}
		guaiwu.setXueLiang(Integer.toString(Integer.parseInt(guaiwu.getXueLiang()) + xue));
		guaiwu.setGongJi(Integer.toString(Integer.parseInt(guaiwu.getGongJi()) + g));
		guaiwu.setFangYu(Integer.toString(Integer.parseInt(guaiwu.getFangYu()) + f));
		guaiwu.setSuDu(Integer.toString(Integer.parseInt(guaiwu.getSuDu()) + s));
		guaiwu.setJinQian(Integer.toString(Integer.parseInt(guaiwu.getJinQian()) + q));
		guaiwu.setJingYan(Integer.toString(Integer.parseInt(guaiwu.getJingYan()) + y));
			
		}else {
		guaiwu=yong.fanhuiguaiwu(jiekou, cunxinxilei.guai);
		jibie =yong.xinxi.jibie;
		guaiwuji = jibie;
		}
		
		cunguaiwu = guaiwu;
		String[] st = new String[1];
		cunxinxi = st;
		if(cunxinxilei.guai=="") {
			
			
		int su = (int) (Math.random() * 5);
		sui = su;
		}else {
			sui=1;
		}
		ha=new HashMap<String,Integer>();
		jishiqi = 0;
		return "tanxian/miwusenlin/daoluhuancun";

	}

	@RequestMapping(value = "/daoluhuancun")
	public String daoluhuancun(HttpServletRequest request, Model model) throws Exception {
		if (sui == 1 || sui == 2) {
			ming=cunguaiwu.getXingMing();
			if(cunxinxilei.guai=="") {
			if (guaiwuji >=3&&guaiwuji<6) {
				String jingying = "精英" + cunguaiwu.getXingMing();
				cunguaiwu.setXingMing(jingying);
			}
			if (guaiwuji >= 6&&guaiwuji<10) {
				String jingying = "优秀" + cunguaiwu.getXingMing();
				cunguaiwu.setXingMing(jingying);
			}
			if (guaiwuji==10) {
				String jingying = "恶魔" + cunguaiwu.getXingMing();
				cunguaiwu.setXingMing(jingying);
			}
			}
			juesexinxi juese = jiekou.chaxuehao(cunxuehao);
			juju = juese;
			wulenque=0;	
			return "tanxian/miwusenlin/zhandouzong";
		} else {

			return "tanxian/"+du+"/daolu" + lu;
		}

	}

	@RequestMapping(value = "/juesevsguaiwu")
	public String juesevsguaiwu(HttpServletRequest request, Model model) throws Exception {
		model.addAttribute("juese", juju);
		model.addAttribute("guaiwu", cunguaiwu);
		model.addAttribute("guaiwuming", ming);
		return "tanxian/"+du+"/juesevsguaiwu";

	}

	@RequestMapping(value = "/zhandouchang")
	public String zhandouchang(HttpServletRequest request, Model model) throws Exception {
        model.addAttribute("cunxinxi",cunxinxi);
		return "tanxian/miwusenlin/zhandouchang";

	}

	@RequestMapping(value = "/tishi")
	public String tishi(HttpServletRequest request, Model model) throws Exception {	
			

		String[] tishi = { "遇到比你强的怪物，最好选择逃跑", "有钱了，记得去村庄里买武器", "战斗中防御高于对方攻击，则不会掉血", "村庄里有特殊道具，记得去看看",
				"管理员模式只有打败魔王，才可开启" };

		model.addAttribute("tishi", tishi);
		return "tanxian/miwusenlin/tishi";

	}

	@RequestMapping(value = "/cunxinxi")
	public String cunxinxi(HttpServletRequest request, Model model) throws Exception {
		int shanghai = Integer.parseInt(request.getParameter("shanghai"));
		shn = shanghai;
		String[] cxx = request.getParameterValues("cunsheng");
		for (int i = 0; i < cxx.length; i++) {
			cxx[i] = URLDecoder.decode(cxx[i], "utf-8");
		}
		if (cxx[1].equals("undefined")) {
			cxx = Arrays.copyOf(cxx, cxx.length - 1);

		}
		cunxinxi = cxx;
		cunsheng = new String[1];
		cunsheng[0]=cunxinxi[0];
		pan = "空";
		if (cxx.length == 2) {
			gudingci="开始";
		}
		return "tanxian/miwusenlin/huancun";

	}
	@RequestMapping(value = "/kaishi")
	public String kaishi(HttpServletRequest request, Model model) throws Exception {
		cunsheng[0]=cunxinxi[1];
		gudingci = "怪物先攻击";
		return "tanxian/miwusenlin/huancun";

	}

	@RequestMapping(value = "/guaiwuxiangongji")
	public String guaiwuxiangongji(HttpServletRequest request, Model model) throws Exception {

		int shanghai = shn;
		juesexinxi juesexuehaoshuju = jiekou.chaxuehao(cunxuehao);
		int xueliang = juesexuehaoshuju.getXueLiang() - shanghai;
		if (xueliang > 0) {
			juesexuehaoshuju.setXueLiang(xueliang);
			jiekou.xiugai(juesexuehaoshuju);
			cunsheng=null;
			gudingci=null;
			return "tanxian/miwusenlin/huancun";
		} else {

			gudingci = "气绝了";
		
			String a = juesexuehaoshuju.getXingMing() + "气绝了";
			cunsheng = new String[1];
			cunsheng[0] = a;
			
			return "tanxian/miwusenlin/huancun";
		}

	}

	@RequestMapping(value = "/jueseshuxing")
	public String jueseshuxing(HttpServletRequest request, Model model) throws Exception {
		
		juesexinxi juese = jiekou.chaxuehao(cunxuehao);
		daojuhezhuangbei dz = jiekou.chadaozhuang(cunxuehao);
		model.addAttribute("zhuangbei", dz);
		model.addAttribute("juesexuehaoshuju", juese);

		return "tanxian/miwusenlin/jueseshuxing";

	}

	@RequestMapping(value = "/dengdai")
	public String dengdai(HttpServletRequest request, Model model) throws Exception {

		return "tanxian/miwusenlin/dengdai";

	}

	@RequestMapping(value = "/zhandou")
	public String zhandou(HttpServletRequest request, Model model) throws Exception {
		model.addAttribute("cunxinxi", cunxinxi);
		return "tanxian/miwusenlin/zhandou";

	}

	@RequestMapping(value = "/gongjihetaopao")
	public String gongjihetaopao(HttpServletRequest request, Model model) throws Exception {
		daojuhezhuangbei daoju=jiekou.chadaozhuang(cunxuehao);
		if(ha.get(daoju.getWuQi())!=null) {
		model.addAttribute("tejilenque", ha.get(daoju.getWuQi()));
		}
		if(ha.get(daoju.getFangJu())!=null) {
			model.addAttribute("tejifanglenque", ha.get(daoju.getFangJu()));
			}
		return "tanxian/miwusenlin/gongjihetaopao";

	}

	@RequestMapping(value = "/fadonggongji")
	public String fadonggongji(HttpServletRequest request, Model model) throws Exception {
		juesexinxi jueseshuxing = jiekou.chaxuehao(cunxuehao);
		int guaiwuxueliang = Integer.parseInt(cunguaiwu.getXueLiang()) - jueseshanghai;
		if (guaiwuxueliang > 0) {
			cunguaiwu.setXueLiang(Integer.toString(guaiwuxueliang));
			guaiwushanghai = Integer.parseInt(cunguaiwu.getGongJi()) - jueseshuxing.getFangYu();
			if (guaiwushanghai < 0) {
				guaiwushanghai = 0;
			}
			if(tejihua.equals("鳞甲")) {
			jueseshuxing.setFangYu(jueseshuxing.getFangYu()+16);
			jiekou.xiugai(jueseshuxing);
			cunxinxilei.jafang=1;
			wuyong yo=jiekou.chacao(cunxuehao);
			yo.setFangteJi("1");
			jiekou.xiucao(yo);
			}
			tejihua="";
			String a = cunguaiwu.getXingMing() + "发动攻击，对你造成" + guaiwushanghai + "点的伤害";
			cunxinxi = Arrays.copyOf(cunxinxi, cunxinxi.length + 1);
			cunxinxi[cunxinxi.length - 1] = a;
			cunsheng = new String[1];
			cunsheng[0] = a;
			gudingci = "怪物攻击";
			return "tanxian/miwusenlin/huancun";

		} else {
			tejihua="";
			cunsheng = new String[1];
			int wei = 0;
			String dabai = "你打败了" + cunguaiwu.getXingMing();
			cunsheng[wei++] = dabai;
			daibaixinxi = dabai;
			int jinqian = jueseshuxing.getJinQian() + Integer.parseInt(cunguaiwu.getJinQian());
			jueseshuxing.setJinQian(jinqian);
			String qian = "你获得了" + cunguaiwu.getJinQian() + "枚金钱";
			cunsheng = Arrays.copyOf(cunsheng, cunsheng.length + 1);
			cunsheng[wei++] = qian;
			int jingyan = jueseshuxing.getJingYan() + Integer.parseInt(cunguaiwu.getJingYan());
			String yan = "你获得了" + cunguaiwu.getJingYan() + "点经验";
			cunsheng = Arrays.copyOf(cunsheng, cunsheng.length + 1);
			cunsheng[wei++] = yan;
			int d = jueseshuxing.getDengJi();
			String de, xu, go, fa, su;
			while (jingyan >= ((d + 1) * 100)) {

				de = "你的等级提升了";
				cunsheng = Arrays.copyOf(cunsheng, cunsheng.length + 1);
				cunsheng[wei++] = de;
				d++;
				int x = (int) (Math.random() * 10 + 1);
				int g = (int) (Math.random() * 2+1);
				int f = (int) (Math.random() * 2+1);
				int s = (int) (Math.random() * 1+1);
				int xueliang = jueseshuxing.getXueliangMax() + x;

				xu = "血量和血量上限增加" + x + "点";
				cunsheng = Arrays.copyOf(cunsheng, cunsheng.length + 1);
				cunsheng[wei++] = xu;
				int xue = x + jueseshuxing.getXueLiang();
				int gongji = jueseshuxing.getGongJi() + g;

				go = "攻击力增加" + g + "点";
				cunsheng = Arrays.copyOf(cunsheng, cunsheng.length + 1);
				cunsheng[wei++] = go;
				int fangyu = jueseshuxing.getFangYu() + f;

				fa = "防御力增加" + f + "点";
				cunsheng = Arrays.copyOf(cunsheng, cunsheng.length + 1);
				cunsheng[wei++] = fa;
				int sudu = jueseshuxing.getSuDu() + s;

				su = "速度增加" + s + "点";
				cunsheng = Arrays.copyOf(cunsheng, cunsheng.length + 1);
				cunsheng[wei++] = su;
				jueseshuxing.setXueliangMax(xueliang);
				jueseshuxing.setXueLiang(xue);
				jueseshuxing.setGongJi(gongji);
				jueseshuxing.setFangYu(fangyu);
				jueseshuxing.setSuDu(sudu);
				jingyan = jingyan - (d * 100);

			}
			jueseshuxing.setDengJi(d);
			jueseshuxing.setJingYan(jingyan);
			jueseshuxing.setJingyanMax(100 + jueseshuxing.getDengJi() * 100);
			jiekou.xiugai(jueseshuxing);
			gudingci = "打败怪物";
			return "tanxian/miwusenlin/huancun";
		}

	}

	@RequestMapping(value = "/guaiwugongji")
	public String guaiwugongji(HttpServletRequest request, Model model) throws Exception {

		juesexinxi juesexuehaoshuju = jiekou.chaxuehao(cunxuehao);
		int xueliang = juesexuehaoshuju.getXueLiang() - guaiwushanghai;
		if (xueliang > 0) {
if(wulenque!=0) {
wulenque--;	
if(wulenque==0) {
	juesexuehaoshuju.setFangYu(juesexuehaoshuju.getFangYu()-16);
}
}
			juesexuehaoshuju.setXueLiang(xueliang);
			jiekou.xiugai(juesexuehaoshuju);
			gudingci = null;
			cunsheng = null;
			if(kai==0) {
		yong.tihuan();
			}
			if(kai==1) {
			kai=0;
		}
			return "tanxian/miwusenlin/huancun";
		} else {
			gudingci = "气绝了";

			String a = juesexuehaoshuju.getXingMing() + "气绝了";
			cunsheng = new String[1];
			cunsheng[0] = a;

			return "tanxian/miwusenlin/huancun";
		}

	}

	@RequestMapping(value = "/qijue")
	public String qijue(HttpServletRequest request, Model model) throws Exception {
		wuyong yo=jiekou.chacao(cunxuehao);
		if (jishiqi == 1) {
			jishiqi = 0;
			juesexinxi shuxing = jiekou.chaxuehao(cunxuehao);
			shuxing.setGongJi(shuxing.getGongJi() - 4);
			jiekou.xiugai(shuxing);
			yo.setLiWan("2");
			jiekou.xiucao(yo);

		}
		if(wulenque!=0) {
			wulenque=0;	
			juesexinxi juese=jiekou.chaxuehao(cunxuehao);
				juese.setFangYu(juese.getFangYu()-16);
				jiekou.xiugai(juese);
			yo.setFangteJi("2");
				jiekou.xiucao(yo);
			}
		cunxinxilei.cunli=0;
		cunxinxilei.jafang=0;
		cunxinxilei.guai="";
		model.addAttribute("cunxuehao", cunxuehao);
		return "shibaihuancun";

	}

	@RequestMapping(value = "/gongji")
	public String gongji(HttpServletRequest request, Model model) throws Exception {
		juesexinxi jueseshuxing = jiekou.chaxuehao(cunxuehao);
		jueseshanghai = jueseshuxing.getGongJi() - Integer.parseInt(cunguaiwu.getFangYu());
		if (jueseshanghai < 0) {
			jueseshanghai = 0;
		}
		String a = "你发动攻击，对" + cunguaiwu.getXingMing() + "造成" + jueseshanghai + "点的伤害";
		cunxinxi = Arrays.copyOf(cunxinxi, cunxinxi.length + 1);
		cunxinxi[cunxinxi.length - 1] = a;
		cunsheng = new String[1];
		cunsheng[0] = a;
		gudingci = "发动攻击";
		return "tanxian/miwusenlin/huancun";

	}
	@RequestMapping(value = "/teji")
	public String teji(HttpServletRequest request, Model model) throws Exception {
		juesexinxi jueseshuxing = jiekou.chaxuehao(cunxuehao);
		String wu = URLDecoder.decode(request.getParameter("teji"), "utf-8");
	if(wu.equals("闪光剑")) {
			yong.tejifadong(wu,jueseshuxing, cunguaiwu, cunxinxi);
			jueseshanghai=yong.xinxi.jueseshanghai;
			cunxinxi=yong.xinxi.cunxinxi;
			cunsheng=yong.xinxi.cunsheng;
			gudingci ="发动攻击";
			tejihua=wu;
			ha.put(tejihua,4);
			kai=1;
	}
	if(wu.equals("鳞甲")) {
		yong.tejifadong(wu,jueseshuxing, cunguaiwu, cunxinxi);
		wulenque=5;
		cunxinxi=yong.xinxi.cunxinxi;
		cunsheng=yong.xinxi.cunsheng;
		gudingci ="发动攻击";
		jueseshanghai=0;
		tejihua=wu;
		ha.put(tejihua,11);
		kai=1;
	}
		return "tanxian/miwusenlin/huancun";
		

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
		juese.setGongJi(juese.getGongJi()-pann.zhuang(de));
		jiekou.xiugai(juese);
		jiekou.xiugaidaozhuang(dz);
		}
		return "tanxian/miwusenlin/juehuan";

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
		juese.setFangYu(juese.getFangYu()-pann.zhuang(de));
		jiekou.xiugai(juese);
		jiekou.xiugaidaozhuang(dz);
		}
		
		return "tanxian/miwusenlin/juehuan";

	}

	@RequestMapping(value = "/huancun")
	public String huancun(HttpServletRequest request, Model model) throws Exception {
		model.addAttribute("pan", pan);
		model.addAttribute("cunsheng", cunsheng);
		model.addAttribute("gudingci", gudingci);
		if(wulenque!=0) {
			model.addAttribute("wulenque", wulenque);
		}
if(tejihua!="") {
	model.addAttribute("tejihua", tejihua);
	tejihua="";
}
if(wupin.equals("刺锥")) {
	model.addAttribute("wupin", wupin);
}
model.addAttribute("guaiwuming", ming);
		return "tanxian/"+du+"/juesevsguaiwu";

	}

	@RequestMapping(value = "/dabaiguaiwu")
	public String dabaiguaiwu(HttpServletRequest request, Model model) throws Exception {
		juesexinxi juese=jiekou.chaxuehao(cunxuehao);
		wuyong yo=jiekou.chacao(cunxuehao);
		if (jishiqi == 1) {
			jishiqi = 0;
			juesexinxi shuxing = jiekou.chaxuehao(cunxuehao);
			shuxing.setGongJi(shuxing.getGongJi() - 4);
			jiekou.xiugai(shuxing);
			yo.setLiWan("2");
			jiekou.xiucao(yo);

		}
		if(wulenque!=0) {
			wulenque=0;	
				juese.setFangYu(juese.getFangYu()-16);
				jiekou.xiugai(juese);
				yo.setFangteJi("2");
				jiekou.xiucao(yo);
			}
		if(cunxinxilei.guai.equals("闯荡者")) {
			model.addAttribute("guai", cunxinxilei.guai);
			
		}
		if(cunxinxilei.guai.equals("蜥蜴王")) {
			teshulei teshu=jiekou.chalu(cunxuehao);
			model.addAttribute("guai", cunxinxilei.guai);
			yong.panjia(cunxinxilei.guai, teshu, jiekou, dalu);
		}
		if(cunxinxilei.guai.equals("象精")) {
			teshulei teshu=jiekou.chalu(cunxuehao);
			model.addAttribute("guai", cunxinxilei.guai);
			yong.panjia(cunxinxilei.guai, teshu, jiekou, dalu);
		}
		if(cunxinxilei.guai.equals("魔王")) {
			teshulei teshu=jiekou.chalu(cunxuehao);
			model.addAttribute("guai", cunxinxilei.guai);
			yong.panjia(cunxinxilei.guai, teshu, jiekou, dalu);
		}
		if(cunxinxilei.guai.equals("黑商")) {
			model.addAttribute("guai", cunxinxilei.guai);
			
		}
		cunxinxilei.cunli=0;
		cunxinxilei.jafang=0;
		cunguai=cunxinxilei.guai;
		cunxinxilei.guai="";
		model.addAttribute("dabai", daibaixinxi);
		daibaixinxi=null;
		return "tanxian/"+du+"/daolu" + lu;

	}
	@RequestMapping(value = "/duibu")
	public String duibu(HttpServletRequest request, Model model) throws Exception {
if(cunguai.equals("闯荡者")) {
			diyi=2;
			String[] sh= {"对不起，你是我爸爸","我告诉你个秘密","道路10有个蜥蜴王","打败他你就可以得到一把很厉害的武器"};
			model.addAttribute("diyi",diyi);
			model.addAttribute("sh",sh);
			model.addAttribute("ren",cunguaiwu.getXingMing());
}
if(cunguai.equals("黑商")) {
	diyi=2;
String[] sh	= {"我是傻逼，我是傻逼","你是我爷爷","你就当我是个屁","给放了吧"};
model.addAttribute("diyi",diyi);
model.addAttribute("sh",sh);
model.addAttribute("ren",cunguaiwu.getXingMing());
}
			return "luren";
		
		

	}
	@RequestMapping(value = "/bosswuqi")
	public String bosswuqi(HttpServletRequest request, Model model) throws Exception {
		if(cunguai.equals("蜥蜴王")) {
		daojuhezhuangbei daoju = jiekou.chadaozhuang(cunxuehao);
			diyi=2;
			String[] sh= {"你的实力比我强","这是我的闪光剑","你就拿上它","去打魔王吧"};
	
				zhonglei="武器";
			yong.huode(daoju, jiekou,cunguai, zhonglei);
			
			model.addAttribute("diyi",diyi);
			model.addAttribute("sh",sh);
			model.addAttribute("ren",cunguai);
			
		}
		if(cunguai.equals("象精")) {
			daojuhezhuangbei daoju = jiekou.chadaozhuang(cunxuehao);
			diyi=2;
			String[] sh= {"你有能力可以打败魔王了","这是我的暗器刺锥","可以降低敌方30点防御","一定要对魔王使用","否则你会很难打赢魔王"};
			zhonglei="物品";
			yong.huode(daoju, jiekou, cunguai, zhonglei);
			model.addAttribute("diyi",diyi);
			model.addAttribute("sh",sh);
			model.addAttribute("ren",cunguai);
		}
		if(cunguai.equals("魔王")) {
			diyi=2;
			String[] sh= {"你很强","是我见过的冒险者中最强的一个","现在你可以去管理员模式了"};
			juesexinxi juese=jiekou.chaxuehao(cunxuehao);
			juese.setShiFou(2);
			jiekou.xiugai(juese);
			model.addAttribute("diyi",diyi);
			model.addAttribute("sh",sh);
			model.addAttribute("ren",cunguai);
		}
		return "luren";
		
		

	}


	@RequestMapping(value = "/taopao")
	public String taopao(HttpServletRequest request, Model model) throws Exception {
		juesexinxi juese = jiekou.chaxuehao(cunxuehao);
		if (juese.getSuDu() > Integer.parseInt(cunguaiwu.getSuDu())) {
			int cheng = (int) (Math.random() * 5 + 1);
			if (cheng == 4 || cheng == 5) {
				taopao = "逃跑失败";
				yong.taopao(juese, guaiwushanghai, cunguaiwu, cunxinxi, taopao);
				guaiwushanghai = yong.xinxi.guaiwushanghai;
				cunxinxi = yong.xinxi.cunxinxi;
				cunsheng = yong.xinxi.cunsheng;
			} else {
				taopao = "逃跑成功";
				yong.taopao(juese, guaiwushanghai, cunguaiwu, cunxinxi, taopao);

				cunsheng = yong.xinxi.cunsheng;

			}
			return "tanxian/miwusenlin/taopaohuancun";
		} else if (juese.getSuDu() < Integer.parseInt(cunguaiwu.getSuDu())) {
			int cheng = (int) (Math.random() * 5 + 1);
			if (cheng == 4 || cheng == 5) {
				taopao = "逃跑成功";
				yong.taopao(juese, guaiwushanghai, cunguaiwu, cunxinxi,taopao);

				cunsheng = yong.xinxi.cunsheng;

			} else {
				taopao = "逃跑失败";
				yong.taopao(juese, guaiwushanghai, cunguaiwu, cunxinxi, taopao);
				guaiwushanghai = yong.xinxi.guaiwushanghai;

				cunxinxi = yong.xinxi.cunxinxi;
				cunsheng = yong.xinxi.cunsheng;

			}
			return "tanxian/miwusenlin/taopaohuancun";
		} else {
			int cheng = (int) (Math.random() * 6 + 1);
			if (cheng == 4 || cheng == 5 || cheng == 6) {
				taopao = "逃跑成功";
				yong.taopao(juese, guaiwushanghai, cunguaiwu, cunxinxi, taopao);

				cunsheng = yong.xinxi.cunsheng;

			} else {
				taopao = "逃跑失败";
				yong.taopao(juese, guaiwushanghai, cunguaiwu, cunxinxi, taopao);
				guaiwushanghai = yong.xinxi.guaiwushanghai;

				cunxinxi = yong.xinxi.cunxinxi;
				cunsheng = yong.xinxi.cunsheng;

			}
			return "tanxian/miwusenlin/taopaohuancun";
		}
	}

	@RequestMapping(value = "/taopaohuancun")
	public String taopaohuancun(HttpServletRequest request, Model model) throws Exception {
		gudingci=taopao;
		if (taopao.equals("逃跑成功")) {
			
			cunxinxilei.guai="";
			return "tanxian/miwusenlin/huancun";
		}
		return "tanxian/miwusenlin/huancun";

	}
	@RequestMapping(value = "/taopaoshibai")
	public String taopaoshibai(HttpServletRequest request, Model model) throws Exception {
		String a = cunguaiwu.getXingMing() + "发动攻击，对你造成" + guaiwushanghai + "点的伤害";
		cunxinxi = Arrays.copyOf(cunxinxi, cunxinxi.length + 1);
		cunxinxi[cunxinxi.length - 1] = a;
		cunsheng = new String[1];
		cunsheng[0] = a;
		gudingci = "怪物攻击";
		return "tanxian/miwusenlin/huancun";

	}

	@RequestMapping(value = "/taopaochenggong")
	public String taopaochenggong(HttpServletRequest request, Model model) throws Exception {
		wuyong yo=jiekou.chacao(cunxuehao);
		if (jishiqi == 1) {
			jishiqi = 0;
			juesexinxi shuxing = jiekou.chaxuehao(cunxuehao);
			shuxing.setGongJi(shuxing.getGongJi() - 4);
			jiekou.xiugai(shuxing);
			yo.setLiWan(null);
			jiekou.xiucao(yo);

		}
		if(wulenque!=0) {
			wulenque=0;
			juesexinxi juese=jiekou.chaxuehao(cunxuehao);
				juese.setFangYu(juese.getFangYu()-16);
				jiekou.xiugai(juese);
				yo.setFangteJi(null);
				jiekou.xiucao(yo);
			}
		cunxinxilei.cunli=0;
		cunxinxilei.jafang=0;
		model.addAttribute("taopaocheng", taopao);
		taopao=null;
		return "tanxian/"+du+"/daolu" + lu;

	}

	@RequestMapping(value = "/guaiwushuxing")
	public String guaiwushuxing(HttpServletRequest request, Model model) throws Exception {
		model.addAttribute("guaiwuji", guaiwuji);
		model.addAttribute("guaiwushuxing", cunguaiwu);
		return "tanxian/miwusenlin/guaiwushuxing";

	}

	@RequestMapping(value = "/diaocha")
	public String diaocha(HttpServletRequest request, Model model) throws Exception {
		
		daojuhezhuangbei daoju = jiekou.chadaozhuang(cunxuehao);
		yong.diaocha(daoju,lu,dz,jiekou,dalu);
		jieguo=yong.xinxi.jieguo;
		return "tanxian/miwusenlin/diaochahuancun";

	}

	@RequestMapping(value = "/diaochahuancun")
	public String diaochahuancun(HttpServletRequest request, Model model) throws Exception {
		model.addAttribute("jieguo", jieguo);
		jieguo=null;
		return "tanxian/"+du+"/daolu" + lu;

	}

	@RequestMapping(value = "/luren")
	public String luren(HttpServletRequest request, Model model) throws Exception {
		
		ren = URLDecoder.decode(request.getParameter("ren"), "utf-8");
		teshulei teshu=jiekou.chalu(cunxuehao);
		yong.panren(ren, teshu, jiekou,dalu);
		diyi=yong.xinxi.diyi;
		return "lurenhuan";
		


	}
	@RequestMapping(value = "/lurenhuan")
	public String lurenhuan(HttpServletRequest request, Model model) throws Exception {
		model.addAttribute("diyi",diyi);
		model.addAttribute("ren",ren);
		model.addAttribute("cunxuehao",cunxuehao);
		model.addAttribute("dalu",dalu);
		return "luren";
		


	}

	@RequestMapping(value = "/wupinzong")
	public String wupinzong(HttpServletRequest request, Model model) throws Exception {
		return "tanxian/miwusenlin/wupinzong";

	}

	@RequestMapping(value = "/zhuangbeizong")
	public String zhuangbeizong(HttpServletRequest request, Model model) throws Exception {
		return "tanxian/miwusenlin/zhuangbeizong";

	}

	@RequestMapping(value = "/wupincaozuo")
	public String wupincaozuo(HttpServletRequest request, Model model) throws Exception {
		model.addAttribute("cunxuehao", cunxuehao);
		return "tanxian/miwusenlin/wupincaozuo";

	}

	@RequestMapping(value = "/zhuangbeicaozuo")
	public String zhuangbeicaozuo(HttpServletRequest request, Model model) throws Exception {
		model.addAttribute("cunxuehao", cunxuehao);
		return "tanxian/miwusenlin/zhuangbeicaozuo";

	}

	@RequestMapping(value = "/wupinneirong")
	public String wupinneirong(HttpServletRequest request, Model model) throws Exception {
		daojuhezhuangbei dz = jiekou.chadaozhuang(cunxuehao);
		if (dz.getDaoJ() != null) {
			String[] daoju = dz.getDaoJ().split("，");
			model.addAttribute("daoju", daoju);
			return "tanxian/miwusenlin/wupinneirong";
		} else {
			return "tanxian/miwusenlin/wupinneirong";
		}

	}

	@RequestMapping(value = "/zhuangbeineirong")
	public String zhuangbeineirong(HttpServletRequest request, Model model) throws Exception {
		daojuhezhuangbei dz = jiekou.chadaozhuang(cunxuehao);
		if (dz.getZhuangB() != null) {
			String[] daoju = dz.getZhuangB().split("，");
			model.addAttribute("daoju", daoju);
			return "tanxian/miwusenlin/zhuangbeineirong";
		} else {
			return "tanxian/miwusenlin/zhuangbeineirong";
		}

	}

	@RequestMapping(value = "/wupinshiyong")
	public String wupinshiyong(HttpServletRequest request, Model model) throws Exception {
		juesexinxi shuxing = jiekou.chaxuehao(cunxuehao);
		daojuhezhuangbei dz = jiekou.chadaozhuang(cunxuehao);
		if (wupin.equals("草药") || wupin.equals("血药")|| wupin.equals("大补药")||wupin.equals("小补药")||wupin.equals("灵芝")||wupin.equals("人参")) {
			zhonglei = "加血量";
			yong.wupin(jiekou, wupin, weizhi, shuxing, dz, zhonglei, st);
		}
		if(wupin.equals("刺锥")) {
			zhonglei="给降防御";
			cunxinxilei.guaifangyu=Integer.parseInt(cunguaiwu.getFangYu());
			yong.wupin(jiekou, wupin, weizhi, shuxing, dz, zhonglei, st);
			cunguaiwu.setFangYu(Integer.toString(cunxinxilei.guaifangyu));
			wupin="";
int xueliang=Integer.parseInt(cunguaiwu.getXueLiang())-yong.xinxi.jueseshanghai;
if(xueliang<0) {
	yong.dabaiguaiwu(cunsheng, shuxing, cunguaiwu, jiekou);
	cunsheng = yong.xinxi.cunsheng;
	gudingci = "打败怪物";
	return "tanxian/miwusenlin/huancun";
}
cunguaiwu.setXueLiang(Integer.toString(xueliang));
		}
		if (wupin.equals("力丸")) {
			zh = "战斗内";
			yong.teshu(jiekou, wupin, weizhi, shuxing, dz, st, zh);
			jishiqi = yong.xinxi.jishiqi;
cunxinxilei.cunli=1;
wuyong yo=jiekou.chacao(cunxuehao);
yo.setLiWan("1");
jiekou.xiucao(yo);
		}
		String a = cunguaiwu.getXingMing() + "发动攻击，对你造成" + guaiwushanghai + "点的伤害";

		cunxinxi = Arrays.copyOf(cunxinxi, cunxinxi.length + 1);
		cunxinxi[cunxinxi.length - 1] = a;
		cunsheng = new String[1];
		cunsheng[0] = a;
		gudingci = "怪物攻击";

		return "tanxian/miwusenlin/huancun";

	}

	@RequestMapping({ "/shiyong" })
	public String shiyong(HttpServletRequest request, Model model) throws Exception {
		st = "";
		wupin = URLDecoder.decode(request.getParameter("wupin"), "utf-8");
		weizhi = Integer.parseInt(request.getParameter("weizhi"));
		juesexinxi shuxing = jiekou.chaxuehao(cunxuehao);
		if (wupin.equals("草药") || wupin.equals("血药")||wupin.equals("大补药")||wupin.equals("小补药")||wupin.equals("灵芝")||wupin.equals("人参")) {
			zhonglei = "加血量";
			yong.zhandoushiyong(zhonglei, cunguaiwu, shuxing, wupin, cunxinxi);
			guaiwushanghai = yong.xinxi.guaiwushanghai;

			cunxinxi = yong.xinxi.cunxinxi;
			cunsheng = yong.xinxi.cunsheng;
			gudingci = wupin;
		}
		if(wupin.equals("刺锥")) {
			zhonglei="给降防御";
			yong.zhandoushiyong(zhonglei,  cunguaiwu, shuxing, wupin, cunxinxi);
			guaiwushanghai = yong.xinxi.guaiwushanghai;
			cunxinxi = yong.xinxi.cunxinxi;
			cunsheng = yong.xinxi.cunsheng;
			gudingci = wupin;
		}

		if (wupin.equals("力丸")) {
			zh = "战斗内";
			yong.zhandouteshu(zh, cunguaiwu, shuxing, wupin, cunxinxi);
			guaiwushanghai = yong.xinxi.guaiwushanghai;

			cunxinxi = yong.xinxi.cunxinxi;
			cunsheng = yong.xinxi.cunsheng;
			gudingci = wupin;
		}

		return "tanxian/miwusenlin/huancun";
	}

	@RequestMapping(value = "/wupinzhuangbei")
	public String wupinzhuangbei(HttpServletRequest request, Model model) throws Exception {
		daojuhezhuangbei dz = jiekou.chadaozhuang(cunxuehao);
		juesexinxi shuxing = jiekou.chaxuehao(cunxuehao);
		if (zhuangbei.equals("匕首") || zhuangbei.equals("大剑")||zhuangbei.equals("闪光剑")||zhuangbei.equals("小剑")||zhuangbei.equals("铁剑")||zhuangbei.equals("刺剑")) {
			zhonglei = "装备武器";
			yong.zhuangbei(jiekou, zhuangbei, weizhi, shuxing, dz, zhonglei, st);

		}

		if (zhuangbei.equals("铜甲") || zhuangbei.equals("铁甲")||zhuangbei.equals("金甲")||zhuangbei.equals("鳞甲")||zhuangbei.equals("板甲")||zhuangbei.equals("精铁甲")||zhuangbei.equals("秘银甲")) {
			zhonglei = "装备防具";
			yong.zhuangbei(jiekou, zhuangbei, weizhi, shuxing, dz, zhonglei, st);
			guaiwushanghai = guaiwushanghai - yong.xinxi.cun;
			if(guaiwushanghai<=0) {
				guaiwushanghai=0;
			}
		}
		String a = cunguaiwu.getXingMing() + "发动攻击，对你造成" + guaiwushanghai + "点的伤害";

		cunxinxi = Arrays.copyOf(cunxinxi, cunxinxi.length + 1);
		cunxinxi[cunxinxi.length - 1] = a;
		cunsheng = new String[1];
		cunsheng[0] = a;
		gudingci = "怪物攻击";

		return "tanxian/miwusenlin/huancun";

	}

	@RequestMapping({ "/zhuangbei" })
	public String zhuangbei(HttpServletRequest request, Model model) throws Exception {
		daojuhezhuangbei dz = jiekou.chadaozhuang(cunxuehao);
		st = "";
		zhuangbei = URLDecoder.decode(request.getParameter("zhuangbei"), "utf-8");
		weizhi = Integer.parseInt(request.getParameter("weizhi"));
		juesexinxi shuxing = jiekou.chaxuehao(cunxuehao);
		if (zhuangbei.equals("匕首") || zhuangbei.equals("大剑")||zhuangbei.equals("闪光剑")||zhuangbei.equals("小剑")||zhuangbei.equals("铁剑")||zhuangbei.equals("刺剑")) {
			zhonglei = "装备武器";
			yong.zhandouzhuangbei(dz, zhonglei,  cunguaiwu, shuxing, zhuangbei, cunxinxi);
			guaiwushanghai = yong.xinxi.guaiwushanghai;

			cunxinxi = yong.xinxi.cunxinxi;
			cunsheng = yong.xinxi.cunsheng;
			gudingci = zhuangbei;

		}
		if (zhuangbei.equals("铜甲") || zhuangbei.equals("铁甲")||zhuangbei.equals("金甲")||zhuangbei.equals("鳞甲")||zhuangbei.equals("板甲")||zhuangbei.equals("精铁甲")||zhuangbei.equals("秘银甲")) {
			zhonglei = "装备防具";
			yong.zhandouzhuangbei(dz, zhonglei,  cunguaiwu, shuxing, zhuangbei, cunxinxi);
			guaiwushanghai = yong.xinxi.guaiwushanghai;

			cunxinxi = yong.xinxi.cunxinxi;
			cunsheng = yong.xinxi.cunsheng;
			gudingci = zhuangbei;

		}

		return "tanxian/miwusenlin/huancun";

	}
	@RequestMapping(value = "/cuntu1", method = RequestMethod.POST,produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String cuntu1(HttpServletRequest request, Model model) throws Exception {
		String tuu=request.getParameter("tu");
		tupian pian=jiekou.chatu(cunxuehao);
		pian.setTuYi(tuu);
		System.out.println(pian.getTuYi());
		System.out.println(22222222);
		System.out.println(pian);
		jiekou.xiutu1(pian);
		String sto="存成功";
		return sto;

	}
	@RequestMapping(value = "/cuntu2", method = RequestMethod.POST,produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String cunt2(HttpServletRequest request, Model model) throws Exception {
		String tuu=request.getParameter("tu");
		tupian pian=jiekou.chatu(cunxuehao);
		pian.setTuEr(tuu);
		System.out.println(111111);
		System.out.println(pian);
		jiekou.xiutu(pian);
		String sto="存成功";
		return sto;

	}
	@RequestMapping(value = "/cuntu3", method = RequestMethod.POST,produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String cunt3(HttpServletRequest request, Model model) throws Exception {

		tupian pian=jiekou.chatu(cunxuehao);
		return pian.getTuYi();
	
		
	}
	@RequestMapping(value = "/cuntu4", method = RequestMethod.POST,produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String cunt4(HttpServletRequest request, Model model) throws Exception {

		tupian pian=jiekou.chatu(cunxuehao);
		return pian.getTuEr();
	
		
	}
	@RequestMapping(value = "/cuntu5", method = RequestMethod.POST,produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String cuntu5(HttpServletRequest request, Model model) throws Exception {
		String tuu=request.getParameter("tu");
		tupian pian=jiekou.chatu(cunxuehao);
		pian.setTuYi(tuu);
		jiekou.xiutu(pian);
		String sto="存成功";
		return sto;

	}
	

}

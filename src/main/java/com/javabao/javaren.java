package com.javabao;

import com.diaoshujukujiekoubao.diaojiekou;
import com.wdbao.daojuhezhuangbei;
import com.wdbao.juesexinxi;
import com.wdbao.teshulei;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.net.URLDecoder;

@Controller
@RequestMapping({ "/ren" })
public class javaren {
	@Resource
	diaojiekou jiekou;
	int yunxingyici=1;
	String cunxuehao="";
	String st="";
	String[] sh=null;
	String bu=null;
	String name=null;
	String dalu=null;
	yongwupinhezhuangbei yong = new yongwupinhezhuangbei();
	@RequestMapping(value = "/yuanyi")
	public String yuanyi(HttpServletRequest request, Model model) throws Exception {
		if (yunxingyici == 1) {
			String xuehao = request.getParameter("cunxuehao");
			cunxuehao = xuehao;
			yunxingyici++;
		}
		daojuhezhuangbei ss=jiekou.chadaozhuang(cunxuehao);
		name = URLDecoder.decode(request.getParameter("name"), "utf-8");
		dalu = URLDecoder.decode(request.getParameter("dalu"), "utf-8");
		if(name.equals("闯荡者")) {
			bu="愿意";
			String wupin="物品";
			yong.pansheng(name, ss, jiekou, wupin,st);
			sh=yong.xinxi.k;
			if(yong.xinxi.shifouyou==0) {
				
				bu="没有";
			}else {
				teshulei teshu=jiekou.chalu(cunxuehao);
				yong.panjia(name,teshu,jiekou,dalu);
			}
			yong.xinxi.shifouyou=0;
		}
		if(name.equals("黑商")) {
			
			String wupin="鳞甲";
			juesexinxi juese=jiekou.chaxuehao(cunxuehao);
			yong.goumai(name,wupin,jiekou,ss,juese);
			bu= cunxinxilei.mai;
            if(yong.xinxi.shifouyou==1) {
				teshulei teshu=jiekou.chalu(cunxuehao);
				yong.panjia(name,teshu,jiekou,dalu);
				yong.xinxi.shifouyou=0;
			}
		}
		return "shengyuhuancun";
	
		
	}
	@RequestMapping(value = "/buyuanyi")
	public String buyuanyi(HttpServletRequest request, Model model) throws Exception {
		if (yunxingyici == 1) {
			String xuehao = request.getParameter("cunxuehao");
			cunxuehao = xuehao;
			yunxingyici++;
		}
		name = URLDecoder.decode(request.getParameter("name"), "utf-8");
		if(name.equals("闯荡者")) {
			bu="不愿意";
			
			
		}
		if(name.equals("黑商")) {
			bu="不购买";
			
			
		}
		return "shengyuhuancun";
		
	}
	@RequestMapping(value = "/shengyuhuan")
	public String shengyuhuan(HttpServletRequest request, Model model) throws Exception {
		model.addAttribute("sh",sh);
		model.addAttribute("bu",bu);
		model.addAttribute("name",name);
		return "shengyu";
		
	}
	@RequestMapping(value = "/zhunda")
	public String zhunda(HttpServletRequest request, Model model) throws Exception {
		String name = URLDecoder.decode(request.getParameter("kk"), "utf-8");
	cunxinxilei.guai=name;
	model.addAttribute("ren",name);
		return "zhundahuancun";
		
	}
}

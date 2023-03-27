package com.javabao;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import com.diaoshujukujiekoubao.diaojiekou;
import com.wdbao.juesexinxi;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping({ "/shengmocuncunkou" })
public class javashengmocuncunkou {
	@Resource
	diaojiekou jiekou;
	int yunxingyici = 1;
	String cunxuehao = "";
	String zh=null;
	String meiyoujuese=null;
	String jueseyichuangjian=null;
	@RequestMapping(value = "/huancun")
	public String huancun(HttpServletRequest request, Model model) throws Exception {
		if(zh.equals("请先创建角色")) {
			model.addAttribute("meiyoujuese", meiyoujuese);
		}
		if(zh.equals("角色已经创建了")) {
			model.addAttribute("jueseyichuangjian", jueseyichuangjian);
		}
		if(zh.equals("你还没有打败魔王")) {
			model.addAttribute("meida", zh);
		}
	
		return "shengmocuncunkou/shengmocuncunkou";
	}
	@RequestMapping(value = "/tanxiandalu", method = RequestMethod.POST)
	public String tanxiandalu(HttpServletRequest request, Model model) throws Exception {
		if (yunxingyici == 1) {
			String xuehao = request.getParameter("xuehao");
			cunxuehao = xuehao;
			yunxingyici++;
		}
		juesexinxi lei = jiekou.chaxuehao(cunxuehao);
		if (lei.getShiFou() == 0) {
			meiyoujuese = "请先创建角色";
			zh=meiyoujuese;
			return "shengmocuncunkou/huancun";
		} else {
			System.out.println("欢迎来到圣魔村村外");
			model.addAttribute("xuehao", cunxuehao);
			return "tanxian/zongkuang";
		}
	}

	@RequestMapping(value = "/cunzhuang", method = RequestMethod.POST)
	public String cunzhuang(HttpServletRequest request, Model model) throws Exception {
		if (yunxingyici == 1) {
			String xuehao = request.getParameter("xuehao");
			cunxuehao = xuehao;
			yunxingyici++;
		}
		juesexinxi lei = jiekou.chaxuehao(cunxuehao);
		if (lei.getShiFou() == 0) {
			meiyoujuese = "请先创建角色";
		zh=meiyoujuese;
			return "shengmocuncunkou/huancun";
		} else {
			System.out.println("欢迎来到圣魔村");
			model.addAttribute("xuehao", cunxuehao);
			return "cunzhuang/cunzong";
		}

	}

	@RequestMapping(value = "/chuangjianjuese", method = RequestMethod.POST)
	public String chuangjianjuese(HttpServletRequest request, Model model) throws Exception {
		if (yunxingyici == 1) {
			String xuehao = request.getParameter("xuehao");
			cunxuehao = xuehao;
			yunxingyici++;
		}
		juesexinxi lei = jiekou.chaxuehao(cunxuehao);
		if (lei.getShiFou() == 1||lei.getShiFou()==2) {

			jueseyichuangjian = "角色已经创建了";
			zh=jueseyichuangjian;
			return "shengmocuncunkou/huancun";
		} else {
			model.addAttribute("xuehao", cunxuehao);
			return "chuangjianjuese/zongkuang";
		}

	}

	@RequestMapping(value = "/guanliyuanmoshi", method = RequestMethod.POST)
	public String guanliyuanmoshi(HttpServletRequest request, Model model) throws Exception {
		if (yunxingyici == 1) {
			String xuehao = request.getParameter("xuehao");
			cunxuehao = xuehao;
			yunxingyici++;
		}
		juesexinxi lei = jiekou.chaxuehao(cunxuehao);
		if (lei.getShiFou() ==2) {

		System.out.println("欢迎来到管理员模式");
		return "guanliyuanmoshi/zongkuang";
		}else {
			zh="你还没有打败魔王";
			return "shengmocuncunkou/huancun";
		}

	}
}

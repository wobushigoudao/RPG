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
@RequestMapping({ "/dengluhezhuce" })
public class javadengluhezhuce {
	@Resource
	diaojiekou jiekou;
	String zhucechenggong=null;
	String zhu=null;
	String yizhucexuehao=null;
	String mimacuowu=null;
	String meiyouzhanghao=null;
	String cunxuehao=null;
	@RequestMapping(value = "/denglu")
	public String denglu(HttpServletRequest request, Model model) throws Exception {
		request.setCharacterEncoding("utf-8");
		String xuehao = request.getParameter("xuehao");
		juesexinxi lei = jiekou.chaxuehao(xuehao);

		if (lei != null) {
			String mima = request.getParameter("mima");
			if (mima.equals(lei.getMiMa())) {
				System.out.println("欢迎来到圣魔大陆，这里是圣魔村村口");
				cunxuehao=xuehao;
				zhu="村口";
				return "dengluhezhuce/huancun";

			} else {
				mimacuowu = "您的密码错误";
				zhu=mimacuowu;
				
				return "dengluhezhuce/huancun";
			}

		} else {
			meiyouzhanghao = "没有该账号";
			zhu=meiyouzhanghao;
			return "dengluhezhuce/huancun";
		}

	}

	@RequestMapping(value = "/zhucezhanghao", method = RequestMethod.POST)
	public String zhucezhanghao(HttpServletRequest request, Model model) throws Exception {
        zhu="到注册";
		return "dengluhezhuce/huancun";

	}

	@RequestMapping(value = "/zhuce", method = RequestMethod.POST)
	public String zhuce(HttpServletRequest request, Model model) throws Exception {
		request.setCharacterEncoding("utf-8");
		String xuehao = request.getParameter("xuehao");

		juesexinxi lei = jiekou.chaxuehao(xuehao);
		if (lei == null) {
			String mima = request.getParameter("mima");
			juesexinxi wd = new juesexinxi();
			wd.setXueHao(xuehao);
			wd.setMiMa(mima);
			wd.setShiFou(0);
			jiekou.zhuce(wd);
			zhucechenggong = "注册成功";
			zhu="";
			return "dengluhezhuce/huancun";

		} else {
			yizhucexuehao = "该学号已注册";
			zhu=yizhucexuehao;
			return "dengluhezhuce/huancun";
		}

	}

	@RequestMapping(value = "/fanhuitanxianwang", method = RequestMethod.POST)
	public String fanhuitanxianwang(HttpServletRequest request, Model model) throws Exception {
		zhu="返回探险网";
		return "dengluhezhuce/huancun";

	}
	@RequestMapping(value = "/huancun")
	public String huancun(HttpServletRequest request, Model model) throws Exception {
		if(zhu.equals("到注册")) {
			return "dengluhezhuce/zhuce";
		}
		if(zhu.equals("该学号已注册")) {
			
			model.addAttribute("yizhucexuehao", yizhucexuehao);
			return "dengluhezhuce/zhuce";
		}
		if(zhu.equals("返回探险网")) {
			return "dengluhezhuce/denglu";
		}
		if(zhu.equals("您的密码错误")) {
			model.addAttribute("mimacuowu", mimacuowu);
			return "dengluhezhuce/denglu";
		}
		 
		if(zhu.equals("没有该账号")) {
			model.addAttribute("meiyouzhanghao", meiyouzhanghao);
			return "dengluhezhuce/denglu";
		}
		if(zhu.equals("村口")) {
			model.addAttribute("xuehao", cunxuehao);
			return "shengmocuncunkou/shengmocuncunkou";
		}
		model.addAttribute("zhucechenggong", zhucechenggong);
		return "dengluhezhuce/denglu";

	}

}

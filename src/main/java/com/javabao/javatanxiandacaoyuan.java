package com.javabao;



import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import com.diaoshujukujiekoubao.diaojiekou;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping({ "/tanxian/dacaoyuan" })
public class javatanxiandacaoyuan {
	@Resource
	diaojiekou jiekou;
	String cunxuehao = "";
	int yunxingyici = 1;
	@RequestMapping(value = "/dacao")
	public String daomiwu(HttpServletRequest request, Model model) throws Exception {
		if (yunxingyici == 1) {
			String xuehao = request.getParameter("xuehao");
			cunxuehao = xuehao;
			yunxingyici++;
		}
		model.addAttribute("cunxuehao", cunxuehao);
		System.out.println("进入了大草原，请务必小心");
		return "tanxian/dacaoyuan/dacao";

	}

}
package com.javabao;

import java.net.URLDecoder;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.diaoshujukujiekoubao.diaojiekou;
import com.wdbao.guaiwushuxing;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({ "/guanliyuanmoshi" })
public class javaguanliyuanmoshi {
	@Resource
	diaojiekou jiekou;
String iid="";
	int cunsuiji = 0;
	String zuihouyiye = "最后一页";
	List<guaiwushuxing> ju=null;
			String ku=null;
			int u=0;
	@RequestMapping(value = "/guaiwubiao")
	public String guaiwubiao(HttpServletRequest request, Model model) throws Exception {
		request.setCharacterEncoding("utf-8");
		List<guaiwushuxing> suoyouguaiwubiaoshuju = jiekou.chasuoyouguaiwu();
		if (suoyouguaiwubiaoshuju.size() != 0) {
			List<guaiwushuxing> guaiwubiaoshuju = jiekou.chaguaiwubiao(cunsuiji);
			int suo = suoyouguaiwubiaoshuju.size();
			int su = guaiwubiaoshuju.size();
			int s = cunsuiji + 5;
			boolean pan = false;
			if (su < 5) {
				pan = true;

				request.setAttribute("zuihouyiye", zuihouyiye);
			}
			if (suo == s) {
				pan = true;

				request.setAttribute("zuihouyiye", zuihouyiye);
			}
			int xianshi = cunsuiji / 5 + 1;
			if (pan == false) {

				System.out.println("欢迎来到第" + xianshi + "页");
			} else {
				System.out.println("欢迎来到最后一页，即第" + xianshi + "页");
			}
			model.addAttribute("guaiwubiaoshuju", guaiwubiaoshuju);

			return "guanliyuanmoshi/guaiwubiao";
		} else {

			return "guanliyuanmoshi/huancunfanhuishengmocuncunkou";
		}
	}

	@RequestMapping(value = "/huancunfanhuishengmocuncunkou")
	public String huancunfanhuishengmocuncunkou(HttpServletRequest request, Model model) throws Exception {
		String meiyouguaiwu = "管理员模式里，怪物表没有怪物";

		model.addAttribute("meiyouguaiwu", meiyouguaiwu);
		return "shengmocuncunkou/shengmocuncunkou";
	}

	@RequestMapping(value = "/shangxiaye")
	public String shangxiaye(HttpServletRequest request, Model model) throws Exception {
		System.out.println(request.getParameter("zuihouyiye"));
		String zuihouyiye = URLDecoder.decode(request.getParameter("zuihouyiye"), "utf-8");
		model.addAttribute("zuihouyiye", zuihouyiye);
		model.addAttribute("cunsuiji", cunsuiji);
		return "guanliyuanmoshi/shangxiaye";
	}

	@RequestMapping(value = "/shangyiye")
	public String shangyiye(HttpServletRequest request, Model model) throws Exception {

		cunsuiji -= 5;
		return "guanliyuanmoshi/huancunshangyiye";

	}

	@RequestMapping(value = "/huancunshangyiye")
	public String huancunshangyiye(HttpServletRequest request, Model model) throws Exception {
		request.setCharacterEncoding("utf-8");

		List<guaiwushuxing> guaiwubiaoshuju = jiekou.chaguaiwubiao(cunsuiji);

		int xianshi = cunsuiji / 5 + 1;

		System.out.println("欢迎来到第" + xianshi + "页");
		model.addAttribute("guaiwubiaoshuju", guaiwubiaoshuju);

		return "guanliyuanmoshi/guaiwubiao";

	}

	@RequestMapping(value = "/xiayiye")
	public String xiayiye(HttpServletRequest request, Model model) throws Exception {
		request.setCharacterEncoding("utf-8");

		cunsuiji += 5;

		return "guanliyuanmoshi/huancunxiayiye";

	}

	@RequestMapping(value = "/huancunxiayiye")
	public String huancunxiayiye(HttpServletRequest request, Model model) throws Exception {
		request.setCharacterEncoding("utf-8");

		List<guaiwushuxing> suoyouguaiwubiaoshuju = jiekou.chasuoyouguaiwu();

		List<guaiwushuxing> guaiwubiaoshuju = jiekou.chaguaiwubiao(cunsuiji);

		int suo = suoyouguaiwubiaoshuju.size();
		int su = guaiwubiaoshuju.size();
		int s = cunsuiji + 5;
		boolean pan = false;

		if (su < 5) {
			pan = true;

			request.setAttribute("zuihouyiye", zuihouyiye);
		}
		if (suo == s) {
			pan = true;

			request.setAttribute("zuihouyiye", zuihouyiye);
		}
		int xianshi = cunsuiji / 5 + 1;
		if (pan == false) {

			System.out.println("欢迎来到第" + xianshi + "页");
		} else {
			System.out.println("欢迎来到最后一页，即第" + xianshi + "页");
		}
		model.addAttribute("guaiwubiaoshuju", guaiwubiaoshuju);
		return "guanliyuanmoshi/guaiwubiao";

	}

	@RequestMapping(value = "/xiugaijiemian")
	public String xiugaijiemian(HttpServletRequest request, HttpSession session, Model model) throws Exception {
		request.setCharacterEncoding("utf-8");

		String id = request.getParameter("id");
iid=id;
		guaiwushuxing guaiwuidshuju = jiekou.chaguaiwuid(id);

		model.addAttribute("guaiwuidshuju", guaiwuidshuju);

		return "guanliyuanmoshi/xiugaiguaiwu";

	}

	@RequestMapping(value = "/xiugaixiuxian")
	public String xiugaixiuxian(HttpServletRequest request, Model model) throws Exception {

		return "guanliyuanmoshi/xiugaixiuxian";

	}

	@RequestMapping(value = "/xiugaicaozuo")
	public String xiugaicaozuo(HttpServletRequest request, Model model) throws Exception {

		return "guanliyuanmoshi/xiugaicaozuo";

	}

	@RequestMapping(value = "/xiugai")
	public String xiugai(HttpServletRequest request, Model model) throws Exception {
		request.setCharacterEncoding("utf-8");
		String id =iid;
		guaiwushuxing gua=jiekou.chaguaiwuid(id);
		String xingming = gua.getXingMing();
		String xueliang = request.getParameter("xueliang");
		String gongji = request.getParameter("gongji");
		String fangyu = request.getParameter("fangyu");
		String sudu = request.getParameter("sudu");
		String jinqian = request.getParameter("jinqian");
		String jingyan = request.getParameter("jingyan");
		guaiwushuxing guaiwushuju = new guaiwushuxing();
		guaiwushuju.setiD(id);
		guaiwushuju.setXingMing(xingming);
		guaiwushuju.setXueLiang(xueliang);
		guaiwushuju.setGongJi(gongji);
		guaiwushuju.setFangYu(fangyu);
		guaiwushuju.setSuDu(sudu);
		guaiwushuju.setJinQian(jinqian);
		guaiwushuju.setJingYan(jingyan);
		jiekou.xiugaiguaiwu(guaiwushuju);

		List<guaiwushuxing> guaiwubiaoshuju = jiekou.chaguaiwubiao(cunsuiji);
		List<guaiwushuxing> suoyouguaiwubiaoshuju = jiekou.chasuoyouguaiwu();

		int suo = suoyouguaiwubiaoshuju.size();
		int su = guaiwubiaoshuju.size();
		int s = cunsuiji + 5;
		boolean pan = false;
		if (su < 5) {
			pan = true;

			request.setAttribute("zuihouyiye", zuihouyiye);
		}
		if (suo == s) {
			pan = true;

			request.setAttribute("zuihouyiye", zuihouyiye);
		}
		int xianshi = cunsuiji / 5 + 1;
		if (pan == false) {

			System.out.println("欢迎来到第" + xianshi + "页");
		} else {
			System.out.println("欢迎来到最后一页，即第" + xianshi + "页");
		}
		String zhongjiankuang = "修改怪物成功";
		model.addAttribute("guaiwubiaoshuju", guaiwubiaoshuju);
		model.addAttribute("zhongjiankuang", zhongjiankuang);

		return "guanliyuanmoshi/guaiwubiao";

	}

	@RequestMapping(value = "/xiugaifanhuiguaiwubiao")
	public String xiugaifanhuiguaiwubiao(HttpServletRequest request, Model model) throws Exception {
		request.setCharacterEncoding("utf-8");

		List<guaiwushuxing> guaiwubiaoshuju = jiekou.chaguaiwubiao(cunsuiji);
		List<guaiwushuxing> suoyouguaiwubiaoshuju = jiekou.chasuoyouguaiwu();

		int suo = suoyouguaiwubiaoshuju.size();
		int su = guaiwubiaoshuju.size();
		int s = cunsuiji + 5;
		boolean pan = false;
		if (su < 5) {
			pan = true;

			request.setAttribute("zuihouyiye", zuihouyiye);
		}
		if (suo == s) {
			pan = true;

			request.setAttribute("zuihouyiye", zuihouyiye);
		}
		int xianshi = cunsuiji / 5 + 1;
		if (pan == false) {

			System.out.println("欢迎来到第" + xianshi + "页");
		} else {
			System.out.println("欢迎来到最后一页，即第" + xianshi + "页");
		}
		model.addAttribute("guaiwubiaoshuju", guaiwubiaoshuju);

		return "guanliyuanmoshi/guaiwubiao";

	}

	@RequestMapping(value = "/shanchu")
	public String shanchu(HttpServletRequest request, Model model) throws Exception {
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");

		jiekou.shanchuguaiwu(id);

		List<guaiwushuxing> guaiwubiaoshuju1 = jiekou.chaguaiwubiao(cunsuiji);

		int u = guaiwubiaoshuju1.size();
		if (u != 0) {
			List<guaiwushuxing> suoyouguaiwubiaoshuju = jiekou.chasuoyouguaiwu();

			int suo = suoyouguaiwubiaoshuju.size();
			int su = guaiwubiaoshuju1.size();
			int s = cunsuiji + 5;
			boolean pan = false;
			if (su < 5) {
				pan = true;

				request.setAttribute("zuihouyiye", zuihouyiye);
			}
			if (suo == s) {
				pan = true;

				request.setAttribute("zuihouyiye", zuihouyiye);
			}
			int xianshi = cunsuiji / 5 + 1;
			if (pan == false) {

				System.out.println("欢迎来到第" + xianshi + "页");
			} else {
				System.out.println("欢迎来到最后一页，即第" + xianshi + "页");
			}
			String zhongjiankuang = "删除怪物成功";
			model.addAttribute("guaiwubiaoshuju", guaiwubiaoshuju1);
			model.addAttribute("zhongjiankuang", zhongjiankuang);

			return "guanliyuanmoshi/guaiwubiao";

		} else {
			cunsuiji -= 5;
			List<guaiwushuxing> guaiwubiaoshuju2 = jiekou.chaguaiwubiao(cunsuiji);
			List<guaiwushuxing> suoyouguaiwubiaoshuju = jiekou.chasuoyouguaiwu();

			int suo = suoyouguaiwubiaoshuju.size();
			int su = guaiwubiaoshuju2.size();
			int s = cunsuiji + 5;
			boolean pan = false;
			if (su < 5) {
				pan = true;

				request.setAttribute("zuihouyiye", zuihouyiye);
			}
			if (suo == s) {
				pan = true;

				request.setAttribute("zuihouyiye", zuihouyiye);
			}
			int xianshi = cunsuiji / 5 + 1;
			if (pan == false) {

				System.out.println("欢迎来到第" + xianshi + "页");
			} else {
				System.out.println("欢迎来到最后一页，即第" + xianshi + "页");
			}
			String zhongjiankuang = "删除怪物成功";
			model.addAttribute("guaiwubiaoshuju", guaiwubiaoshuju2);
			model.addAttribute("zhongjiankuang", zhongjiankuang);

			return "guanliyuanmoshi/guaiwubiao";

		}

	}

	@RequestMapping(value = "/tianjiahefanhuishengmocuncunkou")
	public String tianjiahefanhuishengmocuncunkou(HttpServletRequest request, Model model) throws Exception {

		return "guanliyuanmoshi/tianjiahefanhuishengmocuncunkou";
	}

	@RequestMapping(value = "/tianjiajiemian")
	public String tianjiajiemian(HttpServletRequest request, Model model) throws Exception {

		return "guanliyuanmoshi/tianjiaguaiwu";

	}

	@RequestMapping(value = "/tianjiaxiuxian")
	public String tianjiaxiuxian(HttpServletRequest request, Model model) throws Exception {

		return "guanliyuanmoshi/tianjiaxiuxian";

	}

	@RequestMapping(value = "/tianjiacaozuo")
	public String tianjiacaozuo(HttpServletRequest request, Model model) throws Exception {

		return "guanliyuanmoshi/tianjiacaozuo";

	}
	@RequestMapping(value = "/yanzheng", method = RequestMethod.POST)
	@ResponseBody
	public String yanzheng(HttpServletRequest request, Model model) throws Exception {
		String id=request.getParameter("id");
guaiwushuxing guaiwu=jiekou.chaguaiwuid(id);
String l="";
if(guaiwu!=null) {
	l="yes";
}else {
	l="no";
}
		return l;

	}


	@RequestMapping(value = "/tianjia")
	public String tianjia(HttpServletRequest request, Model model) throws Exception {
		request.setCharacterEncoding("utf-8");

		String id = request.getParameter("id");
		String xingming = URLDecoder.decode(request.getParameter("xingming"), "utf-8");
		String xueliang = request.getParameter("xueliang");
		String gongji = request.getParameter("gongji");
		String fangyu = request.getParameter("fangyu");
		String sudu = request.getParameter("sudu");
		String jinqian = request.getParameter("jinqian");
		String jingyan = request.getParameter("jingyan");
		guaiwushuxing guaiwushuju = new guaiwushuxing();
		guaiwushuju.setiD(id);
		guaiwushuju.setXingMing(xingming);
		guaiwushuju.setXueLiang(xueliang);
		guaiwushuju.setGongJi(gongji);
		guaiwushuju.setFangYu(fangyu);
		guaiwushuju.setSuDu(sudu);
		guaiwushuju.setJinQian(jinqian);
		guaiwushuju.setJingYan(jingyan);

		guaiwushuxing guaiwuidshuju = jiekou.chaguaiwuid(id);
		if (guaiwuidshuju == null) {

			jiekou.tianjiaguaiwu(guaiwushuju);

			List<guaiwushuxing> guaiwubiaoshuju = jiekou.chaguaiwubiao(cunsuiji);
			List<guaiwushuxing> suoyouguaiwubiaoshuju = jiekou.chasuoyouguaiwu();

			int suo = suoyouguaiwubiaoshuju.size();
			int su = guaiwubiaoshuju.size();
			int s = cunsuiji + 5;
			boolean pan = false;
			if (su < 5) {
				pan = true;
u=1;
			}
			if (suo == s) {
				pan = true;
u=1;
			}
			int xianshi = cunsuiji / 5 + 1;
			if (pan == false) {

				System.out.println("欢迎来到第" + xianshi + "页");
			} else {
				System.out.println("欢迎来到最后一页，即第" + xianshi + "页");
			}
			String zhongjiankuang = "添加怪物成功";
			ju=guaiwubiaoshuju;
			ku=zhongjiankuang;
			

			return "guanliyuanmoshi/guaiwubiaohuancun";

		} else {
			String zhongjiankuang = "该怪物编号已存在";
			model.addAttribute("zhongjiankuang", zhongjiankuang);
			model.addAttribute("guaiwushuju", guaiwushuju);

			return "guanliyuanmoshi/tianjiaguaiwu";

		}

	}
	@RequestMapping(value = "/guaiwubiaohuancun")
	public String guaiwubiaohuancun(HttpServletRequest request, Model model) throws Exception {
		request.setCharacterEncoding("utf-8");
if(u==1) {
	request.setAttribute("zuihouyiye", zuihouyiye);
	u=0;
}
		
			model.addAttribute("guaiwubiaoshuju", ju);
			model.addAttribute("zhongjiankuang", ku);

			return "guanliyuanmoshi/guaiwubiao";


	}

	@RequestMapping(value = "/tianjiafanhuiguaiwubiao")
	public String tianjiafanhuiguaiwubiao(HttpServletRequest request, Model model) throws Exception {
		request.setCharacterEncoding("utf-8");

		List<guaiwushuxing> guaiwubiaoshuju = jiekou.chaguaiwubiao(cunsuiji);
		List<guaiwushuxing> suoyouguaiwubiaoshuju = jiekou.chasuoyouguaiwu();

		int suo = suoyouguaiwubiaoshuju.size();
		int su = guaiwubiaoshuju.size();
		int s = cunsuiji + 5;
		boolean pan = false;
		if (su < 5) {
			pan = true;

			request.setAttribute("zuihouyiye", zuihouyiye);
		}
		if (suo == s) {
			pan = true;

			request.setAttribute("zuihouyiye", zuihouyiye);
		}
		int xianshi = cunsuiji / 5 + 1;
		if (pan == false) {

			System.out.println("欢迎来到第" + xianshi + "页");
		} else {
			System.out.println("欢迎来到最后一页，即第" + xianshi + "页");
		}
		model.addAttribute("guaiwubiaoshuju", guaiwubiaoshuju);

		return "guanliyuanmoshi/guaiwubiao";

	}

	@RequestMapping(value = "/fanhuishengmocuncunkou")
	public String fanhuishengmocuncunkou(HttpServletRequest request, Model model) throws Exception {
		return "shengmocuncunkou/shengmocuncunkou";

	}

}
package com.javabao;


import com.diaoshujukujiekoubao.diaojiekou;
import com.wdbao.daojuhezhuangbei;
import com.wdbao.guaiwushuxing;
import com.wdbao.juesexinxi;
import com.wdbao.teshulei;

import java.util.Arrays;

public class yongwupinhezhuangbei {
	cunxinxilei xinxi = new cunxinxilei();
	panduanlei pan = new panduanlei();

	public void wupin(diaojiekou jiekou, String wupin, int weizhi, juesexinxi shuxing, daojuhezhuangbei dz,
					  String zhonglei, String st) throws Exception {
		if (zhonglei.equals("加血量")) {
			if(dz.getDaoJ()!=null) {
			int cun = shuxing.getXueLiang() + pan.wu(wupin);
			if (cun >= shuxing.getXueliangMax()) {
				cun = shuxing.getXueliangMax();
			}
			shuxing.setXueLiang(cun);
			jiekou.xiugai(shuxing);
			String[] daoju = dz.getDaoJ().split("，");
			int sd = 0;
			for (int i = 0; i < daoju.length; i++) {
				if (daoju[i].equals(wupin)) {
					if (weizhi == sd) {
						sd++;
						continue;
					}
					sd++;
				}
				st = st + daoju[i] + "，";
			}
			if (st == "") {
				dz.setDaoJ(null);
			} else {
				dz.setDaoJ(st);
			}
			jiekou.xiugaidaozhuang(dz);
		}
		}
		if(zhonglei.equals("给降防御")) {
			if(dz.getDaoJ()!=null) {
				int cun=cunxinxilei.guaifangyu-pan.wu(wupin);
				if(cun>=0) {
					cunxinxilei.guaifangyu=cun;
				}else {
					cunxinxilei.guaifangyu=0;
					cun=cun-cun*2;
					xinxi.jueseshanghai=cun;
				}
				String[] daoju = dz.getDaoJ().split("，");
				int sd = 0;
				for (int i = 0; i < daoju.length; i++) {
					if (daoju[i].equals(wupin)) {
						if (weizhi == sd) {
							sd++;
							continue;
						}
						sd++;
					}
					st = st + daoju[i] + "，";
				}
				if (st == "") {
					dz.setDaoJ(null);
				} else {
					dz.setDaoJ(st);
				}
				jiekou.xiugaidaozhuang(dz);
			}
		}

	}

	public void zhuangbei(diaojiekou jiekou, String zhuangbei, int weizhi, juesexinxi shuxing, daojuhezhuangbei dz,
			String zhonglei, String st) throws Exception {
		if (zhonglei.equals("装备武器")) {
			if(dz.getZhuangB()!=null) {
			String[] daoju = dz.getZhuangB().split("，");
			int sd = 0;

			for (int i = 0; i < daoju.length; i++) {

				if (daoju[i].equals(zhuangbei)) {
					if (weizhi == sd) {
						if (dz.getWuQi() == null) {
							int cun = shuxing.getGongJi() + pan.zhuang(zhuangbei);
							shuxing.setGongJi(cun);
							dz.setWuQi(daoju[i]);
							sd++;
							continue;
						} else {
							String oo = daoju[i];
							daoju[i] = dz.getWuQi();
							int cn = pan.zhuang(oo) - pan.zhuang(daoju[i]);
							int cun = shuxing.getGongJi() + cn;
							shuxing.setGongJi(cun);
							dz.setWuQi(oo);
						}
					}
					sd++;
				}
				st = st + daoju[i] + "，";
			}
			if (st == "") {
				dz.setZhuangB(null);
			} else {
				dz.setZhuangB(st);

			}
			jiekou.xiugai(shuxing);
			jiekou.xiugaidaozhuang(dz);
			
			}
		}
		if (zhonglei.equals("装备防具")) {
			if(dz.getZhuangB()!=null) {
			String[] daoju = dz.getZhuangB().split("，");
			int sd = 0;

			for (int i = 0; i < daoju.length; i++) {

				if (daoju[i].equals(zhuangbei)) {
					if (weizhi == sd) {
						if (dz.getFangJu() == null) {
							int cun = shuxing.getFangYu() + pan.zhuang(zhuangbei);
							xinxi.cun=pan.zhuang(zhuangbei);
							shuxing.setFangYu(cun);
							dz.setFangJu(daoju[i]);
							sd++;
							continue;
						} else {
							String oo = daoju[i];
							daoju[i] = dz.getFangJu();
							int cn = pan.zhuang(oo) - pan.zhuang(daoju[i]);
							xinxi.cun = cn;
							int cun = shuxing.getFangYu() + cn;
							shuxing.setFangYu(cun);
							dz.setFangJu(oo);
						}
					}
					sd++;
				}
				st = st + daoju[i] + "，";
			}
			if (st == "") {
				dz.setZhuangB(null);

			} else {
				dz.setZhuangB(st);
			}
			jiekou.xiugai(shuxing);
			jiekou.xiugaidaozhuang(dz);
			}
		}
	}

	public void zhandoushiyong(String zhonglei, guaiwushuxing cunguaiwu, juesexinxi shuxing,
							   String wupin, String[] cunxinxi) {
		if (zhonglei.equals("加血量")) {
			String a = "你使用了" + wupin;
			String b = "增加了" + pan.wu(wupin) + "点血量";
			xinxi.guaiwushanghai = Integer.parseInt(cunguaiwu.getGongJi()) - shuxing.getFangYu();
			if (xinxi.guaiwushanghai <= 0) {
				xinxi.guaiwushanghai = 0;
			}
			xinxi.cunxinxi = Arrays.copyOf(cunxinxi, cunxinxi.length + 2);
			xinxi.cunxinxi[xinxi.cunxinxi.length - 2] = a;
			xinxi.cunxinxi[xinxi.cunxinxi.length - 1] = b;
			xinxi.cunsheng = new String[2];
			xinxi.cunsheng[0] = a;
			xinxi.cunsheng[1] = b;
		}
		if(zhonglei.equals("给降防御")) {
				String a="你使用"+wupin+"向怪物扔去";
				int j=Integer.parseInt(cunguaiwu.getFangYu())-pan.wu(wupin);
				String b=null;
				String c=null;
				String d=null;
				int dd=0;
				if(j>=0) {
				b="对"+cunguaiwu.getXingMing()+"的防御力造成破坏";
				c=cunguaiwu.getXingMing()+"防御力降低了"+pan.wu(wupin)+"点";
				}else {
					j=j-j*2;
					b="对"+cunguaiwu.getXingMing()+"防御力造成了破坏";
					c=cunguaiwu.getXingMing()+"的防御力降到了0点";
					d="并对"+cunguaiwu.getXingMing()+"造成"+j+"点伤害";
					dd=1;
				}
				xinxi.guaiwushanghai = Integer.parseInt(cunguaiwu.getGongJi()) - shuxing.getFangYu();
				if (xinxi.guaiwushanghai <= 0) {
					xinxi.guaiwushanghai = 0;
				}
				if(dd==0) {
				xinxi.cunxinxi = Arrays.copyOf(cunxinxi, cunxinxi.length + 3);
				xinxi.cunxinxi[xinxi.cunxinxi.length - 3] = a;
				xinxi.cunxinxi[xinxi.cunxinxi.length - 2] = b;
				xinxi.cunxinxi[xinxi.cunxinxi.length - 1] = c;
				xinxi.cunsheng = new String[3];
				xinxi.cunsheng[0] = a;
				xinxi.cunsheng[1] = b;
				xinxi.cunsheng[2] = c;
				}else {
					xinxi.cunxinxi = Arrays.copyOf(cunxinxi, cunxinxi.length + 4);
					xinxi.cunxinxi[xinxi.cunxinxi.length - 4] = a;
					xinxi.cunxinxi[xinxi.cunxinxi.length - 3] = b;
					xinxi.cunxinxi[xinxi.cunxinxi.length - 2] = c;
					xinxi.cunxinxi[xinxi.cunxinxi.length - 1] = d;
					xinxi.cunsheng = new String[4];
					xinxi.cunsheng[0] = a;
					xinxi.cunsheng[1] = b;
					xinxi.cunsheng[2] = c;
					xinxi.cunsheng[3] = d;
				}
			}
		
	}

	public void zhandouzhuangbei(daojuhezhuangbei dz, String zhonglei, guaiwushuxing cunguaiwu,
			juesexinxi shuxing, String zhuangbei, String[] cunxinxi) {
		if (zhonglei.equals("装备武器")) {
			String a = null;
			if (dz.getWuQi() == null) {
				a = "你装备了" + zhuangbei;
			} else {
				a = "你装备了" + zhuangbei + "并取下了" + dz.getWuQi();
			}
			xinxi.guaiwushanghai = Integer.parseInt(cunguaiwu.getGongJi()) - shuxing.getFangYu();
			if (xinxi.guaiwushanghai <= 0) {
				xinxi.guaiwushanghai = 0;
			}
			xinxi.cunxinxi = Arrays.copyOf(cunxinxi, cunxinxi.length + 1);
			xinxi.cunxinxi[xinxi.cunxinxi.length - 1] = a;
			xinxi.cunsheng = new String[1];
			xinxi.cunsheng[0] = a;
		}
		if (zhonglei.equals("装备防具")) {
			String a = null;
			if (dz.getFangJu() == null) {
				a = "你装备了" + zhuangbei;
			} else {
				a = "你装备了" + zhuangbei + "并取下了" + dz.getFangJu();
			}
			xinxi.guaiwushanghai = Integer.parseInt(cunguaiwu.getGongJi()) - shuxing.getFangYu();
			if (xinxi.guaiwushanghai <= 0) {
				xinxi.guaiwushanghai = 0;
			}
			xinxi.cunxinxi = Arrays.copyOf(cunxinxi, cunxinxi.length + 1);
			xinxi.cunxinxi[xinxi.cunxinxi.length - 1] = a;
			xinxi.cunsheng = new String[1];
			xinxi.cunsheng[0] = a;
		}
	}

	public void zhandouteshu(String zh,  guaiwushuxing cunguaiwu, juesexinxi shuxing, String wupin,
			String[] cunxinxi) {
		if (wupin.equals("力丸")) {
			String a = "你使用了" + wupin;
			String b="";
			String c="";
			if(cunxinxilei.cunli==0) {
			b = "感觉浑身充满了力量";
			c = "增加了" + pan.teshu(wupin, zh) + "点攻击力";
			}else {
				b = "感觉浑身充满了活力";
				zh="战斗外";
				c = "增加了" + pan.teshu(wupin, zh) + "点血量";
			}
			xinxi.guaiwushanghai = Integer.parseInt(cunguaiwu.getGongJi()) - shuxing.getFangYu();
			if (xinxi.guaiwushanghai <= 0) {
				xinxi.guaiwushanghai = 0;

			}

			xinxi.cunxinxi = Arrays.copyOf(cunxinxi, cunxinxi.length + 3);
			xinxi.cunxinxi[xinxi.cunxinxi.length - 3] = a;
			xinxi.cunxinxi[xinxi.cunxinxi.length - 2] = b;
			xinxi.cunxinxi[xinxi.cunxinxi.length - 1] = c;
			xinxi.cunsheng = new String[3];
			xinxi.cunsheng[0] = a;
			xinxi.cunsheng[1] = b;
			xinxi.cunsheng[2] = c;
		}
	}


	public void teshu(diaojiekou jiekou, String wupin, int weizhi, juesexinxi shuxing, daojuhezhuangbei dz, String st,
			String zh) throws Exception {
			if (zh.equals("战斗外")) {
				if (wupin.equals("力丸")) {
					if(dz.getDaoJ()!=null) {
				int cun = shuxing.getXueLiang() + pan.teshu(wupin, zh);
				if (cun >= shuxing.getXueliangMax()) {
					cun = shuxing.getXueliangMax();
				}
				shuxing.setXueLiang(cun);
				jiekou.xiugai(shuxing);
				String[] daoju = dz.getDaoJ().split("，");
				int sd = 0;
				for (int i = 0; i < daoju.length; i++) {
					if (daoju[i].equals(wupin)) {
						if (weizhi == sd) {
							sd++;
							continue;
						}
						sd++;
					}
					st = st + daoju[i] + "，";
				}
				if (st == "") {
					dz.setDaoJ(null);
				} else {
					dz.setDaoJ(st);
				}
				jiekou.xiugaidaozhuang(dz);
			}
			}
			}
			if (zh.equals("战斗内")) {
				if (wupin.equals("力丸")) {
					int cun=0;
					if(cunxinxilei.cunli==0) {
				cun = shuxing.getGongJi() + pan.teshu(wupin, zh);
				xinxi.jishiqi = 1;
				shuxing.setGongJi(cun);
				jiekou.xiugai(shuxing);
					}else {
						zh="战斗外";
						cun = shuxing.getXueLiang() + pan.teshu(wupin, zh);
						shuxing.setXueLiang(cun);
						jiekou.xiugai(shuxing);
					}
				String[] daoju = dz.getDaoJ().split("，");
				int sd = 0;
				for (int i = 0; i < daoju.length; i++) {
					if (daoju[i].equals("力丸")) {
						if (weizhi == sd) {
							sd++;
							continue;
						}
						sd++;
					}
					st = st + daoju[i] + "，";
				}
				if (st == "") {
					dz.setDaoJ(null);
				} else {
					dz.setDaoJ(st);
				}
				jiekou.xiugaidaozhuang(dz);
				}
			}
		}

	

	public void taopao(juesexinxi juese, int guaiwushanghai, guaiwushuxing cunguaiwu, String[] cunxinxi,
			 String taopao) {
		if (taopao.equals("逃跑失败")) {
			xinxi.guaiwushanghai = Integer.parseInt(cunguaiwu.getGongJi()) - juese.getFangYu();
			if (xinxi.guaiwushanghai < 0) {
				xinxi.guaiwushanghai = 0;
			}
			String[] tapa = { "你虚晃一招，从怪物身边快速走过", "你发动攻击，当然这是假的，你快速往后跑", "你正常的逃跑", "你扔了一个石头，砸中了怪物，开始逃跑", "开始逃跑", "开始逃跑",
					"开始逃跑", "开始逃跑", "开始逃跑", "开始逃跑" };
			int si = (int) (Math.random() * 10);
			String a = tapa[si];
			String b = "可还是被追上了";
			xinxi.cunxinxi = Arrays.copyOf(cunxinxi, cunxinxi.length + 2);
			xinxi.cunxinxi[xinxi.cunxinxi.length - 2] = a;
			xinxi.cunxinxi[xinxi.cunxinxi.length - 1] = b;
			xinxi.cunsheng = new String[2];
			xinxi.cunsheng[0] = a;
			xinxi.cunsheng[1] = b;
		}
		if (taopao.equals("逃跑成功")) {
			String[] tapa = { "你虚晃一招，从怪物身边快速走过", "你发动攻击，当然这是假的，你快速往后跑", "你正常的逃跑", "你扔了一个石头，砸中了怪物，开始逃跑", "开始逃跑", "开始逃跑",
					"开始逃跑", "开始逃跑", "开始逃跑", "开始逃跑" };
			int si = (int) (Math.random() * 10);
			String a = tapa[si];
			String b = "逃跑成功";
			xinxi.cunsheng = new String[2];
			xinxi.cunsheng[0] = a;
			xinxi.cunsheng[1] = b;
		}
	}
	public void diaocha(daojuhezhuangbei daoju,int lu,int[] dz,diaojiekou jiekou,String du) throws Exception {
		if(du.equals("迷雾森林")) {
		if (((lu == 5)||(lu==3)) && dz[lu - 1] == 0) {
			xinxi.jieguo = "你找到了"+pan.luji(lu,du);
			if (daoju.getDaoJ() == null) {
				daoju.setDaoJ(pan.luji(lu,du)+"，");
			} else {
				String cund = daoju.getDaoJ() +pan.luji(lu,du)+"，";
				daoju.setDaoJ(cund);

			}
			dz[lu - 1] = 1;
			String cj = "";
			for (int p = 0; p < dz.length; p++) {
				cj = cj + dz[p] + "，";
			}
			daoju.setMiwusenLin(cj);
			jiekou.xiugaidaozhuang(daoju);

		} else if (((lu == 6)||(lu==9)) && dz[lu - 1] == 0) {
			xinxi.jieguo = "你找到了"+pan.luji(lu,du);
			if (daoju.getZhuangB()== null) {
				daoju.setZhuangB(pan.luji(lu,du)+"，");
			} else {
				String cund = daoju.getZhuangB() +pan.luji(lu,du)+"，";
				daoju.setZhuangB(cund);

			}
			dz[lu - 1] = 1;
			String cj = "";
			for (int p = 0; p < dz.length; p++) {
				cj = cj + dz[p] + "，";
			}
			daoju.setMiwusenLin(cj);
			jiekou.xiugaidaozhuang(daoju);

		} else {
			xinxi.jieguo = "你什么也没找到";
		}
		}
		if(du.equals("大草原")) {
		 if (lu==3 && dz[lu - 1] == 0) {
				xinxi.jieguo = "你找到了"+pan.luji(lu,du);
				if (daoju.getZhuangB()== null) {
					daoju.setZhuangB(pan.luji(lu,du)+"，");
				} else {
					String cund = daoju.getZhuangB() +pan.luji(lu,du)+"，";
					daoju.setZhuangB(cund);

				}
				dz[lu - 1] = 1;
				String cj = "";
				for (int p = 0; p < dz.length; p++) {
					cj = cj + dz[p] + "，";
				}
				daoju.setDacaoyuan(cj);
				jiekou.xiugaidaozhuang(daoju);

			} else {
				xinxi.jieguo = "你什么也没找到";
			}
			
		}
		if(du.equals("魔王城堡")) {
			 if (lu==1 && dz[lu - 1] == 0) {
					xinxi.jieguo = "你找到了"+pan.luji(lu,du);
					if (daoju.getDaoJ()== null) {
						daoju.setDaoJ(pan.luji(lu,du)+"，");
					} else {
						String cund = daoju.getDaoJ() +pan.luji(lu,du)+"，";
						daoju.setDaoJ(cund);

					}
					dz[lu - 1] = 1;
					String cj = "";
					for (int p = 0; p < dz.length; p++) {
						cj = cj + dz[p] + "，";
					}
					daoju.setMowangchengbao(cj);
					jiekou.xiugaidaozhuang(daoju);

				} else {
					xinxi.jieguo = "你什么也没找到";
				}
				
			}
		
	}
	public void panren(String ren, teshulei teshu, diaojiekou jiekou , String dalu) throws Exception {
		if(dalu.equals("迷雾森林")) {
		xinxi.diyi=0;
		if(teshu.getMiwusenlinluren()!=null) {
			String[] telu = teshu.getMiwusenlinluren().split("，");
			for (int i = 0; i < telu.length; i++) {
				if(telu[i].equals(ren)) {
					xinxi.diyi=1;
				}
		
		
			}
		}
		}
		if(dalu.equals("大草原")) {
			xinxi.diyi=0;
			if(teshu.getDacaoyuan()!=null) {
				String[] telu = teshu.getDacaoyuan().split("，");
				for (int i = 0; i < telu.length; i++) {
					if(telu[i].equals(ren)) {
						xinxi.diyi=1;
					}
				
				}
	
			}
		}
		if(dalu.equals("魔王城堡")) {
			xinxi.diyi=0;
			if(teshu.getMowangchengbao()!=null) {
				String[] telu = teshu.getMowangchengbao().split("，");
				for (int i = 0; i < telu.length; i++) {
					if(telu[i].equals(ren)) {
						xinxi.diyi=1;
					}
				
				}
	
			}
		}
		
	}
	public void panjia(	String name,teshulei teshu,diaojiekou jiekou ,String dalu) throws Exception {
		if(dalu.equals("迷雾森林")) {
		if(teshu.getMiwusenlinluren()==null) {
			teshu.setMiwusenlinluren(name+"，");
		}else {
			teshu.setMiwusenlinluren(teshu.getMiwusenlinluren()+name+"，");
		
			}
		jiekou.xiugailu(teshu);
		}
		
		if(dalu.equals("大草原")) {
			if(teshu.getDacaoyuan()==null) {
				teshu.setDacaoyuan(name+"，");
			}else {
				teshu.setDacaoyuan(teshu.getDacaoyuan()+name+"，");
			
				}
			jiekou.xiugailu(teshu);
	
			}
		if(dalu.equals("魔王城堡")) {
			if(teshu.getMowangchengbao()==null) {
				teshu.setMowangchengbao(name+"，");
			}else {
				teshu.setMowangchengbao(teshu.getMowangchengbao()+name+"，");
			
				}
			jiekou.xiugailu(teshu);
	
			}
		
		
	}
	public void pansheng(String name,daojuhezhuangbei ss,diaojiekou jiekou,String wupin,String st) throws Exception {
		if(wupin.equals("物品")) {
			if(ss.getDaoJ()!=null) {
			String[] daoju = ss.getDaoJ().split("，");
		st = "";
		int l = 0;
		for (int i = 0; i < daoju.length; i++) {
					if(daoju[i].equals(pan.ne(name))) {
						
						if(l==0) {
							l++;
							xinxi.shifouyou=1;
							continue;
						}
						st=st+daoju[i]+"，";
						
					}
		}
		if(st=="") {
			ss.setDaoJ(null);
		}else {
			ss.setDaoJ(st);
		}
		jiekou.xiugaidaozhuang(ss);
		if(name.equals("闯荡者")) {
		String[] kk= {"谢谢你的慷慨，你是个好人","我告诉你个秘密","道路10有个蜥蜴王","打败他你就可以得到一把很厉害的武器"};
		xinxi.k=kk;
		}
		
		}}
		if(wupin.equals("装备")) {
			
		}
	}
	
	
	
	public guaiwushuxing fanhuiguaiwu(diaojiekou jiekou,String kk) throws Exception {
		guaiwushuxing guaiwu = jiekou.chaguaiwuid(pan.panguai(kk));
		xinxi.jibie=pan.panjibie(kk);
		return guaiwu;
	}
	public void huode(daojuhezhuangbei daoju,diaojiekou jiekou,String ming,String zhonglei) throws Exception {
		if(zhonglei.equals("武器")) {
			if (daoju.getZhuangB()== null) {
				daoju.setZhuangB(pan.panwu(ming)+"，");
			} else {
				String cund = daoju.getZhuangB() +pan.panwu(ming)+"，";
				daoju.setZhuangB(cund);

			}
			jiekou.xiugaidaozhuang(daoju);

		
	}
		if(zhonglei.equals("物品")) {
			if(daoju.getDaoJ()==null) {
				daoju.setDaoJ(pan.panwu(ming)+"，");
			}else {
				String cund = daoju.getDaoJ() +pan.panwu(ming)+"，";
				daoju.setDaoJ(cund);
			}
			jiekou.xiugaidaozhuang(daoju);
		}
	}
	
	public void tejifadong(String wu,juesexinxi jueseshuxing,guaiwushuxing cunguaiwu,String[] cunxinxi) {
		if(wu.equals("闪光剑")) {
		int bei=pan.pantehu(wu);
	xinxi.jueseshanghai = bei*(jueseshuxing.getGongJi() - Integer.parseInt(cunguaiwu.getFangYu()));
		if (xinxi.jueseshanghai < 0) {
			xinxi.jueseshanghai = 0;
		}
		String a = "你使用闪光风暴特技，突然出现了三道暴风，向怪物冲击";
		String b = "对" + cunguaiwu.getXingMing() + "造成" + xinxi.jueseshanghai + "点的伤害";
		xinxi.cunxinxi = Arrays.copyOf(cunxinxi, cunxinxi.length + 2);
		xinxi.cunxinxi[xinxi.cunxinxi.length - 2] = a;
		xinxi.cunxinxi[xinxi.cunxinxi.length - 1] = b;
		xinxi.cunsheng = new String[2];
		xinxi.cunsheng[0] = a;
		xinxi.cunsheng[1] = b;
		}
		if(wu.equals("鳞甲")) {
			String a = "你使用绝对防御特技，面前出现了一个屏障，防御力增加"+pan.pantehu(wu)+"点";
			xinxi.cunxinxi = Arrays.copyOf(cunxinxi, cunxinxi.length + 1);
			xinxi.cunxinxi[xinxi.cunxinxi.length - 1] = a;
			xinxi.cunsheng = new String[1];
			xinxi.cunsheng[0] = a;
		}
		
	}
	public void tihuan() {
		int i=0;
		if(javatanxianmiwusenlin.ha.get("闪光剑")!=null) {
			i=javatanxianmiwusenlin.ha.get("闪光剑");
			if(i!=1) {
			javatanxianmiwusenlin.ha.put("闪光剑",i-1);
			}
		}
		if(javatanxianmiwusenlin.ha.get("鳞甲")!=null) {
			i=javatanxianmiwusenlin.ha.get("鳞甲");
			if(i!=1) {
			javatanxianmiwusenlin.ha.put("鳞甲",i-1);
			}
		}
	}
	public void goumai(String name,String wupin,diaojiekou jiekou,daojuhezhuangbei ss,juesexinxi juese) throws Exception {
		if(name.equals("黑商")) {
			if(ss.getZhuangB()==null) {
				ss.setZhuangB(wupin+"，");
			}else {
				ss.setZhuangB(ss.getZhuangB()+wupin+"，");
			}
			if(juese.getJinQian()<1000) {
				cunxinxilei.mai="没钱";
			
			}else {
				juese.setJinQian(juese.getJinQian()-1000);
				jiekou.xiugai(juese);
				cunxinxilei.mai="购买";
				xinxi.shifouyou=1;
				
			}
			jiekou.xiugaidaozhuang(ss);
			
		}
	}
	public void dabaiguaiwu(String[] cunsheng,juesexinxi jueseshuxing,guaiwushuxing cunguaiwu,diaojiekou jiekou) throws Exception {
		xinxi.cunsheng = new String[1];
		int wei = 0;
		String dabai = "你打败了" + cunguaiwu.getXingMing();
		xinxi.cunsheng[wei++] = dabai;
		xinxi.dabaixinxi = dabai;
		int jinqian = jueseshuxing.getJinQian() + Integer.parseInt(cunguaiwu.getJinQian());
		jueseshuxing.setJinQian(jinqian);
		String qian = "你获得了" + cunguaiwu.getJinQian() + "枚金钱";
		xinxi.cunsheng = Arrays.copyOf(	xinxi.cunsheng, xinxi.cunsheng.length + 1);
		xinxi.cunsheng[wei++] = qian;
		int jingyan = jueseshuxing.getJingYan() + Integer.parseInt(cunguaiwu.getJingYan());
		String yan = "你获得了" + cunguaiwu.getJingYan() + "点经验";
		xinxi.cunsheng = Arrays.copyOf(	xinxi.cunsheng, xinxi.cunsheng.length + 1);
		xinxi.cunsheng[wei++] = yan;
		int d = jueseshuxing.getDengJi();
		String de, xu, go, fa, su;
		while (jingyan >= ((d + 1) * 100)) {

			de = "你的等级提升了";
			xinxi.cunsheng = Arrays.copyOf(xinxi.cunsheng, xinxi.cunsheng.length + 1);
			xinxi.cunsheng[wei++] = de;
			d++;
			int x = (int) (Math.random() * 10 + 1);
			int g = (int) (Math.random() * 2+1);
			int f = (int) (Math.random() * 2+1);
			int s = (int) (Math.random() * 1+1);
			int xueliang = jueseshuxing.getXueliangMax() + x;

			xu = "血量和血量上限增加" + x + "点";
			xinxi.cunsheng = Arrays.copyOf(xinxi.cunsheng, xinxi.cunsheng.length + 1);
			xinxi.cunsheng[wei++] = xu;
			int xue = x + jueseshuxing.getXueLiang();
			int gongji = jueseshuxing.getGongJi() + g;

			go = "攻击力增加" + g + "点";
			xinxi.cunsheng = Arrays.copyOf(xinxi.cunsheng, xinxi.cunsheng.length + 1);
			xinxi.cunsheng[wei++] = go;
			int fangyu = jueseshuxing.getFangYu() + f;

			fa = "防御力增加" + f + "点";
			xinxi.cunsheng = Arrays.copyOf(xinxi.cunsheng, xinxi.cunsheng.length + 1);
			xinxi.cunsheng[wei++] = fa;
			int sudu = jueseshuxing.getSuDu() + s;

			su = "速度增加" + s + "点";
			xinxi.cunsheng = Arrays.copyOf(xinxi.cunsheng, xinxi.cunsheng.length + 1);
			xinxi.cunsheng[wei++] = su;
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
	}

}

package com.javabao;

public class panduanlei {
	public int zhuang(String kk) {
		int k = 0;

		if (kk.equals("匕首")) {
			k = 6;
		}

		if (kk.equals("大剑")) {
			k = 10;
		}

		if (kk.equals("铜甲")) {
			k = 8;
		}

		if (kk.equals("铁甲")) {
			k = 12;
		}
		if(kk.equals("闪光剑")) {
			k = 20;
		}
		if(kk.equals("金甲")) {
			k = 15;
		}
		if(kk.equals("鳞甲")) {
			k = 25;
		}
		if(kk.equals("小剑")) {
			k = 7;
		}
		if(kk.equals("铁剑")) {
			k = 12;
		}
		if(kk.equals("刺剑")) {
			k = 15;
		}
		if(kk.equals("板甲")) {
			k = 6;
		}
		if(kk.equals("精铁甲")) {
			k = 17;
		}
		if(kk.equals("秘银甲")) {
			k = 20;
		}
		




		return k;
	}

	public int wu(String wu) {
		int a = 0;
		if (wu.equals("草药")) {
			a = 30;
		}
		if (wu.equals("血药")) {
			a = 20;
		}
		if(wu.equals("刺锥")) {
			a=30;
		}
		if(wu.equals("大补药")) {
			a=100;
		}
		if(wu.equals("小补药")) {
			a=50;
		}
		if(wu.equals("灵芝")) {
			a=150;
		}
		if(wu.equals("人参")) {
			a=200;
		}
		return a;
	}

	public int teshu(String wu, String l) {
		int a = 0;
		if (l.equals("战斗外")) {
			if (wu.equals("力丸")) {
				a = 10;
			}
		}
		if (l.equals("战斗内")) {
			if (wu.equals("力丸")) {
				a = 4;
			}
		}

		return a;
	}
	public String luji(int lu,String da) {
		String a=null;
		if(da.equals("迷雾森林")) {
		if(lu==5) {
			a="草药";
		}
		if(lu==3) {
			a="血药";
		}
		if(lu==6) {
			a="铜甲";
		}
		if(lu==9) {
			a="铁甲";
		}
		}
		if(da.equals("大草原")) {
			if(lu==3) {
				a="金甲";
			}
		}
		if(da.equals("魔王城堡")) {
			if(lu==1) {
				a="大补药";
			}
		}
		return a;
	}
	public String ne(String name) {
		String k="";
		if(name.equals("闯荡者")) {
			k="草药";
		}
		return k;
	}
	public String panguai(String kk) {
		String i="";
		if(kk.equals("闯荡者")) {
			i="13";
		}
		if(kk.equals("蜥蜴王")) {
			i="14";
		}
		if(kk.equals("黑商")) {
			i="15";
		}
		if(kk.equals("象精")) {
			i="16";
		}
		if(kk.equals("魔王")) {
			i="17";
		}
		return i;
	}
	public int panjibie(String kk) {
		int i=0;
		if(kk.equals("闯荡者")) {
			i=5;
		}
		if(kk.equals("蜥蜴王")) {
			i=10;
		}
		if(kk.equals("黑商")) {
			i=20;
		}
		if(kk.equals("象精")) {
			i=25;
		}
		if(kk.equals("魔王")) {
			i=50;
		}
		return i;
	}
	public String panwu(String kk) {
		String i="";
		if(kk.equals("蜥蜴王")) {
			i="闪光剑";
		}
		if(kk.equals("象精")) {
			i="刺锥";
		}
		return i;
	
	}
	public int pantehu(String kk) {
		int i=0;
		if(kk.equals("闪光剑")) {
			i=3;
		}
		if(kk.equals("鳞甲")) {
			i=16;
		}
		return i;
	}
	public int zhongjian(int a,int b) {
		int d=b-a+1;
		int c=(int)(Math.random()*d);
		int k=a+c;
		return k;
		
	}
	public int qian(String wu) {
		int i=0;
		if(wu.equals("小剑")) {
			i=30;
		}
		if(wu.equals("铁剑")) {
			i=200;
		}
		if(wu.equals("刺剑")) {
			i=500;
		}
		if(wu.equals("板甲")) {
			i=50;
		}
		if(wu.equals("精铁甲")) {
			i=300;
		}
		if(wu.equals("秘银甲")) {
			i=500;
		}
		if(wu.equals("血药")) {
			i=10;
		}
		if(wu.equals("草药")) {
			i=30;
		}
		if(wu.equals("小补药")) {
			i=50;
		}
		if(wu.equals("大补药")) {
			i=100;
		}
		if(wu.equals("灵芝")) {
			i=300;
		}
		if(wu.equals("人参")) {
			i=500;
		}
		return i;
		
	}
	
}

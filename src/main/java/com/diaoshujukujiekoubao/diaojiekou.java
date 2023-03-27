package com.diaoshujukujiekoubao;


import com.wdbao.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface diaojiekou {
	public juesexinxi chaxuehao(String xuecao) throws Exception;

	public int zhuce(juesexinxi zhuce) throws Exception;

	public int xiugai(juesexinxi xiugai) throws Exception;
	
	public int xiugaishuxing(juesexinxi xiugai) throws Exception;

	public List<guaiwushuxing> chasuoyouguaiwu() throws Exception;

	public List<guaiwushuxing> chaguaiwubiao(int a) throws Exception;

	public guaiwushuxing chaguaiwuid(String id) throws Exception;

	public int tianjiaguaiwu(guaiwushuxing tianjia) throws Exception;

	public int xiugaiguaiwu(guaiwushuxing xiugai) throws Exception;

	public int shanchuguaiwu(String id) throws Exception;
	
	public int tianjiamax(shuxingmax tianjia) throws Exception;

	public shuxingmax chamaxxuehao(String xuehao) throws Exception; 
	
	public daojuhezhuangbei chadaozhuang(String xuehao) throws Exception;
	
	public int tianjiadaozhuang(daojuhezhuangbei tianjia) throws Exception; 
	
	public int xiugaidaozhuang(daojuhezhuangbei xiugai) throws Exception; 
	
	public teshulei chalu(@Param("xueHao") String xuehao) throws Exception;

	public int tianjialu(teshulei tianjia) throws Exception;

	public int xiugailu(teshulei xiugai) throws Exception;
	
	public wuyong chacao(@Param("xueHao") String xuehao) throws Exception;

	public int jiacao(wuyong tianjia) throws Exception;

	public int xiucao(wuyong xiugai) throws Exception;
	
	public tupian chatu(@Param("xueHao") String xuehao) throws Exception;

	public int jiatu(tupian tianjia) throws Exception;

	public int xiutu(tupian xiugai) throws Exception;
	public int xiutu1(tupian xiugai) throws Exception;
}

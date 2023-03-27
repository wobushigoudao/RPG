package com.shujukujiekoubao;

import com.wdbao.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface shujukujiekou {

	public juesexinxi chaxuehao(@Param("xueHao") String xuehao);

	public int zhuce(juesexinxi zhuce);

	public int xiugai(juesexinxi xiugai);

	public int xiugaishuxing(juesexinxi xiugai);

	public List<guaiwushuxing> chasuoyouguaiwu();

	public List<guaiwushuxing> chaguaiwubiao(@Param("a") int a);

	public guaiwushuxing chaguaiwuid(@Param("iD") String id);

	public int tianjiaguaiwu(guaiwushuxing tianjia);

	public int xiugaiguaiwu(guaiwushuxing xiugai);

	public int shanchuguaiwu(@Param("iD") String id);

	public int tianjiamax(shuxingmax tianjia);

	public shuxingmax chamaxxuehao(@Param("xueHao") String xuehao);

	public daojuhezhuangbei chadaozhuang(@Param("xueHao") String xuehao);

	public int tianjiadaozhuang(daojuhezhuangbei tianjia);

	public int xiugaidaozhuang(daojuhezhuangbei xiugai);
	
	public teshulei chalu(@Param("xueHao") String xuehao);

	public int tianjialu(teshulei tianjia);

	public int xiugailu(teshulei xiugai);
	
	public wuyong chacao(@Param("xueHao") String xuehao);

	public int jiacao(wuyong tianjia);

	public int xiucao(wuyong xiugai);
	
	public tupian chatu(@Param("xueHao") String xuehao);

	public int jiatu(tupian tianjia);

	public int xiutu(tupian xiugai);

	public int xiutu1(tupian xiugai);
}

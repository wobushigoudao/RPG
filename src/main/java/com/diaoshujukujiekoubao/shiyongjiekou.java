package com.diaoshujukujiekoubao;

import com.wdbao.*;
import org.springframework.stereotype.Service;
import com.shujukujiekoubao.shujukujiekou;

import javax.annotation.Resource;
import java.util.List;

@Service
public class shiyongjiekou implements diaojiekou {
	@Resource
	private shujukujiekou jiekou;

	@Override
	public juesexinxi chaxuehao(String xuehao) throws Exception {
		return jiekou.chaxuehao(xuehao);
	}

	@Override
	public int zhuce(juesexinxi zhuce) throws Exception {
		return jiekou.zhuce(zhuce);
	}

	@Override
	public int xiugai(juesexinxi xiugai) throws Exception {
		return jiekou.xiugai(xiugai);
	}

	@Override
	public int xiugaishuxing(juesexinxi xiugai) throws Exception {
		return jiekou.xiugaishuxing(xiugai);
	}

	@Override
	public List<guaiwushuxing> chasuoyouguaiwu() throws Exception {
		return jiekou.chasuoyouguaiwu();

	}

	@Override
	public List<guaiwushuxing> chaguaiwubiao(int a) throws Exception {
		return jiekou.chaguaiwubiao(a);
	}

	@Override
	public guaiwushuxing chaguaiwuid(String id) throws Exception {
		return jiekou.chaguaiwuid(id);
	}

	@Override
	public int tianjiaguaiwu(guaiwushuxing tianjia) throws Exception {
		return jiekou.tianjiaguaiwu(tianjia);
	}

	@Override
	public int xiugaiguaiwu(guaiwushuxing xiugai) throws Exception {
		return jiekou.xiugaiguaiwu(xiugai);
	}

	@Override
	public int shanchuguaiwu(String id) throws Exception {
		return jiekou.shanchuguaiwu(id);
	}

	@Override
	public int tianjiamax(shuxingmax tianjia) throws Exception {
		return jiekou.tianjiamax(tianjia);
	}

	@Override
	public shuxingmax chamaxxuehao(String xuehao) throws Exception {
		return jiekou.chamaxxuehao(xuehao);
	}

	@Override
	public daojuhezhuangbei chadaozhuang(String xuehao) throws Exception {
		return jiekou.chadaozhuang(xuehao);
	}

	@Override
	public int tianjiadaozhuang(daojuhezhuangbei tianjia) throws Exception {
		return jiekou.tianjiadaozhuang(tianjia);
	}

	@Override
	public int xiugaidaozhuang(daojuhezhuangbei xiugai) throws Exception {
		return jiekou.xiugaidaozhuang(xiugai);
	}
	@Override
	public teshulei chalu(String xuehao) throws Exception {
		return jiekou.chalu(xuehao);
	}

	@Override
	public int tianjialu(teshulei tianjia) throws Exception {
		return jiekou.tianjialu(tianjia);
	}

	@Override
	public int xiugailu(teshulei xiugai) throws Exception {
		return jiekou.xiugailu(xiugai);
	}
	
	@Override
	public wuyong chacao(String xuehao) throws Exception {
		return jiekou.chacao(xuehao);
	}

	@Override
	public int jiacao(wuyong tianjia) throws Exception {
		return jiekou.jiacao(tianjia);
	}

	@Override
	public int xiucao(wuyong xiugai) throws Exception {
		return jiekou.xiucao(xiugai);
	}
	
	@Override
	public tupian chatu(String xuehao) throws Exception {
		return jiekou.chatu(xuehao);
	}

	@Override
	public int jiatu(tupian tianjia) throws Exception {
		return jiekou.jiatu(tianjia);
	}

	@Override
	public int xiutu(tupian xiugai) throws Exception {
		return jiekou.xiutu(xiugai);
	}

	@Override
	public int xiutu1(tupian xiugai) throws Exception {
		return jiekou.xiutu1(xiugai);
	}


}

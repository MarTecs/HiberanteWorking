package com.pojo;

import java.util.HashSet;
import java.util.Set;

public class Goods {

	private int goodsid;
	private String goodsname;
	private Set<UserInfo> infos = new HashSet<UserInfo>(0);

	public Set<UserInfo> getInfos() {
		return infos;
	}

	public void setInfos(Set<UserInfo> infos) {
		this.infos = infos;
	}

	public int getGoodsid() {
		return goodsid;
	}

	public void setGoodsid(int goodsid) {
		this.goodsid = goodsid;
	}

	public String getGoodsname() {
		return goodsname;
	}

	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}

}

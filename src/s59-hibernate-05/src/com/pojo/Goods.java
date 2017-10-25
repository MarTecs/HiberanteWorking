package com.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Goods entity. @author MyEclipse Persistence Tools
 */

public class Goods implements java.io.Serializable {

	// Fields

	private Integer goodsid;
	private String goodsname;
	private Set userinfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public Goods() {
	}

	/** full constructor */
	public Goods(String goodsname, Set userinfos) {
		this.goodsname = goodsname;
		this.userinfos = userinfos;
	}

	// Property accessors

	public Integer getGoodsid() {
		return this.goodsid;
	}

	public void setGoodsid(Integer goodsid) {
		this.goodsid = goodsid;
	}

	public String getGoodsname() {
		return this.goodsname;
	}

	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}

	public Set getUserinfos() {
		return this.userinfos;
	}

	public void setUserinfos(Set userinfos) {
		this.userinfos = userinfos;
	}

}
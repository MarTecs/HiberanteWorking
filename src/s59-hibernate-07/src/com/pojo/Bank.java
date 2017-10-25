package com.pojo;

/**
 * Bank entity. @author MyEclipse Persistence Tools
 */

public class Bank implements java.io.Serializable {

	// Fields

	private Integer bankid;
	private Float money;
	private Integer version;

	// Constructors

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	/** default constructor */
	public Bank() {
	}

	/** full constructor */
	public Bank(Float money) {
		this.money = money;
	}

	// Property accessors

	public Integer getBankid() {
		return this.bankid;
	}

	public void setBankid(Integer bankid) {
		this.bankid = bankid;
	}

	public Float getMoney() {
		return this.money;
	}

	public void setMoney(Float money) {
		this.money = money;
	}

}
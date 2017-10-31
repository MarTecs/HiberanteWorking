package com.pojo;

/**
 * Dep entity. @author MyEclipse Persistence Tools
 */

public class Dep implements java.io.Serializable {

	// Fields

	private String depid;
	private String depname;

	// Constructors

	/** default constructor */
	public Dep() {
	}

	/** full constructor */
	public Dep(String depname) {
		this.depname = depname;
	}

	// Property accessors

	public String getDepid() {
		return this.depid;
	}

	public void setDepid(String depid) {
		this.depid = depid;
	}

	public String getDepname() {
		return this.depname;
	}

	public void setDepname(String depname) {
		this.depname = depname;
	}

}
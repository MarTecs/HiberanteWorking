package com.pojo;

/**
 * Emp entity. @author MyEclipse Persistence Tools
 */

public class Emp implements java.io.Serializable {

	// Fields

	private Integer empid;
	private Dep dep;
	private String empname;

	// Constructors

	/** default constructor */
	public Emp() {
	}

	/** full constructor */
	public Emp(Dep dep, String empname) {
		this.dep = dep;
		this.empname = empname;
	}

	// Property accessors

	public Integer getEmpid() {
		return this.empid;
	}

	public void setEmpid(Integer empid) {
		this.empid = empid;
	}

	public Dep getDep() {
		return this.dep;
	}

	public void setDep(Dep dep) {
		this.dep = dep;
	}

	public String getEmpname() {
		return this.empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

}
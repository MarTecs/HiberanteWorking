package com.pojo;

import java.util.HashSet;
import java.util.Set;

public class Dep {
	private int depid;
	private String depname;
	//部门有哪些员工
	private Set<Emp> emps = new HashSet<Emp>(0);

	public int getDepid() {
		return depid;
	}

	public Set<Emp> getEmps() {
		return emps;
	}

	public void setEmps(Set<Emp> emps) {
		this.emps = emps;
	}

	public void setDepid(int depid) {
		this.depid = depid;
	}

	public String getDepname() {
		return depname;
	}

	public void setDepname(String depname) {
		this.depname = depname;
	}

}

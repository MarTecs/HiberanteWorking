package com.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Userinfo entity. @author MyEclipse Persistence Tools
 */

public class Userinfo implements java.io.Serializable {

	// Fields

	private String username;
	private String password;
	private Set goods = new HashSet(0);

	// Constructors

	public Set getGoods() {
		return goods;
	}

	public void setGoods(Set goods) {
		this.goods = goods;
	}

	/** default constructor */
	public Userinfo() {
	}

	/** full constructor */
	public Userinfo(String password, Set goods) {
		this.password = password;
		this.goods = goods;
	}

	// Property accessors

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

}
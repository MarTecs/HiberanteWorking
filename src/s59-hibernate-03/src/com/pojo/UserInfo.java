package com.pojo;

import java.util.HashSet;
import java.util.Set;

public class UserInfo {
	private String username;
	private String password;
	private Set<Goods> goods = new HashSet<Goods>(0);

	public Set<Goods> getGoods() {
		return goods;
	}

	public void setGoods(Set<Goods> goods) {
		this.goods = goods;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

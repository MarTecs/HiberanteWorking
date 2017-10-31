package com.test;

import java.util.UUID;

public class Test {

	public static void main(String[] args) {
		String id = UUID.randomUUID().toString();
		System.out.println(id.replaceAll("-", ""));
	
	}

}

package com.md5;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Md5Test {
	
	public static byte[] encryptMD5(byte[] data) throws NoSuchAlgorithmException {
		MessageDigest digest = MessageDigest.getInstance(algorithm);
		digest.update(data);
		return digest.digest();
	}
	
	public static String encryptMD5toString(byte[] data) throws NoSuchAlgorithmException {
		String str = "";
		String str16;
		for (int i = 0; i < data.length; i++) {
			str16 = Integer.toHexString(0xFF & data[i]);
			//如果长度为1，前位补0
			if(str16.length() == 1) {
				str = str + "0" + str16;
			} else {
				str = str + str16;
			}
			
		}
		
		return str;
	}

}

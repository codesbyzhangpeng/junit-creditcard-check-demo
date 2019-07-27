package com.codesbyzhangpeng.junit.creditcardmask.demo;

public class CreditcardCheck {
	
	public static String Mask(String ccNumber) {
		return "XXXXXXXXXXXX" + ccNumber.substring(ccNumber.length()-4);
	}
}

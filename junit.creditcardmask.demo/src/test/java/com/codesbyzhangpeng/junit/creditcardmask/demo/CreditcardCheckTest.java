package com.codesbyzhangpeng.junit.creditcardmask.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CreditcardCheckTest {

	@Test
	public void test() {
		//setup		
		String ccNumber = "1234567891567788";
		
		//execute
		String result = CreditcardCheck.Mask(ccNumber);
		
		//assert
		String expected = "XXXXXXXXXXXX7788";
		assertEquals(expected, result);
	}

}

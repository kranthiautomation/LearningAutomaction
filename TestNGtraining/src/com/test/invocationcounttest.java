package com.test;

import org.testng.annotations.Test;


public class invocationcounttest {
	@Test(invocationCount = 5000)
	public void sumtest() {
		
		int a=10;
		int b =20;
		
	int c= a+b;
	
	System.out.println("the sum of the numbers is ====="+c);
	
	}

}

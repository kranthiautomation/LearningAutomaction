package com.test;

import org.testng.annotations.Test;

public class timeouttestcase {

	@Test(timeOut=5000)
	public void testcase1() {
		int i=1;
		
		while (i==1)
		System.out.println("printing");
	}
	
/*	@Test(expectedExceptions=NumberFormatException.class)
	
	public void testcase2() {
		String a= "123m";
		Integer.parseInt(a);
	}
	*/
}

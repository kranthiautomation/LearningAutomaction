package com.test;

import org.testng.annotations.Test;

public class dependsonmethodtest {

	@Test
	public void logintest() {

		System.out.println("this is the login test");
        int i= 9/0;
	}
	
	@Test(dependsOnMethods = "logintest")
	
	public void searchtest() {
		System.out.println("it is the searching test");
	}

}

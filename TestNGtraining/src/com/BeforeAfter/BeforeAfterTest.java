package com.BeforeAfter;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfterTest {

	@BeforeSuite
	public void beforesuite() {
		System.out.println("BeforeSuite");
	}

	@AfterSuite
	public void aftersuite() {
		System.out.println("AfterSuite");
	}

	@BeforeTest
	public void beforetest() {
		System.out.println("beforetest");
	}

	@AfterTest
	public void aftertest() {
		System.out.println("aftettest");
	}

	@BeforeClass
	public void beforeclass() {
		System.out.println("beforeclass");
	}

	@AfterClass
	public void afterclass() {
		System.out.println("afterclass");
	}

	@BeforeMethod
	public void beforemethod() {
		System.out.println("beforemethod");
	}

	@AfterMethod
	public void aftermethod() {
		System.out.println("aftermethod");
	}

	@Test
	public void testcase1() {
		System.out.println("It is the actual test case1");
	}

	@Test(enabled = false)
	public void testcase2() {
		System.out.println("It is the actual test case2");
	}

	@Test(expectedExceptions = { ArithmeticException.class })
	public void testcase3() {
		System.out.println("It is the actual test case2");
		int a = 10 / 0;
	}

}

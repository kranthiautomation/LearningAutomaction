package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestNGbasicsTest {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	}

	@Test(priority = 2, groups = "searching")
	public void testcase1() throws InterruptedException {

		driver.findElement(By.name("q")).sendKeys("Lenovo");
		Thread.sleep(3000);
		driver.findElement(By.name("q")).clear();

	}

	@Test(priority = 3, groups = "searching")
	public void testcase2() throws InterruptedException {

		driver.findElement(By.name("q")).sendKeys("rogers");
		Thread.sleep(3000);
		driver.findElement(By.name("q")).clear();

	}

	@Test(priority = 1, groups = "searching")
	public void testcase3() throws InterruptedException {

		driver.findElement(By.name("q")).sendKeys("federer");
		Thread.sleep(3000);
		driver.findElement(By.name("q")).clear();

	}

	@Test(groups = "linkVerification",priority=4)
	public void testcase4() {
		driver.findElement(By.linkText("Gmail")).isDisplayed();
	}

	@Test(groups = "linkVerification",priority=5)
	public void testcase5() {
		driver.findElement(By.linkText("Images")).isDisplayed();
	}
	
	@Test
	public void testcase6() {
		
		boolean b = driver.findElement(By.linkText("Images")).isDisplayed();
		Assert.assertTrue(b);
		
	}

	@AfterMethod
	public void tearDown() {
		driver.close();

	}
}

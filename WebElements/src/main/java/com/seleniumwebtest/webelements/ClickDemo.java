package com.seleniumwebtest.webelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickDemo {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.manage().deleteAllCookies();
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		Driver.get("https://www.calculator.net/");
		Driver.findElement(By.xpath("//a[contains(text(),'Percentage Calculator')]")).click();
		Driver.findElement(By.xpath("//input[@id='cpar1']")).sendKeys("10");
		Driver.findElement(By.xpath(" //input[@id='cpar2']")).sendKeys("1000");
		Driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/input[2]")).click();
		System.out.println(Driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/p[2]")).getText());
		System.out.println(Driver.findElement(By.xpath("//input[@id='cpar1']")).getAttribute("value"));
		Thread.sleep(5000);
		Driver.close();
	}
}

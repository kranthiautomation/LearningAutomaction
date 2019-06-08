package com.seleniumwebtest.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.calculator.net/");
		driver.findElement(By.xpath("//a[contains(text(),'Mortgage Payoff Calculator')]")).click();
		System.out.println(driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[5]/td[1]/label[1]/span[1]")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[5]/td[1]/label[1]/span[1]")).isEnabled());
		System.out.println(driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[5]/td[1]/label[1]/span[1]")).isSelected());

	}

}

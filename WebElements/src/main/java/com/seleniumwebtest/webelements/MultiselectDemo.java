package com.seleniumwebtest.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MultiselectDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Kranthi%20Kumar.K/Desktop/test-site/site/select_list.html");
		Select select = new Select(driver.findElement(By.id("framework_select")));
		System.out.println(select.isMultiple());
		select.selectByIndex(1);
		select.selectByIndex(2);
		select.selectByIndex(3);
		select.deselectAll();

	}

}

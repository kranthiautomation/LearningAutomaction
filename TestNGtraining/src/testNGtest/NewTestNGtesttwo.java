package testNGtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class NewTestNGtesttwo {

	WebDriver driver;

	

	@BeforeMethod
	public void verifylink() {
		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

	}

	@Test
	public void titlesverificationtest1() {

		String expectedtitle = "Welcome: Mercury Tours";
		String actualtitle = driver.getTitle();
		Assert.assertEquals(actualtitle, expectedtitle);
	}
	@Test
	public void titlesverificationtest2() {
		driver.findElement(By.linkText("REGISTER")).click();
		String expectedtitle = "Register: Mercury Tours";
		String actualtitle = driver.getTitle();
		Assert.assertEquals(actualtitle, expectedtitle);
	}
	@Test
	public void titlesverificationtest3() {
		driver.findElement(By.linkText("SIGN-ON")).click();
		String expectedtitle = "Sign-on: Mercury Tours";
		String actualtitle = driver.getTitle();
		Assert.assertEquals(actualtitle, expectedtitle);
	}
		
	@AfterMethod
	public void afterverfication() {
		driver.close();
	}

}

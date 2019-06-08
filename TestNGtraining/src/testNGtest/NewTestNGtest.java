package testNGtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class NewTestNGtest {

	WebDriver driver;

	@BeforeTest
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

	}

	@Test
	public void titleverificationtest() {

		String expectedtitle = "Welcome: Mercury Tours";
		String actualtitle = driver.getTitle();
		Assert.assertEquals(actualtitle, expectedtitle);

	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}
}

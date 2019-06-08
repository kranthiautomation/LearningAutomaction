package test.dropdown;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

public class welcaretest {

	WebDriver driver;
	Alert alert;

	@BeforeMethod
	public void setUp() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();

		String baseUrl = "http://the-internet.herokuapp.com/dropdown";
		driver.navigate().to(baseUrl);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	@Test
	public void testcase1() throws InterruptedException {

		Select combobox = new Select(driver.findElement(By.id("dropdown")));
		combobox.selectByIndex(1);
		System.out.println(combobox.getOptions().size());
		Thread.sleep(5000);
		
	}
	
	@Test
	public void testcase2() throws InterruptedException {

		Select combobox = new Select(driver.findElement(By.id("dropdown")));
		combobox.selectByVisibleText("Option2");
		System.out.println(combobox.getOptions().size());
		Thread.sleep(5000);
	

	}
	

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}

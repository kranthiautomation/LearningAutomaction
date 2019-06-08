package priority;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Priorityexample {

	WebDriver driver;

	@Test(priority = 0)
	public void openbrowser() {
		System.setProperty("webdriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@Test(priority = 1)
	public void search() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys("Kranthi KUmar");
		driver.findElement(By.name("btnK")).submit();
		Thread.sleep(5000);
	}

	@Test(priority = 2)
	public void tearDown() {
		driver.quit();
	}
}

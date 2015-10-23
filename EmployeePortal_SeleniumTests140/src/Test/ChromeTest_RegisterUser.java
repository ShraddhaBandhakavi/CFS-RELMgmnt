package Test;

import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChromeTest_RegisterUser {


	static Wait<WebDriver> wait;
	@Test
	public void register_chromebrowser() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\CounterWebAppSeleniumTest\\DriverServer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//wait = new WebDriverWait(driver, 5);
		driver.get("http://10.132.18.140:8085/hrapp-1.0");
		// Find the text input element by its name
		//WebElement element;
		
		//Register new User.
		 driver.findElement(By.linkText("Register Here")).click();
		WebElement fname = driver.findElement(By.name("fname"));
		fname.sendKeys("test-user");
		WebElement lname = driver.findElement(By.name("lname"));
		lname.sendKeys("selenium");
		
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("testing@hcl.com");
		
		WebElement uname1 = driver.findElement(By.name("uname"));
		uname1.sendKeys("testuser");
		
		WebElement pass1 = driver.findElement(By.name("pass"));
		pass1.sendKeys("Admin098");
		
		 driver.findElement(By.name("submit-id")).click();
		 System.out.println("Page title is: " + driver.getTitle());
		
		// Close the browser.
		driver.quit();
      
	}
	
	
}

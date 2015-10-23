package Test;

import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChromeTest_LoginNewUser {


	static Wait<WebDriver> wait;
	@Test
	public void login_newuser_chromebrowser() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\CounterWebAppSeleniumTest\\DriverServer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//wait = new WebDriverWait(driver, 5);
		driver.get("http://10.132.18.140:8085/hrapp-1.0/welcome.jsp");
		// Find the text input element by its name
		//WebElement element;
		
		
		//Login with New User.
		 driver.findElement(By.linkText("Go to Login")).click();
		WebElement uname2 = driver.findElement(By.name("uname"));
		uname2.sendKeys("testuser");
		WebElement pass2 = driver.findElement(By.name("pass"));
		pass2.sendKeys("Admin098");
		 driver.findElement(By.name("login")).click();
		 System.out.println("Page title is: " + driver.getTitle());
			// Close the browser.
		driver.quit();
      
	}
	
	
}

package Test;

import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChromeTest_ForgotPassword {


	static Wait<WebDriver> wait;
	@Test
	public void login_chromebrowser() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\CounterWebAppSeleniumTest\\DriverServer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//wait = new WebDriverWait(driver, 5);
		driver.get("http://10.132.18.140:8085/hrapp-1.0");
		// Find the text input element by its name
		//WebElement element;
		
		// Login with default User.
		 
		WebElement uname = driver.findElement(By.name("Forgot Password"));
		
		// Close the browser.
		driver.quit();
      
	}
	
	
}

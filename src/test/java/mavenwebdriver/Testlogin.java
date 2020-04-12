package mavenwebdriver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testlogin {
		
	
	public static WebDriver driver;
	public class LoginTest {
					
		@BeforeSuite
		public void setup() 
		
		{
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
			
		}
		
		@Test
		public void dologin()
		{
			
			driver.get("http://gmail.com");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.findElement(By.id("identifierId")).sendKeys("trainer@way2automation.com");
			
		}
		
		@AfterSuite
		public void teardown()
		{
			driver.quit();
			
		}

	}


}

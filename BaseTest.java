package com.Base;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
	protected WebDriver driver;
	
	@BeforeMethod
	  public void beforeMethod() throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://app-staging.nokodr.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterMethod
	  public void afterMethod() throws InterruptedException
	  {
		Thread.sleep(6000);
		driver.quit();		
	}
	 

}
    
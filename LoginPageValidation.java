package com.AllPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageValidation {
	
	WebDriver driver;
	public LoginPageValidation(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(xpath ="//input[@name=\"username\"]")
	WebElement userid;
	
	@FindBy(xpath ="//input[@autocomplete=\"new-password\"]")
	WebElement passd;
	
	@FindBy(xpath ="//*[@title=\"Log In\"]")
	WebElement login;


   public void LoginPageValidation(String usename, String passname) throws InterruptedException
   {
	   Thread.sleep(3000);
	   userid.sendKeys(usename);
	   Thread.sleep(4000);
	   passd.sendKeys(passname);
	   Thread.sleep(4000);
	   login.click();
	   
	   
     }

}
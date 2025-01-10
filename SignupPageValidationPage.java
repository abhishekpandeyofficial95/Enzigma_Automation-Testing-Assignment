package com.AllPages;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPageValidationPage {
	
	WebDriver driver;
	public SignupPageValidationPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@class=\"slds-float_right\"]/a")
	WebElement signup;
	
	@FindBy(xpath ="//*[@id=\"id_17364210188447499\"]")
	WebElement signupp;
	
	@FindBy(xpath ="//*[@id=\"modal-content-id-1\"]/abx-sign-up/div/div/div[2]/span/div[2]/abx-button/button")
	WebElement procedpath;

   public void SignupPageValidationPage(String emaillll) throws InterruptedException
   {
	   Thread.sleep(3000);
	   signup.click();
	   signupp.sendKeys(emaillll);
	   procedpath.click();
	   
     }

}
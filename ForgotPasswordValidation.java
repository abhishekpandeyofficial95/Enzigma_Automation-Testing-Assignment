package com.AllPages;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordValidation {
	
	WebDriver driver;
	public ForgotPasswordValidation(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="/html/body/app-root/login/abx-auth-container/div/div[2]/div/abx-login/div/a")
	WebElement forgot;
	
	@FindBy(xpath ="//*[@id=\"id_17364173266215197\"]")
	WebElement emailField;
	
	@FindBy(xpath ="//*[@title=\"Proceed\"]")
	WebElement proced;
	
	

   public void ForgotPasswordValidation(String email) throws InterruptedException
   {
	   Thread.sleep(3000);
	   forgot.click();
	   emailField.sendKeys(email);
	   proced.click();
	
	   
     }

}
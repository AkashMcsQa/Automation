package com.MtcPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.MtcUtilities.ExcelUtility;

public class LoginPage extends BasePage{
	
public static 	ExcelUtility e1;

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@placeholder='Email address']")
	WebElement unElement;
	
	@FindBy(xpath = "//input[@id='passwordField']")
	WebElement psElement;
	
	@FindBy(xpath = "//button[@title='Login']")
	WebElement loginButtonElement;
	
	public void setUname() throws Exception {
		
		e1=new ExcelUtility();
	   String un=	e1.userName();
	  unElement.sendKeys(un);
		
		
	}
	public void setPassword() throws Exception {
		e1=new ExcelUtility();
	   String ps=	e1.getPassword();
		psElement.sendKeys(ps);
		
	}
	public void setLoginButton() {
		loginButtonElement.click();
	}
}

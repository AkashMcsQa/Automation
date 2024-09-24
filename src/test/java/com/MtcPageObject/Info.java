package com.MtcPageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.MtcUtilities.ExcelUtility;

public class Info extends BasePage{
	
	public ExcelUtility e1;
	public Info(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//textarea[@placeholder='Notes']")
	WebElement notesElement;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/main/section/div[2]/div/div/div/div[2]/div[2]/span[3]/button")
	WebElement finishButtonElement;
	
	public void setNotes() throws Exception {
		e1=new ExcelUtility();
	String n1=	e1.getNotes();
	
	notesElement.sendKeys(n1);
		
	}
	
	public void setFinishButton() throws Exception {
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click();",finishButtonElement);
	}

}

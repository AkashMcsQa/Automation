package com.MtcPageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class CreateNew extends BasePage{

	public CreateNew(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/main/section/div[1]/div/div[2]/div/div[2]/button")
	WebElement adduserElement;
	
	@FindBy(xpath = "/html/body/div[2]/div/ul/li[2]/span")
	WebElement clickServiveUserElement;
	
	
	public void setCreateNew() {
		Actions a1=new Actions(driver);
		a1.moveToElement(adduserElement).build().perform();
		
	}
	public void setClickOnSu() {
		
	
		   JavascriptExecutor js=(JavascriptExecutor)driver;
	       js.executeScript("arguments[0].click();",clickServiveUserElement);
		
	}

}

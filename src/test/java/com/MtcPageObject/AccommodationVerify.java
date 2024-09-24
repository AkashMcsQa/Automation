package com.MtcPageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.MtcUtilities.ExcelUtility;

public class AccommodationVerify extends BasePage{
	
	public ExcelUtility e1;
	public AccommodationVerify(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//*[@id=\"rc_select_18\"]")
	WebElement accommodationStatusatStartElement;
	
	@FindBy(xpath = "//*[@id=\"rc_select_19\"]")
	WebElement accommodationatEndElement;
	
	@FindBy(xpath = "//input[@placeholder=\"Education / Training Start Notes\"]")
	WebElement accommodationStartNotesElement;
	
	@FindBy(xpath = "//input[@placeholder=\"Education / Training End Notes\"]")
	WebElement accommodationEndNotesElement;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/main/section/div[2]/div/div/div/div[2]/div[2]/span[3]/button")
	WebElement nextButtonElement;
	
	public void setAccommodationStatusStart() {
		accommodationStatusatStartElement.click();
		
	List<WebElement>acc1= driver.findElements(By.xpath("//*[@class=\"rc-virtual-list-holder-inner\"]//div"));
		for(WebElement Dropdown:acc1) {
			if(Dropdown.getText().equals("No fixed Address")) {
				Dropdown.click();
				break;
			}
		}
	}

	public void AccommodationStatusEnd() {
		accommodationatEndElement.click();
		
		accommodationatEndElement.sendKeys(Keys.ENTER);
		
	//List<WebElement>end1=	driver.findElements(By.xpath("//*[@class=\"rc-virtual-list-holder-inner\"]//div"));
		//for(WebElement Dropdown:end1) {
			//if(Dropdown.getText().equals("Home Owner")) {
				//Dropdown.click();
				//break;
			
		
	}
	public void setAccommdationStartNotes() throws Exception {
		e1=new ExcelUtility();
	String s1=	e1.getAccomadtionSTartNotes();
	
	accommodationStartNotesElement.sendKeys(s1);
		
	}
	
	public void setAccommdationEndNotes() throws Exception {
	String a1=	e1.getAccommdationEndNotes();
	accommodationEndNotesElement.sendKeys(a1);
		
	}
	
	public void setNextButton() throws Exception {
		
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click();",nextButtonElement);
	}
}

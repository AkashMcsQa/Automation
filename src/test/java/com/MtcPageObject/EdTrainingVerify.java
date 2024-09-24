package com.MtcPageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.MtcUtilities.ExcelUtility;

public class EdTrainingVerify extends BasePage{
	
	public ExcelUtility e1;
	public EdTrainingVerify(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//*[@id=\"rc_select_16\"]")
	WebElement educationTrainingStartDescriptionElement;
	
	@FindBy(xpath = "//input[@placeholder='Education / Training Start Hours']")
	WebElement educationTrainingStartHoursElement;
	
	@FindBy(xpath = "//input[@placeholder='Education / Training Start Notes']")
	WebElement educationTrainingStartNotesElement;
	
	@FindBy(xpath = "//input[@placeholder='Education / Training End Notes']")
	WebElement educationTrainingEndNotesElement;
	
	@FindBy(xpath = "//*[@id=\"rc_select_17\"]")
	WebElement educationTrainingEndDescriptionElement;
	
	@FindBy(xpath = "//input[@placeholder='Education / Training End Hours']")
	WebElement educationTrainingEndHoursElement;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/main/section/div[2]/div/div/div/div[2]/div[2]/span[3]/button")
	WebElement nextButtonElement;
	
	
	public void setEducationTrainingStartDescription() {
		
		educationTrainingStartDescriptionElement.click();
		
	List<WebElement>edu1=	driver.findElements(By.xpath("//*[@class=\"rc-virtual-list-holder-inner\"]//div"));
	for(WebElement Dropdown:edu1) {
		if(Dropdown.getText().equals("Physically incapable")) {
			Dropdown.click();
			break;
		}
	}
		
	
	}
	
	public void setEducationTrainingStartHours() throws Exception {
		e1=new ExcelUtility();
	String edu1=	e1.getEducationTrainingSTartHours();
		
	educationTrainingStartHoursElement.sendKeys(edu1);
	}
	
	public void setEducationTrainingStartNotes() throws Exception {
		
    String n1=	e1.getEducationTrainingStartNotes();
	
	educationTrainingStartNotesElement.sendKeys(n1);
}
	public void setEducationTrainigEndNotes() throws Exception {
	String end1=	e1.getEducationTrainingEndNotes();
		
		educationTrainingEndNotesElement.sendKeys(end1);
	}
	public void setEductionTrainingEndDescription() {
		
	
	educationTrainingEndDescriptionElement.click();
List<WebElement>ed1=	driver.findElements(By.xpath("//*[@class=\"rc-virtual-list-holder-inner\"]//div"));
	for(WebElement Dropdown:ed1) {
		if(Dropdown.getText().equals("Recalled to custody")) {
			Dropdown.click();
			break;
		}
	}
}
	public void setEducationTrainingEndHours() throws Exception {
	String h1=	e1.getEducationTrainingEndHours();
	educationTrainingEndHoursElement.sendKeys(h1);
	}
		public void setNextButton() throws Exception {
			
			Thread.sleep(2000);
			JavascriptExecutor js=(JavascriptExecutor)driver;
		    js.executeScript("arguments[0].click();",nextButtonElement);
		}
	}

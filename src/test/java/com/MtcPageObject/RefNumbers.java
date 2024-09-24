package com.MtcPageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.MtcUtilities.ExcelUtility;

public class RefNumbers extends BasePage {
	public ExcelUtility e1;
	public RefNumbers(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//input[@placeholder='Pnc']")
	WebElement pncElement;
	
	@FindBy(xpath = "//input[@placeholder='Oypid']")
	WebElement oypidElement;
	
	@FindBy(xpath = "//input[@placeholder='Offender ID']")
	WebElement offendeIdElement;
	
	@FindBy(xpath = "//input[@placeholder='Pnomis']")
	WebElement pnomisElement;
	
	@FindBy(xpath = "//input[@placeholder='Other 2']")
	WebElement other2Element;

	@FindBy(xpath = "//input[@placeholder='NICHE PERSON ID']")
	WebElement nichePerdonIdElement;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/main/section/div[2]/div/div/div/div[2]/div[2]/span[3]/button")
	WebElement nextButtonElement;
	
	public void setPnc() throws Exception {
		e1=new ExcelUtility();
	String p1=	e1.getPnc();
	pncElement.sendKeys(p1);
		
	}
	public void setOypid() throws Exception {
	String oy1=	e1.getOypid();
	oypidElement.sendKeys(oy1);
		
	}
	public void setOffenderId() throws Exception {
	String off1=	e1.getOffendeId();
	offendeIdElement.sendKeys(off1);
		
	}
	public void setPnomis() throws Exception {
	    String p1=	e1.getPnomis();
		pnomisElement.sendKeys(p1);
	}
	
	public void setOther2() throws Exception {
	String othe1=	e1.getOther2();
	other2Element.sendKeys(othe1);
		
	
	}
	
	public void setNichePerson() throws Exception {
	String n1=	e1.getNicheId();
		nichePerdonIdElement.sendKeys(n1);
	}
	
	      public void nextButton() throws Exception {
	    	  
	      Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
	       js.executeScript("arguments[0].click();",nextButtonElement);
}
}

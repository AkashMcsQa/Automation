package com.MtcPageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.MtcUtilities.ExcelUtility;

public class BasicBioInformation extends BasePage{
	
	public ExcelUtility e1;
	public BasicBioInformation(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath = "//*[@id=\"rc_select_1\"]")
	WebElement serviceUserTypElement;
	
	@FindBy(xpath = "//*[@id=\"rc_select_2\"]")
	WebElement titlesElement;
	
	@FindBy(xpath = "//input[@placeholder='First Name']")
	WebElement firstNamElement;
	
	@FindBy(xpath = "//input[@placeholder='Middle Name']")
	WebElement middleNamElement;
	
	@FindBy(xpath = "//input[@placeholder='Last Name']")
	WebElement lastNamElement;
	
	@FindBy(xpath = "//input[@placeholder='Preferred Name']")
	WebElement preferrednamElement;
	
	@FindBy(xpath = "//input[@placeholder='Pronouns']")
	WebElement pronounsElement;
	
	@FindBy(xpath = "//input[@placeholder='Previous Name']")
	WebElement previousNamElement;
	
	@FindBy(xpath = "//input[@placeholder='Contact No (Mobile)']")
	WebElement mobileNumberElement;
	
	@FindBy(xpath = "//input[@placeholder='Contact No (Home)']")
	WebElement homeNumberElement;
	
	@FindBy(xpath = "//input[@placeholder='Contact No (Work)']")
	WebElement workNumberElement;
	
	@FindBy(xpath = "//input[@placeholder='e.g House number and street name']")
	WebElement addressElement;
	
	@FindBy(xpath = "//input[@placeholder='Select date']")
	WebElement dobElement;
	
	@FindBy(xpath = "//input[@placeholder='Email']")
	WebElement emailElement;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement passwordElement;
	
	@FindBy(xpath = "//textarea[@placeholder='Specify details']")
	WebElement specifyDetailsElement;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/main/section/div[2]/div/div/div/div[2]/div[2]/span[2]/button")
	WebElement nextButtonElement;
	
	@FindBy(xpath = "//button[normalize-space()='Add Further Info']")
	WebElement addFurtherInfoElement;
	
	public void setServiceUserType() {
		
		serviceUserTypElement.click();
	List<WebElement>suType=	driver.findElements(By.xpath("//*[@class=\"rc-virtual-list-holder-inner\"]//div"));
		for(WebElement Dropdown:suType) {
			if(Dropdown.getText().equals("Initial Police report made")) {
				Dropdown.click();
				break;
			}
		}
		
	}
	
	    public void setTitiles() {
		titlesElement.click();
	    List<WebElement>tit1=	driver.findElements(By.xpath("//*[@class=\"rc-virtual-list-holder-inner\"]//div"));
		for(WebElement Dropdown:tit1) {
			if(Dropdown.getText().equals("Mrs")) {
				Dropdown.click();
				break;
			}
		}
	}
	    public void setFirstName() throws Exception {
	    	e1=new ExcelUtility();
	    String fn=	e1.firstName();
	    firstNamElement.sendKeys(fn);
	    
	    }
	    
	    public void setMiddleName() throws Exception {
	    String m1=	e1.middleName();
	    middleNamElement.sendKeys(m1);
	    
	    }
	    
	    public void setLastname() throws Exception {
	    String ln=	e1.lastName();
	    lastNamElement.sendKeys(ln);
	    	
	    }
	    public void setPreffredName() throws Exception {
	    String p1=	e1.preffredName();
	    preferrednamElement.sendKeys(p1);
	    }
	    
	    public void pnouns() throws Exception {
	    String p1=	e1.pnouns();
	    pronounsElement.sendKeys(p1);
	    	
	    }
	    
	    public void Setprevious() throws Exception {
	    String p1=	e1.previousName();
	    previousNamElement.sendKeys(p1);
	    	
	    }
	    
	    public void SetmobileNumber() throws Exception {
	    String m1=	e1.mobileNumber();
	    mobileNumberElement.sendKeys(m1);
	    	
	    }
	    
	    public void SethomeNumber() throws Exception {
	    String h1=	e1.homeNumber();
	    	homeNumberElement.sendKeys(h1);
	    }
	    
	    public void setWorkNumber() throws Exception {
	    String w1=	e1.workNumber();
	    
	    workNumberElement.sendKeys(w1);
	    
	    	
	    }
	    
	    public void setAddress() throws Exception {
	    	Thread.sleep(2000);
	    	addressElement.sendKeys("Euston Road, London, Greater London, N1 9AL, United Kingdom");
	   
	    	addressElement.sendKeys(Keys.ENTER);
	    	Thread.sleep(2000);
	    }
	    
	    public void setDOB() throws Exception {
	    	dobElement.sendKeys("01 Sep 1995"+Keys.ENTER);
	    	Thread.sleep(2000);
	    }
	    public void setEmail(String email) {
	    	emailElement.sendKeys(email);
	    	
	    }
	    public void setPassword() throws Exception {
	    String p1=	e1.password();
	    passwordElement.sendKeys(p1);
	    	
	    }
	    public void setSpecifyDetails() throws Exception {
	    String s1=	e1.specifyDetilas();
	    	specifyDetailsElement.sendKeys(s1);
	    }
	    
	    public void setNextButton() {
	    	
	    	  JavascriptExecutor js=(JavascriptExecutor)driver;
		       js.executeScript("arguments[0].click();",nextButtonElement);
	    }

	    
	          public void setAddFurtherInfo() throws Exception {
	    	     Thread.sleep(2000);
	    	     
	    	   JavascriptExecutor js=(JavascriptExecutor)driver;
		       js.executeScript("arguments[0].click();",addFurtherInfoElement);
	    }
}

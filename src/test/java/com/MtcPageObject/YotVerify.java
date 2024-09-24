package com.MtcPageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YotVerify extends BasePage {
	
	public YotVerify(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//*[@id=\"rc_select_20\"]")
	WebElement yotElement;
	
	@FindBy(xpath = "//*[@id=\"rc_select_21\"]")
	WebElement lacStatusElement;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/main/section/div[2]/div/div/div/div[2]/div[2]/span[3]/button")
	WebElement nextButtonElement;
	
	public void setyot() {
		yotElement.click();
		
	List<WebElement>y1=	driver.findElements(By.xpath("//*[@class=\"rc-virtual-list-holder-inner\"]//div"));
		for(WebElement Dropdown:y1) {
			if(Dropdown.getText().equals("Yot2")) {
				Dropdown.click();
				break;
			}
		}
	}
	
	public void setLacSTatus() {
		lacStatusElement.click();
		
	List<WebElement>l1=	driver.findElements(By.xpath("//*[@class=\"rc-virtual-list-holder-inner\"]//div"));
		for(WebElement Dropdown:l1) {
			if(Dropdown.getText().equals("New Local")) {
				Dropdown.click();
				break;
			}
		}
	}
public void setNextButton() throws Exception {
		
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click();",nextButtonElement);

}
}

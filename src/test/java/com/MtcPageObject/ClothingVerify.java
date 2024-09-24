package com.MtcPageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClothingVerify extends BasePage {
	
	public ClothingVerify(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath = "//*[@id=\"rc_select_22\"]")
	WebElement clothingSizElement;
	
	@FindBy(xpath = "//input[@id='rc_select_23']")
	WebElement shoeSizElement;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/main/section/div[2]/div/div/div/div[2]/div[2]/span[3]/button")
	WebElement nextButtonElement;
	
	public void setClothingSize() {
		clothingSizElement.click();
		
	List<WebElement>c1=	driver.findElements(By.xpath("//*[@class=\"rc-virtual-list-holder-inner\"]//div"));
		for(WebElement Dropdown:c1) {
			if(Dropdown.getText().equals("XL")) {
				Dropdown.click();
				break;
			}
		}
	}

	public void setshoeSize() {
		
		shoeSizElement.click();
	List<WebElement>sh1=	driver.findElements(By.xpath("//*[@class=\"rc-virtual-list-holder-inner\"]//div"));
		for(WebElement Dropdown:sh1) {
			if(Dropdown.getText().equals("8")) {
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

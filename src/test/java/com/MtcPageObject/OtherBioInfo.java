package com.MtcPageObject;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class OtherBioInfo extends BasePage{
	
	public OtherBioInfo(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/main/section/div[2]/div/div/div/div[1]/div[2]/div[1]/div[1]/div/div/div/div")
	WebElement assignToElement;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/main/section/div[2]/div/div/div/div[1]/div[2]/div[1]/div[2]/div/div/div/div")
	WebElement preffredCommunicationElement;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/main/section/div[2]/div/div/div/div[1]/div[2]/div[1]/div[3]/div/div/div/div")
	WebElement lauexclutionElement;
	
	@FindBy(xpath = "//*[@id=\"rc_select_6\"]")
	WebElement religin;
	
	@FindBy(xpath = "//*[@id=\"rc_select_7\"]")
	WebElement immgirationStatusElement;
	
	@FindBy(xpath = "//*[@id=\"rc_select_8\"]")
	WebElement prefrredSpokenLanaguElement;
	
	@FindBy(xpath = "//*[@id=\"rc_select_9\"]")
	WebElement preffredWrittenlanaguElement;
	
	@FindBy(xpath = "//input[@placeholder='TBD 2']")
	WebElement tbd2Element;
	
	@FindBy(xpath = "//input[@placeholder='TBD 1']")
	WebElement tbd1Element;
	
	@FindBy(xpath = "//*[@id=\"rc_select_10\"]")
	WebElement gendarElement;
	
	@FindBy(xpath = "//*[@id=\"rc_select_11\"]")
	WebElement nationalityElement;
	
	@FindBy(xpath = "//*[@id=\"rc_select_12\"]")
	WebElement ethincityElement;
	
	@FindBy(xpath = "//*[@id=\"rc_select_13\"]")
	WebElement pncrhicCodElement;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/main/section/div[2]/div/div/div/div[1]/div[2]/div[2]/div[7]/div/div/div/div")
	WebElement disabilityElement;
	
	@FindBy(xpath = "//*[@id=\"rc_select_15\"]")
	WebElement sexualOrintionalElement;
	
	@FindBy(xpath = "//select[@placeholder='Fingerprint']")
	WebElement fingerprintElement;
	
	@FindBy(xpath = "//select[@placeholder='DNA']")
	WebElement dnaElement;
	
	@FindBy(xpath = "//input[@placeholder='TBD 3']")
	WebElement tbd3Element;
	
	@FindBy(xpath = "//input[@placeholder='TBD 4']")
	WebElement tbd4Element;
	
	@FindBy(xpath = "//input[@placeholder='TBD 5']")
	WebElement tbd5Element;
	
	@FindBy(xpath = "//input[@placeholder='TBD 6']")
	WebElement tbd6Element;
	
	@FindBy(xpath = "//input[@placeholder='TBD 7']")
	WebElement tbd7Element;
	
	@FindBy(xpath = "//input[@placeholder='TBD 8']")
	WebElement tbd8Element;
	
	@FindBy(xpath = "//input[@placeholder='TBD 9']")
	WebElement tbd9Element;
	
	@FindBy(xpath = "//input[@placeholder='TBD 10']")
	WebElement tbd10Element;
	
	@FindBy(xpath = "//input[@placeholder='TBD 11']")
	WebElement tbd11Element;
	
	@FindBy(xpath = "//input[@placeholder='TBD 12']")
	WebElement tbd12Element;
	
	@FindBy(xpath = "//input[@placeholder='TBD 13']")
	WebElement tbd13Element;
	
	@FindBy(xpath = "//input[@placeholder='TBD 14']")
	WebElement tbd14Element;
	
	@FindBy(xpath = "//input[@placeholder='TBD 15']")
	WebElement tbd15Element;
	
	@FindBy(xpath = "//input[@placeholder='TBD 16']")
	WebElement tbd16Element;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/main/section/div[2]/div/div/div/div[1]/div[2]/div[3]/div[1]/div/div/div/div/span/div/span")
	WebElement profileUploadElement;
	
	@FindBy(xpath = "/html/body/div[16]/div/div[2]/div/div[2]/div[3]/button[2]")
	WebElement okButtonElement;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/main/section/div[2]/div/div/div/div[2]/div[2]/span[3]/button")
	WebElement nextButtonElement;
	public void SetAssignTo() {
		
		assignToElement.click();
	List<WebElement>ass1=	driver.findElements(By.xpath("//*[@class=\"rc-virtual-list-holder-inner\"]//div"));
		for(WebElement Dropdown:ass1) {
			if(Dropdown.getText().equals("Sid PRACTITIONER")) {
				Dropdown.click();
				break;
			}
		}
	}
	
	public void SetpreffredCommunication() {
		preffredCommunicationElement.click();
	List<WebElement>pre1=	driver.findElements(By.xpath("//*[@class=\"rc-virtual-list-holder-inner\"]//div"));
		for(WebElement Dropdown:pre1) {
			if(Dropdown.getText().equals("Phone - Home")) {
				Dropdown.click();
				break;
			}
		}
		
	}
	
	public void SetLAU() {
		lauexclutionElement.click();
	List<WebElement>lau1=	driver.findElements(By.xpath("//*[@class=\"rc-virtual-list-holder-inner\"]//div"));
		for(WebElement Dropdown:lau1) {
			if(Dropdown.getText().equals("SIDDHARAJSINH VAGHELA")) {
				Dropdown.click();
				break;
			}
		}
	}
	
	public void setReligin() {
		religin.click();
	List<WebElement>re1=	driver.findElements(By.xpath("//*[@class=\"rc-virtual-list-holder-inner\"]//div"));
		for(WebElement Dropdown:re1) {
			if(Dropdown.getText().equals("Zoroastrian")) {
				Dropdown.click();
				break;
			}
		}
	}
	
	public void setImmigirationStatus() {
		immgirationStatusElement.click();
	List<WebElement>imm1=	driver.findElements(By.xpath("//*[@class=\"rc-virtual-list-holder-inner\"]//div"));
		for(WebElement Dropdown:imm1) {
			if(Dropdown.getText().equals("Sole representative")) {
				Dropdown.click();
				break;
			}
		}
	}
	
	public void setPrefSpkoenLangaue() {
		prefrredSpokenLanaguElement.click();
		
	List<WebElement>preSpLa1=	driver.findElements(By.xpath("//*[@class=\"rc-virtual-list-holder-inner\"]//div"));
		for(WebElement Dropdown:preSpLa1) {
			if(Dropdown.getText().equals("English")) {
				Dropdown.click();
				break;
			}
		}
	}
	
	public void preWrittenLange() {
		preffredWrittenlanaguElement.click();
	List<WebElement>preWriLan1=	driver.findElements(By.xpath("//*[@class=\"rc-virtual-list-holder-inner\"]//div"));
		for(WebElement Dropdown:preWriLan1) {
			if(Dropdown.getText().equals("Egyptian Spoken Arabic")) {
				Dropdown.click();
				break;
			}
		}
	}
	public void setTbd2(String tbd2) {
		tbd2Element.sendKeys(tbd2);
	}
	public void setTbd1(String tbd1) {
		tbd1Element.sendKeys(tbd1);
	}
	
	public void setGendar() {
		gendarElement.click();
	List<WebElement>gen1=	driver.findElements(By.xpath("//*[@class=\"rc-virtual-list-holder-inner\"]//div"));
		for(WebElement Dropdown:gen1) {
			if(Dropdown.getText().equals("Male")) {
				Dropdown.click();
				break;
			}
		}
	}
	
	public void setNationality() throws Exception {
		nationalityElement.sendKeys(Keys.ENTER);
		
		nationalityElement.sendKeys(Keys.ENTER);
		
	}
	public void setEhincity() {
		ethincityElement.click();
	List<WebElement>ethi1=	driver.findElements(By.xpath("//*[@class=\"rc-virtual-list-holder-inner\"]//div"));
		for(WebElement Dropdown:ethi1) {
			if(Dropdown.getText().equals("(W3) White, Gypsy or Irish Traveller")) {
				Dropdown.click();
				break;
			}
		}
	}

	public void setPncEthicCode() {
		pncrhicCodElement.click();
	List<WebElement>pnc1=	driver.findElements(By.xpath("//*[@class=\"rc-virtual-list-holder-inner\"]//div"));
		for(WebElement Dropdown:pnc1) {
			if(Dropdown.getText().equals("White (South – Dark) European(2)")) {
				Dropdown.click();
				break;
			}
		}
	}
	public void setDisability() {
		disabilityElement.click();
	List<WebElement>dis1=	driver.findElements(By.xpath("//*[@class=\"rc-virtual-list-holder-inner\"]//div"));
		for(WebElement Dropdown:dis1) {
			if(Dropdown.getText().equals("Learning Difficulties")) {
				Dropdown.click();
				break;
			}
		}
	}
	
	public void setSexualOrintation() {
		sexualOrintionalElement.click();
	List<WebElement>se1=	driver.findElements(By.xpath("//*[@class=\"rc-virtual-list-holder-inner\"]//div"));
		for(WebElement Dropdown:se1) {
			if(Dropdown.getText().equals("Gay/Lesbian")) {
				Dropdown.click();
				break;
			}
		}
	}
	
	public void setFinergeprint() {
		Select s1=new Select(fingerprintElement);
		s1.selectByValue("4");
	}
	public void setDna() {
		Select s2=new Select(dnaElement);
		s2.selectByValue("3");
	}
	
	public void setTbd3(String tbd3) {
		tbd3Element.sendKeys(tbd3);
	}
	
	public void setTbd4(String tbd4) {
		tbd4Element.sendKeys(tbd4);
	}
	
	public void setTbd5(String tbd5) {
		tbd5Element.sendKeys(tbd5);
	}
	
	public void setTbd6(String tbd6) {
		tbd6Element.sendKeys(tbd6);
	}
	
	public void setTbd7(String tbd7) {
		tbd7Element.sendKeys(tbd7);
	}
	public void setTbd8(String tbd8) {
		tbd8Element.sendKeys(tbd8);
	}
	
	public void setTbd9(String tbd9) {
		tbd9Element.sendKeys(tbd9);
	}
	
	public void setTbd10(String tbd10) {
		tbd10Element.sendKeys(tbd10);
	}
	
	public void setTbd11(String tbd11) {
		tbd11Element.sendKeys(tbd11);
	}
	
	public void setTbd12(String tbd12) {
		tbd12Element.sendKeys(tbd12);
	}
	
	public void setTbd13(String tbd13) {
		tbd13Element.sendKeys(tbd13);
	}
	
	public void setTbd14(String tbd14) {
		tbd14Element.sendKeys(tbd14);
	}
	public void setTbd15(String tbd15) {
		tbd15Element.sendKeys(tbd15);
	}
	public void setTbd16(String tbd16) {
		tbd16Element.sendKeys(tbd16);
	}
	
	public void setprofilePicture() throws Exception {
		
		Thread.sleep(2000);
		//profileUploadElement.click();
		
		 JavascriptExecutor js=(JavascriptExecutor)driver;
	     js.executeScript("arguments[0].click();",profileUploadElement);
		
		Robot r1=new Robot();
		r1.delay(2000);
		StringSelection s1=new StringSelection("\"C:\\Upload\\images.jpg\"");
		
		  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s1, null);
          
          r1.keyPress(KeyEvent.VK_CONTROL);
          
          r1.keyPress(KeyEvent.VK_V);
          
          r1.keyPress(KeyEvent.VK_ENTER);
          
          r1.keyPress(KeyEvent.VK_ENTER);
          
          Thread.sleep(2000);
          okButtonElement.click();
	
		
	}
	
        	public void setNextButton() throws Exception {
		
		   Thread.sleep(2000);
		   
		   JavascriptExecutor js=(JavascriptExecutor)driver;
	       js.executeScript("arguments[0].click();",nextButtonElement);
	}
	
}

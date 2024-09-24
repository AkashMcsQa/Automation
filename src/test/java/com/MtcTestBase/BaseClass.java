package com.MtcTestBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {

	public static WebDriver driver;
	public Properties p1;
	public Logger logger;  //Log4j

	@BeforeClass(groups = {"Master","Sanity","Regression"})
	@Parameters({"os","browser"})
	public void setup(String os,String br) throws Exception {
		FileInputStream f1=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\HybrirdServiceUser\\src\\test\\resources\\config.properties");
	
		p1=new Properties();
		p1.load(f1);
		logger=LogManager.getLogger(this.getClass());  //lOG4J2

		switch(br.toLowerCase()) {
		case "chrome":driver=new ChromeDriver();
		break;
		
		case "edge" :driver=new EdgeDriver();
		break;
		
		case "firefox":driver=new FirefoxDriver();
		break;
		
		default :System.out.println("Not Browser found");
		}
		
		
		driver.get(p1.getProperty("url"));
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterClass(groups = {"Master","Regression"})
	public void tearDown() {
		//driver.close();
		
		
		
	}
	
	public String randomString() {
		
	String generateRandom=	RandomStringUtils.randomAlphabetic(6);
	return generateRandom;
		
		
	}
	
	public String captureScreen(String tname) throws IOException {

		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
				
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		
		String targetFilePath=System.getProperty("user.dir")+"\\screenshots\\" + tname + "_" + timeStamp + ".png";
		File targetFile=new File(targetFilePath);
		
		sourceFile.renameTo(targetFile);
			
		return targetFilePath;

}

}
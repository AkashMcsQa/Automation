package com.MtcTestCases;

import org.testng.annotations.Test;

import com.MtcPageObject.AccommodationVerify;
import com.MtcPageObject.BasicBioInformation;
import com.MtcPageObject.ClothingVerify;
import com.MtcPageObject.CreateNew;
import com.MtcPageObject.EdTrainingVerify;
import com.MtcPageObject.Info;
import com.MtcPageObject.LoginPage;
import com.MtcPageObject.OtherBioInfo;
import com.MtcPageObject.RefNumbers;
import com.MtcPageObject.YotVerify;
import com.MtcTestBase.BaseClass;

public class TC00_MtcServiceUser extends BaseClass{
	
	@Test(priority = 1,groups = {" Master","Sanity","Regression"})
	public void LoginPageVerify() throws Exception {
		
		LoginPage l1=new LoginPage(driver);
		l1.setUname();
		l1.setPassword();
		l1.setLoginButton();
		
		logger.info("Login Page succesfully");

	}

	@Test(priority = 2,groups = {" Master","Sanity","Regression"})
	public void createNewSUser() {
		CreateNew c1=new CreateNew(driver);
		c1.setCreateNew();
		c1.setClickOnSu();
		
		logger.info("Create new User succesfully updates");
	}
	
	@Test(priority = 3,groups = {"Master","Sanity","Regression"})
	public void BasicBioInfo() throws Exception {
		BasicBioInformation b1=new BasicBioInformation(driver);
		
		b1.setServiceUserType();
		
		b1.setTitiles();
		
		b1.setFirstName();
		
		b1.setMiddleName();
		
		b1.setLastname();
		
		b1.setPreffredName();
		
		b1.pnouns();
		
		b1.Setprevious();
		
		b1.SetmobileNumber();
		
		b1.SethomeNumber();
		
		b1.setWorkNumber();
		
		b1.setAddress();
		
		b1.setDOB();
		
		b1.setEmail(randomString()+"@gmail.co.uk");
		
		b1.setPassword();
		
		b1.setSpecifyDetails();
		
		b1.setNextButton();
		
		b1.setAddFurtherInfo();
		
		logger.info("Basic bio information succesfully update");
	}
	
	@Test(priority = 4,groups = {"Master","Sanity","Regression"})
	public void OtherBioInformation() throws Exception {
		OtherBioInfo p=new OtherBioInfo(driver);
		p.SetAssignTo();
		p.SetpreffredCommunication();
		p.SetLAU();
		p.setReligin();
		p.setImmigirationStatus();
		p.setPrefSpkoenLangaue();
		p.preWrittenLange();
		
		p.setTbd2(randomString());
		p.setTbd1(randomString());
		
		p.setGendar();
		p.setNationality();
		p.setEhincity();
		p.setPncEthicCode();
		p.setDisability();
		p.setSexualOrintation();
		
		p.setFinergeprint();
		p.setDna();
		
		p.setTbd3(randomString().toUpperCase());
		p.setTbd4(randomString().toUpperCase());
		p.setTbd5(randomString().toUpperCase());
		p.setTbd6(randomString().toUpperCase());
		p.setTbd7(randomString().toUpperCase());
		p.setTbd8(randomString().toUpperCase());
		p.setTbd9(randomString().toUpperCase());
		p.setTbd10(randomString().toUpperCase());
		p.setTbd11(randomString().toUpperCase());
		p.setTbd12(randomString().toUpperCase());
		p.setTbd13(randomString().toUpperCase());
		p.setTbd14(randomString().toUpperCase());
		p.setTbd15(randomString().toUpperCase());
		p.setTbd16(randomString().toLowerCase());
		
		p.setprofilePicture();
		p.setNextButton();
		
		
		
		
		
	}
	
	@Test(priority = 5,groups = {"Master","Sanity","Regression"})
	public void RefNumbersverify() throws Exception {
		RefNumbers r1=new RefNumbers(driver);
		r1.setPnc();
		r1.setOypid();
		r1.setOffenderId();
		r1.setPnomis();
		r1.setOther2();
		r1.setNichePerson();
		r1.nextButton();
	}
	
	@Test(priority = 6,groups = {"Master","Sanity","Regression"})
	public void EdTraining() throws Exception {
		EdTrainingVerify ed1=new EdTrainingVerify(driver);
		
		ed1.setEducationTrainingStartDescription();
		
		ed1.setEducationTrainingStartHours();
		
		ed1.setEducationTrainingStartNotes();
		
		ed1.setEducationTrainigEndNotes();
		
		ed1.setEductionTrainingEndDescription();
		
		ed1.setEducationTrainingEndHours();
		
		ed1.setNextButton();
		
	}
	
	@Test(priority = 7,groups = {"Master","Sanity","Regression"})
	public void Accommodation() throws Exception {
		AccommodationVerify ac1=new AccommodationVerify(driver);
		
		ac1.setAccommodationStatusStart();
		
		ac1.AccommodationStatusEnd();
		
		ac1.setAccommdationStartNotes();
		
		ac1.setAccommdationEndNotes();
		
		ac1.setNextButton();
	}
	
	@Test(priority = 8,groups = {"Master","Sanity","Regression"})
	public void Yot() throws Exception {
		YotVerify y1=new YotVerify(driver);
		
		y1.setyot();
		
		y1.setLacSTatus();
		
		y1.setNextButton();
	}
	
	@Test(priority = 9,groups = {"Master","Sanity","Regression"})
	public void Clothing() throws Exception {
		ClothingVerify c1=new ClothingVerify(driver);
		c1.setClothingSize();
		
		c1.setshoeSize();
		
		c1.setNextButton();
	}
	
	@Test(priority = 10,groups = {"Master","Sanity","Regression"})
	public void Information() throws Exception {
		Info in=new Info(driver);
		
		in.setNotes();
		
		in.setFinishButton();
		
	
		
	}
}

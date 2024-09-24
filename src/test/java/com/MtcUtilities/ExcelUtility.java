package com.MtcUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
	public static FileInputStream fis;
	public static XSSFWorkbook w1;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;

	public String userName() throws IOException {
		fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\HybrirdServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
	w1=new XSSFWorkbook(fis);
	sheet=w1.getSheetAt(0);
	row=sheet.getRow(1);
	cell=row.getCell(0);
	String UserName=cell.getStringCellValue();
	return UserName;
}
	public String getPassword() throws IOException {
		fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\HybrirdServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
        w1=new XSSFWorkbook(fis);
        sheet=w1.getSheetAt(0);
        row=sheet.getRow(1);
        cell=row.getCell(1);
        String Password=cell.getStringCellValue();
        return Password;
	}
	
	public String firstName() throws Exception{
		fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\HybrirdServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
        w1=new XSSFWorkbook(fis);
        sheet=w1.getSheetAt(0);
        row=sheet.getRow(1);
        cell=row.getCell(2);
        String FirstName=cell.getStringCellValue();
        return FirstName;
		
	}
	public String middleName() throws IOException {
		fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\HybrirdServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
        w1=new XSSFWorkbook(fis);
        sheet=w1.getSheetAt(0);
        row=sheet.getRow(1);
        cell=row.getCell(3);
        String MiddleName=cell.getStringCellValue();
        return MiddleName;
	}
	
	public String lastName() throws Exception {
		fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\HybrirdServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
        w1=new XSSFWorkbook(fis);
        sheet=w1.getSheetAt(0);
        row=sheet.getRow(1);
        cell=row.getCell(4);
        String LastName=cell.getStringCellValue();
        return LastName;
	}
	public String preffredName() throws Exception {
		fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\HybrirdServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
        w1=new XSSFWorkbook(fis);
        sheet=w1.getSheetAt(0);
        row=sheet.getRow(1);
        cell=row.getCell(5);
        String PreferredName=cell.getStringCellValue();
        return PreferredName;
        
	}
	public String  pnouns() throws Exception {
		fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\HybrirdServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
        w1=new XSSFWorkbook(fis);
        sheet=w1.getSheetAt(0);
        row=sheet.getRow(1);
        cell=row.getCell(6);
        String Pronouns=cell.getStringCellValue();
        return Pronouns;
	}
	
	public String previousName() throws Exception {
		fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\HybrirdServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
        w1=new XSSFWorkbook(fis);
        sheet=w1.getSheetAt(0);
        row=sheet.getRow(1);
        cell=row.getCell(7);
        String PreviousName=cell.getStringCellValue();
        return PreviousName;
	}
	public String mobileNumber() throws Exception {
		fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\HybrirdServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
        w1=new XSSFWorkbook(fis);
        sheet=w1.getSheetAt(0);
        row=sheet.getRow(1);
        cell=row.getCell(8);
        String MobileNumber=cell.getStringCellValue();
        return MobileNumber;
	}
	public String  homeNumber() throws Exception {
		fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\HybrirdServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
        w1=new XSSFWorkbook(fis);
        sheet=w1.getSheetAt(0);
        row=sheet.getRow(1);
        cell=row.getCell(9);
        String HomeNumber=cell.getStringCellValue();
        return HomeNumber;
	}
	public String workNumber() throws Exception {
		fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\HybrirdServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
        w1=new XSSFWorkbook(fis);
        sheet=w1.getSheetAt(0);
        row=sheet.getRow(1);
        cell=row.getCell(10);
        String WorkNumber=cell.getStringCellValue();
        return WorkNumber;
	}
	public String password() throws Exception {
		fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\HybrirdServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
        w1=new XSSFWorkbook(fis);
        sheet=w1.getSheetAt(0);
        row=sheet.getRow(1);
        cell=row.getCell(11);
        String Password=cell.getStringCellValue();
        return Password;
	}
	public String specifyDetilas() throws Exception {
		fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\HybrirdServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
        w1=new XSSFWorkbook(fis);
        sheet=w1.getSheetAt(0);
        row=sheet.getRow(1);
        cell=row.getCell(12);
        String SpecifyDetails=cell.getStringCellValue();
        return SpecifyDetails;
	}
	
	public String getPnc() throws Exception {
		fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\HybrirdServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
        w1=new XSSFWorkbook(fis);
        sheet=w1.getSheetAt(0);
        row=sheet.getRow(1);
        cell=row.getCell(13);
        String Pnc=cell.getStringCellValue();
        return Pnc;
	}
	public String getOypid() throws Exception {
		fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\HybrirdServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
        w1=new XSSFWorkbook(fis);
        sheet=w1.getSheetAt(0);
        row=sheet.getRow(1);
        cell=row.getCell(14);
        String Oypid=cell.getStringCellValue();
        return Oypid;
	}
	
	public String getOffendeId() throws Exception {
		fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\HybrirdServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
        w1=new XSSFWorkbook(fis);
        sheet=w1.getSheetAt(0);
        row=sheet.getRow(1);
        cell=row.getCell(15);
        String OffenderID=cell.getStringCellValue();
        return OffenderID;
	}
	
	public String getPnomis() throws Exception {
		fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\HybrirdServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
        w1=new XSSFWorkbook(fis);
        sheet=w1.getSheetAt(0);
        row=sheet.getRow(1);
        cell=row.getCell(16);
        String Pnomis=cell.getStringCellValue();
        return Pnomis;
	}
	public String getOther2() throws Exception {
	fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\HybrirdServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
    w1=new XSSFWorkbook(fis);
    sheet=w1.getSheetAt(0);
    row=sheet.getRow(1);
    cell=row.getCell(17);
    String Other2=cell.getStringCellValue();
    return Other2;
	}
	public String getNicheId() throws Exception {
		fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\HybrirdServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
        w1=new XSSFWorkbook(fis);
        sheet=w1.getSheetAt(0);
        row=sheet.getRow(1);
        cell=row.getCell(18);
        String NICHEPERSONID=cell.getStringCellValue();
        return NICHEPERSONID;
	}
	public String getEducationTrainingSTartHours() throws Exception {
		fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\HybrirdServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
        w1=new XSSFWorkbook(fis);
        sheet=w1.getSheetAt(0);
        row=sheet.getRow(1);
        cell=row.getCell(19);
        String EducationTrainingStartHours=cell.getStringCellValue();
        return EducationTrainingStartHours;
	}
	
	public String getEducationTrainingStartNotes() throws Exception {
		fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\HybrirdServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
        w1=new XSSFWorkbook(fis);
        sheet=w1.getSheetAt(0);
        row=sheet.getRow(1);
        cell=row.getCell(20);
        String EducationTrainingStartNotes=cell.getStringCellValue();
        return EducationTrainingStartNotes;
        
	}
	public String getEducationTrainingEndNotes() throws Exception {
		fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\HybrirdServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
        w1=new XSSFWorkbook(fis);
        sheet=w1.getSheetAt(0);
        row=sheet.getRow(1);
        cell=row.getCell(21);
        String EducationTrainingEndNotes=cell.getStringCellValue();
        return EducationTrainingEndNotes;
	}
	public String getEducationTrainingEndHours() throws Exception {
		fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\HybrirdServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
        w1=new XSSFWorkbook(fis);
        sheet=w1.getSheetAt(0);
        row=sheet.getRow(1);
        cell=row.getCell(22);
        String EducationTrainingEndHours=cell.getStringCellValue();
        return EducationTrainingEndHours;
	}
	public String getAccomadtionSTartNotes() throws Exception {
		fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\HybrirdServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
        w1=new XSSFWorkbook(fis);
        sheet=w1.getSheetAt(0);
        row=sheet.getRow(1);
        cell=row.getCell(23);
        String AccommodationStartNotes=cell.getStringCellValue();
        return AccommodationStartNotes;
	}
	
	public String getAccommdationEndNotes() throws Exception {
		fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\HybrirdServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
        w1=new XSSFWorkbook(fis);
        sheet=w1.getSheetAt(0);
        row=sheet.getRow(1);
        cell=row.getCell(24);
        String AccommodationEndNotes=cell.getStringCellValue();
        return AccommodationEndNotes;
	}
	
	public String getNotes() throws Exception {
		fis=new FileInputStream("C:\\Users\\akash.dake\\eclipse-workspace\\HybrirdServiceUser\\src\\test\\resources\\ServiceUser.xlsx");
        w1=new XSSFWorkbook(fis);
        sheet=w1.getSheetAt(0);
        row=sheet.getRow(1);
        cell=row.getCell(25);
        String Notes=cell.getStringCellValue();
        return Notes;
	}
	//Notes







	
 

}








	
	

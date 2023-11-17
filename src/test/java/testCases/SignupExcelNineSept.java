package testCases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageObjectModel.LoginPageObjects;
import resources.BaseClass;

public class SignupExcelNineSept extends BaseClass{
	
	@Test
	public void SigupExcel() throws IOException, InterruptedException
	{
		FileInputStream fs=new FileInputStream("F:\\Testing class\\Sept\\excel\\9 Sept Signup saleforce.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fs);
		XSSFSheet sheet=workbook.getSheetAt(0);   // enter in sheet
		
		XSSFRow row1=sheet.getRow(1);  // enter in second row
		
		  
		XSSFCell cell1=row1.getCell(0);   
		String c1=cell1.toString();
		
		XSSFCell cell2=row1.getCell(1);
		String c2=cell2.toString();
		
		XSSFCell cell3=row1.getCell(2);
		String c3=cell3.toString();
		
		XSSFCell cell4=row1.getCell(3);
		String c4=cell4.toString();
		
		XSSFCell cell5=row1.getCell(4);
		String c5=cell5.toString();  
		
		System.out.println(sheet.getRow(1).getCell(0));
		System.out.println(sheet.getRow(1).getCell(1));
		System.out.println(sheet.getRow(1).getCell(2));
		System.out.println(sheet.getRow(1).getCell(3));
		System.out.println(sheet.getRow(1).getCell(4));
		
		// Thread.sleep(2000);
		
		driverInitialize();   // call from baseclass object file
		
		LoginPageObjects lpo=new LoginPageObjects(driver); // main file name
		
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		
		// Thread.sleep(2000);
		
		lpo.enterFname().sendKeys(c1);
		
		lpo.checkbox().click();   // not run when done in last , also not after c5
		Thread.sleep(1000);
		
		lpo.enterLname().sendKeys(c2);
		lpo.entermail().sendKeys(c3);
		lpo.enterCname().sendKeys(c4);
		lpo.enterphone().sendKeys(c5);
		
	
		
		 
		 Thread.sleep(2000);
		 
		WebElement s=lpo.enterJob();	
		Select s1=new Select(s);
		s1.selectByIndex(4);
		
		WebElement e=lpo.SelectEmpoye();
		Select e1=new Select(e);
		e1.selectByIndex(4);
		
		WebElement country=lpo.selectcountry();
		Select ct=new Select(country);
		ct.selectByIndex(3);
		
		
	    
		
		
		
		
		
		
	}

}

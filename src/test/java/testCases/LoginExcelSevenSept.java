// 7 & 8 spt both in this class.

package testCases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjectModel.LoginPageObjects;
import resources.BaseClass;

public class LoginExcelSevenSept extends BaseClass{
	
	@Test
	public void login() throws IOException, InterruptedException
	{
		FileInputStream fs=new FileInputStream("F:\\Testing class\\Sept\\excel\\1sept handleExcel.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(fs);
		
		XSSFSheet sheet=workbook.getSheetAt(0);
		
		XSSFRow row=sheet.getRow(0);
		
		XSSFCell cell1=row.getCell(0);
		
		String c1=cell1.toString();
		
		XSSFCell cell2=row.getCell(1);
		
		String c2=cell2.toString();
		
		XSSFRow row1=sheet.getRow(1); // enterr in second row
		
		XSSFCell cell3=row1.getCell(0);
		
		String c3=cell3.toString();
		
		XSSFCell cell4=row1.getCell(1);
		
		String c4=cell4.toString();
		
		
		
		driverInitialize();
		
		driver.get("https://login.salesforce.com/?locale=in");
		
		Thread.sleep(1000);
		
		LoginPageObjects lpo=new LoginPageObjects(driver); 
		//loginpageobject is name of main file.
		// remove error by create constructor
		//this error because two driver name in two different files that why
		
		lpo.enterUsername().sendKeys(c1);
		
		lpo.enterPassword().sendKeys(c2);
		
		Thread.sleep(000);
		
		lpo.enterClickLogin().click();
		
		Thread.sleep(15000);    // for second login
		
		/* lpo.enterUsername().sendKeys(c3);
		
		 lpo.enterPassword().sendKeys(c4);
		
		Thread.sleep(2000);
		
		lpo.enterClickLogin().click();    */   // for fast test it coment by me. 
		
		// Thread.sleep(1000);
		
		String actual=lpo.getErrorMessage().getText();
		
		String expected="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		
// if expected is same error mesage that appear on screen then tesst is pass else fail.
		
		// for hard assertion-
		
	//	Assert.assertEquals(actual, expected);    //this also done
     // for Assert ctrl space choose testng first.
		
	//	Assert.assertEquals(actual, expected,"somethign ent wrong");   // coment for hard both not run same time
		// this also done if we want some mesage to show if it wrong.
		//if it right then not show any message.
		
		// for soft assertion-
		
		SoftAssert a=new SoftAssert();  // for softassert choose tesng .
		
		a.assertEquals(actual, expected);
		
	System.out.println("some remaining code");
// this code run only in soft assertion not in hard assertion in both wrong right both case.
	
	     a.assertAll();  
	     /* according by my search assertAll validates all test cases.
	     If some assertions fail, then also it will continue the rest of the assertions 
	     and return the validation result for all failed assertion. */
		
		
	}
	
	
	

}

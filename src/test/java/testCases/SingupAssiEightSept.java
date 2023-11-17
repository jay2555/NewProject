package testCases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageObjectModel.LoginPageObjects;
import resources.BaseClass;

public class SingupAssiEightSept extends BaseClass
{
	@Test
	public void Signup() throws IOException, InterruptedException
	{
		driverInitialize();
		
		driver.get("https://login.salesforce.com/?locale=in");
		
		LoginPageObjects lpo=new LoginPageObjects(driver); 
		// main file name
		
		lpo.TryForFree().click();
        
		Thread.sleep(2000);
		
		lpo.enterFname().sendKeys("Abc");
		lpo.enterLname().sendKeys("Xyz");
		lpo.entermail().sendKeys("AbcXyz@gmail.com");
		
		WebElement s=lpo.enterJob();	
		Select s1=new Select(s);
		s1.selectByIndex(5);
		
		
		lpo.enterCname().sendKeys("IT Company");
		
		WebElement e=lpo.SelectEmpoye();
		Select e1=new Select(e);
		e1.selectByIndex(3);
		
		lpo.enterphone().sendKeys("1234567890");
		
		WebElement country=lpo.selectcountry();
		Select c2=new Select(country);
		c2.selectByIndex(4);
		
		
		Thread.sleep(2000);
		
		lpo.enterFname();	
		Thread.sleep(2000);
	    lpo.checkbox().click();
		
		
		
				
		
		
	}

}

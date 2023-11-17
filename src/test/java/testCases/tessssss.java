package testCases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageObjectModel.LoginPageObjects;
import resources.BaseClass;

public class tessssss extends BaseClass
{
	@Test
	public void login() throws IOException
	{
		driverInitialize();
		
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		LoginPageObjects lpo=new LoginPageObjects(driver); 
		
		lpo.checkbox().click();
		
		
	}
	
	
	
}

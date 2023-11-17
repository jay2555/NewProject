package testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import resources.BaseClass;

public class VerifyloginSixSeptBase extends BaseClass {   // add baseclass resources by adding
	// class extends baseclass to connect using intereface
	@Test
	public void login() throws IOException, InterruptedException
	{
		driverInitialize();   // after baseclass extends by interface add throws to driver initialize
		
		driver.get("https://login.salesforce.com/?locale=in");
		
		Thread.sleep(1000);
		
		WebElement UN=driver.findElement(By.id("username"));
		
		UN.sendKeys("xyz@gmail.com");
		
		WebElement pw=driver.findElement(By.id("password"));
		
		pw.sendKeys("abcd");
		
		Thread.sleep(2000);
		
		WebElement loginB=driver.findElement(By.id("Login"));
		
		loginB.click();
	
/*  -its done by firefox using dataproperties file
    -its called cross browsing also see definition.
    -for other broser change bros=wser name from data properties file.  */

		
		
	}

}
  

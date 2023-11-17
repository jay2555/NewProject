package testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PrintingAllLinksSecondSep {
	
	@Test
	public void printinglinks() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		
		Thread.sleep(2000);
		
		List<WebElement> links=driver.findElements(By.tagName("a")); 
		// for this same attribute is necessary
		
		
		System.out.println(links.size());
		
		Thread.sleep(2000);
		
		// for loop
		/*
		for(int i=0 ; i< links.size() ; i++)
            {
            	System.out.println(links.get(i).getText());
            	
            }   */
		
		//for each loop
		
		for(WebElement k:links)
		{
			System.out.println(k.getText());
		}
		
		
	}
	


}

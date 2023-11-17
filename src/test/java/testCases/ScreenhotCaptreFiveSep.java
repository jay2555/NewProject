package testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenhotCaptreFiveSep {
	
	@Test
	public void screenshot() throws InterruptedException, IOException
	{
        WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		
		TakesScreenshot s=(TakesScreenshot)driver;
		
		File srcreen=s.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("F:\\Testing class\\Sept\\Screenshots Test\\5sept.jpeg");
		
		FileUtils.copyFile(srcreen, dest);
	}

}

package resources;      // 6 Sept class

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	public static WebDriver driver;   // delcare it globally using static keyword
	
	public void driverInitialize() throws IOException
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\Maven\\src\\main\\java\\resources\\data.propeties");
		                                 // add throws exception for here
		// upper line will read the properties file
		
		Properties prop=new Properties();   // Properties is class import
		
		prop.load(fis);   // add throws exception here again
		// load is method name
		
		String browserName=prop.getProperty("browser");
		// String browserName 
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("please make sure you have correct browser");
		}
		
		
	}

}

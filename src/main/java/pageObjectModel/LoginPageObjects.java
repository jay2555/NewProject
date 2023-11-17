package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	
	public static WebDriver driver;
	
	private By username=By.xpath("//input[@id='username']");
	
	private By password=By.xpath("//input[@id='password']");
	
	private By login=By.xpath("//input[@id='Login']");
	
	private By errorMessage=By.xpath("//div[@id='error']");
	
	private By TrForFree=By.linkText("Try for Free"); // using by link text
	
	
	private By Fname=By.xpath("//input[@name='UserFirstName']");
	
	private By Lname=By.xpath("//input[@name='UserLastName']");
	
	private By mail=By.xpath("//input[@name='UserEmail']");
	
	private By Jobtitle=By.xpath("//select[@name='UserTitle']");
	
	private By CName=By.xpath("//input[@name='CompanyName']");
	
	private By employees=By.xpath("//select[@name='CompanyEmployees']");
	
	private By phone=By.xpath("//input[@name='UserPhone']");
	
	private By country=By.xpath("//select[@name='CompanyCountry']");
	
	private By box=By.xpath("(//div[@class='checkbox-ui'])[1]");
	
	
	public LoginPageObjects(WebDriver driver2)
	{
		this.driver=driver2;   ///add from loginexcelsevensept constructor
	}

	public WebElement enterUsername()
	{
		return driver.findElement(username);
	}
	
	public WebElement enterPassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement enterClickLogin()
	{
		return driver.findElement(login);
	}
	
	public WebElement getErrorMessage()
	{
		return driver.findElement(errorMessage);
	}
	
	public WebElement TryForFree()
	{
		return driver.findElement(TrForFree);
	}
	
	public WebElement enterFname()
	{
		return driver.findElement(Fname);
	}
	
	public WebElement enterLname()
	{
		return driver.findElement(Lname);
	}
	
	public WebElement entermail()
	{
		return driver.findElement(mail);
	}
	
	public WebElement enterJob()
	{
		return driver.findElement(Jobtitle);
	}
	
	public WebElement enterCname()
	{
		return driver.findElement(CName);
	}
	public WebElement SelectEmpoye()
	{
		return driver.findElement(employees);
	}
	public WebElement enterphone()
	{
		return driver.findElement(phone);
	}
	public WebElement selectcountry()
	{
		return driver.findElement(country);
	}
	public WebElement checkbox()
	{
		return driver.findElement(box);
		
	}
	
}

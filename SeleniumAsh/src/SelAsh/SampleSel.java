package SelAsh;

//import java.util.ArrayList;
//import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.utility.UtilityClass;

public class SampleSel {
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\AshwiniND\\Downloads\\Java instal\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.ebay.com/");

	}
	
	@DataProvider
	public Object[][] getTestData() throws Exception
	{
		Object[][] testData = UtilityClass.getDataFromExcel("Sheet1");
		return testData;
	}
	
	@Test(dataProvider = "getTestData")
	public void RegistrationSite(String name, String surname, String mobile,String password, String newpass)
	{
		driver.findElement(By.id("name")).sendKeys("name");
		driver.findElement(By.id("name")).sendKeys("surname");
		driver.findElement(By.id("name")).sendKeys("mobile");
		driver.findElement(By.id("name")).sendKeys("password");
		driver.findElement(By.id("name")).sendKeys("newpass");
				
	}
	
	@AfterMethod
	public void teardown()
	{
		System.out.println("Closing thatregistation site");
	}

}

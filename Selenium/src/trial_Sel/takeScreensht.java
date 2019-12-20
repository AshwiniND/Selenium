package trial_Sel;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

//import SelAsh.FirefoxDriver;

public class takeScreensht {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\AshwiniND\\Downloads\\Java instal\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver= new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.ebay.com/");
		takescrshot("facebook_Login_page");
		System.out.println("Screenshot taken and stored in specified destination");

	}
	public static void takescrshot(String filename) throws Exception
	{
		TakesScreenshot ts = ((TakesScreenshot)driver);
		File src = ts.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("C:\\Users\\AshwiniND\\eclipse-workspace\\Selenium\\src"+filename+".jpg"));
		
		//FileUtils.copyFile(src, new File("C:\\Users\\AshwiniND\\eclipse-workspace\\Selenium\\src"+filename+".jpg"));
	}

}

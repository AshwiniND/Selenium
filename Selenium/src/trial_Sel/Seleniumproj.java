package trial_Sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class Seleniumproj {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AshwiniND\\Downloads\\Java instal\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		//Implicit wait
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		//Explicit wait
		//WebDriverWait wait =new WebDriverWait(driver,30);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz[1]/div[2]")));		
				
		driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals("Gmail - Free Storage and Email from Google"))
			System.out.println("title is correct");
		else 
			System.out.println("title is wrong");
		System.out.println(driver.getCurrentUrl());
		
		String parentHandle = driver.getWindowHandle();
		
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/ul[1]/li/div/div/div[1]/div/div[3]/a[1]")).click();
		
		for(String childhandle : driver.getWindowHandles()) {
			if(!parentHandle.equals(childhandle))
				driver.switchTo().window(childhandle);
		}
		driver.findElement(By.id("firstName")).sendKeys("Ashwini");
		driver.findElement(By.className("CwaK9")).click();	
		driver.close();
		
		driver.switchTo().window(parentHandle);
		
		
		//Thread.sleep(3000);
		driver.quit();
	}

}

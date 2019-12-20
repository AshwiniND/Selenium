package trial_Sel;

//import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FirefoxBroswer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\AshwiniND\\Downloads\\Java instal\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.get("https://gsuite.google.com/products/gmail/");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("/html/body/header/div/div[1]/div[5]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div[2]/div[2]/section/div/div[1]/div[1]/c-wiz[2]/div/div[1]/div/div[1]/input")).sendKeys("Tsting");
		driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div[2]/div[2]/section/div/div[1]/div[1]/c-wiz[3]/div/div[1]/span/label[3]/div/div[3]/div")).click();
		
		//Taking screenshot and copy that in file
		//File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType<T>.FILE);
		
		//FileUtils.copyFile(src, new File("c:\\Users\\AshwiniND\\Downloads"));
		
		
		//selecting dropdown value
		Select DD= new Select(driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div[2]/div[2]/section/div/div[1]/div[1]/c-wiz[5]/div/div[2]/div[1]/div[1]")));
		DD.deselectByVisibleText("India");
		
		driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div[2]/div[2]/section/div/div[1]/div[1]/c-wiz[6]/div/div/span/span")).click();
				
		driver.quit();

	}

}

package trial_Sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class UPSBrexit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\AshwiniND\\Downloads\\Java instal\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver= new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\AshwiniND\\Downloads\\Java instal\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		
		driver.navigate().to("https://wwwapps.ups.com/ctc/request?loc=en_GB");
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("email")).sendKeys("manga6abr");
		driver.findElement(By.id("pwd")).sendKeys("ctc@qa123");
		driver.findElement(By.xpath("//*[@id=\"submitBtn\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"orig_PostalCode\"]")).sendKeys("SE028");
		driver.findElement(By.xpath("//*[@id=\"dest_PostalCode\"]")).sendKeys("SE028");
		driver.findElement(By.xpath("//*[@id=\"ctc_module1_submit\"]")).click();
		
		
		
		

	}

}

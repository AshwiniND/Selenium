package trial_Sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DifferentLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AshwiniND\\Downloads\\Java instal\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.navigate().to("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.findElement(By.id("firstName")).sendKeys("Ashwini");
		driver.findElement(By.id("lastName")).sendKeys("ND");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("trial1234");
		driver.findElement(By.cssSelector("#passwd > div.aCsJod.oJeWuf > div > div.Xb9hP > input")).sendKeys("password");
		driver.findElement(By.xpath("//*[@id=\"confirm-passwd\"]/div[1]/div/div[1]/input")).sendKeys("password");
		driver.findElement(By.xpath("//*[@id=\"accountDetailsNext\"]/span/span")).click();
		driver.findElement(By.linkText("Help")).click();
		//driver.findElement(By.partialLinkText("Community")).click();
		
		//Handling drop down
		WebElement DD = driver.findElement(By.id("country"));
		Select dropdown = new Select(DD);
		dropdown.selectByValue("IN");
		driver.quit();

	}

}

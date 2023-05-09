package Automation.Training;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstAutomationScript {

	public static void main(String[] args) {
		//Setting up a particular browser using webdriver Manager
		WebDriverManager.chromedriver().setup();
		
		//Open Browser using webdriver  
		WebDriver driver = new ChromeDriver();
		
		//Navigating to website
	//	driver.get("http://www.amazon.com");
		
	//	driver.navigate().to("http://www.amazon.com");
		
		driver.get("file:///C:/HTMLTutorial/index.html");
		
		driver.findElement(By.id("name")).sendKeys("Manpreet Handa");
		driver.findElement(By.id("Phone")).sendKeys("123456789");
		
		//driver.findElement(By.xpath("//select[@id='cars']")).click();
		
		WebElement w = driver.findElement(By.xpath("//select[@id='cars']"));
		Select s = new Select(w);
		s.selectByVisibleText("TX");
		
		driver.findElement(By.partialLinkText("Visit W3School")).click();;
		
		WebDriverWait wait = new WebDriverWait(driver,10000);
		wait.until(ExpectedConditions.visibilityOf(w));
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
		
	//	driver.findElement(By.id("Username")).sendKeys("ManpreetHanda");
	//	driver.findElement(By.id("password")).sendKeys("ManpreetHandaPassword");*/
	}

}

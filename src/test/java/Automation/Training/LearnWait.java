package Automation.Training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		/*Implicit Wait
		 * 
		 */
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	//	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	
		driver.get("file:///C:/HTMLTutorial/index.html");
		
	//	WebElement getPasswordText  = driver.findElement(By.id("password12355253"));
		//Expilict Wait
		
		WebDriverWait wait = new WebDriverWait(driver, 35);
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("name")))).sendKeys("MyName");
		
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("username")))).sendKeys("My UserName");
		
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("email")))).sendKeys("Email");;
		
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("Phone")))).sendKeys("Phone");;
		
	
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("password12355253")))).sendKeys("Password");;
		
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("confirmPassword")))).sendKeys("ConfirmPassword");;
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("confirmPassword"))).sendKeys("ConfirmPassword");;
		
		
		
			}

}

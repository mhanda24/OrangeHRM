package Automation.Training;

import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBasics {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/HTMLTutorial/index.html");
		
	//	WebDriverWait wait = new WebDriverWait(driver, 35);
		
		enterText(driver, driver.findElement(By.id("name")), "MyName");
		
		enterText(driver, driver.findElement(By.id("username")), "My UserName");
		
		enterText(driver, driver.findElement(By.id("email")), "Email");
		
		enterText(driver, driver.findElement(By.id("Phone")), "Phone");
		
		enterText(driver, driver.findElement(By.id("password12355253")), "Password");
		
		enterText(driver, driver.findElement(By.id("confirmPassword")), "ConfirmPassword");
		
		
	/*	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("name")))).clear();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("name")))).sendKeys("MyName");
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("username")))).sendKeys("My UserName");
			
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("email")))).sendKeys("Email");;
		
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("Phone")))).sendKeys("Phone");;
		
	
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("password12355253")))).sendKeys("Password");;
		
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("confirmPassword")))).sendKeys("ConfirmPassword");;*/
		
		

	}
	
	public static void enterText(WebDriver driver, WebElement element, String input) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 35);
			wait.until(ExpectedConditions.visibilityOf(element)).clear();
			wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(input);
		}catch(Exception e) {
			System.out.println("Error occurs:----- " + e);
		}

	}

}

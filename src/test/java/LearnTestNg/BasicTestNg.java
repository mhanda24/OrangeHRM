package LearnTestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseClass.BaseClass;



public class BasicTestNg extends BaseClass{
	
	@BeforeClass()
	public void myBeforeClass() {
		System.out.println("Before Class");
		
	}
	
	@BeforeMethod(alwaysRun=true)
	public void myBeforeMethod() {
		System.out.println("Before Method");
	}
	
	@AfterMethod()
	public void myAfterMethod() {
		System.out.println("After Method");
	}
	
	
	
	@Test
	public void myFirstTest() {
		System.out.println("First Test");
		WebDriverWait wait= new WebDriverWait(driver, 35);;
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("name")))).clear();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("name")))).sendKeys("MyName");
		
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("username")))).sendKeys("My UserName");
		
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("email")))).sendKeys("Email");;
		
		
		
	}
	
	@Test
	public void mySecondTest() {
		
		System.out.println("Second Test");
		WebDriverWait wait= new WebDriverWait(driver, 35);;
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("Phone")))).sendKeys("Phone");;
		
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("password12355253")))).sendKeys("Password");;
		
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("confirmPassword")))).sendKeys("ConfirmPassword");;
	
		
	}
	
	@AfterClass(alwaysRun=true)
	public void myAfterClass() {
		System.out.println("After Class");
	}
	
	

}

package Automation.Training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.Alerts;

public class LearnAlerts {

	@Test
	public void myAlertTest() throws InterruptedException{
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("incognito");  
		WebDriver driver = new ChromeDriver(options);


		String baseUrl = "https://chercher.tech/practice/practice-pop-ups-selenium-webdriver";
	//	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get(baseUrl);
		Thread.sleep(2000);
		//simple alert
		driver.findElement(By.name("alert")).click();
		//Thread.sleep(2000);
		Alert simpleAlert =  driver.switchTo().alert();
		System.out.println(simpleAlert.getText());
		Thread.sleep(2000);
		simpleAlert.accept();
		Thread.sleep(2000);
	

		//Confirmation alert
		driver.findElement(By.name("confirmation")).click();
		Alert confirmationAlert =  driver.switchTo().alert();
		System.out.println(confirmationAlert.getText());
		Thread.sleep(2000);
		confirmationAlert.accept();
		Thread.sleep(2000);
	//	System.out.println(driver.findElement(By.id("confirmResult")).getText());

		//Prompt alert
		driver.findElement(By.name("prompt")).click();
		Alert promptAlert =  driver.switchTo().alert();
		System.out.println(promptAlert.getText());
		Thread.sleep(2000);
		promptAlert.sendKeys("I am testing this alert");
		Thread.sleep(2000);
		promptAlert.accept();
		Thread.sleep(2000);
		//System.out.println(driver.findElement(By.id("promptResult")).getText());
		Thread.sleep(2000);
		
	

		driver.quit();
	}

}

package Automation.Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnXpath {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/HTMLTutorial/index.html");
		
		// How to write xpath - //htmltag[@attribute='attributevalue']
		
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("mhanda@test.com");
		
		
		
		
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Richa told this xpath");
		//driver.findElement(By.xpath("//input[@placeholder='Confirm your password']")).sendKeys("Entering text in confirm password");
		driver.findElement(By.xpath("//div[@class='user-details']/div[6]/input")).sendKeys("Monica's turn");
		
		/*System.out.println(driver.findElement(By.xpath("//div[@class='user-details']/div[6]/input")).getAttribute("value"));
		
		String emailText = driver.findElement(By.xpath("//div[@class='input-box'][3]/span")).getText();
		System.out.println("Text of email field is " + emailText);
		*/
	}

}
//Homework - https://www.techlistic.com/p/selenium-practice-form.html
package Automation.Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAssertions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("file:///C:/HTMLTutorial/index.html");
		
		String expectedW3SchoolsLinkText = "Visit W3School";
		
		WebElement w3school = driver.findElement(By.linkText("Visit W3Schools"));
		String actualW3SchoolsLinkText =  w3school.getText();
		
		Assert.assertEquals(actualW3SchoolsLinkText, expectedW3SchoolsLinkText,"Text not matching");
		
		

	}

}

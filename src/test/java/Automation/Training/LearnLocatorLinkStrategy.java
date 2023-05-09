package Automation.Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnLocatorLinkStrategy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("file:///C:/HTMLTutorial/index.html");
		
		//driver.findElement(By.xpath("//a[@href='https://www.w3schools.com']")).click();
		
		//driver.findElement(By.linkText("Visit W3Schools")).click();
		
		//driver.findElement(By.partialLinkText("W3")).click();
		
		//driver.findElement(By.tagName("a")).click();
		
		
	}

}

package Automation.Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWebElementsStrategy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/HTMLTutorial/index.html");
		
		driver.findElement(By.xpath("//input[starts-with(@id, 'password')]")).sendKeys("kjkkfksdfkn");
		driver.findElement(By.xpath("//input[contains(@id,'emai')]")).sendKeys("kjkkfksdfkn@dsnsn.com");
		

	}

}

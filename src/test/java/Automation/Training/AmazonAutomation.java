package Automation.Training;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.amazon.com");
		
		List<WebElement> amazonMenuLinks = driver.findElements(By.xpath("//*[@id='nav-xshop']/a"));
		
		for(WebElement menuLink : amazonMenuLinks) {
			System.out.println(menuLink.getText());
		}
		
		
	}

}

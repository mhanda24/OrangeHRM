package Automation.Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnGetAttribute {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

	//	driver.get("https://www.amazon.com/");
	//	driver.get("file:///C:/HTMLTutorial/index.html");
		
		driver.get("https://www.amazon.com/");
		
		WebElement getPasswordText  = driver.findElement(By.id("twotabsearchtextbox"));
		
		String defaultPasswordValue = getPasswordText.getAttribute("placeholder");
		
		System.out.println(defaultPasswordValue);
		
		getPasswordText.sendKeys("My Password");
		Thread.sleep(1000);
		
		String passwordValue = getPasswordText.getAttribute("value");
		
		System.out.println(passwordValue);

	}

}

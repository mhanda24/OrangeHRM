package Automation.Training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnIFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("incognito");  
		WebDriver driver = new ChromeDriver(options);


		String baseUrl = "https://demoqa.com/frames";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get(baseUrl);
	//	System.out.println(driver.findElement(By.id("sampleHeading")).getText());
	//	System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		//System.out.println(driver.findElement(By.xpath("//h1[@id='sampleHeading'][1]")).getText());
		
		driver.switchTo().frame("frame1");
		System.out.println(driver.findElement(By.id("sampleHeading")).getText());
	//	System.out.println(driver.findElement(By.id("framesWrapper")).getText());
		driver.switchTo().parentFrame();
		System.out.println(driver.findElement(By.id("framesWrapper")).getText());
		driver.quit();
	}

}

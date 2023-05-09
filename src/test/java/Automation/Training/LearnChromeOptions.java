package Automation.Training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnChromeOptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		System.out.println("Opening chrome in Incognito mode");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("incognito");  
		options.addArguments("ignore-certificate-errors");

        
        
        WebDriver driver = new ChromeDriver(options);

		
		String baseUrl = "https://www.amazon.com/";
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
		driver.get(baseUrl);

	}

}

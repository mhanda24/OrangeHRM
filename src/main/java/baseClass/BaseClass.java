package baseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.MyLogger;

public class BaseClass {
	public static WebDriver driver = null;
	public MyLogger oLogger = null;
	public Actions action = null;
	
	
	@BeforeSuite
	public void myBeforeSuite() {
		System.out.println("Before Suite");
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("incognito");  
		
		driver = new ChromeDriver(options);
		action = new Actions(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		oLogger = new MyLogger();
		
	}
	
	
	
	@AfterSuite
	public void myAfterSuite() {
		System.out.println("After Suite");
		driver.quit();
	}

}

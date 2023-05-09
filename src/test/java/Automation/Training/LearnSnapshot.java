package Automation.Training;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSnapshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("incognito");  
		WebDriver driver = new ChromeDriver(options);


		String baseUrl = "https://amazon.com/";

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get(baseUrl);


		File SourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File DestFile=new File("./snapshot/test.png");
		//Copy file at destination
		FileUtils.copyFile(SourceFile, DestFile);
	}

}

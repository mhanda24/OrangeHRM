package Automation.Training;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MaximizeCloseBrowser {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

	//	driver.get("https://www.amazon.com/");
		driver.get("file:///C:/HTMLTutorial/index.html");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='vehicle1']")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//input[@id='vehicle1']")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//input[@id='vehicle1']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='vehicle1']")).click();
		//driver.close();//Just close current Window
	//	driver.quit(); // This will close all browsers that opened during the session
		
		

	}

}

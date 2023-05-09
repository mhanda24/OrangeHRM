package Automation.Training;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindowHandles {


	@Test
	public void myTest() throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();


		String baseUrl = "https://www.amazon.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(baseUrl);
	//	
		String mainWindow = driver.getWindowHandle();
		
		System.out.println(mainWindow);
		Actions action = new Actions(driver);

		action.contextClick(driver.findElement(By.xpath("//*[@id='nav-xshop']/a[3]"))).build().perform();
		
		////div[@class='page-container']/h1
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

		/*action.contextClick(driver.findElement(By.xpath("//*[@id='nav-xshop']/a[4]"))).build().perform();
		
		////div[@class='page-container']/h1
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);*/
		
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		for(String tab : tabs) {
			System.out.println("Window handle :"+ tab);
		}
		System.out.println(tabs.size());
		
		/*driver.switchTo().window(tabs.get(2));
		Thread.sleep(5000);*/
		driver.switchTo().window(tabs.get(1));
		
		String actualTitle = driver.getTitle();
		
		String expectedTitle = "Help & Contact Us - Amazon Customer Service";
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
		driver.close();
		Thread.sleep(5000);
		driver.switchTo().window(tabs.get(0));
		
		
		driver.quit();
	}
}

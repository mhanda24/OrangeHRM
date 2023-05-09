package Automation.Training;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnActionClass {

	@Test
	public void actionClassTest() throws AWTException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();


		String baseUrl = "https://www.amazon.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(baseUrl);



		Actions action = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver,10);
		WebElement amazonMenu= wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='nav-xshop']/a[3]"))));
		action.contextClick(amazonMenu).perform();
	//	action.moveToElement(driver.findElement(By.id("nav-link-accountList"))).click(driver.findElement(By.id("nav_prefetch_yourorders"))).build().perform();
		
	
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
	//	robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
	}

}

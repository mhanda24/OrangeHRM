package utils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;

import baseClass.BaseClass;

public class Alerts extends BaseClass{
	
	public static void simpleAlert(WebElement element) throws InterruptedException {
		
		element.click();
		//Thread.sleep(2000);
		Alert simpleAlert =  driver.switchTo().alert();
		System.out.println(simpleAlert.getText());
		Thread.sleep(2000);
		simpleAlert.accept();
		Thread.sleep(2000);
	}
	
	

}

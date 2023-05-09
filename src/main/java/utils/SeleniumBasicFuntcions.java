package utils;

import org.openqa.selenium.WebElement;

public class SeleniumBasicFuntcions {
	
	public static void enterText(WebElement element,String value) {
		
		element.clear();
		System.out.println("Entering value as: " + value);
		element.sendKeys(value);
	}
	
	public static void clickButton(WebElement element) {
		element.click();
	}
	
	public static void threadSleep(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

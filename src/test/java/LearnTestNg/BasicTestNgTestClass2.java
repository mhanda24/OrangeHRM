package LearnTestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import baseClass.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicTestNgTestClass2 extends BaseClass{
	
	
	@Test
	public void myThirdTest() {
		System.out.println("Third Test");
	}
	
	@Test
	public void myForthTest() {
		
		System.out.println("Forth Test");
		
	}
	
	

}

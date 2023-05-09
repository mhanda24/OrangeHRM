package Automation.Training;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropDownSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("file:///C:/HTMLTutorial/index.html");
		
		
		WebElement cars = driver.findElement(By.xpath("//select[@id='cars']"));
			
		Select s = new Select(cars);
		
		//System.out.println(s.getOptions());
		
		List<WebElement> stateOptions = s.getOptions();
		
		System.out.println(stateOptions.get(1).getText());
		
		int stateDropDownSize = stateOptions.size();
		
		System.out.println(stateDropDownSize);
		
		for(WebElement sO : stateOptions) {
			
			System.out.println(sO.getText());
		}
		
		
		
		//s.selectByIndex(3);
		//s.selectByValue("NY");
		
		//s.selectByVisibleText("CA");
		
		
		
		
	

	}

}

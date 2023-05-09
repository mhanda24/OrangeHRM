package Automation.Training;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("file:///C:/HTMLTutorial/index.html");
		
	//	WebElement drinks = driver.findElement(By.xpath("//label[text()='List of Favorite Drink:']"));
	//	System.out.println(drinks.getText());
		
		List<WebElement> drinks =  driver.findElements(By.xpath("//ul[@id='drink']/li"));
		

		for(WebElement drink : drinks) {
			System.out.println(drink.getText());
			if(drink.getText().equals("Milk")) {
				System.out.println("Found my fav drink");
				break;
			}
		}
		
		}

}

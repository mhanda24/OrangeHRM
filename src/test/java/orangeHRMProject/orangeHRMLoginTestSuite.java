package orangeHRMProject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseClass.BaseClass;
import utils.SeleniumBasicFuntcions;



public class orangeHRMLoginTestSuite extends BaseClass{
	
	@DataProvider(name = "credentials")
    public Object[][] dataProviderMethod() {
        return new Object[][] {{ "Admin","admin123"}};
    }
	
	@DataProvider(name = "Invalidcredentials")
    public Object[][] dataProviderMethodFotrInvalidCred() {
        return new Object[][] {{ "FirstUserName","fjfjsfsj"},{"SecondUserName", "hsjbjbh@@"},{"ThirdUserName", "fhhfskfhk"}};
    }
	
	@Test(priority = 2, dataProvider="credentials")
	public void testLoginWithValidCredentials(String UserName, String Password) throws InterruptedException  {
		
	Reporter.log("Navigating to Orange HRM application");
	System.out.println("Navigating to Orange HRM application");
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	Reporter.log("Enter valid Username");
	
	
	WebElement userName = driver.findElement(By.name("username"));
	SeleniumBasicFuntcions.enterText(userName, UserName);
	/*userName.clear();
	userName.sendKeys("Admin");*/
	
	Reporter.log("Enter valid Password");
	WebElement passWord = driver.findElement(By.name("password"));
	SeleniumBasicFuntcions.enterText(passWord, Password);
	/*passWord.clear();
	passWord.sendKeys("admin123");*/
	
	WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
	System.out.println(loginButton.getCssValue("background-color"));
	Reporter.log("Click Login button");
	SeleniumBasicFuntcions.clickButton(loginButton);
//	/loginButton.click();
	
	SeleniumBasicFuntcions.threadSleep(5000);
	//Thread.sleep(5000);
	
	String actualResult = driver.findElement(By.xpath("//h6")).getText();
	String expectedResult = "Dashboard";
	
	Assert.assertEquals(actualResult, expectedResult);
	}
	

	
	@Test(priority = 2,dataProvider="Invalidcredentials")
	public void testLoginWithInvalidCredentials(String user, String password) throws InterruptedException, IOException {
	
	
	Reporter.log("Navigating to Orange HRM application");
	oLogger.info("Navigating to Orange HRM application");
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	Reporter.log("Enter Invalid Username");
	WebElement userName = driver.findElement(By.name("username"));
	SeleniumBasicFuntcions.enterText(userName, user);
	/*userName.clear();
	userName.sendKeys("dkdsjfskjf");*/
	
	Reporter.log("Enter Invalid Password");
	WebElement passWord = driver.findElement(By.name("password"));
	SeleniumBasicFuntcions.enterText(passWord, password);
	/*passWord.clear();
	passWord.sendKeys("testdkjfdkfnsk");*/
	
	WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
	oLogger.info(loginButton.getCssValue("background-color"));
	Reporter.log("Click Login button");
	SeleniumBasicFuntcions.clickButton(loginButton);
	//loginButton.click();
	SeleniumBasicFuntcions.threadSleep(2000);
	//Thread.sleep(2000);
	
	String actualResult = driver.findElement(By.xpath("//p[text()='Invalid credentials']")).getText();
	String expectedResult = "Invalid credential";
	
	File SourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	File DestFile=new File("./orangeHRMsnapshots/"+user+"--"+password+".png");
	//Copy file at destination
	FileUtils.copyFile(SourceFile, DestFile);
	
	Assert.assertEquals(actualResult, expectedResult);
	}
	
	

}

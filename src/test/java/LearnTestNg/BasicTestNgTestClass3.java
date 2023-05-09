package LearnTestNg;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class BasicTestNgTestClass3{
	
	@BeforeGroups("Smoke")  
	public void SmokeTest()  
	{  
	System.out.println("Applicabel for Smoke Only");  
	}  
	
	@BeforeGroups("Regression")  
	public void RegressionTest()  
	{  
	System.out.println("Applicabel for Regfression Only");  
	}  
	
	@Test(groups = {"Smoke","Regression"})
	public void myFifthTest() {
		System.out.println("Fifth Test");
	}
	
	@Test(groups = {"Smoke"})
	public void mySixthTest() {
		System.out.println("Six Test");
		
	
		
	}
	

	@Test(groups = {"Regression"})
	public void mySeventhest() {
		System.out.println("Seventh Test");
		
	
		
	}
	

	@Test(groups = {"Regression"})
	public void myEigthTest() {
		System.out.println("Eigth Test");
		
	
		
	}

	

}

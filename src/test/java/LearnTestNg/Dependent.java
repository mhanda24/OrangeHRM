package LearnTestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependent {
	
	  @Test
	  public void OpenBrowser() {
		  System.out.println("This will execute first (Open Browser and goto URL)");
	  }
	 

	@Test(dependsOnMethods = { "OpenBrowser"})
	  public void SignIn() {
		  System.out.println("This will execute second (SignIn)");
		  Assert.assertTrue(false,"Login unsuccessfull");
	  }
	
	@Test(dependsOnMethods = { "SignIn" })
	  public void AdminFeature() {
		  System.out.println("This will execute Third (Admin)");
	  }
	
	@Test(dependsOnMethods = { "SignIn" })
	  public void PIMFeature() {
		  System.out.println("This will execute Firth (PIM)");
	  }

	
}

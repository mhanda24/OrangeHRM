package LearnTestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPrioirty {
	
	@Test(priority = 1)
	  public void OpenBrowser() {
		  System.out.println("This will execute first (Open Browser and goto URL)");
	  }
	 

	@Test(priority = 2)
	  public void SignIn() {
		  System.out.println("This will execute second (SignIn)");
		  Assert.assertTrue(true,"Login unsuccessfull");
	  }
	
	@Test(priority = 3)
	  public void AdminFeature() {
		  System.out.println("This will execute Third (Admin)");
	  }
	
	@Test(priority = 4)
	  public void PIMFeature() {
		  System.out.println("This will execute Firth (PIM)");
	  }


}

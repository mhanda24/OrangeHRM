package LearnAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicAssert {
	
	@Test(enabled=false)
	public void testCalculatorAdd() {
		int a = 1;
		int b = 100;
		
		int expectedSum = 101;
		
		int actualSum = 100;
		
		//Assertion class
		
		Assert.assertEquals(actualSum,expectedSum,"Actual results doesn't match with Expected Results");
		
				
		System.out.println("After Assertion");
	}
	
	@Test(enabled=false)
	public void testCalculatorSubtract() {
		int a = 1;
		int b = 100;
		
		int expectedSum = 99;
		
		int actualSum = 99;
		
		//Assertion class
		Assert.assertNotEquals(actualSum,expectedSum,"Actual results matches with Expected Results");
		
		System.out.println("After subtract method Assertion");
	}
	
	@Test(enabled=false)
	public void testBoolean() {
		boolean actualResult = true;
		boolean expectedResult = true;
			
		//Assertion class
		//Assert.assertTrue(actualResult);
	//	Assert.assertEquals(actualResult, expectedResult);
		
		Assert.assertFalse(actualResult);
		
	}
	
	@Test
	public void testNull() {
		String fullName = null;
		String expectedName = null;
			
		//Assertion class
		//Assert.assertTrue(actualResult);
	//	Assert.assertEquals(actualResult, expectedResult);
		
	//	Assert.assertNotNull(fullName);
	//	Assert.assertNull(fullName);
		Assert.assertEquals(fullName,expectedName,"Actual results doesn't match with Expected Results");
		
	}
	
	@Test
	public void testFail() {
		int a = 100;
		
		if(a==101) {
			System.out.println("do something here");
		}else {
			Assert.fail();
		}
	}
}

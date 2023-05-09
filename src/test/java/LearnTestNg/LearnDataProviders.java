package LearnTestNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearnDataProviders {
	
	
	@DataProvider(name = "data-provider")
    public Object[][] dataProviderMethod() {
        return new Object[][] {{ "test",443424}, {"test2",34242}, { "test3",42342343 }};
    }

    @Test(dataProvider = "data-provider")
    public void testMethod(String userName, int password) {
    
        System.out.println("User Name is: " + userName);
        System.out.println("password is: " + password);

    }

}

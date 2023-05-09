package Automation.Training;

import utils.MyLogger;


public class TestLog4j {
	  
	
	
	public static void main(String[] args) {
		 
		MyLogger oLogger = new MyLogger();
		
		oLogger.info("Running Test");

		oLogger.error("Failed test case");
	}

}

package utils;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class MyLogger {
	
	 // get a logger instance
		public static Logger logger = Logger.getLogger("AppName");
		
		public MyLogger() {
			PropertyConfigurator.configure("log4j.properties");
		}

		public void info(String message) {
			logger.info(message);
		}

		public void error(String message) {
			logger.error(message);
			
		}

		

}

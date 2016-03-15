package pl.lodz;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App {
	
	private static Logger logger = Logger.getLogger(App.class.getName());
	public static void main(String[] args) {
		logger.info("jakiś error");
		System.out.println("Hello World!");
	}
}

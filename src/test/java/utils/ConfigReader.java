package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	
	Properties prop;

	public ConfigReader() {

		try {
			FileInputStream fis = new FileInputStream("/Users/ezhilvanan/eclipse-workspace/SDET/lms-Hackathon/src/test/resources/TestData/config.properties");
			prop = new Properties();
			prop.load(fis);

		} catch (Exception e) {
 			e.printStackTrace();
		}
	}

}

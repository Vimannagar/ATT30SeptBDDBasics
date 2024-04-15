package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigLoader {

	public static String readConfigData(String data) throws IOException {
		Properties prop = new Properties();

		String path = System.getProperty("user.dir") + "//src//test//resources//Config.properties";

		FileInputStream fis = new FileInputStream(path);

		prop.load(fis);

		String value = prop.getProperty(data);

		System.out.println(value);
		
		return value;

	}
	
}

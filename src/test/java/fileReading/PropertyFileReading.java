package fileReading;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReading {
	
	static String filePath = ".\\src\\test\\resources\\file2.properties";

	public static void main(String[] args) throws Exception {
		FileReader reader = new FileReader(".\\src\\test\\resources\\file2.properties");

		Properties prop = new Properties();
		prop.load(reader);

		String prop_name = prop.getProperty("name");
		System.out.println(prop_name);

		System.out.println(prop.getProperty("company"));

		prop.setProperty("company", "Wipro");

		System.out.println(prop.getProperty("company"));
		
		PropertyFileReading obj = new PropertyFileReading();
		obj.readAProperty(".\\src\\test\\resources\\file2.properties", "name");
		
		obj.readAProperty("company");

	}

	public void readAProperty(String filePath, String propName) throws Exception {
		FileReader reader = new FileReader(filePath);

		Properties prop = new Properties();
		prop.load(reader);

		String prop_name = prop.getProperty(propName);
		System.out.println(prop_name);
	}
	
	public void readAProperty(String propName) throws Exception {
		FileReader reader = new FileReader(filePath);

		Properties prop = new Properties();
		prop.load(reader);

		String prop_name = prop.getProperty(propName);
		System.out.println(prop_name);
	}
	
	public static String readApropertyAndReturnItsValue(String propName) throws Exception {
		FileReader reader = new FileReader(filePath);

		Properties prop = new Properties();
		prop.load(reader);

		return prop.getProperty(propName);
		
	}

}

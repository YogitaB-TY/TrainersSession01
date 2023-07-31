package seleniumbasics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;



public class Working_With_PropertyFile {
	
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./TestData/configuration.properties");
		Properties prop=new Properties();
		prop.load(fis);
		
		System.out.println(prop.getProperty("url"));
	}

}

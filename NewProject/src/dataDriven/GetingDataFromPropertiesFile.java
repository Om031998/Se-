package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GetingDataFromPropertiesFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis= new FileInputStream("./TestDATa/data.properties");
		Properties prop=new Properties();
		prop.load(fis);

		System.out.println(prop.getProperty("username"));
	}

}

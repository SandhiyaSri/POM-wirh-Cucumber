package testcase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadProperties {
	@Test
	public void readData() throws IOException
	{
		//Create an object for Properties
		Properties prop=new Properties();
		//Class used for reading a file
		FileInputStream fis=new FileInputStream(new File("./src/main/resources/config.properties"));
		prop.load(fis);
		//Retrive the data from File
		System.out.println(prop.get("url"));
		
	}

}

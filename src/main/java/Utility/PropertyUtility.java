package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtility {

	public static String getInputData(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(".\\Confugration\\LoginFunction.properties");
		Properties p = new Properties();
		p.load(fis);
		return p.getProperty(key);
	}
}

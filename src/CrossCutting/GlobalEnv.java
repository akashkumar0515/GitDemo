package CrossCutting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalEnv {

	public static void main(String[] args) throws IOException 
	{
	Properties prop=new Properties();
	FileInputStream fis=new FileInputStream("C:\\Users\\akash\\eclipse-workspace\\TestNg\\Data.properties");
	prop.load(fis);
	System.out.println(prop.getProperty("Env"));
	System.out.println(prop.getProperty("url"));
	prop.setProperty("User", "TESTALL");
	
	FileOutputStream fos=new FileOutputStream("C:\\Users\\akash\\eclipse-workspace\\TestNg\\Data.properties");
	prop.store(fos, null);
	System.out.println(prop.getProperty("User"));
	
	

	}

}

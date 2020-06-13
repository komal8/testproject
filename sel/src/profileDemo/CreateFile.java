package profileDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class CreateFile {
	static Properties prop;

	public static void main(String[] args) throws IOException {
		File fs=new File(".\\config1\\config1.properties");
		try {
			FileInputStream fis=new FileInputStream(fs);
			prop=new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String user=prop.getProperty("Username");
		System.out.println("user name is:"+user);
		String pass=prop.getProperty("password");
		System.out.println("pass is:"+pass);
		String pass1=prop.getProperty("password1");
		System.out.println("pass is:"+pass1);
		

	}

}

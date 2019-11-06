package dempProperties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Handlewindow1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
File fs=new File(".//config1//config1.properties");

Properties p=new Properties();
String s1=p.getProperty("1");
System.out.println(" the name at key1:"+1);
String s2=p.getProperty("2");
System.out.println("the name at key2:"+2);
String s3=p.getProperty("3");
System.out.println("the name at key3:"+3);
	}
catch(Exception e) {
	e.printStackTrace();
}
	}
}

package testngAnnotation;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DatadrivenTestng {
	@Test(dataProvider="getData")
	
	public void testData(String s1,String s2,String s3) {
	System.out.println(s1+""+s2+""+s3);	
	}
	@DataProvider
	public Object[][] getData() {

	Object	data[][]=new Object[2][3];
	data[0][0]="username";
	data[0][1]="password";
	data[0][2]="emailId";
	
	
	data[1][0]="komu";
	data[1][1]="kk8*";
	data[1][2]="kadamk@gmail.com";
	return data;
	
	}

}

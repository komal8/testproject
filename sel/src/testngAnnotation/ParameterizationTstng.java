package testngAnnotation;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationTstng {
	@Test
	@Parameters({"uname","upass"})
	public void test1(String uname,String upass) {
	System.out.println("user name is"+uname+"password is"+upass);	
	}

}

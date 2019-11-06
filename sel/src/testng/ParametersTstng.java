package testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTstng {
	@Parameters({"username","password"})
	@Test
	public void parameterTest(@Optional("username")String uname,@Optional("userpassword")String upass)
	{
		System.out.println("username is:"+uname+" "+"userpassword is:"+upass);
	}

}

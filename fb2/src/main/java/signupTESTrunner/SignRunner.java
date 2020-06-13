package signupTESTrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\Amit Jadhav\\git\\testproject\\fb2\\src\\main\\java\\feature\\signup.feature",
		glue={"signupSTEPdefination"}
		)
public class SignRunner {


}

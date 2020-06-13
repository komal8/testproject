package alert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleDemo {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Creo\\chromedriver_win32 (4)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.google.com");
	String ExpectedTitle="Google";
	System.out.println(ExpectedTitle);
String ActualTitle=	driver.getTitle();
System.out.println(ActualTitle);
if(ActualTitle.equals(ExpectedTitle)) {
	System.out.println("verified page");
}
else
{
	System.out.println("page not found");
}
	

	}

}

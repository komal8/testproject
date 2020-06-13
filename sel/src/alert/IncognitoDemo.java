package alert;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class IncognitoDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Creo\\chromedriver_win32 (4)\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		//options.addArguments("--incognito");
		options.addArguments("--headless");
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(capabilities);
		ChromeDriver driver=new ChromeDriver(options);
		//driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.get("http://demo.guru99.com");
		driver.manage().window().maximize();
	String title=	driver.getTitle();
	System.out.println("Title of the page"+title);
		//driver.close();
		

	}

}

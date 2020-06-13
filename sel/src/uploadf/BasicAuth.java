package uploadf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuth {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Creo\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		String actualText=driver.findElement(By.xpath("//h3[text()='Basic Auth']/following::p")).getText();
		String expectedText="Congratulations! You must have the proper credentials.";
		if(actualText.equals(expectedText)) {
			System.out.println("verified corrected page");
		}
		else {
			System.out.println("not verified");
		}
	}

}

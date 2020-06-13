package launch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DayByGetoption {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Creo\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement day=driver.findElement(By.name("birthday_day"));
		Select select=new Select(day);
		boolean status=select.isMultiple();
		System.out.println(status);
		List<WebElement>l=select.getOptions();
		int totaldays=l.size();
		System.out.println("totaldays"+totaldays);
	for (WebElement Element : l) {
		System.out.println(Element.getText());
		if(Element.getText().equals("12")) {
			Element.click();
			break;
		}
		
	}
		
		
		

	}

}

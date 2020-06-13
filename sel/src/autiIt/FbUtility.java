package autiIt;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbUtility {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Creo\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
		/*WebElement Date=driver.findElement(By.xpath("//*[@name='birthday_day']"));
		selectDropDown(Date,"8");*/
	List<WebElement>date=	driver.findElements(By.xpath("//*[@name='birthday_day']"));
	System.out.println(date.size());
	for(int i=0;i<date.size()-1;i++) {
	String dateBox=	date.get(i).getText();
	System.out.println(dateBox);
	if(date.get(i).getText().equals("8")) {
		date.get(i).click();
		break;
	}
	}
		

	}
	/*public static void selectDropDown(WebElement element,String value) {
		Select select=new Select(element);
		select.selectByVisibleText(value);
		
	}*/

}

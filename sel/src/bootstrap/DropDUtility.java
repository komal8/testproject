package bootstrap;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDUtility {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Creo\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		WebElement Day=driver.findElement(By.xpath("//*[text()='Day']"));
		WebElement Month=driver.findElement(By.xpath("//*[text()='Month']"));
		WebElement Year=driver.findElement(By.xpath("//*[text()='Year']"));
		DDvalues(Day,"18");
		DDvalues(Month,"june");
		DDvalues(Year,"1993");
		

	}
	public static void DDvalues(WebElement element,String ddvalue) {
		Select select=new Select(element);
		select.selectByVisibleText(ddvalue);
/*List<WebElement>dd=		select.getOptions();
System.out.println(dd.size());
for(WebElement ele:dd) {
	System.out.println(ele.getText());
	if(ele.getText().equals(ddvalue)) {
		ele.click();
		break;
	}*/
}

		
	}



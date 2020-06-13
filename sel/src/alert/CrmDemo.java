package alert;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CrmDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Creo\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
driver.get("https://www.crmpro.com/");
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
driver.findElement(By.xpath("//*[@type='text']")).sendKeys("Mayuri_257");
driver.findElement(By.xpath("//*[@type='password']")).sendKeys("Mayuri$257");
driver.findElement(By.xpath("//*[@value='Login']")).click();
//String expectedTitle="CRMPRO  - CRM software for customer relationship management, sales, and support.";
String actualTitle=driver.getTitle();
System.out.println(actualTitle);
Thread.sleep(1000);
driver.switchTo().frame("mainpanel");
WebElement Button= driver.findElement(By.xpath("//*[text()='Call']"));
Actions action=new Actions(driver);
action.moveToElement(Button).click().build().perform();
driver.findElement(By.xpath("//*[@name='contact_lookup']")).sendKeys("7520574520");
driver.findElement(By.xpath("//*[@name='client_lookup']")).sendKeys("KHS INFOTECH");
driver.findElement(By.xpath("//*[@name='conf_call']")).click();
Thread.sleep(1000);
WebElement list=driver.findElement(By.xpath("//*[@name='end_time_hour']"));
Select select=new Select(list);
List<WebElement> selvalue=select.getOptions();
System.out.println(selvalue.size());
for(int i=0;i<selvalue.size();i++) {
String text=	selvalue.get(i).getText();
System.out.println(text);
if(selvalue.get(i).getText().equals("9")) {
	selvalue.get(i).click();
}

}

driver.findElement(By.xpath("//*[@name='closed']")).click();



	}	

}

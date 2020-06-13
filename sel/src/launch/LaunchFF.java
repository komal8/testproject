package launch;

import java.util.List;

import org.apache.commons.collections4.Get;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchFF {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Creo\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("komal");
		driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("kadam");
		driver.findElement(By.xpath("//input[@id='u_0_r']")).sendKeys("kadamkomal12@gmail.com");
		driver.findElement(By.xpath("//input[@id='u_0_w']")).sendKeys("smile8*");
		
		/*WebElement day=driver.findElement(By.xpath("//*[@class='_5dba _8esg']"));
		Select select=new Select(day);
		List<WebElement>days=select.getOptions();
	System.out.println(days.size());
	for(int i=0;i<days.size();i++) {
String value=days.get(i).getText();	
	System.out.println("values are"+value);	
	}*/
		
	/*WebElement	selvalue=select.getFirstSelectedOption();
	String dayoption=selvalue.getText();
	System.out.println("before selecting the day"+dayoption); 
	select.selectByValue("10");
WebElement selvalue1=	select.getFirstSelectedOption();
String dayoption2=selvalue1.getText();
System.out.println("after selecting value"+dayoption2);*/
	
		Select select=new Select(driver.findElement(By.xpath("//*[@name='birthday_day']")));
		select.selectByVisibleText("10");
		Select select1=new Select(driver.findElement(By.xpath("//*[@id='month']")));
		select1.selectByValue("6");
		Select select2=new Select(driver.findElement(By.xpath("//*[@id='year']")));
		select2.selectByVisibleText("1993");
		driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
		Thread.sleep(2000);
	//	driver.close(); 
		
		
			
	}

}

package DateFormatter;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Creo\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("http://jqueryui.com/datepicker/");
	/*	Alert alert=driver.switchTo().alert();
	String Notifytext=	alert.getText();
	System.out.println(Notifytext);
	alert.accept();*/
	//driver.findElement(By.xpath("//*[@id='BE_flight_flsearch_btn']")).click();
	
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[@id='datepicker']")).click();
	//	WebElement calWidget=driver.findElement(By.xpath("//*[@class='ui-datepicker-calendar']"));
	List<WebElement> rows=	driver.findElements(By.tagName("tr"));
	System.out.println("row count:"+rows.size());
	List<WebElement> columns=driver.findElements(By.tagName("td"));
	System.out.println("columns count:"+columns.size());
for (WebElement ele : columns) {
	 if (ele.getText().equals("10")){
		 
		   ele.findElement(By.linkText("10")).click();
		
		 
		   break;
		 
		   }
	
}
		
	
	
	

	}

}

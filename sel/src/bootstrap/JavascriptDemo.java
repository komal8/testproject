package bootstrap;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JavascriptDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Creo\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('u_0_m').value='komal'; ");
		js.executeScript("document.getElementById('u_0_o').value='kadam'; ");
		WebElement month=driver.findElement(By.id("month"));
		Select select=new Select(month);
/*WebElement selvalue=		select.getFirstSelectedOption();
String MonthValue=selvalue.getText();
System.out.println(MonthValue);*/
java.util.List<WebElement>ListMList=	select.getOptions();
int totalMonth=ListMList.size();
for(int i=0;i<totalMonth;i++) {
	String Months=ListMList.get(i).getText();
	System.out.println("list of months"+Months);
	if(ListMList.get(i).getText().equals("Apr")) {
		ListMList.get(i).click();
		break;
		
	}
} 
		
		
		
		

	}

}

package alert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Creo\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("http://demo.guru99.com/test/web-table-element.php");
	System.out.println(driver.findElement(By.id("leftcontainer")).getSize());	
WebElement TableRow=		driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[8]"));
String Text=TableRow.getText();
System.out.println("the text of the 8th row:"+Text);
List<WebElement> TableCol=		driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[1]/td"));
int TotalCol=TableCol.size();
System.out.println("the text of the columns:"+TotalCol);
for(int i=0;i<TotalCol;i++) {
String Text1=	TableCol.get(i).getText();
System.out.println("text of the column"+Text1);
}


	}

}

package action;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Creo\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
	List<WebElement> tbody=	driver.findElements(By.xpath("//*[@id='customers']/tbody"));
	List<WebElement> rows=	driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
int totalRow=	rows.size();
System.out.println("total num of rows"+totalRow);
for(int i=0;i<totalRow;i++) {
String TableHeader=	rows.get(i).getText();
System.out.println(""+TableHeader);
	
}
	List<WebElement> cols=	driver.findElements(By.xpath("//*[@id='customers']/tbody/tr/td"));
int totalColumn=	cols.size();
System.out.println("total num of column"+totalColumn);
for(int j=0;j<totalColumn;j++) {
String TableFooter=	cols.get(j).getText();
System.out.println(""+TableFooter);
}

	

	/*List<WebElement>rows=driver.findElements(By.tagName("tr"));
int totalRow=	rows.size();
System.out.println(totalRow);
for (WebElement webElement : rows) {
	List<WebElement>cols=driver.findElements(By.tagName("td"));
int totalColumn=	cols.size();
System.out.println(totalColumn);
for (WebElement webElement2 : cols) {
	System.out.println(webElement2.getText()+"");
}
	
}*/
	

	}

}

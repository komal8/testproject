package handlewebtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium3\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		WebElement tbody=driver.findElement(By.xpath("//*[@id='customers']/tbody"));
		List<WebElement>rows=tbody.findElements(By.tagName("tr"));
		for(WebElement ele:rows) {
			List<WebElement>cols=ele.findElements(By.tagName("td"));
			for(WebElement ele1:cols) {
				System.out.print(ele1.getText()+" ");
			}
		}
		

	}

}

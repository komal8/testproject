package mouseoverAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightclickAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium3\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement rightbtn=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		WebElement edit=driver.findElement(By.xpath("//span[text()='Edit']"));
		Actions actions=new Actions(driver);
		actions.contextClick(rightbtn).build().perform();
		edit.click();
		Alert alert=driver.switchTo().alert();
		String editAlertText=alert.getText();
		System.out.println("the text of the alert is:"+editAlertText);
		alert.accept();
		actions.contextClick().build().perform();
		

	}

}

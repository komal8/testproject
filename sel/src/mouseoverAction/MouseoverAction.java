package mouseoverAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseoverAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium3\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
WebElement uname=driver.findElement(By.xpath("//input[@id='txtUsername']"));
WebElement upass=driver.findElement(By.xpath("//input[@id='txtPassword']"));
WebElement login=driver.findElement(By.xpath("//input[@id='btnLogin']"));
uname.sendKeys("Admin");
upass.sendKeys("admin123");
login.click();
WebElement admin=driver.findElement(By.xpath("//b[contains(text(),'Admin')]"));
WebElement  usermanagement=driver.findElement(By.id("menu_admin_UserManagement"));
WebElement users=driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']"));
Actions action=new Actions(driver);
action.moveToElement(admin).moveToElement(usermanagement).moveToElement(users).click().build().perform();



	}

}

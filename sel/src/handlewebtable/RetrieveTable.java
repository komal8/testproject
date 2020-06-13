package handlewebtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RetrieveTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Creo\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
int rows=driver.findElements(By.xpath("//*[@id='customers']/tbody/tr")).size();
		System.out.println("total no.of rows:"+rows);
		int cols=driver.findElements(By.xpath("//*[@id='customers']/tbody/tr[2]/td")).size();
		System.out.println("total no. of columns:"+cols);
		String beforexpath="//*[@id='customers']/tbody/tr[";
		String middlexpath="]/td";
		String afterxpath="]";
		
		for(int i=2;i<=rows;i++) {
			for(int j=1;j<=cols;j++) {
				String finalxpath=beforexpath+i+middlexpath+afterxpath;
				String tabledata=driver.findElement(By.xpath(finalxpath)).getText();
				System.out.println(tabledata +" ");
			}
			System.out.println();
		}
				
		

	}

}

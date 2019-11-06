package handlewebtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium3\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		String Firstpart="//*[@id='customers']/tbody/tr[2]/td[";
		String secondpart="]";
		List<WebElement>coldata=driver.findElements(By.xpath("//*[@id='customers']/tbody/tr[2]/td"));
		int totalcols=coldata.size();
		System.out.println("total column are:"+totalcols);
		for(WebElement ele:coldata) {
			String columndata=ele.getText();
			System.out.println(columndata+" ");
		}
	String beforexpath="//*[@id='customers']/tbody/tr[";
	String afterxpath="]/td[3]";
	List<WebElement>rowsList=driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
	System.out.println("total no.of rows are:"+rowsList.size());
	for (int i=2;i<=rowsList.size();i++) {
		String finalxpath=beforexpath+afterxpath;
		String rowdata=driver.findElement(By.xpath(finalxpath)).getText();
		System.out.println(rowdata);
		if(rowdata.contains("canada"))
		{
			System.out.println("country name:"+rowdata+"is found");
			break;
		}	
	

	} 	
		
		

	}

}

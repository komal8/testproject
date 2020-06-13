package action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	static String excelpath="C:\\Users\\Amit Jadhav\\AppData\\Roaming\\Microsoft\\Windows\\Network Shortcuts\\Book1.xlsx";

	public static void main(String[] args) throws IOException {
		File fs=new File(excelpath);
		try {
			FileInputStream fis=new FileInputStream(fs);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sheet=wb.getSheet("WebW");
	int rowCount=		sheet.getLastRowNum();
	System.out.println("total num of rows"+rowCount);
	int col=sheet.getRow(0).getLastCellNum();
	System.out.println("total num of column"+col);
			
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

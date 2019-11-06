package xlSheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XsslReader {
	static String excelpath="C:\\Users\\Amit Jadhav\\Desktop\\test.xlsx";

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File fs=new File(excelpath);
		 FileInputStream	fins = new FileInputStream(fs);
			XSSFWorkbook wb=new XSSFWorkbook(fins);
			XSSFSheet sheet=wb.getSheet("Sheet1"); 
Iterator itr=sheet.iterator();
while(itr.hasNext()) {
	Row rowitr=(Row)itr.next();
	Iterator cellitr=rowitr.cellIterator();
	while(cellitr.hasNext()) {
		Cell cell=(Cell)cellitr.next();
		switch(cell.getCellType()) {
		case STRING:
			System.out.println(cell.getStringCellValue());
			break;
		case NUMERIC:
			int Numeric=(int)cell.getNumericCellValue();
			System.out.println(Numeric);
			break;
		case BOOLEAN:
			System.out.println(cell.getBooleanCellValue());
			break;
		}	
	}

	}	

	}
	}
 

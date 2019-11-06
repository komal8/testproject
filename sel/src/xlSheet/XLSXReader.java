package xlSheet;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class XLSXReader {
	static String excelpath="C:\\Users\\Amit Jadhav\\Desktop\\XL1.xlsx";
	public static  void main(String[] args)  {
		File fs=new File(excelpath);
		try {
			FileInputStream	fins= new FileInputStream(fs);
			XSSFWorkbook wb=new XSSFWorkbook(fins);
			XSSFSheet sheet=wb.getSheet("Sheet1"); 
				String row_00=sheet.getRow(0).getCell(0).getStringCellValue();
				System.out.println(row_00);
				String row_10=sheet.getRow(1).getCell(0).getStringCellValue();
				System.out.println(row_10);
			//	String row_20=sheet.getRow(2).getCell(0).getStringCellValue();
			//	System.out.println(row_20);
		//		int id=(int) sheet.getRow(1).getCell(4).getNumericCellValue();
		//		System.out.println(id);
				
				wb.close();
				fins.close();
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}

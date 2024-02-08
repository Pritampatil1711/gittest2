package resusable;

import java.io.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;



public class ExcelReader 
{
	@Test
public void reader() throws Exception
	{

	String filePath = "G:/readexcel/Book1.xlsx ";
	FileInputStream fis = new FileInputStream(filePath);
	Workbook workbook = new XSSFWorkbook(fis); //interface in Apache POI to read excel
	Sheet sheet = workbook.getSheetAt(0);
	
	for (Row row : sheet) 
	{
	    for (Cell cell : row) 
	    {
	        switch (cell.getCellType()) 
	        {
	            case STRING:
	                System.out.print(cell.getStringCellValue() + "\t");
	                break;
	            case NUMERIC:
	                System.out.print(cell.getNumericCellValue() + "\t");
	                break;
	            case BOOLEAN:
	                System.out.print(cell.getBooleanCellValue() + "\t");
	                break;
	            default:
	                System.out.print("\t");
	        }
	    }
	    System.out.println();
	}
	fis.close();
	workbook.close();

}
}

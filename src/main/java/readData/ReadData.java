package readData;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static void main(String[] args) throws IOException {

		// Open/Enter the workbook
		XSSFWorkbook wb = new XSSFWorkbook("./Data5/ExcelData5.xlsx");
		
				
		//Get Sheet
		XSSFSheet sheet = wb.getSheet("Sheet1");
				
		//Get row
		XSSFRow row = sheet.getRow(2);
		
		//Get column

		XSSFCell cell = row.getCell(0);
		XSSFCell cell1 = row.getCell(1);
		XSSFCell cell2 = row.getCell(2);
		XSSFCell cell3 = row.getCell(3);
		
		//Action- Read/print particular CellValue
		String Svalue = cell.getStringCellValue();
		System.out.println(Svalue);
		String Svalue1 = cell1.getStringCellValue();
		System.out.println(Svalue1);
		String Svalue2 = cell2.getStringCellValue();
		System.out.println(Svalue2);
		String Svalue3 = cell3.getStringCellValue();
		System.out.println(Svalue3);
	}

}

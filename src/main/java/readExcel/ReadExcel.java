package readExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		//open/Enter the Workbook
		XSSFWorkbook wb =new XSSFWorkbook("./Data5/ExcelData5.xlsx");
		//Get Sheet
		XSSFSheet sheet = wb.getSheet("Sheet1");
		//Get Row
		XSSFRow row = sheet.getRow(2);
		//Get column
		XSSFCell cell = row.getCell(0);
		XSSFCell cell1 = row.getCell(1);
		XSSFCell cell2 = row.getCell(2);
		XSSFCell cell3= row.getCell(3);
		XSSFCell cell4 = row.getCell(4);
		//Action Read Print Particular Cell Value
		String SValue = cell.getStringCellValue();
		System.out.println(SValue);
		String SValue1 = cell1.getStringCellValue();
		System.out.println(SValue1);
		String SValue2 = cell2.getStringCellValue();
		System.out.println(SValue2);
		String SValue3 = cell3.getStringCellValue();
		System.out.println(SValue3);
		String SValue4 = cell4.getStringCellValue();
		System.out.println(SValue4);
	
		

	}

}

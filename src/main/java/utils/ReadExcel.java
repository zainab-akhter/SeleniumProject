package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	//public static String[][] main(String[] args) throws IOException {
	
	public String[][] readExcel() throws IOException{
		// Open/Enter the workbook
		XSSFWorkbook wb = new XSSFWorkbook("./ExcelData/Data9.xlsx");

		//Get Sheet
		XSSFSheet sheet = wb.getSheetAt(0);

		//Get row count
		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount);

		//Get column count
		int columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println(columnCount);
		
		String[] [] data = new String [rowCount][columnCount];
		
		for (int i = 1; i <= rowCount; i++) {
			//Get row
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < columnCount; j++) {
				// Get column
				XSSFCell cell = row.getCell(j); //Column 2
				// Actions -> Read value
				String sValue = cell.getStringCellValue();
				//data [i-1][j] = "sValue";
				data [i-1][j] = "sValue";
				System.out.println(sValue);
				
			
			}
		}
		return data;

	}


	}



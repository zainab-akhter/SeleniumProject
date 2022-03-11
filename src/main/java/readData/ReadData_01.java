package readData;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData_01 {

	
		public static void main(String[] args) throws IOException {

			// Open/Enter the workbook
			XSSFWorkbook wb = new XSSFWorkbook("./Data5/ExcelData5.xlsx");

			//Get Sheet
			XSSFSheet sheet = wb.getSheet("Sheet1");

			//Get row count
			int rowCount = sheet.getLastRowNum();
			System.out.println(rowCount);

			//Get column count
			int columnCount = sheet.getRow(0).getLastCellNum();
			System.out.println(columnCount);
			
			for (int i = 1; i <= rowCount; i++) {
				//Get row
				XSSFRow row = sheet.getRow(i);
				for (int j = 0; j < columnCount; j++) {
					// Get column
					XSSFCell cell = row.getCell(j); //Column 2
					// Actions -> Read value
					String sValue = cell.getStringCellValue();
					System.out.println(sValue);
				}
			}

		}

}
	



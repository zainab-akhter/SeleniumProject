package readExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel_01 {

	public static void main(String[] args) throws IOException {
		//open/Enter the WorkBook
		XSSFWorkbook wb = new XSSFWorkbook("./Data_01/Data009.xlsx");
		//Get Sheet
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		//Get Row count
				int rowCount = sheet.getLastRowNum();
				System.out.println(rowCount);  
				//Get Column count
				int columnCount = sheet.getRow(1).getLastCellNum();
				System.out.println(columnCount);
				
				
			for (int i = 1; i < rowCount ; i++) {
				//Get Row
				XSSFRow row = sheet.getRow(i);
				for (int j = 0; j < columnCount; j++) {
					//Get column
					XSSFCell cell = row.getCell(j);//column 2
					//Action Read Print Particular Cell Value
					String SValue = cell.getStringCellValue();
					System.out.println(SValue);
				}
			}
		}
		   
		
		

	}



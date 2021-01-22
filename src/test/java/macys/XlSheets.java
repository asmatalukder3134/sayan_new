package macys;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XlSheets {
	public String readExcel(int row,int col) throws FileNotFoundException {
		FileInputStream f=new FileInputStream("");
		XSSFWorkbook wb = new XSSFWorkbook();
		Sheet sheet = wb.getSheetAt(2);
		int row1 = sheet.getLastRowNum();
		int cell = sheet.getRow(0).getLastCellNum();
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < cell; j++) {
				String value = sheet.getRow(row).getCell(col).getStringCellValue();
				return value;
			}
				
				//System.out.println("xl sheet value:" + value);
			}
	
		


		

	}

}

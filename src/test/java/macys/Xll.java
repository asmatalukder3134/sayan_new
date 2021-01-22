package macys;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xll {
	String value;
	public String collect_data_xl(int row, int col) throws FileNotFoundException {

		FileInputStream f = new FileInputStream("path");
		XSSFWorkbook wb = new XSSFWorkbook();
		Sheet sheet = wb.getSheetAt(9);
		int r = sheet.getLastRowNum();
		int cell = sheet.getRow(0).getLastCellNum();
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < cell; j++) {
			 value=sheet.getRow(i).getCell(j).getStringCellValue();

			}
		}
		return value;
	}

}

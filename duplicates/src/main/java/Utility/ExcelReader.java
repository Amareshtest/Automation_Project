package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public static List<String> excelreader() throws IOException {

		FileInputStream fs = new FileInputStream(
				new File(propertyconfig.Excelconstant("C:\\Users\\Amaresh\\Desktop\\testdata.xlsx")));
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		XSSFSheet sheet = wb.getSheet(propertyconfig.Excelconstant("Sheet1"));
		XSSFRow row = sheet.getRow(0);
		int lastCellNum = row.getLastCellNum();
		int lastRowNum = sheet.getLastRowNum();
		List<String> li = new ArrayList<String>();

		for (int i = 0; i <= lastRowNum; i++) {
			XSSFRow row2 = sheet.getRow(i);
			for (int j = 0; j < lastCellNum; j++) {
				String stringCellValue = row2.getCell(j).getStringCellValue();
				li.add(stringCellValue);
			}
			System.out.println(li);

		}
		return li;

	}

}

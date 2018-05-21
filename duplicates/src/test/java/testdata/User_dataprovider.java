package testdata;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utility.ExcelReader;
import Utility.propertyconfig;

public class User_dataprovider {

	@Test(dataProvider = "mydata1")
	public void read(String type, String name, String username, String status, String password, String con_password) {
		System.out.println(type);
		System.out.println(name);
		System.out.println(username);
		System.out.println(status);
		System.out.println(password);
		System.out.println(con_password);

	}

	@DataProvider(name = "mydata1")
	public static Object[][] mydataprovider() throws IOException {
		Object[][] obj = null;
		FileInputStream fs = new FileInputStream(
				new File(propertyconfig.Excelconstant("C:\\Users\\Amaresh\\Desktop\\testdata.xlsx")));
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		XSSFSheet sheet = wb.getSheet(propertyconfig.Excelconstant("Sheet1"));
		XSSFRow row = sheet.getRow(0);
		int lastRowNum = sheet.getLastRowNum();
		int lastCellNum = row.getLastCellNum();
		obj = new Object[lastRowNum][lastCellNum - 1];

		List<?> Validusers = ExcelReader.excelreader();

		for (int i = 0; i < Validusers.size(); i++) {
			int j = 0;
			obj[j][i] = Validusers.get(i);

		}
		return obj;

	}

	public static void main(String[] args) {

	}

}

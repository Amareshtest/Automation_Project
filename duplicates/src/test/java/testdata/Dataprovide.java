package testdata;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import Utility.Excel_reader_data;
import Utility.propertyconfig;

public class Dataprovide {

	@DataProvider(name = "testdata_Users")
	public static Object[][] userFormData() throws Exception {
		Object[][] data = dataprovidertest(propertyconfig.testconstant("User_creation_path"), "Sheet1");
		return data;
	}

	@DataProvider(name = "Search_Users_Data")
	public static Object[][] Search_User_Data() throws Exception {
		Object[][] data = dataprovidertest(propertyconfig.testconstant("Search_input_path"), "Sheet1");
		return data;
	}

	@DataProvider(name = "Delete_test_data")
	public static Object[][] Delete_User_Data() throws Exception {
		Object[][] data = dataprovidertest(propertyconfig.testconstant("Deletedata_inputpath"), "Sheet1");
		return data;
	}

	@DataProvider(name = "Assign_Leave")
	public static Object[][] AssignLeave() throws Exception {
		Object[][] data = dataprovidertest(propertyconfig.testconstant("AssignLeave_inputpath"), "Sheet1");
		return data;
	}

	@DataProvider(name = "Add_Employee")
	public static Object[][] AddEmployee_data() throws Exception {
		Object[][] data = dataprovidertest(propertyconfig.testconstant("Addemployee_inputpath"), "Sheet1");
		return data;
	}

	@DataProvider(name = "Add_Salary")
	public static Object[][] Add_Salary_data() throws Exception {
		Object[][] data = dataprovidertest(propertyconfig.testconstant("Addsalary_inputpath"), "Sheet1");
		return data;
	}

	public static Object[][] dataprovidertest(String path, String User_Sheet) throws IOException {
		Excel_reader_data obj = new Excel_reader_data(path);
		FileInputStream fs = new FileInputStream(new File(path));
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		XSSFSheet sheet = wb.getSheet(User_Sheet);
		XSSFRow row = sheet.getRow(0);
		int lastCellNum = row.getLastCellNum();
		int rowCount2 = obj.getRowCount(User_Sheet);

		Object[][] excelData = null;
		excelData = new Object[rowCount2][lastCellNum];
		for (int i = 1; i <= rowCount2; i++) {
			for (int j = 0; j < lastCellNum; j++) {
				excelData[i - 1][j] = new Excel_reader_data(path).getCellData(User_Sheet, j, i);
			}

		}
		return excelData;

	}
}

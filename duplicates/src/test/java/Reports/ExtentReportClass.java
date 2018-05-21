package Reports;

import java.io.File;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ExtentReportClass {

	public static ExtentReports Reports;
	public static ExtentTest test;

	@BeforeSuite
	public void Report() {

		Reports = new ExtentReports("C:\\Users\\Amaresh\\Desktop\\Duplicate_reports\\extentreports.htm", true);
		Reports.loadConfig(new File("D:\\Selenium Work\\extent-config.xml"));
		test = Reports.startTest("smoke test");
	}

	@AfterSuite

	public void Report_Close() {
		ExtentReportClass.Reports.endTest(ExtentReportClass.test);
		ExtentReportClass.Reports.flush();
		ExtentReportClass.Reports.close();
	}

}

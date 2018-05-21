package testcase;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Core.Core_Basic;
import Listners.Mylistners;
import Pagelibrary.Login;
import Reports.ExtentReportClass;
import Utility.Screenshot;
import Utility.propertyconfig;

public class Pagetitle_TC extends Mylistners {

	static final Logger logger2 = Logger.getLogger(Pagetitle_TC.class.getName());

	@Test
	public void pagetitle_verify() throws IOException, InterruptedException {
		Login_valid_TC.Login_user_valid();
		logger2.info("called valid login method");
		String app_Title = Core_Basic.driver.getTitle();

		try {
			Assert.assertEquals(app_Title, propertyconfig.testvalidation("page_title"));
			logger2.info("Pagetitle has successfully verified");
			ExtentReportClass.test.log(LogStatus.PASS, "Pagetitle testcase passed");
			/*
			 * ExtentReportClass.test.log(LogStatus.PASS,
			 * ExtentReportClass.test.addScreenCapture(""
			 */

		} catch (Exception e) {
			logger2.error("pagetitle is incorrect");
			ExtentReportClass.test.log(LogStatus.FAIL, "page title verification testcase failed");
			Screenshot.getscreenshot(Core_Basic.driver, "incorrectpagetitle");
		}
	}

	

}

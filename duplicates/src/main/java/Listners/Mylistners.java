package Listners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Core.Core_Basic;
import Reports.ExtentReportClass;
import Utility.Screenshot;

public class Mylistners implements ITestListener {

	public void onTestStart(ITestResult result) {

		System.out.println("On Test start");
		ExtentReportClass.test = ExtentReportClass.Reports.startTest(result.getMethod().getMethodName());
		ExtentReportClass.test.log(LogStatus.INFO, result.getMethod().getMethodName() + "test is started");

	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("On test success");
		ExtentReportClass.test.log(LogStatus.PASS, result.getMethod().getMethodName() + "test is passed");

	}

	public void onTestFailure(ITestResult result) {
		System.out.println("On test Failure");
		ExtentReportClass.test.log(LogStatus.FAIL, result.getMethod().getMethodName() + "test is failed");

		try {
			Screenshot.getscreenshot(Core_Basic.driver, "./Screenshots/" + result.getMethod().getMethodName() + ".png");
			String addScreenCapture = ExtentReportClass.test
					.addScreenCapture("./Screenshots/" + result.getMethod().getMethodName() + ".png");
			ExtentReportClass.test.log(LogStatus.FAIL, result.getMethod().getMethodName(), addScreenCapture);
			ExtentReportClass.test.log(LogStatus.FAIL, result.getThrowable().getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("On test skip");
		ExtentReportClass.test.log(LogStatus.SKIP, result.getMethod().getMethodName() + "test is skipped");

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("on test sucess within percentage");

	}

	public void onStart(ITestContext context) {
		System.out.println("browser will be open on chrome");

	}

	public void onFinish(ITestContext context) {
		System.out.println("on finish");
		Core_Basic.driver.close();
		ExtentReportClass.Reports.endTest(ExtentReportClass.test);
		ExtentReportClass.Reports.flush();

	}

}

package Utility;

import org.testng.ITestContext;
import org.testng.ITestResult;

public class TestListners {

	public void onFinish(ITestContext arg0) {
		System.out.println("FInishing the test");
	}

	public void onStart(ITestContext arg0) {
		System.out.println("Starting the test");

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		System.out.println("partially success");

	}

	public void onTestFailure(ITestResult arg0) {
		System.out.println("Test failed");

	}

	public void onTestSkipped(ITestResult arg0) {
		System.out.println("test skipped");
	}

	public void onTestStart(ITestResult arg0) {
		System.out.println("test started");
	}

	public void onTestSuccess(ITestResult arg0) {
		System.out.println("Test Success");

	}
}

package testcase;

import java.io.IOException;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
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

@Test
public class Login_valid_TC extends Mylistners {

	static final Logger log= Logger.getLogger(Login_valid_TC.class.getName());

	public static void Login_user_valid() throws IOException {
		PageFactory.initElements(Core_Basic.driver, Login.class);
		Core_Basic.driver.get(propertyconfig.appcontatnt("URL"));
		Core_Basic.driver.manage().window().maximize();
		Screenshot.getscreenshot(Core_Basic.driver, "launchbrowser");
		try {
			Login.txt_UserName.sendKeys(propertyconfig.appcontatnt("Valid_Username"));
			Login.txt_Password.sendKeys(propertyconfig.appcontatnt("Valid_Password"));
			Login.btn_login.click();
			log.info("Login successful with valid credentials");
			ExtentReportClass.test.log(LogStatus.PASS, "Login with valid credentails testcase passed");

		} catch (Exception e) {
			log.error("Login is not successful with valid credentials");
			ExtentReportClass.test.log(LogStatus.FAIL, "Login with invalid credentials testcase failed");
			//
		}

	}

	
}

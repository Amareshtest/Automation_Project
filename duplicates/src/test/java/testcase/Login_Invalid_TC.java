package testcase;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Core.Core_Basic;
import Listners.Mylistners;
import Pagelibrary.Dashboard;
import Pagelibrary.Login;
import Reports.ExtentReportClass;
import Utility.Screenshot;
import Utility.Waits;
import Utility.propertyconfig;

public class Login_Invalid_TC extends Mylistners {

	static final Logger log = Logger.getLogger(Login_Invalid_TC.class.getName());

	@Test

	public static void Login_user_Invalid() throws InterruptedException {

		try {
			PageFactory.initElements(Core_Basic.driver, Dashboard.class);
			Waits.ExplicitWait(Dashboard.Welcome_DDL_Link, 10);
			log.info("Navigating to logout dropdown");
			Dashboard.Welcome_DDL_Link.click();
			Thread.sleep(3000);
			Dashboard.Logout_linktext.click();
			log.info("logout from the application successfully");
		} catch (Exception e1) {
			log.error("unable to logout from the application reason" + e1.getMessage());
		}

		try {

			Login.txt_UserName.sendKeys(propertyconfig.appcontatnt("Invalid_Username"));
			Login.txt_Password.sendKeys(propertyconfig.appcontatnt("Invalid_Password"));
			Login.btn_login.click();
			String Actual_message = Core_Basic.driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
			Assert.assertEquals(Actual_message, propertyconfig.testvalidation("Invalidlogin_Message"));
			log.info("Login Test with invalid credentials is case working fine");
			ExtentReportClass.test.log(LogStatus.PASS, "Login with invalid credentials passed");
			Screenshot.getscreenshot(Core_Basic.driver, "invalid_credentials");
		} catch (Exception e) {

			log.info("Invalid login not working fine");
			ExtentReportClass.test.log(LogStatus.FAIL, "Login with invalid credentials failed ");

		}

	}

	

}

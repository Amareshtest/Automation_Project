package testcase;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Core.Core_Basic;
import Listners.Mylistners;
import Pagelibrary.Login;
import Pagelibrary.NewUser;
import Utility.Dropdownlist;
import Utility.Mousehover;
import Utility.Screenshot;
import testdata.Dataprovide;

public class User_Creation_TC extends Mylistners {

	static final Logger log = Logger.getLogger(User_Creation_TC.class.getName());

	@Test(dataProvider = "testdata_Users", dataProviderClass = Dataprovide.class, groups = { "smoke" })
	public static void user_creation(String type, String name, String username, String status, String password,
			String con_password) throws InterruptedException {
		PageFactory.initElements(Core_Basic.driver, NewUser.class);

		try {
			Mousehover.mousehovering(NewUser.admin_link);
			Thread.sleep(2000);
			Mousehover.mousehovering(NewUser.usermanagement_link);
			Thread.sleep(2000);
			NewUser.users_link.click();
			log.info("Creating new user");
			NewUser.Add_button.click();
			log.info("User creation page has opened");
		} catch (Exception e1) {

			log.info("User Creation page is not loading reason" + e1.getMessage());
		}

		// Creating new users provided by data provider.
		try {
			Dropdownlist.select_byvisisbletext(NewUser.Usertype_Dropdown, type);
			NewUser.Employeename_txtbox.sendKeys(name);
			NewUser.Username_txtbox.sendKeys(username);
			Dropdownlist.select_byvisisbletext(NewUser.Status_Dropdown, status);
			NewUser.Password_textbox.sendKeys(password);
			NewUser.ConfirmPassword_textbox.sendKeys(con_password);
			NewUser.save_button.click();
			Thread.sleep(5000);

			// Validation check
			if (Core_Basic.driver.findElements(By.xpath("//span[@class='validation-error']")).size() == 0) {
				log.info("form submitted succesfully");
				System.out.println("form submitted Successfully");
			} else {
				List<WebElement> fbelements = Core_Basic.driver.findElements(By.xpath("//span[@class='validation-error']"));
				System.out.println(fbelements.size());
				for (int i = 0; i <= fbelements.size(); i++) {

					fbelements.get(i).getText();

					if (fbelements.get(i).getText().equalsIgnoreCase("Invalid")) {
						System.out.println("Invalid dataset");
					} else if (fbelements.get(i).getText().equalsIgnoreCase("required")) {
						System.out.println("mandatory field missing");

					} else if (fbelements.get(i).getText().equalsIgnoreCase("Already Exists")) {
						System.out.println("Duplicate Record Found");

					}

				}

			}
		} catch (Exception e) {
			log.error("not able to find the element");
		}

	}

	
	
	
	
}

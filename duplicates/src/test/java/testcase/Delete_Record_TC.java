package testcase;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Core.Core_Basic;
import Listners.Mylistners;
import Pagelibrary.Delete;
import Pagelibrary.Login;
import Pagelibrary.NewUser;
import Pagelibrary.Search_inputs;
import Utility.Mousehover;
import Utility.Screenshot;
import Utility.propertyconfig;
import testdata.Dataprovide;

public class Delete_Record_TC extends Mylistners {

	static final Logger log = Logger.getLogger(Delete_Record_TC.class.getName());

	@Test(dataProvider = "Delete_test_data", dataProviderClass = Dataprovide.class)
	public static void delete_usingserach(String delete_username, String employee_name)
			throws InterruptedException, IOException {
		// PageFactory.initElements(Login.wd, Search_inputs.class);
		PageFactory.initElements(Core_Basic.driver, Delete.class);

		// PageFactory.initElements(Login.wd, NewUser.class);

		try {
			Mousehover.mousehovering(NewUser.admin_link);
			Thread.sleep(2000);
			Mousehover.mousehovering(NewUser.usermanagement_link);
			Thread.sleep(2000);
			NewUser.users_link.click();
			Search_inputs.Username_Search_textbox.sendKeys(delete_username);
			Search_inputs.Search_Employeename.sendKeys(employee_name);
			Search_inputs.Search_Button.click();
		} catch (Exception e) {
			log.error("unable to perform delete action reason" + e.getMessage());
		}
		
		try {
			Assert.assertEquals(Search_inputs.notfound_webelement.getText(),
					propertyconfig.testvalidation("Searchresultnotfound_message"));
		} catch (Exception e) {
		log.error("Seach action is not performing" +e.getMessage());
		}
		
		try {
			if (Search_inputs.notfound_webelement.getText().equals("No Records Found")) {
				System.out.println("Deleting item doesnot present");
			} else {
				Delete.selectall_checkbox.click();
				Delete.Delete_button.click();
				Delete.Delete_button_yes.click();
				System.out.println("deleted successfully");
			}
		} catch (Exception e) {
			log.error("error while deleting the record " +e.getMessage());
		}

		/*
		 * @Test public static void delete_user()
		 * 
		 * { PageFactory.initElements(Login.wd, Search_inputs.class);
		 * PageFactory.initElements(Login.wd, Delete.class); if(
		 * Delete_Record_tc.ispresent);
		 * 
		 * try {
		 * 
		 * 
		 * Search_inputs.Username_Search_textbox.sendKeys("john.smith");
		 * Search_inputs.Search_Employeename.sendKeys("Abhishek J Pinaki");
		 * Search_inputs.Search_Button.click(); if(
		 * Search_inputs.notfound_webelement.getText().equals("No Records Found")) {
		 * log.info("successfully Deleted"); } } catch (Exception e) {
		 * log.error("Deletion failed"); }
		 * 
		 * 
		 * 
		 * }
		 */

	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
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
import Pagelibrary.Login;
import Pagelibrary.NewUser;
import Pagelibrary.Search_inputs;
import Utility.Dropdownlist;
import Utility.Screenshot;
import Utility.propertyconfig;
import testdata.Dataprovide;

public class Search_Results_TC extends Mylistners {

	public static final Logger log = Logger.getLogger(Search_Results_TC.class.getName());

	// (dataProvider = "Search_Users_Data",dataProviderClass = Dataprovide.class)
	@Test(dataProvider = "Search_Users_Data", dataProviderClass = Dataprovide.class)

	public static void Search_result_ispresent(String Searched_username, String User_type, String Employee_name,
			String Status) throws InterruptedException, IOException {
		PageFactory.initElements(Core_Basic.driver, Search_inputs.class);
		NewUser.admin_link.click();
		Thread.sleep(2000);

		try {
			Search_inputs.Username_Search_textbox.sendKeys(Searched_username);
			Dropdownlist.select_byvisisbletext(Search_inputs.Search_User_Type, User_type);
			Search_inputs.Search_Employeename.sendKeys(Employee_name);
			Dropdownlist.select_byvisisbletext(Search_inputs.Search_Employee_Status, Status);
			Search_inputs.Search_Button.click();
			Search_inputs.Search_Button.click();
			;
		} catch (Exception e) {
			log.error("Search action could not be completed reason is " + e.getMessage());

		}

		Assert.assertEquals(Search_inputs.Is_search.getText(),
				propertyconfig.testvalidation("Searchresultnotfound_message"));

		if (Search_inputs.Is_search.getText() == "No Records Found") {
			log.info("Search Result not found");
		} else {
			log.info("Search element found");
		}
	}



}

package testcase;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Core.Core_Basic;
import Listners.Mylistners;
import Pagelibrary.Leave;
import Pagelibrary.Login;
import Utility.Dropdownlist;

public class AssignLeave_TC extends Mylistners{
static final Logger log= Logger.getLogger(AssignLeave_TC.class.getName());
	@Test
	public static void leave_assignement() throws InterruptedException {
		PageFactory.initElements(Core_Basic.driver, Leave.class);

		try {
			Thread.sleep(5000);
			Leave.Leave_tab.click();
			Leave.assignleave_subtab.click();
			Thread.sleep(5000);
		} catch (Exception e) {
			log.error("unable to openLeave assign page "+e.getMessage());
		}
		try {
			log.info("entering employee and leave details");
			Leave.Assignleave_empname.sendKeys("Hannah Flores");
			Dropdownlist.select_byvisisbletext(Leave.Leavetype_DDL, "Maternity US");
			Leave.Assign_fromdate.sendKeys("2018-04-06");
			Leave.Assign_todate.clear();
			Leave.Assign_todate.sendKeys("2018-04-10");
			Leave.Assign_button.click();
		} catch (Exception e) {
		log.error("Unable to assign leave reason" +e.getMessage());
		}

	}

}

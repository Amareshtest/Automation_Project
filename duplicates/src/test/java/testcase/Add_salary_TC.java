package testcase;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Core.Core_Basic;
import Listners.Mylistners;
import Pagelibrary.Add_Salary;
import Pagelibrary.Login;
import Utility.Dropdownlist;
import testdata.Dataprovide;

public class Add_salary_TC extends Mylistners {
	static final Logger log = Logger.getLogger(Add_salary_TC.class.getName());

	@Test(dataProvider = "Add_Salary", dataProviderClass = Dataprovide.class)
	public static void addsalary(String paygrade, String Salary_component, String frequencey, String Currency,
			String Amount, String Comments, String direct_account, String Direct_accounttype, String Routing,
			String Amount_direct) {
		try {
			PageFactory.initElements(Core_Basic.driver, Add_Salary.class);
			try {
				Add_Salary.Addsalary_link.click();

				Add_Salary.Addsalary_button.click();
				Dropdownlist.select_byvisisbletext(Add_Salary.paygrade_DDL, paygrade);
				Add_Salary.salarycomponent_textbox.sendKeys(Salary_component);
				Dropdownlist.select_byvisisbletext(Add_Salary.payfrequency_DDL, frequencey);
				Dropdownlist.select_byvisisbletext(Add_Salary.currency_DDL, Currency);
				Add_Salary.Amount_textbox.sendKeys(Amount);
				Add_Salary.Comments_textbox.sendKeys(Comments);
			} catch (Exception e1) {
				log.error("unable to submit  primary salary details of the employee" + e1.getMessage());
				e1.printStackTrace();
			}

			try {
				Add_Salary.directdepositcheckbox.click();
				if (Add_Salary.directdepositsections.isDisplayed()) {
					Add_Salary.Directdeposit_account.sendKeys(direct_account);
					Dropdownlist.select_byvisisbletext(Add_Salary.Directdeposit_accounttype, Direct_accounttype);
					Add_Salary.routingnumber_textbox.sendKeys(Routing);
					Add_Salary.directdeposit_amount.sendKeys(Amount_direct);
				}

			} catch (Exception e) {
				log.error("unable to submit secondary salary details of the employee" +e.getMessage());
			}

			Add_Salary.salarysave_button.click();
		} catch (Exception e) {
			log.error("Add salary functionality is not working reason" +e.getMessage());
		}

	}

}

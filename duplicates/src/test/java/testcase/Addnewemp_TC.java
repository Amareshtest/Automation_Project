package testcase;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Core.Core_Basic;
import Listners.Mylistners;
import Pagelibrary.Add_NewEmployee;
import Pagelibrary.Login;
import Utility.propertyconfig;
import testdata.Dataprovide;

public class Addnewemp_TC extends Mylistners {
	static final Logger log = Logger.getLogger(Addnewemp_TC.class.getName());

	@Test(dataProvider = "Add_Employee", dataProviderClass = Dataprovide.class)
	public static void addnewemployee(String firstname, String middlename, String lastname)
			throws IOException, InterruptedException {
		PageFactory.initElements(Core_Basic.driver, Add_NewEmployee.class);

		try {
			Add_NewEmployee.PIM_TAB.click();
			Add_NewEmployee.AddEmployee_subtab.click();
			Add_NewEmployee.Firstname_textbox.sendKeys(firstname);
			Add_NewEmployee.middlename.sendKeys(middlename);
			Add_NewEmployee.lastname.sendKeys(lastname);
			Add_NewEmployee.photofiles_browse.click();
			try {
				Runtime.getRuntime().exec(propertyconfig.testconstant("Autoit"));
			} catch (Exception e) {
				log.error("AutoIT is not working so unable to upload files from external source" + e.getMessage());
				e.printStackTrace();
			}
			Thread.sleep(5000);
			Add_NewEmployee.Save_button.click();
		} catch (Exception e) {
			log.error("Unable to add new employee details reason" + e.getMessage());
			e.printStackTrace();
		}

	}

}

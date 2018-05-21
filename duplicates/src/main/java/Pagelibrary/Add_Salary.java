package Pagelibrary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Add_Salary {

	// Add salary link
	@FindBy(how = How.XPATH, using = "//*[@id='sidenav']/li[7]/a")
	public static WebElement Addsalary_link;

	// select allsalary checkbox
	@FindBy(how = How.XPATH, using = "//input[@id='salaryCheckAll']")
	public static WebElement Select_all_checkbox;

	// Delete salary button
	@FindBy(how = How.XPATH, using = "//input[@id='delSalary']")
	public static WebElement Deletesalary_button;

	// Add Salary button
	@FindBy(how = How.XPATH, using = "//input[@id='addSalary']")
	public static WebElement Addsalary_button;

	// paygrade dropdown list
	@FindBy(how = How.XPATH, using = "//select[@id='salary_sal_grd_code']")
	public static WebElement paygrade_DDL;

	// salary component textbox
	@FindBy(how = How.XPATH, using = "//input[@id='salary_salary_component']")
	public static WebElement salarycomponent_textbox;

	// pay frequency dropdownlist
	@FindBy(how = How.XPATH, using = "//select[@id='salary_payperiod_code']")
	public static WebElement payfrequency_DDL;

	// Currency Dropdownlist
	@FindBy(how = How.XPATH, using = "//select[@id='salary_currency_id']")
	public static WebElement currency_DDL;

	// Ammount textbox
	@FindBy(how = How.XPATH, using = "//input[@id='salary_basic_salary']")
	public static WebElement Amount_textbox;

	// salary comments textbox
	@FindBy(how = How.XPATH, using = "//textarea[@id='salary_comments']")
	public static WebElement Comments_textbox;

	// Direct deposit checkbox
	@FindBy(how = How.XPATH, using = "//input[@id='salary_set_direct_debit']")
	public static WebElement directdepositcheckbox;

	// Direct deposit sections
	@FindBy(how = How.XPATH, using = "//*[@id='directDebitSection']")
	public static WebElement directdepositsections;

	// Direct deposit account
	@FindBy(how = How.XPATH, using = "//input[@id='directdeposit_account']")
	public static WebElement Directdeposit_account;

	// Direct Deposit account type Dropdownlist
	@FindBy(how = How.XPATH, using = "//select[@id='directdeposit_account_type']")
	public static WebElement Directdeposit_accounttype;

	// Routing Number textbox;
	@FindBy(how = How.XPATH, using = "//input[@id='directdeposit_routing_num']")
	public static WebElement routingnumber_textbox;

	// Direct Deposit Amount
	@FindBy(how = How.XPATH, using = "//input[@id='directdeposit_amount']")
	public static WebElement directdeposit_amount;

	// Salary save Button
	@FindBy(how = How.XPATH, using = "//input[@id='btnSalarySave']")
	public static WebElement salarysave_button;

	// Salary cancel Button
	@FindBy(how = How.XPATH, using = "//input[@id='btnSalaryCancel']")
	public static WebElement salarycancel_button;

}

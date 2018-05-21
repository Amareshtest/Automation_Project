package Pagelibrary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Leavelist {

	// Leavelist Subtask
	@FindBy(how = How.XPATH, using = "//a[@id='menu_leave_viewLeaveList']")
	public static WebElement Leavelist_subtab;

	// call from datepicker
	@FindBy(how = How.XPATH, using = "//input[@id='calFromDate']")
	public static WebElement calfrom_date;

	// call to datepicker
	@FindBy(how = How.XPATH, using = "//input[@id='calToDate']")
	public static WebElement Calto_date;

	// list all types of leave checkbox
	@FindBy(how = How.XPATH, using = "//input[@id='leaveList_chkSearchFilter_checkboxgroup_allcheck']")
	public static WebElement listalltypesleave_checkbox;

	// Employee Name textbox
	@FindBy(how = How.XPATH, using = "//input[@id='leaveList_txtEmployee_empName']")
	public static WebElement Employeename_textbox;

	// Subunit select Dropdown list
	@FindBy(how = How.XPATH, using = "//select[@id='leaveList_cmbSubunit']")
	public static WebElement subunit_DDL;

	@FindBy(how = How.XPATH, using = "//input[@id='btnSearch']")
	public static WebElement submit_button;

}

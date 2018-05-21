package Pagelibrary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Leave {

	// Leave tab
	@FindBy(how = How.XPATH, using = "//a[@id='menu_leave_viewLeaveModule']")
	public static WebElement Leave_tab;

	// assign Leave subtab
	@FindBy(how = How.XPATH, using = "//a[@id='menu_leave_assignLeave']")
	public static WebElement assignleave_subtab;

	// employee name textbox
	@FindBy(how = How.XPATH, using = "//input[@id='assignleave_txtEmployee_empName']")
	public static WebElement Assignleave_empname;

	// Leave Type Dropdownlist
	@FindBy(how = How.XPATH, using = "//select[@id='assignleave_txtLeaveType']")
	public static WebElement Leavetype_DDL;

	// Assign fromdate datepicker
	@FindBy(how = How.XPATH, using = "//input[@id='assignleave_txtFromDate']")
	public static WebElement Assign_fromdate;

	// Assign todate datepicker
	@FindBy(how = How.XPATH, using = "//input[@id='assignleave_txtToDate']")
	public static WebElement Assign_todate;

	@FindBy(how = How.XPATH, using = "//input[@id='assignBtn']")
	public static WebElement Assign_button;

}

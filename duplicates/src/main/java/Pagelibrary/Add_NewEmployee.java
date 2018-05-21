package Pagelibrary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Add_NewEmployee {

	// PIM tab locator
	@FindBy(how = How.XPATH, using = "//a[@id='menu_pim_viewPimModule']")
	public static WebElement PIM_TAB;

	// Add Employees Subtab
	@FindBy(how = How.XPATH, using = "//a[@id='menu_pim_addEmployee']")
	public static WebElement AddEmployee_subtab;

	// Firstname Textbox
	@FindBy(how = How.XPATH, using = "//input[@id='firstName']")
	public static WebElement Firstname_textbox;

	// Middlename Textbox
	@FindBy(how = How.XPATH, using = "//input[@id='middleName']")
	public static WebElement middlename;

	// Lastname textbox
	@FindBy(how = How.XPATH, using = "//input[@id='lastName']")
	public static WebElement lastname;

	// EmployeeID textbox
	@FindBy(how = How.XPATH, using = "//input[@id='employeeId']")
	public static WebElement employeeid;

	// photographs browse button
	@FindBy(how = How.XPATH, using = "//input[@id='photofile']")
	public static WebElement photofiles_browse;

	// CreateLoginDetails Checkbox
	@FindBy(how = How.XPATH, using = "//input[@id='chkLogin']")
	public static WebElement createlogindetails_checkbox;

	// SaveButton locator
	@FindBy(how = How.XPATH, using = "//input[@id='btnSave']")
	public static WebElement Save_button;

}

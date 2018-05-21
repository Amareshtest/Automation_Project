package Pagelibrary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Search_Employee {

	// employee list subtab
	@FindBy(how = How.XPATH, using = "//a[@id='menu_pim_viewEmployeeList']")
	public static WebElement employeelist_subtab;

	// Employee name Search box
	@FindBy(how = How.XPATH, using = "//input[@id='empsearch_employee_name_empName']")
	public static WebElement Search_Username;

	// Employee id Searchbox
	@FindBy(how = How.XPATH, using = "//input[@id='empsearch_id']")
	public static WebElement Search_id;

	// Employee Status Dropdownlist
	@FindBy(how = How.XPATH, using = "//select[@id='empsearch_employee_status']")
	public static WebElement employeestatus_DDL;

	// Include Dropdownlist
	@FindBy(how = How.XPATH, using = "//select[@id='empsearch_termination']")
	public static WebElement Include_DDL;

	// Supervisorname textbox
	@FindBy(how = How.XPATH, using = "//input[@id='empsearch_supervisor_name']")
	public static WebElement Supervisorname;

	// JobTitle Dropdwon list
	@FindBy(how = How.XPATH, using = "//select[@id='empsearch_job_title']")
	public static WebElement jobtitle;

	// Subunit Dropdownlist
	@FindBy(how = How.XPATH, using = "//select[@id='empsearch_sub_unit']")
	public static WebElement subunit_DDL;

	// Search Button
	@FindBy(how = How.XPATH, using = "//input[@id='searchBtn']")
	public static WebElement Search_Button;

	// Reset Button
	@FindBy(how = How.XPATH, using = "//input[@id='resetBtn']")
	public static WebElement ResetButton;

}

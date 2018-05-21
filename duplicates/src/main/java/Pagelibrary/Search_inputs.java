package Pagelibrary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Search_inputs {

	@FindBy(how = How.XPATH, using = "//input[@id='searchSystemUser_userName']")
	public static WebElement Username_Search_textbox;

	@FindBy(how = How.XPATH, using = "	//input[@id='searchBtn']")
	public static WebElement Search_Button;

	@FindBy(how = How.XPATH, using = "	//select[@id='searchSystemUser_userType']")
	public static WebElement Search_User_Type;

	@FindBy(how = How.XPATH, using = "//input[@id='searchSystemUser_employeeName_empName']")
	public static WebElement Search_Employeename;

	@FindBy(how = How.XPATH, using = "	//select[@id='searchSystemUser_status']")
	public static WebElement Search_Employee_Status;

	@FindBy(how = How.XPATH, using = "	//*[@id=\"resultTable\"]/tbody/tr/td")
	public static WebElement Is_search;
	// *[@id="resultTable"]/tbody/tr/td

	@FindBy(how = How.XPATH, using = "//table[@id='resultTable' ]/tbody/tr/td")
	public static WebElement notfound_webelement;

}

package Pagelibrary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewUser {

	@FindBy(how = How.XPATH, using = "//a[@id='menu_admin_viewAdminModule']")
	public static WebElement admin_link;

	@FindBy(how = How.XPATH, using = "//a[@id='menu_admin_UserManagement']")
	public static WebElement usermanagement_link;

	@FindBy(how = How.XPATH, using = "//a[@id='menu_admin_viewSystemUsers']")
	public static WebElement users_link;

	@FindBy(how = How.XPATH, using = "//input[@id='btnAdd']")
	public static WebElement Add_button;

	// User credentials

	@FindBy(how = How.XPATH, using = "//select[@id='systemUser_userType']")
	public static WebElement Usertype_Dropdown;

	@FindBy(how = How.XPATH, using = "//input[@id='systemUser_employeeName_empName']")
	public static WebElement Employeename_txtbox;

	@FindBy(how = How.XPATH, using = "//input[@id='systemUser_userName']")
	public static WebElement Username_txtbox;

	@FindBy(how = How.XPATH, using = "//select[starts-with(@id,'systemUser_status')]")
	public static WebElement Status_Dropdown;

	@FindBy(how = How.XPATH, using = "//input[contains(@id,'password')]")
	public static WebElement Password_textbox;

	@FindBy(how = How.XPATH, using = "//input[contains(@id,'systemUser_confirmPassword')]")
	public static WebElement ConfirmPassword_textbox;

	@FindBy(how = How.XPATH, using = "//input[contains(@id,'btnSave')]")
	public static WebElement save_button;

	@FindBy(how = How.XPATH, using = "//input[@id='searchSystemUser_userName']")
	public static WebElement Username_Search_textbox;

	@FindBy(how = How.XPATH, using = "	//input[@id='searchBtn']")
	public static WebElement Search_Button;

}

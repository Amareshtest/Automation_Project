package Pagelibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login {


	// Username_textbox
	@FindBy(how = How.ID, using = "txtUsername")
	public static WebElement txt_UserName;

	// Password_textbox
	@FindBy(how = How.ID, using = "txtPassword")
	public static WebElement txt_Password;

	// Login_Button
	@FindBy(how = How.ID, using = "btnLogin")
	public static WebElement btn_login;

	// Logout_Button
	@FindBy(how = How.ID, using = "btnLogout")
	public static WebElement btn_logout;

	// Welcome_Dropdown_list
	@FindBy(how = How.XPATH, using = "//a[@id='welcome']")
	public static WebElement Welcome_DDL;

	@FindBy(how = How.XPATH, using = "//a[@href='/index.php/auth/logout']")
	public static WebElement Logout;

}

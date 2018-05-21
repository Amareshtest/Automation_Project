package Pagelibrary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Dashboard {

	// Welcome_Dropdown_list
	@FindBy(how = How.XPATH, using = "//a[@id='welcome']")
	public static WebElement Welcome_DDL;

	@FindBy(how = How.XPATH, using = "//a[@href='/index.php/auth/logout']")
	public static WebElement Logout;

	@FindBy(how = How.LINK_TEXT, using = "Welcome Admin")
	public static WebElement Welcome_DDL_Link;

	@FindBy(how = How.LINK_TEXT, using = "Logout")
	public static WebElement Logout_linktext;
}

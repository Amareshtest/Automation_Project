package Pagelibrary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Delete {

	@FindBy(how = How.XPATH, using = "//input[@id='btnDelete']")
	public static WebElement Delete_button;

	@FindBy(how = How.XPATH, using = "//input[@id=\"ohrmList_chkSelectAll\"]")
	public static WebElement selectall_checkbox;

	@FindBy(how = How.XPATH, using = "//input[@id='dialogDeleteBtn']")
	public static WebElement Delete_button_yes;

	@FindBy(how = How.XPATH, using = "//input[@data-dismiss='modal' and @value='Cancel']")
	public static WebElement Cancel_button;

}

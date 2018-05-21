package Utility;

import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdownlist {

	static final Logger logger2 = Logger.getLogger(Dropdownlist.class.getName());
	private WebDriver wd;

	public void DropDownHelper(WebDriver wd) {
		this.wd = wd;
		logger2.debug("DropDownHelper : " + this.wd.hashCode());

	}

	// Select method using the text

	public static void select_byvisisbletext(WebElement Element_Dropdown, String Visibletext) {
		Select sel = new Select(Element_Dropdown);
		sel.selectByVisibleText(Visibletext);
		logger2.info("Element_Dropdown: " + Element_Dropdown + "Value " + Visibletext);
	}

	// Select method using index

	public static void select_byindex(WebElement Element_Dropdown, int index_number) {
		Select sel = new Select(Element_Dropdown);
		sel.selectByIndex(index_number);
		logger2.info("Element_Dropdown: " + Element_Dropdown + "Value " + index_number);
	}

	// Get the selected value

	public static void getselected_value(WebElement Element) {
		String Selected_Value = new Select(Element).getFirstSelectedOption().getText();
		logger2.info("Element : " + Element + " Value : " + Selected_Value);
	}

	// Get all dropdown values

	public List<String> get_allvaluesof_dropdownlist(WebElement Element) {
		List<WebElement> All_values_DDL = new Select(Element).getAllSelectedOptions();

		List<String> values = new LinkedList<String>();

		for (WebElement element : All_values_DDL) {

			values.add(element.getText());

			logger2.info("values added to the list");

		}
		return values;

	}

}

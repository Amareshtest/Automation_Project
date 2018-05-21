package Utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Core.Core_Basic;
import Pagelibrary.Login;

public class Scroll {

	public static void scroll(WebElement wb) {
		JavascriptExecutor js = (JavascriptExecutor) Core_Basic.driver;
		js.executeScript("arguments[0].scrollIntoView();", wb);
	}

}

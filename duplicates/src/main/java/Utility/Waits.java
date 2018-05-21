package Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Core.Core_Basic;
import Pagelibrary.Login;

public class Waits {
	public static void ExplicitWait(WebElement wb, int time) {
		WebDriverWait wait = new WebDriverWait(Core_Basic.driver, time);
		
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(wb));
	}

}

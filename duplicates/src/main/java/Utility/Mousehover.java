package Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Core.Core_Basic;
import Pagelibrary.Login;

public class Mousehover {
	public static void mousehovering(WebElement wb) {
		Actions act = new Actions(Core_Basic.driver);
		act.moveToElement(wb).build().perform();

	}

}

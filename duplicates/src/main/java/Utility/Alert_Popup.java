package Utility;

import org.openqa.selenium.Alert;

import Core.Core_Basic;
import Pagelibrary.Login;

public class Alert_Popup {
	static Alert alert = null;

	public static void accept_alertpopup() {
		alert = Core_Basic.driver.switchTo().alert();
		alert.accept();
	}

	public static void dismiss_alertpopup() {
		alert = Core_Basic.driver.switchTo().alert();
		alert.dismiss();
	}

	public static String alert_message() {
		alert = Core_Basic.driver.switchTo().alert();
		String text = alert.getText();
		return text;

	}

}

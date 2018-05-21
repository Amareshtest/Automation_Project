package Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class Screenshot {
	static Logger log = Logger.getLogger(Screenshot.class.getName());

	public static void getscreenshot(WebDriver wd, String imagepath) throws IOException {

		try {
			TakesScreenshot ts = ((TakesScreenshot) wd);
			File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File(imagepath);
			FileUtils.copyFile(screenshotAs, dest);
			log.info("Screenshot captured successfully");
		} catch (WebDriverException e) {

			log.error("Unable to capture screesnshot showing error" + e.getMessage());

		}

	}

}

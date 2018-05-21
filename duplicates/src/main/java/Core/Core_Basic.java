package Core;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@SuppressWarnings("unused")
public class Core_Basic {
public static WebDriver driver;
	private static final Logger log = Logger.getLogger(Core_Basic.class.getName());

	@Parameters({ "browser" })
	@Test
	public static void launchbrowserI(String browser)

	{
		if (browser.equalsIgnoreCase("FF")) {
			System.setProperty("webdriver.gecko.driver",
					"D:\\Study\\Drivers\\geckodriver-v0.19.1-win64\\geckodriver.exe");
			driver= new FirefoxDriver();
			log.info("Luanching Firefox broeswer");
		}

		else if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			log.info("Chrome Browser Launched successfully");
		}
	}

}

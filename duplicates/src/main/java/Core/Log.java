package Core;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log {

	public static final Logger logger = Logger.getLogger(Log.class.getName());

	protected static void loadlog4j() throws IOException {
		Properties prop = new Properties();

		InputStream in = new FileInputStream(
				new File("D:\\Study\\workspace\\Selenium_dummy_project\\Log4j.properties"));
		prop.load(in);
		PropertyConfigurator.configure(prop);
	}

}

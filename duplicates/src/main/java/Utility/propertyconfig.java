package Utility;

import java.io.IOException;

public class propertyconfig {

	public static String appcontatnt(String key) throws IOException {
		Loadfiles loadfiles = new Loadfiles();
		String property = loadfiles
				.loadproperty("C:\\Users\\Amaresh\\eclipse-workspace\\duplicates\\src\\main\\Application.properties")
				.getProperty(key);
		return property;
	}

	public static String Excelconstant(String excelKey) throws IOException {
		Loadfiles loadfiles = new Loadfiles();
		String property = loadfiles
				.loadproperty("C:\\Users\\Amaresh\\eclipse-workspace\\duplicates\\src\\main\\Read.properties")
				.getProperty(excelKey);
		return property;
	}

	public static String testconstant(String testkey) throws IOException {
		Loadfiles loadfiles = new Loadfiles();
		String property = loadfiles
				.loadproperty("C:\\Users\\Amaresh\\eclipse-workspace\\duplicates\\src\\test\\Test.properties")
				.getProperty(testkey);
		return property;
	}

	public static String testvalidation(String testvalidationkey) throws IOException {
		Loadfiles loadfiles = new Loadfiles();
		String property = loadfiles
				.loadproperty("C:\\Users\\Amaresh\\eclipse-workspace\\duplicates\\src\\test\\testvalidation.properties")
				.getProperty(testvalidationkey);
		return property;
	}
}

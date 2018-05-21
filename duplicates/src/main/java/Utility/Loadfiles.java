package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Loadfiles {
	Properties p = null;

	public Properties loadproperty(String path) throws IOException {

		File fl = new File(path);
		InputStream in = new FileInputStream(fl);
		p = new Properties();
		p.load(in);
		return p;

	}

}
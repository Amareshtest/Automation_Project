package testdata;

import org.testng.annotations.Test;

public class testreading {
	@Test(dataProvider = "Add_Salary", dataProviderClass = Dataprovide.class)
	public void read(String type, String name, String x, String y, String a, String b, String c, String d, String e,
			String f) {
		System.out.println(type);
		System.out.println(name);
		System.out.println(x);
		System.out.println(y);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		;
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);

	}
}

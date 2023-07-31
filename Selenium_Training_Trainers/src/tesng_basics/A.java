package tesng_basics;

import org.testng.annotations.DataProvider;

public class A {
	
	@DataProvider(name = "Data")
	public Object[][] testdata() {
		Object[][] data=new Object[1][1];
		data[0][0]="Pradyumna";
		
		return data;
	}

}

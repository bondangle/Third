package tests;

import org.testng.annotations.Test;

import com.base.BaseClass;

public class GoogleTest extends BaseClass {

	@Test
	
	public void googletestMethod() {
		getDriver();
		driver.get("http://www.google.com");
	}
			
	
}

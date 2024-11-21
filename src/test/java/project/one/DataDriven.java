package project.one;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven {
	@DataProvider(name="Data")
	public Object[][] logindata(){
		return new Object[][] {
			{"student","Password123"},
			{"incorrectUser","Password123"},
			{"student","luci@123"}
		};
	}
	//(dataProvider="Data")String uname,String pass
	@Test
	public void test1() throws Exception {
		LoginPage l = new LoginPage();
		l.start();
		l.scroll();
		//l.getUname().sendKeys(uname);
		//l.getPass().sendKeys(pass);
		//l.getSubmit().click();
		//l.tearDown();
		
	}
}

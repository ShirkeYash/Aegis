package aegis.TestScripts;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import aegis.GenericUtility.baseTest;
import aegis.GenericUtility.webdriverUtility;
import aegis.pomClass.homePage;

@Listeners(aegis.GenericUtility.listners.class)
public class user_login_logout_Tests extends baseTest {
	
	@Test(priority = 0)
	public void loginAndLogout() throws IOException, InterruptedException {
	
		System.out.println("Login Logout Successfully Done-");
		
		homePage home=new homePage(listnerDriver);
		webdriverUtility web=new webdriverUtility();
		
		home.navigationButon.click();
		web.webPageScreenshot(listnerDriver);
		Thread.sleep(3000);
	}
	
}

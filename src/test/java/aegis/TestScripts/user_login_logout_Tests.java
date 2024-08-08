package aegis.TestScripts;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import aegis.GenericUtility.baseTest;

@Listeners(aegis.GenericUtility.listners.class)
public class user_login_logout_Tests extends baseTest {
	
	@Test(priority = 0)
	public void loginAndLogout() throws IOException, InterruptedException {
	
		System.out.println("Login Logout Test script");

		Thread.sleep(3000);
	}
	
}

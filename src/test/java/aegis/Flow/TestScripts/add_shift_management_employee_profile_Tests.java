package aegis.Flow.TestScripts;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import aegis.GenericUtility.baseTest;
import aegis.GenericUtility.webdriverUtility;
import aegis.pomClass.homePage;
import aegis.pomClass.setupPage;
import aegis.pomClass.shiftManagementPage;

@Listeners(aegis.GenericUtility.listners.class)
public class add_shift_management_employee_profile_Tests extends baseTest {
	
	@Test(enabled  = false)
	public void addShiftManagement() throws InterruptedException, IOException {
		
		//login employee profile from Sky-Tech organization.
		
		homePage home=new homePage(listnerDriver);
		setupPage setup=new setupPage(listnerDriver);
		shiftManagementPage shiftPage=new shiftManagementPage(listnerDriver);
		webdriverUtility web=new webdriverUtility();
		listnerDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		home.navigationButon.click();
		Thread.sleep(4000);
		setup.profileField.click();
		Thread.sleep(4000);
		setup.profileField.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		home.navigationButon.click();
		Thread.sleep(4000);
		//setup.selfHelp.click();
		setup.shiftManagement.click();
		
		shiftPage.applyForShiftButton.click();
		shiftPage.monthTxtField.click();
		shiftPage.selectAugustOption.click();
		Thread.sleep(2000);
		web.webPageScreenshot(listnerDriver);
		
		shiftPage.selectDate13.click();
		Thread.sleep(2000);
		shiftPage.selectDate23.click();
		Thread.sleep(2000);
		shiftPage.submitButton.click();
		shiftPage.submitButton.click();
		Thread.sleep(3000);
		shiftPage.selectShiftType.click();
		shiftPage.selectShiftType.sendKeys(Keys.ENTER);
		shiftPage.applyForShiftButton.click();
		
		
	}


}

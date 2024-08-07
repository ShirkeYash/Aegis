package aegis.TestScripts;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import aegis.GenericUtility.baseTest;
import aegis.GenericUtility.webdriverUtility;
import aegis.pomClass.employeesPunchSyncPage;
import aegis.pomClass.homePage;
import aegis.pomClass.organisationListPage;
import aegis.pomClass.setupPage;

@Listeners(aegis.GenericUtility.listners.class)
public class machine_punching_and_punch_sync_Tests extends baseTest {

	@Test(enabled = false)
	public void punchSync() throws AWTException, IOException, InterruptedException {
		
		//login with super admin credentials of noble hospitals to sync machine punching.
		
		setupPage setup=new setupPage(listnerDriver);
		homePage home=new homePage(listnerDriver);
		organisationListPage org=new organisationListPage(listnerDriver);
		employeesPunchSyncPage emp=new employeesPunchSyncPage(listnerDriver);
		webdriverUtility web=new webdriverUtility();
		listnerDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		home.goToOrganizationButton.click();
		
		String noble=listnerDriver.findElement(By.xpath("//h5[text()='Noble Hospitals']")).getText();
		System.out.println(noble);
		if (noble.equalsIgnoreCase("noble hospitals")) {
			org.setupButton.click();
			
			home.navigationButon.click();
			
			setup.machinePunching.click();
			setup.punchSync.click();
			
//			Robot robot=new Robot();
			
			emp.uploadFileButton.click();
			Thread.sleep(5000);
//			StringSelection filepath= new StringSelection("C:\\Users\\Yashsh\\Downloads\\Transaction_export_July.xlsx");
//			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);
			
//			robot.delay(2000);
//			robot.keyPress(KeyEvent.VK_CONTROL+KeyEvent.VK_V);
//			robot.keyPress(KeyEvent.VK_V);
//			robot.keyPress(KeyEvent.VK_ENTER);
			
			web.webPageScreenshot(listnerDriver);
			
			emp.searchEmployeeNameTxtField.sendKeys("yash"+Keys.ENTER);
			emp.checkbox1.click();
			emp.syncButton.click();
			emp.searchEmailtxtField.sendKeys("y@gmail.com"+Keys.ENTER);
			emp.checkBox2.click();
			emp.syncButton2.click();
			Thread.sleep(2000);
			web.webPageScreenshot(listnerDriver);
			emp.accessTimeIcon.click();
			emp.totalShiftHourTxtField.sendKeys("9"+Keys.ENTER);
			Thread.sleep(3000);
			emp.cancleButton.click();
			
		}else {
			System.out.println("Organization not found");
		}	
		
	}
	
}

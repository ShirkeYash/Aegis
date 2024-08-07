package aegis.TestScripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import aegis.GenericUtility.baseTest;
import aegis.GenericUtility.webdriverUtility;
import aegis.pomClass.employeeOnboardingPage;
import aegis.pomClass.homePage;
import aegis.pomClass.organisationListPage;
import aegis.pomClass.setupPage;

@Listeners(aegis.GenericUtility.listners.class)
public class employee_onboarding_through_excel_Tests extends baseTest {

	@Test(enabled = false)
	public void excelOnboarding() throws InterruptedException, IOException, AWTException {
		
		//login with super admin of noble hospitals organisation to on board employee through excel.
		
		setupPage setup=new setupPage(listnerDriver);
		homePage home=new homePage(listnerDriver);
		organisationListPage org=new organisationListPage(listnerDriver);
		employeeOnboardingPage emp=new employeeOnboardingPage(listnerDriver);
		webdriverUtility web=new webdriverUtility();
		listnerDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Robot robot=new Robot();
		
		home.goToOrganizationButton.click();
		org.setupButton.click();
		home.navigationButon.click();
		setup.employee.click();
		setup.onboarding.click();
		
		emp.excelOnboardingCheckbox.click();
		Thread.sleep(2000);
		//emp.downloadCsvTemplateButton.click();
		Thread.sleep(3000);
		web.webPageScreenshot(listnerDriver);
		
		StringSelection filepath= new StringSelection("QA Report.xlsx");
		
		Clipboard clip=Toolkit.getDefaultToolkit().getSystemClipboard();
		clip.setContents(filepath, null);
		
		emp.uploadExcelFileButton.click();
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		
	}
	
}

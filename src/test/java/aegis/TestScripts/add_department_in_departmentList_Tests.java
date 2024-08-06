package aegis.TestScripts;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import aegis.GenericUtility.baseTest;
import aegis.GenericUtility.webdriverUtility;
import aegis.pomClass.addDepartmentPage;
import aegis.pomClass.homePage;
import aegis.pomClass.organisationListPage;
import aegis.pomClass.setupPage;

@Listeners(aegis.GenericUtility.listners.class)
public class add_department_in_departmentList_Tests extends baseTest {

	@Test
	public void addDepartment() throws IOException, InterruptedException {
		
		//login with super admin profile of Sky-Tech organization.
		
		setupPage setup=new setupPage(listnerDriver);
		homePage home=new homePage(listnerDriver);
		organisationListPage org=new organisationListPage(listnerDriver);
		addDepartmentPage add=new addDepartmentPage(listnerDriver);
		webdriverUtility web=new webdriverUtility();
		
		listnerDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		home.goToOrganizationButton.click();
		
		org.setupButton.click();
		
		home.navigationButon.click();
		
		setup.department.click();
		setup.addDepartment.click();
		
		add.departmentNameTxtField.sendKeys(file.allOtherData("deptname"));
		add.departmentLocationTxtField.click();
		add.departmentLocationTxtField.sendKeys(file.allOtherData("deptloc")+Keys.ENTER);
		add.departmentLocationTxtField.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		add.nextButton.click();
		add.departmentIdTxtField.sendKeys(file.allOtherData("deptid"));
		add.deptCostCenterId.sendKeys(file.allOtherData("deptcostid"));
		add.nextButton.click();
		Thread.sleep(2000);
		add.submitButton.click();
	
		web.webPageScreenshot(listnerDriver);
		
		home.navigationButon.click();
		
		//setup.department.click();
		setup.manageDepartment.click();
		web.webPageScreenshot(listnerDriver);
		
	}
	
}

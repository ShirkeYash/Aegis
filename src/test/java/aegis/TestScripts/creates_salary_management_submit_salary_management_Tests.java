package aegis.TestScripts;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import aegis.GenericUtility.baseTest;
import aegis.GenericUtility.webdriverUtility;
import aegis.pomClass.homePage;
import aegis.pomClass.organisationListPage;
import aegis.pomClass.salaryManagementPage;
import aegis.pomClass.setupPage;

@Listeners(aegis.GenericUtility.listners.class)
public class creates_salary_management_submit_salary_management_Tests extends baseTest {

	@Test(priority = 3)
	public void salaryManagement() throws InterruptedException, IOException {
		
		//login with super admin from noble hospitals organizations.
		
		setupPage setup=new setupPage(listnerDriver);
		homePage home=new homePage(listnerDriver);
		organisationListPage org=new organisationListPage(listnerDriver);
		salaryManagementPage salary=new salaryManagementPage(listnerDriver);
		webdriverUtility web=new webdriverUtility();
		listnerDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		home.goToOrganizationButton.click();
		
		String noble=listnerDriver.findElement(By.xpath("//h5[text()='Noble Hospitals']")).getText();
		System.out.println(noble);
		if (noble.equalsIgnoreCase("noble hospitals")) {
			org.setupButton.click();
			
			home.navigationButon.click();
			setup.payroll.click();
			setup.salaryManagement.click();
			
			salary.searchEmpNameTxtField.sendKeys("Suyash");
			salary.MoreOptionsIcon.click();
			salary.addIconBox.click();
			
			Thread.sleep(3000);
			salary.inputTxtField.sendKeys("35000"+Keys.TAB+"0"+Keys.TAB+"1000"+Keys.TAB+"1000"+Keys.TAB+"200"+Keys.TAB+"1800"+Keys.TAB+"500");
			web.webPageScreenshot(listnerDriver);
			Thread.sleep(2000);
			salary.submitButton.click();
			Thread.sleep(3000);
			salary.calculateSalaryButton.click();
			Thread.sleep(2000);
			web.webPageScreenshot(listnerDriver);
			salary.submitButton.click();
			
			System.out.println("Salary management Test Script");
			
		}else {
			System.out.println("Invalid organisation name");
		}
		
		
	}
	
}

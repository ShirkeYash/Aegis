package aegis.TestScripts;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import aegis.GenericUtility.baseTest;
import aegis.GenericUtility.webdriverUtility;
import aegis.pomClass.employeeOnboardingPage;
import aegis.pomClass.homePage;
import aegis.pomClass.organisationListPage;
import aegis.pomClass.setupPage;

@Listeners(aegis.GenericUtility.listners.class)
public class empoyee_onboarding_in_employee_Tests extends baseTest {
	
	@Test(enabled = false)
	public void onBoarding() throws InterruptedException, IOException {
	
	//login with super admin profile of Sky-Tech organization to on board employee.	
		
	setupPage setup=new setupPage(listnerDriver);
	employeeOnboardingPage onboard=new employeeOnboardingPage(listnerDriver);
	organisationListPage org=new organisationListPage(listnerDriver);
	homePage home=new homePage(listnerDriver);
	webdriverUtility web=new webdriverUtility();
	
	home.goToOrganizationButton.click();
	org.setupButton.click();
	home.navigationButon.click();
	setup.employee.click();
	setup.onboarding.click();
	
	onboard.firstnameTxtField.sendKeys(file.allOtherData("firstName"));
	onboard.lastNameTxtField.sendKeys(file.allOtherData("lastName"));
	onboard.dateField.sendKeys(file.allOtherData("dob"));
	onboard.emailTxtField.sendKeys(file.allOtherData("empEmail"));
	onboard.contactTxtField.sendKeys(file.allOtherData("contact"));
	onboard.addressTxtField.sendKeys(file.allOtherData("address"));
	onboard.checkBox.click();
	Thread.sleep(2000);
	onboard.checkBox.click();
	onboard.maleRadioButton.click();
	onboard.adharCardTxtField.sendKeys(file.allOtherData("adharNo"));
	onboard.pancardTxtField.sendKeys(file.allOtherData("panNo"));
	onboard.bankAccountTxtField.sendKeys(file.allOtherData("bankAccountNo"));
	onboard.citizenshipTxtField.sendKeys(file.allOtherData("citizenship"));
	Thread.sleep(3000);
	
	web.webPageScreenshot(listnerDriver);
	onboard.nextButton.click();
	Thread.sleep(3000);
		
	}

}

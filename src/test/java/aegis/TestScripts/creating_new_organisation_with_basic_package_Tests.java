package aegis.TestScripts;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import aegis.GenericUtility.baseTest;
import aegis.pomClass.addOrganisationPage;
import aegis.pomClass.homePage;
import aegis.pomClass.setupPage;

@Listeners(aegis.GenericUtility.listners.class)
public class creating_new_organisation_with_basic_package_Tests extends baseTest {
	@Test (priority = 1)
	public void addOrganisation() throws InterruptedException, IOException {
		
		//login with any super admin profile.
		
		setupPage setup=new setupPage(listnerDriver);
		addOrganisationPage add=new addOrganisationPage(listnerDriver);
		homePage home=new homePage(listnerDriver);
		listnerDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		Thread.sleep(3000);
		home.navigationButon.click();
		setup.organisation.click();
		setup.addOrganisation.click();
		Thread.sleep(3000);
		
		add.orgName.sendKeys(file.allOtherData("orgname"));
		add.foundDate.sendKeys(file.allOtherData("foundDate"));
		add.webUrl.sendKeys(file.allOtherData("weburl"));
		add.linkedInUrl.sendKeys(file.allOtherData("linkedInUrl"));
		add.typeOfIndustry.sendKeys(file.allOtherData("type")+Keys.ENTER);
		add.email.sendKeys(file.allOtherData("orgEmail"));
		add.mobile.sendKeys(file.allOtherData("mobile"));
		add.description.sendKeys(file.allOtherData("description"));
		add.location.sendKeys(file.allOtherData("location"));
		Thread.sleep(2000);
		add.location.sendKeys(Keys.ENTER);
		add.checkBox.click();
		add.nextButton.click();
		Thread.sleep(2000);
		
		add.getStartedButton.click();
		add.getStartedButton.click();
		Thread.sleep(2000);
		
		add.count.sendKeys(file.allOtherData("memberCount"));
		add.cycleCount.sendKeys(Keys.BACK_SPACE);
		add.cycleCount.sendKeys(file.allOtherData("cycle"));
		add.cycleCount.sendKeys(Keys.TAB+"raz"+Keys.ENTER);
		Thread.sleep(2000);
		add.confirmButton.click();
		Thread.sleep(3000);
		
		add.submitButton.click();
		
		System.out.println("Creating new organization Test script");
		
		
	}

}

package aegis.TestScripts;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import aegis.GenericUtility.baseTest;
import aegis.GenericUtility.webdriverUtility;
import aegis.pomClass.addOrganisationPage;
import aegis.pomClass.homePage;
import aegis.pomClass.organisationListPage;

@Listeners(aegis.GenericUtility.listners.class)
public class edit_organisation_from_organisation_list_Tests extends baseTest {

	@Test (priority = 2)
	public void editOrganisationDetails() throws IOException, InterruptedException {
		
		//Edits the organisation details from organisation list page.
		
		webdriverUtility web=new webdriverUtility();
		homePage home=new homePage(listnerDriver);
		organisationListPage org=new organisationListPage(listnerDriver);
		addOrganisationPage add=new addOrganisationPage(listnerDriver);
		
		home.goToOrganizationButton.click();
		org.moreOptionIcon.click();
		org.blueEditIcon.click();
		
		add.mobile.sendKeys(Keys.CONTROL,"a",Keys.DELETE);
		Thread.sleep(3000);
		add.mobile.sendKeys("8888543120");
		add.description.sendKeys(Keys.CONTROL,"a",Keys.DELETE);
		Thread.sleep(3000);
		add.description.sendKeys("bbbbbbbb");
		web.webPageScreenshot(listnerDriver);
		
		add.submitButton.click();
		Thread.sleep(3000);
		listnerDriver.navigate().back();
		System.out.println("Edit Organization Test script");
		
	}
	
}

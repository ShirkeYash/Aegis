package aegis.TestScripts;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import aegis.GenericUtility.baseTest;
import aegis.pomClass.createNewSurveyPage;
import aegis.pomClass.employeeSurveyPage;
import aegis.pomClass.homePage;
import aegis.pomClass.organisationListPage;
import aegis.pomClass.setupPage;

@Listeners(aegis.GenericUtility.listners.class)
public class create_new_survey_in_employee_survey_Tests extends baseTest {
	
	@Test(priority = 4)
	public void createNewSurvey() throws InterruptedException {
		
		//login with super admin profile from Sky-tech organization.
		
		setupPage setup=new setupPage(listnerDriver);
		employeeSurveyPage empSurvey=new employeeSurveyPage(listnerDriver);
		createNewSurveyPage createPage=new createNewSurveyPage(listnerDriver);
		homePage home=new homePage(listnerDriver);
		organisationListPage orgList=new organisationListPage(listnerDriver);
		
		home.goToOrganizationButton.click();
		Thread.sleep(3000);
		
//		String companyname=listnerDriver.findElement(By.xpath("//h5[text()='Sky tech']")).getText();
//		if(companyname.equalsIgnoreCase("sky tech")) {
		orgList.setupButton.click();
	
		Thread.sleep(2000);
		home.navigationButon.click();
		
		setup.communication.click();
		setup.employeeSurvey.click();
		empSurvey.createNewSurveyButton.click();
		Thread.sleep(3000);
		
		
		createPage.titleTxtField.sendKeys("Automation Test");
		createPage.descriptionTxtField.sendKeys("Basics");
		Thread.sleep(3000);
		createPage.questionField.sendKeys("What is automation testing?");
		createPage.selectQuestionTypeField.click();
		createPage.shortAns.click();
		Thread.sleep(2000);
		createPage.startdateField.sendKeys("08/07/2024");
		createPage.endDateField.sendKeys("10/12/2024");
		Thread.sleep(3000);
		createPage.selectAllEmpCheckbox.click();
		createPage.selectAllButton.click();
		createPage.submitButton.click();
		Thread.sleep(3000);
//		}else {
//			System.out.println("Inavlid Company name");
//		}
		
		
	}

}

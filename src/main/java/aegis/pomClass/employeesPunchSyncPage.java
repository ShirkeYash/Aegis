package aegis.pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class employeesPunchSyncPage {
	
	public employeesPunchSyncPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='Upload File']")
	public WebElement uploadFileButton;
	
	@FindBy(xpath = "//span[text()='Sync']")
	public WebElement syncButton;
	
	@FindBy(xpath = "//input[@placeholder='Search Employee Name....']")
	public WebElement searchEmployeeNameTxtField;
	
	@FindBy(xpath = "//input[@placeholder='Search Department....']")
	public WebElement searchDepartmentTxtField;

	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	public WebElement checkbox1;
	
	@FindBy(xpath = "//input[@placeholder='Search Email....']")
	public WebElement searchEmailtxtField;
	
	@FindBy(xpath = "//input[@aria-label='Select the employee']")
	public WebElement checkBox2;
	
	@FindBy(xpath = "//button[text()='Sync']")
	public WebElement syncButton2;
	
	@FindBy(xpath = "(//*[local-name()='svg' and @data-testid='AccessTimeIcon'])[1]")
	public WebElement accessTimeIcon;
	
	@FindBy(name = "hour")
	public WebElement totalShiftHourTxtField;
	
	@FindBy(xpath = "//button[text()='Cancel']")
	public WebElement cancleButton;

	
	public WebElement getCancleButton() {
		return cancleButton;
	}

	public WebElement getCheckbox1() {
		return checkbox1;
	}

	public WebElement getSearchEmailtxtField() {
		return searchEmailtxtField;
	}

	public WebElement getCheckBox2() {
		return checkBox2;
	}

	public WebElement getSyncButton2() {
		return syncButton2;
	}

	public WebElement getAccessTimeIcon() {
		return accessTimeIcon;
	}

	public WebElement getTotalShiftHourTxtField() {
		return totalShiftHourTxtField;
	}

	public WebElement getUploadFileButton() {
		return uploadFileButton;
	}

	public WebElement getSyncButton() {
		return syncButton;
	}

	public WebElement getSearchEmployeeNameTxtField() {
		return searchEmployeeNameTxtField;
	}

	public WebElement getSearchDepartmentTxtField() {
		return searchDepartmentTxtField;
	}
	
	

}

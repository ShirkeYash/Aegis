package aegis.pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class employeeOnboardingPage {
	
	public employeeOnboardingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//----------------------------------------------First Page
	@FindBy(name = "first_name")
	public WebElement firstnameTxtField;
	
	@FindBy(name = "last_name")
	public WebElement lastNameTxtField;
	
	@FindBy(name = "date_of_birth")
	public WebElement dateField;
	
	@FindBy(name = "email")
	public WebElement emailTxtField;
	
	@FindBy(name = "phone_number")
	public WebElement contactTxtField;
	
	@FindBy(name = "address")
	public WebElement addressTxtField;
	
	@FindBy(id = "pwd")
	public WebElement checkBox;
	
	@FindBy(xpath = "//input[@value = 'male']")
	public WebElement maleRadioButton;
	
	@FindBy(xpath = "//input[@value = 'female']")
	public WebElement femaleRadioButton;
	
	@FindBy(xpath = "//input[@value = 'transgender']")
	public WebElement transgenderRadioButton;
	
	@FindBy(name = "adhar_card_number")
	public WebElement adharCardTxtField;
	
	@FindBy(name = "pan_card_number")
	public WebElement pancardTxtField;
	
	@FindBy(name = "bank_account_no")
	public WebElement bankAccountTxtField;
	
	@FindBy(name = "citizenship")
	public WebElement citizenshipTxtField;
	
	@FindBy(name = "uanNo")
	public WebElement uanNoTxtField;
	
	@FindBy(name = "esicNo")
	public WebElement esicNoTxtField;
	
	@FindBy(xpath = "//button[text()='Next']")
	public WebElement nextButton;
	
	@FindBy(xpath = "//span[text()='Excel Onboarding']")
	public WebElement excelOnboardingCheckbox;
	
	@FindBy(xpath = "//a[text()='Download CSV Template']")
	public WebElement downloadCsvTemplateButton;
	
	@FindBy(xpath = "//button[text()='Upload Excel File']")
	public WebElement uploadExcelFileButton;
	
	//----------------------------------------------Second Page
	@FindBy(name = "empId")
	public WebElement empCodeTxtField;
	
	@FindBy(id = "react-select-12-input")
	public WebElement departmentTxtField;
	
	@FindBy(id = "react-select-13-input")
	public WebElement managerTxtField;
	
	@FindBy(id = "react-select-14-input")
	public WebElement roleTxtField;
	
	@FindBy(name = "companyemail")
	public WebElement companyEmailTxtField;
	
	@FindBy(name = "joining_date")
	public WebElement joiningDateField;
	
	@FindBy(name = "password")
	public WebElement passwordTxtField;
	
	@FindBy(name = "confirmPassword")
	public WebElement confirmPasswordTxtField;
	
	@FindBy(id = "react-select-15-input")
	public WebElement designationTxtField;
	
	@FindBy(id = "react-select-16-input")
	public WebElement shiftTxtField;
	
	@FindBy(id = "react-select-17-input")
	public WebElement deptCostTxtField;
	
	@FindBy(id = "react-select-18-input")
	public WebElement locationTxtField;
	
	@FindBy(id = "react-select-19-input")
	public WebElement employeeTypeTxtField;
	
	@FindBy(id = "react-select-20-input")
	public WebElement salaryTemplateTxtField;
	
	@FindBy(xpath = "//button[text()='prev']")
	public WebElement prevButton;

	
	//----------------------------------------------Third Page
	
	
	//----------------------------------------------Getters
	
	
	public WebElement getFirstnameTxtField() {
		return firstnameTxtField;
	}

	public WebElement getExcelOnboardingCheckbox() {
		return excelOnboardingCheckbox;
	}

	public WebElement getDownloadCsvTemplateButton() {
		return downloadCsvTemplateButton;
	}

	public WebElement getUploadExcelFileButton() {
		return uploadExcelFileButton;
	}

	public WebElement getLastNameTxtField() {
		return lastNameTxtField;
	}

	public WebElement getDateField() {
		return dateField;
	}

	public WebElement getEmailTxtField() {
		return emailTxtField;
	}

	public WebElement getContactTxtField() {
		return contactTxtField;
	}

	public WebElement getAddressTxtField() {
		return addressTxtField;
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getMaleRadioButton() {
		return maleRadioButton;
	}

	public WebElement getFemaleRadioButton() {
		return femaleRadioButton;
	}

	public WebElement getTransgenderRadioButton() {
		return transgenderRadioButton;
	}

	public WebElement getAdharCardTxtField() {
		return adharCardTxtField;
	}

	public WebElement getPancardTxtField() {
		return pancardTxtField;
	}

	public WebElement getBankAccountTxtField() {
		return bankAccountTxtField;
	}

	public WebElement getCitizenshipTxtField() {
		return citizenshipTxtField;
	}

	public WebElement getUanNoTxtField() {
		return uanNoTxtField;
	}

	public WebElement getEsicNoTxtField() {
		return esicNoTxtField;
	}

	public WebElement getNextButton() {
		return nextButton;
	}

	public WebElement getEmpCodeTxtField() {
		return empCodeTxtField;
	}

	public WebElement getDepartmentTxtField() {
		return departmentTxtField;
	}

	public WebElement getManagerTxtField() {
		return managerTxtField;
	}

	public WebElement getRoleTxtField() {
		return roleTxtField;
	}

	public WebElement getCompanyEmailTxtField() {
		return companyEmailTxtField;
	}

	public WebElement getJoiningDateField() {
		return joiningDateField;
	}

	public WebElement getPasswordTxtField() {
		return passwordTxtField;
	}

	public WebElement getConfirmPasswordTxtField() {
		return confirmPasswordTxtField;
	}

	public WebElement getDesignationTxtField() {
		return designationTxtField;
	}

	public WebElement getShiftTxtField() {
		return shiftTxtField;
	}

	public WebElement getDeptCostTxtField() {
		return deptCostTxtField;
	}

	public WebElement getLocationTxtField() {
		return locationTxtField;
	}

	public WebElement getEmployeeTypeTxtField() {
		return employeeTypeTxtField;
	}

	public WebElement getSalaryTemplateTxtField() {
		return salaryTemplateTxtField;
	}

	public WebElement getPrevButton() {
		return prevButton;
	}

	
}

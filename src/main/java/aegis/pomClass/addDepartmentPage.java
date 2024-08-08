package aegis.pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import aegis.GenericUtility.webdriverUtility;

public class addDepartmentPage {
	
	public addDepartmentPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//FirstPage
	@FindBy(name = "dept_name")
	public WebElement departmentNameTxtField;
	
	@FindBy(xpath = "(//input[@aria-autocomplete='list'])[1]")
	public WebElement departmentLocationTxtField;
	
	@FindBy(name = "dept_description")
	public WebElement departmentdescriptionTxtField;
	
	@FindBy(xpath = "//div[text()='Department Head']")
	public webdriverUtility departmentHeadTxtField;
	
	@FindBy(xpath = "//div[text()='Delegate Department Head']")
	public WebElement delegateDepartmentHeadTxtField;
	
	@FindBy(xpath = "//button[text()='Next']")
	public WebElement nextButton;
	
	//secondPage
	@FindBy(name = "dept_cost_center_name")
	public WebElement deptCostCenterNametTxtField;
	
	@FindBy(name = "dept_cost_center_description")
	public WebElement deptCostCenterDescription;
	
	@FindBy(name = "dept_id")
	public WebElement departmentIdTxtField;
	
	@FindBy(name = "dept_cost_center_id")
	public WebElement deptCostCenterId;
	
	@FindBy(xpath = "//button[text()='Prev']")
	public WebElement previuosButton;
	
	//thirdPage
	@FindBy(xpath = "//button[text()='Submit']")
	public WebElement submitButton;

	public WebElement getDepartmentNameTxtField() {
		return departmentNameTxtField;
	}

	public WebElement getDepartmentLocationTxtField() {
		return departmentLocationTxtField;
	}

	public WebElement getDepartmentdescriptionTxtField() {
		return departmentdescriptionTxtField;
	}

	public webdriverUtility getDepartmentHeadTxtField() {
		return departmentHeadTxtField;
	}

	public WebElement getDelegateDepartmentHeadTxtField() {
		return delegateDepartmentHeadTxtField;
	}

	public WebElement getNextButton() {
		return nextButton;
	}

	public WebElement getDeptCostCenterNametTxtField() {
		return deptCostCenterNametTxtField;
	}

	public WebElement getDeptCostCenterDescription() {
		return deptCostCenterDescription;
	}

	public WebElement getDepartmentIdTxtField() {
		return departmentIdTxtField;
	}

	public WebElement getDeptCostCenterId() {
		return deptCostCenterId;
	}

	public WebElement getPreviuosButton() {
		return previuosButton;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}
	

	
	
}

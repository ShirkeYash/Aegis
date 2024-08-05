package aegis.pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class salaryManagementPage {
	
	public salaryManagementPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng'])[1]")
	public WebElement searchEmpNameTxtField;
	
	@FindBy(xpath = "//*[local-name()='svg' and @data-testid='MoreVertIcon']")
	public WebElement MoreOptionsIcon;
	
	@FindBy(xpath = "//*[local-name()='svg' and @data-testid='AddBoxIcon']")
	public WebElement addIconBox;
	
	@FindBy(xpath = "//td[text()='Basic']")
	public String basicComponent;
	@FindBy(xpath = "//td[text()='HRA']")
	public String hraComponent;
	@FindBy(xpath = "//td[text()='Special allowance']")
	public String specialAllowComponent;
	@FindBy(xpath = "//td[text()='DA']")
	public String daComponent;
	@FindBy(xpath = "//td[text()='Professinal Tax (Deduction)']")
	public String ProTaxComponent;
	@FindBy(xpath = "//td[text()='Employee PF']")
	public String empPFComponent;
	@FindBy(xpath = "//td[text()='ESIC']")
	public String esicComponent;
	
	@FindBy(xpath = "(//input[@type='number'])[1]")
	public WebElement inputTxtField;
	
	@FindBy(xpath = "//button[text()='Submit']")
	public WebElement submitButton;
	
	@FindBy(xpath = "//button[text()='Calculate Salary']")
	public WebElement calculateSalaryButton;

	
	public String getBasicComponent() {
		return basicComponent;
	}

	public String getHraComponent() {
		return hraComponent;
	}

	public String getSpecialAllowComponent() {
		return specialAllowComponent;
	}

	public String getDaComponent() {
		return daComponent;
	}

	public String getProTaxComponent() {
		return ProTaxComponent;
	}

	public String getEmpPFComponent() {
		return empPFComponent;
	}

	public String getEsicComponent() {
		return esicComponent;
	}

	public WebElement getSearchEmpNameTxtField() {
		return searchEmpNameTxtField;
	}

	public String getSalaryComponent() {
		return basicComponent;
	}

	public WebElement getMoreOptionsIcon() {
		return MoreOptionsIcon;
	}

	public WebElement getAddIconBox() {
		return addIconBox;
	}

	public WebElement getInputTxtField() {
		return inputTxtField;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

	public WebElement getCalculateSalaryButton() {
		return calculateSalaryButton;
	}
	

}

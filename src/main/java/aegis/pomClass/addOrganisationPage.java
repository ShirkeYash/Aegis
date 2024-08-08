package aegis.pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addOrganisationPage {
	
	public addOrganisationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "orgName")
	public WebElement orgName;
	
	@FindBy(name = "foundation_date")
	public WebElement foundDate;
	
	@FindBy(name = "web_url")
	public WebElement webUrl;
	
	@FindBy(name = "organization_linkedin_url")
	public WebElement linkedInUrl;
	
	@FindBy(id = "react-select-3-input")
	public WebElement typeOfIndustry;
	
	@FindBy(name = "email")
	public WebElement email;
	
	@FindBy(name = "contact_number")
	public WebElement mobile;
	
	@FindBy(xpath = "(//input[contains(@class,' border-none bg-white w-full outline-none px-2  false')])[7]")
	public WebElement description;
	
	@FindBy(id = "react-select-4-input")
	public WebElement location;
	
	@FindBy(xpath = "//label[text()='Do you want 7 day Trial']")
	public WebElement checkBox;
	
	@FindBy(xpath = "//button[contains(@class,'MuiButtonBase-root MuiButton')]")
	public WebElement nextButton;
	
	@FindBy(xpath = "(//button[@type='submit'])[1]")
	public WebElement getStartedButton;
	
	@FindBy(name = "count")
	public WebElement count;
	
	@FindBy(name = "cycleCount")
	public WebElement cycleCount;
	
	@FindBy(xpath = "//div[text()='Select your Merchant']")
	public WebElement paymentGateway;
	
	@FindBy(id = "react-select-17-placeholder")
	public WebElement payment;
	
	@FindBy(xpath = "//button[text()='Confirm & Pay']")
	public WebElement confirmButton;
	
	@FindBy(xpath = "//button[text()='Submit']")
	public WebElement submitButton;

	
	
	public WebElement getPayment() {
		return payment;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getOrgName() {
		return orgName;
	}

	public WebElement getFoundDate() {
		return foundDate;
	}

	public WebElement getWebUrl() {
		return webUrl;
	}

	public WebElement getLinkedInUrl() {
		return linkedInUrl;
	}

	public WebElement getTypeOfIndustry() {
		return typeOfIndustry;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getDescription() {
		return description;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getNextButton() {
		return nextButton;
	}

	public WebElement getGetStartedButton() {
		return getStartedButton;
	}

	public WebElement getCount() {
		return count;
	}

	public WebElement getCycleCount() {
		return cycleCount;
	}

	public WebElement getPaymentGateway() {
		return paymentGateway;
	}

	public WebElement getConfirmButton() {
		return confirmButton;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

}

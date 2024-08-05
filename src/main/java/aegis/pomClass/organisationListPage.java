package aegis.pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class organisationListPage {
	
	public organisationListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Setup']")
	public WebElement setupButton;
	
	//organisation Names:
	@FindBy(xpath = "//h5[text()='Noble Hospitals']")
	public WebElement nobleHospital;
	@FindBy(xpath="(//button[text()='Setup'])[2]")
	public WebElement nanoSlouSetupButton;

	@FindBy(xpath = "//button[text()='Go to Dashboard']")
	public WebElement goTodashboardButton;
	
	@FindBy(xpath = "(//*[local-name()='svg' and @data-testid='MoreVertIcon'])[1]")
	public WebElement moreOptionIcon;
	
	@FindBy(xpath = "//*[local-name()='svg' and @data-testid='DeleteOutlineIcon']")
	public WebElement redDeleteIcon;
	
	@FindBy(xpath = "//*[local-name()='svg' and @data-testid='EditOutlinedIcon']")
	public WebElement blueEditIcon;
	
	
	
	public WebElement getNobleHospital() {
		return nobleHospital;
	}

	public WebElement getNanoSlouSetupButton() {
		return nanoSlouSetupButton;
	}

	public WebElement getNanaSlouSetupButton() {
		return nanoSlouSetupButton;
	}

	public WebElement getMoreOptionIcon() {
		return moreOptionIcon;
	}

	public WebElement getRedDeleteIcon() {
		return redDeleteIcon;
	}

	public WebElement getBlueEditIcon() {
		return blueEditIcon;
	}

	public WebElement getSetupButton() {
		return setupButton;
	}
	
	public WebElement getGoTodashboardButton() {
		return goTodashboardButton;
	}


}

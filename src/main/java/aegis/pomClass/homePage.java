package aegis.pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {
	
	public homePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//*[local-name()='svg' and @data-testid='PersonIcon'])[1]")
	public WebElement profileIconButton;
	
	@FindBy(xpath = "//div[text()=' Log out']")
	public WebElement logOutButton;
	
	@FindBy(xpath = "//button[@aria-label='open drawer']")
	public WebElement navigationButon;
	
	@FindBy(xpath = "//button[text()='Go To Organisation']")
	public WebElement goToOrganizationButton;
	
	@FindBy(xpath = "(//span[contains(@class,'MuiBadge-root css-1rzb3uu')])[2]")
	public WebElement notificationIcon;
	

	public WebElement getNotificationIcon() {
		return notificationIcon;
	}

	public WebElement getGoToOrganizationButton() {
		return goToOrganizationButton;
	}

	public WebElement getNavigationButon() {
		return navigationButon;
	}

	public WebElement getProfileIconButton() {
		return profileIconButton;
	}

	public WebElement getLogOutButton() {
		return logOutButton;
	}
	

}

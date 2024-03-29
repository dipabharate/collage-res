package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import genericPackage.BaseTest;

public class HomePage extends BaseTest {
	@FindBy(xpath = "//a[.='Logout']")private WebElement logoutLink;
	@FindBy(id="SubmitTTButton")private WebElement saveLeaveTimeButton;
	@FindBy(xpath = "")private WebElement users;
	@FindBy(name="usersSelector.selectedUser")private WebElement enterTimeTrackDropDown;
	
	//intilaization
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization

	public WebElement getLogoutLink() {
		return logoutLink;
	}

	public WebElement getSaveLeaveTimeButton() {
		return saveLeaveTimeButton;
	}

	public WebElement getUsers() {
		return users;
	}

	public WebElement getEnterTimeTrackDropDown() {
		return enterTimeTrackDropDown;
	}
	
	//operational method

	public void logOut()
	{
		logoutLink.click();
		
	}
	
	public void clickOnUsers()
	{
		users.click();
	}
	
	public void clickOnSaveLeaveTime()
	{
		saveLeaveTimeButton.click();
	}
	
	
	public void selectUser(int index)
	{
		Select sel = new Select(enterTimeTrackDropDown);
		sel.selectByIndex(index);
	}
	
	public void clickOnUser() {
		users.click();
	}
}

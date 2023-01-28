package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {
	
	@FindBy(xpath = "//a[@class='content users_selected selected']") private WebElement userTB;
	@FindBy(xpath = "//input[@type='button' and (@value='Create New User')]")private WebElement createUser;
   @FindBy(name = "username")private WebElement usnTextBox;
   @FindBy(name = "passwordText")private WebElement passTextBox;
   @FindBy(name = "passwordTextRetype")private WebElement retypeTextBox;
   @FindBy(name = "firstName")private WebElement firstnameTextBox;
   @FindBy(name = "lastName")private WebElement lastnameTextBox;
   @FindBy(name = "//input[@type='submit' and (.= '')]")private WebElement createUserButton;
   @FindBy(name = "//input[@type='button' and (@value='      Cancel      ')]")private WebElement cancelButton;

//initialization
   public UsersPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

public WebElement getUserTB() {
	return userTB;
}

public WebElement getCreateUser() {
	return createUser;
}

public WebElement getUsnTextBox() {
	return usnTextBox;
}

public WebElement getPassTextBox() {
	return passTextBox;
}

public WebElement getRetypeTextBox() {
	return retypeTextBox;
}

public WebElement getFirstnameTextBox() {
	return firstnameTextBox;
}

public WebElement getLastnameTextBox() {
	return lastnameTextBox;
}

public WebElement getCreateUserButton() {
	return createUserButton;
}

public WebElement getCancelButton() {
	return cancelButton;
}
   
//operational method

public void validUsn(String validUser)
{
	getUsnTextBox().sendKeys(validUser);
}

public void validPass(String validPassword)
{
	passTextBox.sendKeys(validPassword);
}

public void firstName(String fname)
{
	firstnameTextBox.sendKeys(fname);
}
   
public void lastName(String lname)
{
	lastnameTextBox.sendKeys(lname);
}

public void clickOnCreateButton()
{
	createUserButton.click();
}

public void clickOnTab()
{
	createUser.click();
}
}


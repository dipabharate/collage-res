package testPacakage;

import java.io.IOException;

import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.Flib;
import pagePackage.HomePage;
import pagePackage.LoginPage;
import pagePackage.UsersPage;

public class ActiTimeCreateUser extends BaseTest {
	
	@Test
	public void createValidUser() throws InterruptedException, IOException
	{
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		lp.actiTimeInvalidLogin(flib.readPropertyData(PROP_PATH, "username"),flib.readPropertyData(PROP_PATH, "password"));
		Thread.sleep(2000);
		HomePage hp = new HomePage(driver);
		Thread.sleep(2000);
		hp.clickOnUser();
		UsersPage userPage = new UsersPage(driver);
		userPage.clickOnTab();
		userPage.validUsn(flib.readExcelData(EXCEL_PATH, "uservaliddata", 1, 0));
		userPage.validPass(flib.readExcelData(EXCEL_PATH, "uservaliddata", 0, 0));
	}

}

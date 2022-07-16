package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddContactPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddContactTest {
WebDriver driver;
@Test
public void validUserShouldBeAbleToAddCustomer() {
	driver = BrowserFactory.init();
	
	LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
	
	loginPage.insertUserName("demo@techfios.com");
	loginPage.insertPassword("abc123");
	loginPage.clickLoginButton();
	
	DashboardPage dashboarpage = PageFactory.initElements(driver, DashboardPage.class);
	dashboarpage.validateDashboardPage("Dashboard");
	dashboarpage.clickCustomerMenuBotton();
	dashboarpage.clickAddCustomerMenuBotton();
	
	
	AddContactPage addContactPage = PageFactory.initElements(driver, AddContactPage.class);
	addContactPage.validateAddContactPage("Add Contact");
	addContactPage.insertFullNAME("Aref Hemati");
	addContactPage.slectCompany("Uber");
	addContactPage.insertemail("abc@techfios.com");
}
}
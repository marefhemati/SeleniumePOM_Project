package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	WebDriver driver;
	@Test
	public void validUserShouldBeAbleToLogin() {
		// To call methods from different package we can create of object of the class
		// or by using the class name
//		BrowserFactory.init(); // before we call the the methods from BrowserFactory we should make the method
								// static then it give us options
//		WebDriver driver = BrowserFactory.init(); // here we save it in variable that we may need this method repeatedly
		// Now we can make it global variable in this class

//	LoginPage loginpage = new LoginPage(); //Normally We create object of LoginPage to call the methods of LoginPage but for POM it's 
		// different and we have a another method to create object of LoginPage and this methods is
		// called PageFactory like below:
		driver = BrowserFactory.init();
		LoginPage loginpage1 = PageFactory.initElements(driver, LoginPage.class); // now if the call the method it has
																					// this LoginPage driver
		loginpage1.insertUserName("demo@techfios.com");
		loginpage1.insertPassword("abc123");
		loginpage1.clickLoginButton();
		
		DashboardPage dashboarpage = PageFactory.initElements(driver, DashboardPage.class);
		dashboarpage.validateDashboardPage("Dashboard");
		
		BrowserFactory.tearDown();
	}

	
}



package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class AddContactPage extends BasePage{

	WebDriver driver;

	public AddContactPage(WebDriver driver) { // We create the constructor of of the class to link the driver when we
												// call the method it should be same
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//H5[contains(text(),'Add Contact')]") WebElement ADD_CONTACT_HEADER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='account']") WebElement FULL_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]") WebElement COMPANY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='email']") WebElement EMAIL_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='phone']") WebElement PHONE_ELEMENT;

	public void validateAddContactPage(String addContact) {
		Assert.assertEquals(ADD_CONTACT_HEADER_ELEMENT.getText(), addContact, "Wrong page!!");
	}
	public void insertFullNAME(String fullName){
		FULL_NAME_ELEMENT.sendKeys(fullName + generatedNo(999));
	}
	
	public void slectCompany(String company) {
		selectFromDropdown(COMPANY_ELEMENT, company); // here we inherit from BasePage
	}
	public void insertemail (String email) {
		EMAIL_ELEMENT.sendKeys(generatedNo(99) + email);
	}
}

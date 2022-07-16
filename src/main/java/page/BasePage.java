package page;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage { // Here in BasePage we create the methods that we may need it repeatedly then we extend this class
	WebDriver driver;

	public void selectFromDropdown(WebElement element, String visibleText) {
		Select sel = new Select(element);
		sel.deselectByVisibleText(visibleText);
	}
	
	public int generatedNo (int boundaryNo) {
		Random rnd = new Random();
			int generatedNo = rnd.nextInt();
		return generatedNo;
	}
}

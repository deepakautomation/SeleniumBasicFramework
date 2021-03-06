package pages;

import org.openqa.selenium.WebDriver;

import core.ActionDriver;
import or.HomePageElements;

public class HomePage extends ActionDriver{

	public HomePage(WebDriver driver) throws Exception {
		super(driver);
		if(!isElementPresent(HomePageElements.loginLink)){
			throw new Exception("User is not on HomePage and is on "+getTitle());
		}
	}
	
	public LoginPage clickLoginLink() throws Exception{
		click(HomePageElements.loginLink);
		return new LoginPage(driver);
	}

}

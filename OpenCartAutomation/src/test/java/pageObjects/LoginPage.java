package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement Email;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement Password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement LoginBtn;
	
	public void enterEmail(String email) {
		Email.sendKeys(email);
	}
	
	public void enterPassword(String password) {
		Password.sendKeys(password);
	}
	
	public void clickOnLoginBtn() {
		LoginBtn.click();
		
	}
}

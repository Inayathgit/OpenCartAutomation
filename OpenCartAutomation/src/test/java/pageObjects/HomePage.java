package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
		
	}

	
	@FindBy(xpath = "//span[text()='My Account']")
	WebElement MyAccount;
	
	@FindBy(xpath = "//a[text()='Register']")
	WebElement Register;
	
	@FindBy(xpath = "//a[text()='Login']")
	WebElement Login;
	
	public void clickOnMyAccount() {
		MyAccount.click();
	}
	
	public void clickOnRegister() {
		Register.click();
	}
	
	public void clickOnLogin() {
		Login.click();
	}
}

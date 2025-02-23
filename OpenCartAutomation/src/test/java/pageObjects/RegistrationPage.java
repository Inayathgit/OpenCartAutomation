package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {

	public RegistrationPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//input[@id='input-firstname']")
	WebElement FirstName;
	
	@FindBy(xpath = "//input[@id='input-lastname']")
	WebElement LastName;
	
	@FindBy(xpath = "//input[@id='input-telephone']")
	WebElement TelePhone;
	
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement Email;
	
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement Password;
	
	@FindBy(xpath = "//input[@id='input-confirm']")
	WebElement ConfirmPassword;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	WebElement CheckBox;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement ContinueBtn;
	
	@FindBy(xpath = "//div[@id='content']//h1")
	WebElement ConfirmationMsg;

	
	public void setFirstName(String firstName) {
		FirstName.sendKeys(firstName);
		
	}

	

	public void setLastName(String lastName) {
		LastName.sendKeys(lastName);
	}

	

	public void setTelePhone(String telePhone) {
		TelePhone.sendKeys(telePhone);
	}

	

	public void setEmail(String email) {
		Email.sendKeys(email);
	}


	public void setPassword(String password) {
		Password.sendKeys(password);
	}


	public void setConfirmPassword(String confirmPassword) {
		ConfirmPassword.sendKeys(confirmPassword);
	}

	

	public void clickOnCheckBox() {
		CheckBox.click();
	}



	public void clickOnContinueBtn() {
		ContinueBtn.click();
	}

	public String getConfirmationMsg() {
		
		try {
			return ConfirmationMsg.getText();
		}
		catch(Exception e) {
			return e.getMessage();
		}
		
	}

	
	
	
	

}

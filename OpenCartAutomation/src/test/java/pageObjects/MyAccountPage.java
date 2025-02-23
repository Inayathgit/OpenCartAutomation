package pageObjects;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {


		public MyAccountPage(WebDriver driver) {
			super(driver);
		}
		
		@FindBy(xpath="(//div[@id='content']//h2)[1]")
		WebElement SectionOneHeadliner;
		
		@FindBy(xpath="//li[@class='dropdown open']//a[text()='Logout']")
		WebElement Logout;
		
		@FindBy(xpath = "//a[@title='My Account']")
		WebElement MyAccountdrpdwn;
		
		@FindBy(xpath="//h2[text()='My Account']")
		WebElement MyAccount;
		
		
		public String getSectionOneHeadliner() {
			return SectionOneHeadliner.getText();
		}
		
		public boolean isHeadlinerdisplayed() {
		 boolean out;
			try {
				out = MyAccount.isDisplayed();
			}
			catch(NoSuchElementException e) {
				out = false;
			}
		return out;
		}
	
		public void clickOnLogoutBtn() {
			MyAccountdrpdwn.click();
			Logout.click();
		}

}

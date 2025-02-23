package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;

public class TC_002Login extends BaseClass {

	@Test(groups = {"Master","Sanity","Regression"})
	public void verifyLogin() {
		logger.info("**** Starting TC__002Login ****");
		try {
			
			HomePage homepage = new HomePage(driver);
			homepage.clickOnMyAccount();
			homepage.clickOnLogin();
			
			LoginPage loginpage = new LoginPage(driver);
			
			loginpage.enterEmail(prop.getProperty("email"));
			
			loginpage.enterPassword(prop.getProperty("password"));
			loginpage.clickOnLoginBtn();
			
			logger.info("**** Validating Headliner Text ****");
			MyAccountPage myaccountpage = new MyAccountPage(driver);
			String SectionOneHeadlinerText = myaccountpage.getSectionOneHeadliner();
			if(SectionOneHeadlinerText.equals("My Account")){
				Assert.assertTrue(true);
			}
			else {
				logger.error("Test Case failed");
				Assert.assertTrue(false);
				
			}
			
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("**** Finished TC__002Login ****");
	}
}

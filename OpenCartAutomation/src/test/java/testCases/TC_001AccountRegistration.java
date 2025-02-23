package testCases;



import static org.testng.Assert.assertEquals;

import static org.testng.Assert.assertTrue;

import org.apache.logging.log4j.core.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegistrationPage;

public class TC_001AccountRegistration extends BaseClass {
	
	@Test(groups = {"Sanity","Regression"})
	public void verifyAccountRegistration() {
		logger.info("****TC_001AccountRegistration Started ****");
	
			
try {
		HomePage homepage = new HomePage(driver);
		homepage.clickOnMyAccount();
		homepage.clickOnRegister();
		
		RegistrationPage registerationpage = new RegistrationPage(driver);
		registerationpage.setFirstName(generateRandomString(5));
		registerationpage.setLastName(generateRandomString(5));
		registerationpage.setEmail(generateRandomString(5)+"@gmail.com");
		registerationpage.setTelePhone(generateRandomNumeric(5));

		String pwd = generateRandomAlphanumeric(5);
		
		registerationpage.setPassword(pwd);
		registerationpage.setConfirmPassword(pwd);
		registerationpage.clickOnCheckBox();
		registerationpage.clickOnContinueBtn();
		String ConfirmMsg = registerationpage.getConfirmationMsg();
	
		if(ConfirmMsg.equalsIgnoreCase("Your Account Has Been Created!")) {
			Assert.assertTrue(true);
		}
		else {
			logger.error("Test Case Failed");
//			logger.debug("Debugging logs");
			Assert.assertTrue(false);
			
		}
		
		logger.info("**** TC_001AccountRegistration Execution Finished ****");	
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		Assert.fail();
		
	}
}
}

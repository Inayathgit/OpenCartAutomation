package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import utilities.DataProviders;

public class TC003__LoginDDT extends BaseClass{
	
	
	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class)
	public void verifyLoginDDT(String username,String password,String res) {
		
		try {
	HomePage homepage = new HomePage(driver);
	homepage.clickOnMyAccount();
	homepage.clickOnLogin();
	
	LoginPage loginpage = new LoginPage(driver);
	MyAccountPage myaccountpage = new MyAccountPage(driver);
	loginpage.enterEmail(username);
	
	loginpage.enterPassword(password);
	loginpage.clickOnLoginBtn();
	logger.info("**** Validating Headliner Text ****");
	System.out.println("This is username" + username);
	System.out.println("This is password" + password);
	System.out.println("This is res" + res);
	boolean  result  = myaccountpage.isHeadlinerdisplayed();
	if(res.equalsIgnoreCase("Valid")) {
	if(result=true){
		
		myaccountpage.clickOnLogoutBtn();
		Assert.assertTrue(true);
	}
	else {
		Assert.assertTrue(false);
	}
	}
	if(res.equalsIgnoreCase("Invalid")) {
		if(result==true){
			myaccountpage.clickOnLogoutBtn();
			Assert.assertTrue(false);
		}
		else {
			
			Assert.assertTrue(true);
		}
		}
			}
	catch(Exception e) {
	System.out.println(e.getMessage());
	Assert.fail();
	}
		}
	
		

	
}
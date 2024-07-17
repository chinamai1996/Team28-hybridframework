package TestCase;

import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.RegistrationPage;
import testBase.BaseClass;

public class TC_001_Regitration extends BaseClass {
	@Test
	public void AccountRegistration() {
	HomePage hp = new HomePage(driver);
	hp.clickAccount();
	logger.info("******clicked on create account*****");
	RegistrationPage rp = new RegistrationPage(driver);
	rp.setFirstname(RB.getString("firstname"));
	logger.info("*****entered firstname*****");
	rp.setLastname(RB.getString("lastname"));
	logger.info("******Entered lastname*****");
	rp.setEmail(RB.getString("email"));
	logger.info("******entered email*****");
	rp.setPassword(RB.getString("password"));
	logger.info("*****Entered password*****");
	rp.setConfirmPassword(RB.getString("cnfpassword"));
	logger.info("*****Entered cnfpassword*****");
	rp.ClickRegister(); 
	logger.info("*****clicked on register*****");
	}				
}

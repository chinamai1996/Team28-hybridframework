package TestCase;

import PageObjects.Loginpage;
import testBase.BaseClass;

public class TC_002_Login extends BaseClass {
	public void Login() {
		Loginpage ln = new Loginpage(driver);
		ln.setLogin();
		ln.setEmail(RB.getString("email"));
		ln.setPassword(RB.getString("password"));
		ln.setSingin(null);
		
	}

}

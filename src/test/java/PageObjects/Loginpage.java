package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends BasePage {

	public Loginpage(WebDriver driver) {
		super(driver);
	
	}
	//with pagefactory
	@FindBy (xpath="//a[text()=' Sign In ']") 
	WebElement txt_Login;
	
	@FindBy (xpath="//input[@id='email']")
	WebElement txt_email;
	@FindBy (xpath="//input[@type='password']")
	WebElement txt_password;
	
	@FindBy (xpath="//span[text()='Sign In']")
	WebElement txt_singin;
	
	public void setLogin() {
	txt_Login.click(); 	
	}
	public void setEmail(String email) {
		txt_email.sendKeys(email);
	}
	public void setPassword(String password) {
		txt_password.sendKeys(password);
		
	}
	public void setSingin(String signin) {
		txt_singin.click();
	}
		
	}



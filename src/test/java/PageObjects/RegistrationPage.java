package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {

	public RegistrationPage(WebDriver driver) {
		super(driver);
	}
	@FindBy (xpath="//input[@id='firstname']")
	WebElement txt_firstname;
	
	@FindBy (xpath="//input[@id='lastname']")
	WebElement txt_lastname;
	
	@FindBy (xpath="//input[@name='email']")
	WebElement txt_email;
	
	@FindBy (xpath="(//input[@name='password'])[1]")
	WebElement txt_password;
	
	@FindBy (xpath="(//input[@name='password_confirmation'])[1]")
	WebElement txt_cpassword;
	
	@FindBy (xpath="//button[@title='Create an Account']")
	WebElement btn_register;
	
	public void setFirstname(String fname) {
		txt_firstname.sendKeys(fname);
	}
	public void setLastname(String lname) {
		txt_lastname.sendKeys(lname);
	}
	public void setEmail(String email) {
	txt_email.sendKeys(email);
	}
	public void setPassword(String password) {
		txt_password.sendKeys(password);
	}
	public void setConfirmPassword(String Cnpwd) {
		txt_cpassword.sendKeys(Cnpwd);
	}
	public void ClickRegister() {
		btn_register.click();;
	}
}

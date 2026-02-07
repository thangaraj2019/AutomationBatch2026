package pagePack;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePack.BaseClass;

public class AdactinHotelRegistrationPageObject extends BaseClass {
	
	public AdactinHotelRegistrationPageObject() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath="//a[text()='New User Register Here']")
	public WebElement newUserRegisterLink;
	
	@FindBy(id="username")
	public WebElement usernameField;
	
	@FindBy(id="password")
	public WebElement passwordField;
	
	@FindBy(id="re_password")
	public WebElement confirmPasswordField;
	
	@FindBy(id="full_name")
	public WebElement fullNameField;
	
	@FindBy(id="email_addd")
	public WebElement emailAddressField;
	
	@FindBy(id="captcha-form")
	public WebElement captchaField;
	
	@FindBy(id="tnc_box")
	public WebElement termsAndConditionsCheckbox;
	
	@FindBy(id="Submit")
	public WebElement registerButton;
	
	
	public void enterUserName(String username) {
		usernameField.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		passwordField.sendKeys(password);
	}
	
	public void enterConfirmPassword(String confirmPassword) {
		confirmPasswordField.sendKeys(confirmPassword);
	}
	
	public void enterFullName(String fullName) {
		fullNameField.sendKeys(fullName);
	}
	
	public void enterEmailAddress(String emailAddress) {
		emailAddressField.sendKeys(emailAddress);
	}
	
	public void enterCaptcha(String captcha) {
		captchaField.sendKeys(captcha);
	}
	
	public void clickTermsAndConditions() {
		termsAndConditionsCheckbox.click();
	}
	
	public void clickRegisterButton() {
		registerButton.click();
	}
	
	public void clickNewUserRegisterLink() {
		newUserRegisterLink.click();
	}
	

}

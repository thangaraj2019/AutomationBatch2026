package pagePack;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePack.BaseClass;

public class OrangeHRMLoginPageObject extends BaseClass{
	
	public OrangeHRMLoginPageObject() {
		PageFactory.initElements(getDriver(), this);
		
	}
		
	
	@FindBy(name="username")
	public WebElement username;
	
	@FindBy(name="password")
	public WebElement password;
	
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement loginBtn;
	
	
	
	public void enterUsername(String user) throws InterruptedException {
		Thread.sleep(6000);
		username.sendKeys(user);
	}
	
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void clickLoginBtn() {
		loginBtn.click();
	}
	
	
}

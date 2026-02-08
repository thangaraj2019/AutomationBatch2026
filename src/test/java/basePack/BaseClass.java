package basePack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<WebDriver>();
	
	
	
	public void initializeDriver() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		threadDriver.set(driver);
		
	}
	
	public static WebDriver getDriver() {
		return threadDriver.get();
	}

	
	public void launchUrl(String url) {
		getDriver().get(url);
	}
	
	public boolean verifyApplicationUrl(String expectedUrl) {
		String actualUrl = getDriver().getCurrentUrl();
		return actualUrl.equals(expectedUrl);
	}
	 
	public void setup() {
		
		        System.out.println("Firefox browser launched");
		        System.out.println("Chrome browser launched");
	
		    }
	
}

package basePack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class BaseClass {

    public static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<WebDriver>();

    public void initializeDriver() {

       
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        // options.addArguments("--headless=new"); // enable if needed

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

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

    public void quitDriver() {
        WebDriver driver = getDriver();
        if (driver != null) {
            driver.quit();
            threadDriver.remove();
        }
    }

}
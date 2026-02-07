package hooksPack;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import basePack.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HookClass {
	BaseClass base;
	
	@Before
	public void beforeScenario() {
		System.out.println("Before Scenario Hook executed");
		base = new BaseClass();
		base.initializeDriver();
	}
	
	@After
	public void afterScenario(Scenario scenario) throws IOException {

		if(scenario.isFailed()) {		
			TakesScreenshot tk = (TakesScreenshot) base.getDriver();
			byte[] source = tk.getScreenshotAs(OutputType.BYTES);
			scenario.attach(source, "image/png", scenario.getName());		
		}
		
		BaseClass.getDriver().quit();
	}

}

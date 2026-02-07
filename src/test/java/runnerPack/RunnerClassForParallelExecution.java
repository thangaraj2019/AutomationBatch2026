package runnerPack;


import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="C:\\Users\\thang\\OneDrive\\Desktop\\EclipseWorkspace\\CucumberProjectFramework\\src\\test\\resources\\FeatureFiles",
glue={"stepPack","hooksPack"}, plugin= {"pretty","html:target/cucumber-report.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","rerun:target/failedscenarios.txt"},dryRun =false)

public class RunnerClassForParallelExecution extends AbstractTestNGCucumberTests {
	
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}

}

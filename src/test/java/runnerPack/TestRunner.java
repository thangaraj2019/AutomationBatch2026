package runnerPack;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features="src/test/resources/FeatureFiles",
    glue={"stepPack","hooksPack"},
    plugin={
        "pretty",
        "html:target/cucumber-report.html",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
        "rerun:target/failedscenarios.txt"
    },
    dryRun=false,
    tags="@AdactinHotelRegistrationTC001"
)


public class TestRunner {


}



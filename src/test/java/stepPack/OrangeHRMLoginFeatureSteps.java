package stepPack;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagePack.OrangeHRMLoginPageObject;


public class OrangeHRMLoginFeatureSteps extends OrangeHRMLoginPageObject {
	
	
	
	@Given("user launch the Orange HRM application")
	
	public void user_launch_the_orange_hrm_application() {
		
		launchUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
	@Then("user verify that the Orange HRM application {string} is laucnhed successfully")
	public void user_verify_that_the_orange_hrm_application_is_laucnhed_successfully(String expectedUrl) {
		
		Assert.assertTrue(verifyApplicationUrl(expectedUrl));
			
	}
	
	
	@When("user click on the login button")
	public void user_click_on_the_login_button() {
		
	}
	
	@Then("user verify that the user is navigated to the Orange HRM home page successfully")
	public void user_verify_that_the_user_is_navigated_to_the_orange_hrm_home_page_successfully() {
	}
	
	@When("user enter the valid {string} and valid {string}")
	public void user_enter_the_valid_and_valid(String username, String password) throws InterruptedException {
		enterUsername(username);
		enterPassword(password);
	}

	@Then("user verify that the error message {string} is displayed on the login screen")
	public void user_verify_that_the_error_message_is_displayed_on_the_login_screen(String expectedErrorMsg) {
	
	  
	}
	
	
	@When("user enter the below valid credentials")
	public void user_enter_the_below_valid_credentials(DataTable credentials) throws InterruptedException {
		
//		List<List<String>> datas = credentials.asLists();
		List<Map<String, String>>datas = credentials.asMaps();
		
		System.out.println(datas.get(0).get("userName"));
		System.out.println(datas.get(0).get("Password"));
	
	   
	}


	
	
}

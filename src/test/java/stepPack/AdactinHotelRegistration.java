package stepPack;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import pagePack.AdactinHotelRegistrationPageObject;

public class AdactinHotelRegistration extends AdactinHotelRegistrationPageObject {
	
	@Given("user launch the Adactin Hotel application")
	public void user_launch_the_adactin_hotel_application() {
	  
		launchUrl("http://adactinhotelapp.com/");
		
	}
	
	@When("user click on the New User Register Here link")
	public void user_click_on_the_new_user_register_here_link() {
	  
		clickNewUserRegisterLink();
	}
	
	@When("user click and enters all below mandatory values into the all fields")
	public void user_click_and_enters_all_below_mandatory_values_into_the_all_fields(DataTable adactinHotelRegData) {
		
		List<String> allAcdatinHotelRegDatas =  adactinHotelRegData.asList();
		enterUserName(allAcdatinHotelRegDatas.get(0));
		enterPassword(allAcdatinHotelRegDatas.get(1));
		enterConfirmPassword(allAcdatinHotelRegDatas.get(2));
		enterFullName(allAcdatinHotelRegDatas.get(3));
		enterEmailAddress(allAcdatinHotelRegDatas.get(4));
		enterCaptcha(allAcdatinHotelRegDatas.get(5));
		
			
		
	}
	
	@When("user click the terms and condition checkbix on the Register button")
	public void user_click_the_terms_and_condition_checkbix_on_the_register_button() {
		clickTermsAndConditions();
	}
	@When("user click on the Register button")
	public void user_click_on_the_register_button() {
		clickRegisterButton();
	}
	@Then("user verify that the registration is successful and user is navigated to the login screen")
	public void user_verify_that_the_registration_is_successful_and_user_is_navigated_to_the_login_screen() {
	 
	}


}

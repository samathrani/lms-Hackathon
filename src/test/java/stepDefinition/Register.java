package stepDefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageClasses.RegisterPage;

public class Register {
	
	WebDriver driver = Hooks.driver;
	RegisterPage register;
	
	@Given("User is on LMS website")
	public void user_is_on_lms_website() {
		register= new RegisterPage(driver);
	}

	@When("User clicks register button")
	public void user_clicks_register_button() {
		//register.clickregister();
	
	}

	@Then("User should land on registration page and sees the heading on the form as {string}")
	public void user_should_land_on_registration_page_and_sees_the_heading_on_the_form_as(String registration) {
		//register.registration(registration);
		  // assertEquals(registration, "Registration Form");
		   System.out.println("User is in Registration page");
	}

	@Then("User sees a log in button with text {string} on the form")
	public void user_sees_a_log_in_button_with_text_on_the_form(String loginText) {
		//register.loginText(loginText);
		 //  assertEquals(loginText, "Registration Form");
		   System.out.println("Registration button");
	}
	
	@Then("User sees a sign up button with text {string} on the form")
	public void user_sees_a_sign_up_button_with_text_on_the_form(String signUpText) {
		//register.signUpText(signUpText);
		 //  assertEquals(signUpText, "Registration Form");
		   System.out.println("Sign Up Button");
	}

	@Given("User is on the Registeration Page")
	public void user_is_on_the_registeration_page() {
		//register.registrationPage();
	 
	}

	@When("User clicks the Log in button")
	public void user_clicks_the_log_in_button() {
		///register.login();
	}

	@Then("User lands on the Log in page")
	public void user_lands_on_the_log_in_page() {
//register.LoginPage();
System.out.println("Login page");
		
	}

	@When("User clicks sign up button with all fields empty")
	public void user_clicks_sign_up_button_with_all_fields_empty() {
		//register.signUp();
	   
	}

	@Then("User should get a message {string}")
	public void user_should_get_a_message(String warningText) {
		//register.warningText(warningText);
		  // assertEquals(warningText, "Please fill out the field above");
		   System.out.println("Display error Message");
		
	}

	@When("User clicks sign up button with all mandatory fields empty")
	public void user_clicks_sign_up_button_with_all_mandatory_fields_empty() {
		//register.signUp();
	}

	@When("User clicks sign up button with one of the mandatory fields empty")
	public void user_clicks_sign_up_button_with_one_of_the_mandatory_fields_empty() {
		//register.firstName();
		//register.lastName();
		//register.signUp();
	}

	@When("User clicks Sign Up button with invalid phone")
	public void user_clicks_sign_up_button_with_invalid_phone() {
		//register.invalidPhone();
		
	   
	}

	@When("User clicks Sign Up button with invalid email")
	public void user_clicks_sign_up_button_with_invalid_email() {
		//register.invalidemail();
	}

	@When("User clicks Sign Up button with invalid Password")
	public void user_clicks_sign_up_button_with_invalid_password() {
		//register.invalidPassword();
	}

	@When("USer clicks Sign Up button with existing User name")
	public void u_ser_clicks_sign_up_button_with_existing_user_name() {
		//register.existingUser();
	}

	@Then("User should see the message {string}")
	public void user_should_see_the_message(String warningText) {
		//register.warningText(warningText);
		 //  assertEquals(warningText, "Please fill out the field above");
		   System.out.println("Display error Message");
	}

	@When("User enters all Field value and click Sign Up button")
	public void user_enters_all_field_value_and_click_sign_up_button() {
		/*register.firstName();
		register.lastName();
		register.address();
		register.streetName();
		register.city();
		register.state();
		register.zip();
		register.birthDate();
		register.userName();
		register.password();
		register.phone();
		register.email();*/
		
		}
		@Then("User should get successful message {string}")
		public void user_should_get_successful_message(String successText) {
			
			//register.successText(successText);
			  // assertEquals(successText, "Registeration successful");
			   System.out.println("Registeration successful");
	}


}

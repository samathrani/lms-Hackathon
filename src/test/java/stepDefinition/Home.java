package stepDefinition;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageClasses.HomePage;


public class Home {
	WebDriver driver = Hooks.driver;
	HomePage homepage;
	
	@Given("User is in login page")
	public void user_is_in_login_page() {
		homepage= new HomePage(driver);
	
	}

	@When("The user gets the valid data from the datasheet with {string} and {string}")
	public void the_user_gets_the_valid_data_from_the_datasheet_with_and(String testId, String sheetName) {
		homepage.enterusername(testId, sheetName);
		homepage.enterpassword(testId, sheetName);
		homepage.clicklogin();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Then("User should see a heading with text {string} on the Home page")
	public void user_should_see_a_heading_with_text_on_the_home_page(String LmsText) {
		homepage.LmsTitle(LmsText);
		   assertEquals(LmsText, "LMS - Learning Management System");
		    System.out.println("LMS - Learning Management System");
	}

	@Then("User should see a program button with text {string} on the menu bar")
	public void user_should_see_a_program_button_with_text_on_the_menu_bar(String programText) {
		homepage.programText(programText);
		   assertEquals(programText, "Program");
		   System.out.println("Program button");
	}

	@Then("User should see a batch button with text {string} on the menu bar")
	public void user_should_see_a_batch_button_with_text_on_the_menu_bar(String batchText) {
		homepage.batchText(batchText);
		   assertEquals(batchText, "Batch");
		   System.out.println("Batch button");
	}

	@Then("User should see a user button with text {string} on the menu bar")
	public void user_should_see_a_user_button_with_text_on_the_menu_bar(String userText) {
		homepage.userText(userText);
		   assertEquals(userText, "User");
		   System.out.println("User button");
	}

	@Then("User should see a assignment button with text {string} on the menu bar")
	public void user_should_see_a_assignment_button_with_text_on_the_menu_bar(String assignmentText) {
		homepage.assignmentText(assignmentText);
		   assertEquals(assignmentText, "Assignment");
		   System.out.println("Assignment button");
	}

	@Then("User should see aattendace  button with text {string} on the menu bar")
	public void user_should_see_aattendace_button_with_text_on_the_menu_bar(String attendanceText) {
		homepage.attendanceText(attendanceText);
		   assertEquals(attendanceText, "Attendance");
		   System.out.println("Attendance button");
	}

	@Then("User should see a logout button with text {string} on the menu bar")
	public void user_should_see_a_logout_button_with_text_on_the_menu_bar(String logoutText) {
		homepage.logoutText(logoutText);
		   assertEquals(logoutText, "Logout");
		   System.out.println("Logout button");
	}
	
	@Given("The User is in home page after enters valid data from the datasheet with {string} and {string}")
	public void the_user_is_in_home_page_after_enters_valid_data_from_the_datasheet_with_and(String testId, String sheetName) {
		homepage= new HomePage(driver);
		homepage.enterusername(testId, sheetName);
		homepage.enterpassword(testId, sheetName);
		homepage.clicklogin();
	}
	@When("The user clicks a Program  button")
	public void the_user_clicks_a_program_button() {
		 homepage.clickprogram();
	}

	@Then("The User should redirected to Program  page")
	public void the_user_should_redirected_to_program_page() {
		System.out.println("User redirected to Program  page");
	}

	@When("The user clicks a Batch button")
	public void the_user_clicks_a_batch_button() {
		 homepage.clickbatch();
	}

	@Then("The User should redirected to Batch page")
	public void the_user_should_redirected_to_batch_page() {
		System.out.println("User redirected to Batch page");
	}

	@When("The user clicks a User button")
	public void the_user_clicks_a_user_button() {
		 homepage.clickuser();
	}

	@Then("The User should redirected to User page")
	public void the_user_should_redirected_to_user_page() {
		System.out.println("User redirected to User page ");
	}

	@When("The user clicks a Assignment button")
	public void the_user_clicks_a_assignment_button() {
		 homepage.clickassignment();
	}

	@Then("The User should redirected to Assignment page")
	public void the_user_should_redirected_to_assignment_page() {
		System.out.println("User redirected to Assignment page");
	}

	@When("The user clicks a Attendance button")
	public void the_user_clicks_a_attendance_button() {
		 homepage.clickattendance();
	}

	@Then("The User should redirected to Attendance page")
	public void the_user_should_redirected_to_attendance_page() {
		 System.out.println("User redirected to Attendance page");
	}

	@When("The user clicks a logout button")
	public void the_user_clicks_a_logout_button() {
	    homepage.clicklogout();
	}

	@Then("The User should redirected to login page")
	public void the_user_should_redirected_to_login_page() {
	  System.out.println("User loggged out successfully");
	}

}

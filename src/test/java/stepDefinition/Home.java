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
		    System.out.println("passed");
	}

	@Then("User should see a program button with text {string} on the menu bar")
	public void user_should_see_a_program_button_with_text_on_the_menu_bar(String programText) {
		homepage.programText(programText);
		   assertEquals(programText, "Program");
	}

	@Then("User should see a batch button with text {string} on the menu bar")
	public void user_should_see_a_batch_button_with_text_on_the_menu_bar(String batchText) {
		homepage.batchText(batchText);
		   assertEquals(batchText, "Batch");
	}

	@Then("User should see a user button with text {string} on the menu bar")
	public void user_should_see_a_user_button_with_text_on_the_menu_bar(String userText) {
		homepage.userText(userText);
		   assertEquals(userText, "User");
	}

	@Then("User should see a assignment button with text {string} on the menu bar")
	public void user_should_see_a_assignment_button_with_text_on_the_menu_bar(String assignmentText) {
		homepage.assignmentText(assignmentText);
		   assertEquals(assignmentText, "Assignment");
	}

	@Then("User should see aattendace  button with text {string} on the menu bar")
	public void user_should_see_aattendace_button_with_text_on_the_menu_bar(String attendanceText) {
		homepage.attendanceText(attendanceText);
		   assertEquals(attendanceText, "Attendance");
	}

	@Then("User should see a logout button with text {string} on the menu bar")
	public void user_should_see_a_logout_button_with_text_on_the_menu_bar(String logoutText) {
		homepage.logoutText(logoutText);
		   assertEquals(logoutText, "Logout");
	}

}

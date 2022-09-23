package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageClasses.ManageBatch;

public class ManageBatchSteps {
	WebDriver driver=Hooks.driver;
	ManageBatch managebatch;
	
	@Given("User is on Login Page")
	public void user_is_on_login_page() {
		managebatch=new ManageBatch(driver);
	    
	    throw new io.cucumber.java.PendingException();
	}

	@When("Enters {string} and {string} and user clicks on Login button")
	public void enters_and_and_user_clicks_on_login_button(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("navigates to home page")
	public void navigates_to_home_page() {
	    throw new io.cucumber.java.PendingException();
	    System.out.println("home page should be displayed");
	}

	@Given("User is on home page")
	public void user_is_on_home_page() {
	    
	    throw new io.cucumber.java.PendingException();
	}

	@When("user clicks Batch on the title Bar")
	public void user_clicks_batch_on_the_title_bar() {
	    managebatch.clkBatch();
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user should be navigated to manage batch page")
	public void user_should_be_navigated_to_manage_batch_page() {
	   System.out.println("------ManageBatch should be displayed-----");
	    throw new io.cucumber.java.PendingException();
	}

	@Given("User is logged on to LMS website")
	public void user_is_logged_on_to_lms_website() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User is on Batch page")
	public void user_is_on_batch_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User should see a heading with text {string} on the page")
	public void user_should_see_a_heading_with_text_on_the_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Verify that the Delete button next to the search box is Disabled")
	public void verify_that_the_delete_button_next_to_the_search_box_is_disabled() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Verify that number of records \\(rows of data in the table) displayed on the page are {int}")
	public void verify_that_number_of_records_rows_of_data_in_the_table_displayed_on_the_page_are(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("User is on Batch page")
	public void batc_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on search box with Batch Name entered in it")
	public void user_clicks_on_search_box_with_batch_name_entered_in_it() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("records of that  {string} are displayed")
	public void records_of_that_are_displayed(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on Edit button")
	public void user_clicks_on_edit_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User lands on Batch Details form.")
	public void user_lands_on_batch_details_form() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("User is on Batch details page")
	public void user_is_on_batch_details_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User edits Name")
	public void user_edits_name() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User can see edited Name")
	public void user_can_see_edited_name() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user edits description")
	public void user_edits_description() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User can see edited descricption")
	public void user_can_see_edited_descricption() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user edits program name")
	public void user_edits_program_name() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user can see edited program name")
	public void user_can_see_edited_program_name() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user changes status")
	public void user_changes_status() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User can see updated Status")
	public void user_can_see_updated_status() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user edits No of classes")
	public void user_edits_no_of_classes() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user can see updated No of classes")
	public void user_can_see_updated_no_of_classes() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user clicks cancel button")
	public void clicks_cancel_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User can see Batch Details are not updated")
	public void user_can_see_batch_details_are_not_updated() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user clicks save button")
	public void user_click_save_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User can see {string} alert")
	public void user_can_see_alert(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User searches with newly updated {string}")
	public void user_searches_with_newly_updated(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User verifies that the details are correctly updated")
	public void user_verifies_that_the_details_are_correctly_updated() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User selects more than one Batch using checkbox")
	public void user_selects_more_than_one_batch_using_checkbox() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Baches gets selected")
	public void baches_gets_selected() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on Delete button")
	public void user_clicks_on_delete_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User lands on Confirm Deletion form.")
	public void user_lands_on_confirm_deletion_form() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("user is on Batch Confirm Deletion page")
	public void user_is_on_batch_confirm_deletion_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks Yes button")
	public void user_clicks_yes_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User can see {string} message")
	public void user_can_see_message(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User Searches for {string}")
	public void user_searches_for(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("There should be zero results.")
	public void zero_results() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("User is on Batch Confirm Deletion Page after selecting multiple batches")
	public void user_is_on_batch_confirm_deletion_page_after_selecting_multiple_batches() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks No button")
	public void user_clicks_no_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User can see Batches are still selected and not deleted")
	public void user_can_see_batches_are_still_selected_and_not_deleted() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("user is on Batch page")
	public void batch_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user clicks delete  button for any batch")
	public void user_clicks_delete_button_for_any_batch() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user will get confirm deletion popup")
	public void user_will_get_confirm_deletion_popup() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("There should be zero results")
	public void there_should_be_zero_results() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("User is on Batch Confirm Deletion Page after selecting a batch to delete")
	public void user_is_on_batch_confirm_deletion_page_after_selecting_a_batch_to_delete() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User can see Batch is not deleted")
	public void user_can_see_batch_is_not_deleted() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks A New Batch button")
	public void user_clicks_a_new_batch_button() {
	   managebatch.addBatch();
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user can see Batch details form")
	public void user_can_see_batch_details_form() {
	   
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks Save button without entering data")
	public void user_clicks_save_button_without_entering_data() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User gets message {string}")
	public void user_gets_message(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks Cancel button")
	public void user_clicks_cancel_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User can see Batch Details form disappears")
	public void user_can_see_batch_details_form_disappears() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user enters name in text box")
	public void user_enters_name_in_text_box() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User can see {string} entered")
	public void user_can_see_entered(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User enters Description in text box")
	public void user_enters_description_in_text_box() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User selects Program name")
	public void user_selects_program_name() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User can see {string} selected")
	public void user_can_see_selected(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User selects Status using radiobutton")
	public void user_selects_status_using_radiobutton() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User can see {string} status selected")
	public void user_can_see_status_selected(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User enters No of classes in text box")
	public void user_enters_no_of_classes_in_text_box() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks Save button")
	public void user_clicks_save_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User searches with newly created {string}")
	public void user_searches_with_newly_created(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Records of the newly created  {string} is displayed")
	public void records_of_the_newly_created_is_displayed(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User is on first page of Manage Batch")
	public void user_is_on_first_page_of_manage_batch() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Verify that previous link is disabled")
	public void verify_that_previous_link_is_disabled() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("User is on the page number {string}")
	public void user_is_on_the_page_number(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks navigate > button")
	public void user_clicks_navigate_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User navigated to page number {string}")
	public void user_navigated_to_page_number(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("User is on page number {string}")
	public void user_is_on_page_number(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks navigate < button")
	public void navigate_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User is on last page of Manage Batch")
	public void user_is_on_last_page_of_manage_batch() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Verify that next link is disabled")
	public void verify_that_next_link_is_disabled() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on the Ascending arrow \\(down ) near to the Batch name")
	public void user_clicks_on_the_ascending_arrow_down_near_to_the_batch_name() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User can see the results in Ascending order of Batch name")
	public void user_can_see_the_results_in_ascending_order_of_batch_name() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on the Ascending arrow \\(down ) near to the Batch Description")
	public void user_clicks_on_the_ascending_arrow_down_near_to_the_batch_description() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User can see the results in Ascending order of Batch Description")
	public void user_can_see_the_results_in_ascending_order_of_batch_description() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on the Ascending arrow \\(down ) near to the Batch Status")
	public void user_clicks_on_the_ascending_arrow_down_near_to_the_batch_status() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User can see the results in Ascending order of Batch Status")
	public void user_can_see_the_results_in_ascending_order_of_batch_status() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on the Ascending arrow \\(down ) near to the No Of Classes")
	public void user_clicks_on_the_ascending_arrow_down_near_to_the_no_of_classes() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User can see the results in Ascending order of No of Classes")
	public void user_can_see_the_results_in_ascending_order_of_no_of_classes() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on the Ascending arrow \\(down ) near to the Program Name")
	public void user_clicks_on_the_ascending_arrow_down_near_to_the_program_name() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User can see the results in Ascending order of Program Name")
	public void user_can_see_the_results_in_ascending_order_of_program_name() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks onthe Descending arrow \\(down ) near to the Batch name")
	public void user_clicks_onthe_descending_arrow_down_near_to_the_batch_name() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User can see the results in Descending order of Batch name")
	public void user_can_see_the_results_in_descending_order_of_batch_name() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks onthe Descending arrow \\(down ) near to the Batch Description")
	public void user_clicks_onthe_descending_arrow_down_near_to_the_batch_description() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User can see the results in Descending order of Batch Description")
	public void user_can_see_the_results_in_descending_order_of_batch_description() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks onthe Descending arrow \\(down ) near to the Batch Status")
	public void user_clicks_onthe_descending_arrow_down_near_to_the_batch_status() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User can see the results in Descending order of Batch Status")
	public void user_can_see_the_results_in_descending_order_of_batch_status() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on the Descending arrow \\(down ) near to the No Of Classes")
	public void user_clicks_on_the_descending_arrow_down_near_to_the_no_of_classes() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User can see the results in Descending order of No of Classes")
	public void user_can_see_the_results_in_descending_order_of_no_of_classes() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on the Descending arrow \\(down ) near to the Program Name")
	public void user_clicks_on_the_descending_arrow_down_near_to_the_program_name() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User can see the results in Descending order of Program Name")
	public void user_can_see_the_results_in_descending_order_of_program_name() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}

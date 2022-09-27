package stepDefinition;
import static org.testng.Assert.assertEquals;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageClasses.ManageProgramPage;


public class Program {
	WebDriver driver = Hooks.driver;
	ManageProgramPage programpage;

	@Given("User is in loginpage")
	public void user_is_in_loginPage() {
		programpage =new ManageProgramPage(driver);
	}

	@When("The user gets the valid data from excel with {string} and {string}")
	public void the_user_gets_the_valid_data_from_excel_with_and(String testId, String sheetName) {
		programpage.validlogin("testId","Sheet1");  
	}

	@Then("User should see a heading with text {string} on the page")
	public void user_should_see_a_heading_with_text_on_the_page(String managePgmHeading) {
		programpage.headingTxt(managePgmHeading);
		assertEquals(managePgmHeading, "Manage Program");
		System.out.println("pass");
	}

	@Given("User is logged on to LMS website")
	public void user_is_logged_on_to_lms_website() {
		//programpage =new ManageProgramPage(driver);
		//programpage.validlogin("testId","Sheet1");  
	}

	@Then("User should see text as {string} below the table")
	public void user_should_see_text_as_below_the_table(String txtBelowTable) {
		programpage.textBelowTable(txtBelowTable);
		Assert.assertEquals(txtBelowTable,"Showing 1 to 5 of 27 entries");
		System.out.println("pass"); 
	}
	@Then("User should see the footer as {string}")
	public void user_should_see_the_footer_as(String totalNoOfPrograms) {
		programpage.footer(totalNoOfPrograms);
		Assert.assertEquals(totalNoOfPrograms, "In total there are 27 Programs.");     
	}
	@Then("User should see the Delete button on the top left hand side as Disabled")
	public void user_should_see_the_delete_button_on_the_top_left_hand_side_as_disabled() {
		programpage.disabledDelButton();   
	}

	@Then("Verify that number of records \\(rows of data in the table) {string}")
	public void verify_that_number_of_records_rows_of_data_in_the_table(String noofrowsintable) {
		programpage.NoOfRowsInTable();
		//Assert.assertEquals(entry, "5 rows of data in table");
		System.out.println("Pass, 5 rows of data displayed");
	}
	@Then("Text box used for search has text as {string}")
	public void text_box_used_for_search_has_text_as(String textInSearchfield) {
		programpage.searchFeature();
		String Srch="Search...";
		Assert.assertEquals(textInSearchfield, Srch);
		System.out.println("Pass");
	}
	@Given("User is on Program page")
	public void user_is_on_program_page() {
		System.out.println("User is in program page");
		programpage =new ManageProgramPage(driver);
		programpage.validlogin("testId","Sheet1");
	}

	@When("User enters name {string} into search box.")
	public void user_enters_name_phrase_into_search_box(String name) {   
		name= "AWS";
		programpage.searchByProgramName(name);  
	}

	@Then("Entries for name string are shown.")
	public void entries_for_name_phrase_are_shown() {
		System.out.println("Search results for given name phrase is displyaed");
	}

	@When("User enters description {string} into search box.")
	public void user_enters_description_phrase_into_search_box(String desc) {

		desc="JAVA";
		programpage.searchByProgramDesciption(desc);
	}

	@Then("Entries for description string are shown.")
	public void entries_for_description_phrase_are_shown() {
		System.out.println("Entries for entered desc are shown");
	}

	@When("User enters Status {string} into search box.")
	public void user_enters_status_phrase_into_search_box(String status) {
		status="Active";
		programpage.searchByProgramStatus(status);

	}

	@Then("Entries for Status string are shown.")
	public void entries_for_status_phrase_are_shown() {
		System.out.println("Entries for entered status are shown");
	}
	@When("User selects Program using checkbox")
	public void user_selects_program_using_checkbox() {
		//programpage =new ManageProgramPage(driver);
		//programpage.validlogin("testId","Sheet1");
		programpage.selectPgmByCheckbox();
	}

	@Then("Program gets selected")
	public void program_gets_selected() {
		System.out.println("particular program gets selected");
	}
	@Given("User clicks on <Edit> button")
	public void user_clicks_on_edit_button() {
		programpage =new ManageProgramPage(driver);
		programpage.validlogin("testId","Sheet1");
		programpage.selectPgmByCheckbox();
		programpage.editFeature();
	}
	@When("Edit check box is selected")
	public void edit_check_box_is_selected() {
		System.out.println("check box gets selected");
	}

	@Then("User lands on Program Details form.")
	public void user_lands_on_program_details_form() {
		System.out.println("Program details window appears");

	}
	@Given("User is on Program Details form")
	public void user_is_on_program_details_form() {
		programpage =new ManageProgramPage(driver);
		programpage.validlogin("testId","Sheet1");
		programpage.editFeature();
		System.out.println("User in Program details window ");
	}

	@When("User edits Name and selects the Save button")
	public void user_edits_name_and_selects_the_save_button() {
		programpage.editNameAndSave();
	}
	@Then("User can see updated Name")
	public void user_can_see_updated_name() {
		System.out.println("User can see updated Name");
	}
	@When("User edits Description and selects the Save button")
	public void user_edits_description_and_selects_the_save_button() {
		programpage.editDescAndSave();
	}

	@Then("User can see updated Description")
	public void user_can_see_updated_description() {
		System.out.println("User can see updated description");
	}

	@When("User changes status and selects the Save button")
	public void user_changes_status_and_selects_the_save_button() {
		programpage.editStatusAndSave();
	}

	@Then("User can see updated Status")
	public void user_can_see_updated_status() {
		System.out.println("User can see updated Status");    
	}

	@When("User clicks <Cancel> button")
	public void user_clicks_cancel_button() {
		programpage.cancelPgmDetails();
	}

	@Then("User can see Program Details form disappears")
	public void user_can_see_program_details_form_disappears() {
		System.out.println("Program Details form disappears");
	}
	@When("User clicks <Save> button")
	public void user_clicks_save_button() {
		//programpage.editFeature();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		programpage.savePgmDetails();
	}
	@Then("User can see {string} message")
	public void user_can_see_message(String string) {

		System.out.println("Successful Program Updated");
	}

	@When("Check box is selected to delete")
	public void check_box_is_selected_to_delete() {
		programpage.selectPgmByCheckbox();
		programpage.deleteFeature();
	}
	@When("User clicks on <Delete> button")
	public void user_clicks_on_delete_button() {
		//programpage =new ManageProgramPage(driver);
		//programpage.validlogin("testId","Sheet1");
		programpage.deleteFeature();
	}
	@Then("User lands on Confirm Deletion form.")
	public void user_lands_on_confirm_deletion_form() {
		System.out.println("Confirmation window should appear");
	}

	@Given("User is on Confirm Deletion form")
	public void user_is_on_confirm_deletion_form() {
		programpage =new ManageProgramPage(driver);
		programpage.validlogin("testId","Sheet1");
	}
	@When("User clicks <No> button")
	public void user_clicks_no_button() {
		programpage.deleteFeature();
		programpage.deleteNo();
	}
	@Then("User can see Confirm Deletion form disappears")
	public void user_can_see_confirm_deletion_form_disappears() {
		System.out.println("deletion window shoould close");
	}
	@When("User clicks <Yes> button")
	public void user_clicks_yes_button() {
		programpage.deleteFeature();
		programpage.deleteYes();
	}
	@When("User clicks <A New Program> button")
	public void user_clicks_a_new_program_button() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		programpage.addNewPgm();
	}

	@Then("User lands on Program Details form to add new program.")
	public void user_lands_on_program_details_form_to_add_new_program() {
		System.out.println("User lands on Program Details form to add new program");
	}
	@When("User clicks <Save> button without entering data")
	public void user_clicks_save_button_without_entering_data() {
		programpage.saveNewPgmDetails();
	}

	@Then("User gets message {string}")
	public void user_gets_message(String string) {
		System.out.println("Name is required");
	}
	@When("User enters <Name> in text box")
	public void user_enters_name_in_text_box() {
	}

	@Then("User can see {string} entered")
	public void user_can_see_entered(String string) {
	}

	@When("User enters <Description> in text box")
	public void user_enters_description_in_text_box() {
	}

	@When("User selects <Status> using radiobutton")
	public void user_selects_status_using_radiobutton() {
	}
	@Then("User can see {string} status selected")
	public void user_can_see_status_selected(String string) {
	}

	@When("User selects more than one Program using checkbox")
	public void user_selects_more_than_one_program_using_checkbox() {
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		programpage.selectMultiFeature();
	}
	@Then("Programs get selected")
	public void programs_get_selected() {
		System.out.println("corresponing programs gets selected");
	}
	@When("User clicks on <Delete> button on top left corner")
	public void user_clicks_on_delete_button_on_top_left_corner() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		programpage.selectMultiFeature();	
		programpage.deleteMultiFeature();
	}
	@Given("User is on Confirm Del form")
	public void user_is_on_confirm_del_form() {
		System.out.println("User is on Confirm Del form");
	}

	@Given("User is on Confirm Del form for No")
	public void user_is_on_confirm_del_form_for_no() {
		programpage =new ManageProgramPage(driver);
		programpage.validlogin("testId","Sheet1");	
	}

	@When("User clicks delete all <No> button")
	public void user_clicks_delete_all_no_button() {
		programpage.selectMultiFeature();	
		programpage.deleteMultiFeature();
		programpage.delMulitiNo();
	}
	@Then("User can see no programs gets deleted")
	public void user_can_see_no_programs_gets_deleted() {
		System.out.println("User can see no programs gets deleted");
	}
	@Given("User is on Confirm Del form for Yes")
	public void user_is_on_confirm_del_form_for_yes() {
		programpage =new ManageProgramPage(driver);
		programpage.validlogin("testId","Sheet1");	
	}
	@When("User clicks delete all <Yes> button")
	public void user_clicks_delete_all_yes_button() {
		programpage.selectMultiFeature();	
		programpage.deleteMultiFeature();
		programpage.delMultiYes();
	}

	@Then("User can see  All Programs Deleted message")
	public void user_can_see_all_programs_deleted_message() {
		System.out.println("User can see  All Programs Deleted message");

	}
}
/*
	//Pagination
	@When("User is on first page of Manage Program")
	public void user_is_on_first_page_of_manage_program() {
		programpage.clickPagiLeft();
	}
	@Then("Verify that previous link is disabled")
	public void verify_that_previous_link_is_disabled() {
		System.out.println("Pagination left arrow is disabled");
	}
	@Given("User is on the page number {string}")
	public void user_is_on_the_page_number(String string) {
	}

	@When("User clicks navigateRight > button")
	public void user_clicks_navigate_right_button() {
	}

	@Then("User navigated to page number {string}")
	public void user_navigated_to_page_number(String string) {
	}
	@When("User clicks navigateLeft < button")
	public void user_clicks_navigate_left_button() {
	}

	@When("User is on last page of Manage Program")
	public void user_is_on_last_page_of_manage_program() {
	}
	@Then("Verify that next link is disabled")
	public void verify_that_next_link_is_disabled() {
}
	@Given("User is on the Program page")
	public void user_is_on_the_program_page() {

	}
	@When("User clicks on the Ascending arrow \\(down) near to the Program name")
	public void user_clicks_on_the_ascending_arrow_down_near_to_the_program_name() {
	}

	@Then("User can see the results in Ascending order of Program name")
	public void user_can_see_the_results_in_ascending_order_of_program_name() {
	}
	@When("User clicks on the Ascending arrow \\(down) near to the Program Description")
	public void user_clicks_on_the_ascending_arrow_down_near_to_the_program_description() {
	}

	@Then("User can see the results in Ascending order of Program description")
	public void user_can_see_the_results_in_ascending_order_of_program_description() {
	}

	@When("User clicks on the Ascending arrow \\(down)near to the Program status")
	public void user_clicks_on_the_ascending_arrow_down_near_to_the_program_status() {
	}

	@Then("User can see the results in Ascending order of Program status")
	public void user_can_see_the_results_in_ascending_order_of_program_status() {
	}

	@When("User clicks on the descending arrow \\(down) near to the Program name")
	public void user_clicks_on_the_descending_arrow_down_near_to_the_program_name() {
	}

	@Then("User can see the results in descending order of Program name")
	public void user_can_see_the_results_in_descending_order_of_program_name() {
	}
	@When("User clicks on the descending arrow \\(down) near to the Program Description")
	public void user_clicks_on_the_descending_arrow_down_near_to_the_program_description() {
	}

	@Then("User can see the results in descending order of Program description")
	public void user_can_see_the_results_in_descending_order_of_program_description() {
	}

	@When("User clicks on the descending arrow \\(down)near to the Program status")
	public void user_clicks_on_the_descending_arrow_down_near_to_the_program_status() {
	}
	@Then("User can see the results in descending order of Program status")
	public void user_can_see_the_results_in_descending_order_of_program_status() {
	}*/


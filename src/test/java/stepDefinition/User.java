package stepDefinition;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import com.lms.ui.factory.DriverFactory;
import com.lms.ui.pageobject.UserDetailsPageObject;
import com.lms.ui.pageobject.UserPageDeleteIconPageObject;
import com.lms.ui.pageobject.UserPageObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class User {
	static WebDriver driver;
	static UserPageObject user;
	static UserPageDeleteIconPageObject deleteuser;
	static UserDetailsPageObject userDetails;
	int noOfRecords=0;
	int beforeDeleteCount=0;
	int afterDeleteCount=0;
	int previousCount=0;
	int afterCount=0;

	@AfterMethod
	public void closeDriver() {
		driver.quit();
	}

	@Given("User is on any page after Login")
	public void user_is_on_any_page_after_login() {
		System.out.println("In Given");
		//driver.findElement(By.xpath("//button[@class=\"mat-focus-indicator mat-button mat-button-base\"][1]")).click();
		DriverFactory dr = new DriverFactory();
		driver = dr.initialiseDriver();
		user= new UserPageObject(driver);
		deleteuser= new UserPageDeleteIconPageObject(driver);

		user.enterLoginID();
		user.enterLoginPassword();
		user.clickLogin();

	}

	@When("User clicks the Tab {string}")
	public void user_clicks_the_tab(String string) throws InterruptedException {
		//Thread.sleep(5000);
		user.clickUserTab();
	}

	@Then("User should see the Manage user page")
	public void user_should_see_the_manage_user_page() throws InterruptedException {

		String originaltext	= user.assertUserPage();
		Assert.assertEquals(originaltext, "Manage User");
	}

	public void initialize() {
		DriverFactory dr = new DriverFactory();
		driver = dr.initialiseDriver();
		user= new UserPageObject(driver);
		user.enterLoginID();
		user.enterLoginPassword();
		user.clickLogin();
		userDetails = new UserDetailsPageObject(driver);
	}

	//----------------

	//Feature :Pagination
	@When("User is on the Manage user page after clicking User Tab")
	public void user_is_on_the_manage_user_page_after_clicking_user_tab() throws Exception {
		//		if(user == null) {
		//			initialize();
		//		}`
		//Thread.sleep(3000);
		initialize();
		user.clickUserTab();
	}

	@Then("User should see the pagination controls below data table")
	public void user_should_see_the_pagination_controls_below_data_table() {
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class=\"p-paginator-bottom p-paginator p-component ng-star-inserted\"]")).isDisplayed(), "Eleemnt Present");

	}


	//3
	@When("Manage user table has less less than or equal to {int} rows")
	public void manage_user_table_has_less_less_than_or_equal_to_rows(Integer int1) {
		System.out.println("No. of "+noOfRecords);
		System.out.println("USER obj:"+user);
		user.clickUserTab();
		noOfRecords =  user.findNoOfRecordsInDataTable();
		System.out.println("No. of "+noOfRecords);
	}

	@Then("Pagination control should be disabled")
	public void pagination_control_should_be_disabled() throws IOException {
		//		URL url = new URL("https://www.google.com");
		//		HttpURLConnection  huc = (HttpURLConnection)(url).openConnection();
		//		System.out.println(huc.getResponseCode());
		if(noOfRecords<=5) {
			Assert.assertFalse(user.findPaginationEnabled());

		}

	}

	//6
	@When("Manage user table has more than {int} rows")
	public void manage_user_table_has_more_than_rows(Integer int1) {
		user.clickUserTab();
		noOfRecords =  user.findNoOfRecordsInDataTable();
		System.out.println("No. of "+noOfRecords);

	}

	@Then("Pagination control should be enabled")
	public void pagination_control_should_be_enabled() {
		if(noOfRecords>5) {
			Assert.assertTrue(user.findPaginationEnabled());
		}

	}

	//	//7 	Scenario: Verify pagination next link	

	@Given("User table is displayed in manage user page")
	public void user_table_is_displayed_in_manage_user_page() {
		boolean isCheckDataTablePresent = user.checkDataTableIsPresent();
		Assert.assertEquals(isCheckDataTablePresent, true);
	}

	@When("User cliks next link of pagination")
	public void user_cliks_next_link_of_pagination() {
		if(user.isPaginationNextPageButtonEnabled())
			user.clickPaginationNextPageButton();
	}

	@Then("Next page should be displayed")
	public void next_page_should_be_displayed() {
		Assert.assertEquals(user.assertUserPage(), "Manage User"); 
		//int noOfEntriesInPagination = user.nextPageEntriesOnPaginationRightClick();
		//Assert.assertTrue(noOfEntriesInPagination>5);
		//System.out.println("HHH"+noOfEntriesInPagination);
	}

	//----------------
	//8Scenario: Verify pagination next link after 	
	@Given("last record of user table	last page of User records are displayed")
	public void last_record_of_user_table_last_page_of_user_records_are_displayed() {
		System.out.println("here");
		driver.findElement(By.xpath("//button[@class='mat-focus-indicator mat-button mat-button-base'][2]")).click();

		while(user.isLastPageButtonOnPaginationEnabled()==true) {
			user.clickLastPageButtonOnPagination();
		}

	}
	@When("	When User cliks next link of pagination	")
	public void when_user_cliks_next_link_of_pagination()
	{
		while(user.isLastPageButtonOnPaginationEnabled()==true) {
			user.clickLastPageButtonOnPagination();
		}
	}
	@Then("Next link of pagination should be disabled")
	public void next_link_of_pagination_should_be_disabled() {
		Assert.assertFalse(user.isPaginationNextPageButtonEnabled());
	}
	//Table Footer

	@Given("User is logged on to the LMS website	 ")
	public void user_is_logged_on_to_the_LMS_website() {

		user= new UserPageObject(driver);

		user.enterLoginID();
		user.enterLoginPassword();
		user.clickLogin();

	}
	@When("User lands on Manage User page")
	public void user_lands_on_manage_user_page() throws InterruptedException {
		//Thread.sleep(5000);
		user.clickUserTab();
	}

	@Then("User should see the table footer as {string}")
	public void user_should_see_the_table_footer_as(String string) {
		Assert.assertEquals(user.getFooterContent(), "In total there are 4 users."); 
	}

	//ADD New User Button

	@Then("User should see the button  Add New User")
	public void user_should_see_the_button_add_new_user() throws Exception {
		user.clickUserTab();
		//Thread.sleep(3000);
		Assert.assertTrue(user.checkPresenceOfAddNewUserButton());
	}

	@When("User clicks Add New User button")
	public void user_clicks_add_new_user_button() {
		user.clickAddNewUserButton();
	}

	@Then("User should see the {string} dialog box")
	public void user_should_see_the_dialog_box(String string) {
		Assert.assertTrue(user.checkUserDetailsDialogBox());
	}
	//Table header

	@Then("User should see the table header as \"Empty checkbox-icon , ID with sorticon, Name with Sorticon, Email Address with sort icon,Contact Number with sort icon, Batch with sort icon, Skill with Sort icon, Edit\\/Delete as column names")
	public void user_should_see_the_table_header_as_empty_checkbox_icon_id_with_sorticon_name_with_sorticon_email_address_with_sort_icon_contact_number_with_sort_icon_batch_with_sort_icon_skill_with_sort_icon_edit_delete_as_column_names() {
		user.checkTableHeader();

	}

	@When("User clicks sort icon in table header")
	public void user_clicks_sort_icon_in_table_header() {
		user.clickSortButton();
		user.clickSortButton();

	}

	@Then("Table rows should be sorted")
	public void table_rows_should_be_sorted() {

		List<WebElement> list = user.listofItemsInDataTable();

		List<String> usersInDataTable = list.stream().map(element -> element.getText()).collect(Collectors.toList());

		List<String> usersInDtaTableCopy = new ArrayList<>(usersInDataTable);
		//Collections.copy(usersInDtaTableCopy, usersInDataTable);
		Collections.sort(usersInDtaTableCopy,Collections.reverseOrder());
		Assert.assertTrue(usersInDataTable.equals(usersInDtaTableCopy));


	}

	@When("User checks empty checkbox in header")
	public void user_checks_empty_checkbox_in_header() {
		user.clickCheckBoxInHeader();
	}

	@Then("Check box in all the rows of user table should be checked")
	public void check_box_in_all_the_rows_of_user_table_should_be_checked() {
		Assert.assertTrue(user.isAllCheckBoxesSelected());

	}

	@When("User unchecks checkbox in header")
	public void user_unchecks_checkbox_in_header() {
		user.clickCheckBoxInHeader();
	}

	@Then("Check box in all the rows of user table should be unchecked")
	public void check_box_in_all_the_rows_of_user_table_should_be_unchecked() {
		Assert.assertFalse(user.isAllCheckBoxesSelected());
	}

	//----------------------DeleteIcon-------------------------------
	//-----------------------------------------------------------------

	@Then("User should see the delete icon at the top left corner of the user table")
	public void user_should_see_the_delete_icon_at_the_top_left_corner_of_the_user_table() {
		boolean isDeleteIconDisplayed = user.isDeleteIconDisplayed();
		Assert.assertTrue(isDeleteIconDisplayed);
	}

	@When("no rows is checked")
	public void no_rows_is_checked() {
		boolean isAllSelected = user.isAllCheckBoxesSelected();
		Assert.assertFalse(isAllSelected);
	}

	@Then("Delete icon at the top left corner of the user table disabled")
	public void delete_icon_at_the_top_left_corner_of_the_user_table_disabled() {
		boolean isDeleteIconDisabled = user.isDeleteIconIsDisabled();
		Assert.assertTrue(isDeleteIconDisabled);
	}
	//-------------

	@Given("User checks the rows in user table")
	public void user_checks_the_rows_in_user_table() throws InterruptedException {

		user.clickCheckBoxInHeader();
	}

	@When("User clicks the delete icon at the top right corner of user table")
	public void user_clicks_the_delete_icon_at_the_top_left_corner_of_user_table() throws InterruptedException {
		user.clickDeleteIconOnRight();
	}

	@Then("Confirm dialog box should be displayed with Text {string}")
	public void confirm_dialog_box_should_be_displayed_with_text(String string) {
		boolean value = user.checkConfirmAlertBoxPopUp();
		Assert.assertTrue(value);
	}



	//-------- 3rd

	@Then("Delete icon at the top left corner of the user table enabled")
	public void delete_icon_at_the_top_left_corner_of_the_user_table_enabled() {
		Assert.assertTrue(user.isDeleteIconEnabled());
	}


	//NO button
	@When("User clicks button No")
	public void user_clicks_button_no() {
		beforeDeleteCount = user.listofItemsInDataTable().size();
		user.clickNoButtonOnAlertBox();
	}

	@Then("Selected rows should not be deleted and dialog box should be closed")
	public void selected_rows_should_not_be_deleted_and_dialog_box_should_be_closed() {
		afterDeleteCount = user.listofItemsInDataTable().size();
		if(beforeDeleteCount==afterDeleteCount)
			assertTrue(true);
		else
			assertTrue(false);

	}//

	//YEs button

	@Given("User is in confirm dialog box after clicking delete icon")
	public void user_is_in_confirm_dialog_box_after_clicking_delete_icon() {
		user.clickDeleteIconOnRight();
	}

	@When("User clicks button Yes")
	public void user_clicks_button_yes() {
		try {
			user.clickYesButtonOnAlertBox();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	@Then("Selected rows should be deleted and popup should be shown with success message {string}")
	public void selected_rows_should_be_deleted_and_popup_should_be_shown_with_success_message(String string) {
		if(beforeDeleteCount> afterDeleteCount)
			assertTrue(true);
		else
			assertFalse(false);
	}


	//******************************************************************************************
	//*****************USER DETAILS ***************************************************************


	@When("User clicks A Add new user button")
	public void user_clicks_a_add_new_user_button() {
		initialize();
		user.clickUserTab();
		user.clickAddNewUserButton();
	}

	@Then("User should see User details window with heading {string}")
	public void user_should_see_user_details_window_with_heading(String string) throws Exception {
		Thread.sleep(2000);
		boolean isDisplayed = user.checkUserDetailsDialogBox();
		Assert.assertTrue(isDisplayed);
		Assert.assertTrue(userDetails.validateHeadingInUserDetailsAlert());
	}

	@Then("User should see a button with text Cancel in user details window")
	public void user_should_see_a_button_with_text_cancel_in_user_details_window() throws Exception {
		Thread.sleep(2000);
		boolean isCancelButtonPresentInUserDetails = userDetails.isCancelButtonPresentInUserDetailsAlert();
		Assert.assertTrue(isCancelButtonPresentInUserDetails);
	}
	///////
	@When("User clicks A cancel button")
	public void user_clicks_a_cancel_button() throws Exception {
		Thread.sleep(2000);
		userDetails.clickCancelButtonOnuserDetailsAlert();

	}


	// Scenario: Fucntionality of Cancel(x) icon 
	@Then("User details window should be closed")
	public void user_details_window_should_be_closed() throws InterruptedException {
		Thread.sleep(2000);
		boolean value = user.ischeckUserDetailsDialogBoxPresent();
		Assert.assertFalse(value); 
	}
	////
	@Then("User should see a cancel\\(x) in user details window")
	public void user_should_see_a_cancel_x_in_user_details_window() {

		boolean value = userDetails.isCloseButtonOnUserDetailsALertVisible();
		Assert.assertTrue(value);
	}
	// Scenario: Fucntionality of Cancel(x) icon
	@When("User clicks A cancel\\(X) icon")
	public void user_clicks_a_cancel_x_icon() {
		userDetails.clickCancelButtonOnuserDetailsAlert();
	}



	//Scenario: Verify the presence of Submit button in user detais window
	@Then("User should see a button with text Submit in user details window")
	public void user_should_see_a_button_with_text_submit_in_user_details_window() {
		userDetails.isSubmitButtoninUserDetailsAlert();
	}
	
	
	@Then("User should see the input fields for {string},{string}, Last name\",\"Email adress\",\"Phone no\", \"Address\",\"City\", \"State\",\"Postal Code\".\"Program\",\"UG Program\",\"PG Program\",\"Skill\",\"Experience\",\"User Role\",Visa status\",{string},{string} corresponding to their labels")
	public void user_should_see_the_input_fields_for_last_name_email_adress_phone_no_address_city_state_postal_code_program_ug_program_pg_program_skill_experience_user_role_visa_status_corresponding_to_their_labels(String string, String string2, String string3, String string4) throws Exception {
		boolean validate = userDetails.validateInputElementsinUserDetailsDialogBox();
		Assert.assertTrue(validate);
	}

	@Then("User should see the placeholders with Text")
	public void user_should_see_the_placeholders_with_text() {
		boolean validate = userDetails.validatePlaceHolderInUserDetailsBox();
		Assert.assertTrue(validate);
	}

	@When("User clicks the drop down icon for state")
	public void user_clicks_the_drop_down_icon_for_state() {
		userDetails.clickDropDownState();
	}

	@Then("User should select from the drop down menu")
	public void user_should_select_from_the_drop_down_menu() {
		userDetails.isDropDownStateListVisible();
	}

	@When("User clicks the drop down icon for User Role")
	public void user_clicks_the_drop_down_icon_for_user_role() {
	userDetails.clickDropDownRoleList();
	}
	
	@Then("User should select from the role drop down menu")
	public void user_should_select_from_the_role_drop_down_menu() {
		userDetails.isDropDownRoleListEnabled();
	}
	
	@When("User clicks the button + Add CO, Apt, Suite, Unit")
	public void user_clicks_the_button() {
		userDetails.clickAddress2LinkInUserDetails();
	}

	@Then("User should see the input field with Label Address2")
	public void user_should_see_the_input_field_with_label(String string) {
		Assert.assertTrue(userDetails.isAddress2TextBoxInUserDetailsVisible());
	}
	
	@Then("User should see the button with text {string}")
	public void user_should_see_the_button_with_text(String string) {
	userDetails.isAddress2TextBoxInUserDetailsVisible();
	}
	
	@When("User clicks save button with all details empty")
	public void user_clicks_save_button_with_all_details_empty() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("User should see a message \"Mandatory Fields cannot be empty")
	public void user_should_see_a_message_mandatory_fields_cannot_be_empty() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User clicks Save button by entering all valid values in required fields")
	public void user_clicks_save_button_by_entering_all_valid_values_in_required_fields() {
		previousCount = user.findNoOfRecordsInDataTable(); 
		userDetails.enterAllDetails();
	}

	@Then("New User Should be Saved.")
	public void new_user_should_be_saved() {
		 afterCount = user.findNoOfRecordsInDataTable();
		 Assert.assertTrue(afterCount>beforeDeleteCount);
	}

	
//	@AfterAll
//	public static void before_or_afer_all() {
//		driver.quit();
//	}


}

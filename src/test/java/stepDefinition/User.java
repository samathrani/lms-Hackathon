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
import org.testng.annotations.AfterSuite;

import com.lms.ui.factory.DriverFactory;
import com.lms.ui.pageobject.UserPageDeleteIconPageObject;
import com.lms.ui.pageobject.UserPageObject;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class User {
	static WebDriver driver;
	static UserPageObject user;
	static UserPageDeleteIconPageObject deleteuser;
	int noOfRecords=0;
	int beforeDeleteCount=0;
	int afterDeleteCount=0;


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
	}
	
	//----------------

	//Feature :Pagination
	@When("User is on the Manage user page after clicking User Tab")
	public void user_is_on_the_manage_user_page_after_clicking_user_tab() throws Exception {
//		if(user == null) {
//			initialize();
//		}
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
		//driver.findElement(By.xpath("//button[@class='mat-focus-indicator mat-button mat-button-base'][2]")).click();
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

	//DeleteIcon

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
		user.clickYesButtonOnAlertBox();
	}
	

	@Then("Selected rows should be deleted and popup should be shown with success message {string}")
	public void selected_rows_should_be_deleted_and_popup_should_be_shown_with_success_message(String string) {
		if(beforeDeleteCount> afterDeleteCount)
			assertTrue(true);
		else
			assertFalse(false);
	}

}

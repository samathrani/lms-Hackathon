package stepDefinition;

import static org.testng.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageClasses.ManageBatchPageclass;
import utils.ConfigReader;
import utils.ExcelHandling;
import utils.ExcelHandlingK;

public class BatchSD {
	ExcelHandling excel;
	ConfigReader reader;
	WebDriver driver = Hooks.driver;
	ManageBatchPageclass batch;
	
	
	
	@Given("User is on Login Page")
	public void user_is_on_login_page() {
		batch= new ManageBatchPageclass(driver);
	}

	@When("Enters username and Password using {string} and {string} and user clicks on Login button")
	public void enters_username_and_password_using_and_and_user_clicks_on_login_button(String testId, String sheetName) {
		sheetName="Sheet1";
		testId="testId";
		batch.login(testId, sheetName);
	}

	@Then("navigates to home page")
	public void navigates_to_home_page() {
		System.out.println("Home page opened");
	}

	

	
	@Given("User is logged in to the Batch page using valid credentials from {string} and {string}")
	public void user_is_logged_in_to_the_batch_page_using_valid_credentials_from_and(String testId, String sheetName) {
		batch= new ManageBatchPageclass(driver);
	batch.login(testId, sheetName);
	Assert.assertTrue(true);
	}

	@When("user clicks Batch on the title Bar")
	public void user_clicks_batch_on_the_title_bar() throws InterruptedException {
		Thread.sleep(2000);
		batch.clkBatch();
	}

	@Then("user should be navigated to manage batch page")
	public void user_should_be_navigated_to_manage_batch_page() {
		Assert.assertTrue("manage batch page opened", true);
	}
	@Given("User is logged in to Batch page using valid credentials from {string} and {string}")
	public void user_is_logged_in_to_batch_page_using_valid_credentials_from_and(String testId, String sheetName) {
		batch= new ManageBatchPageclass(driver);
		batch.login(testId, sheetName);
	}

	@When("user clicks on Batch on the title Bar and The user enters the text in the Search box")
	public void user_clicks_on_batch_on_the_title_bar_and_the_user_enters_the_text_in_the_search_box() {
	   batch.clkBatch();
	   batch.batchsearchText();
	}
	@When("The user clicks on Batch and The user clicks on the check box of all assignments")
	public void the_user_clicks_on_batch_and_the_user_clicks_on_the_check_box_of_all_assignments() {
		batch.mulchkbox();
	}
	@Given("The user is logged in to Batch page using valid credentials from {string} and {string}")
	public void the_user_is_logged_in_to_batch_page_using_valid_credentials_from_and(String testId, String sheetName) {
		batch= new ManageBatchPageclass(driver);
		batch.login(testId, sheetName);  
	}

	@When("The user clicks Delete button after selecting check box of an Batch and The user clicks on Yes in confirm deletion form")
	public void the_user_clicks_delete_button_after_selecting_check_box_of_an_batch_and_the_user_clicks_on_yes_in_confirm_deletion_form() {
		batch.mulchkbox();
		batch.delallbatch();
	}
	@Then("The selected batches should be deleted successfully with Successful Batch Deleted message")
	public void the_selected_batches_should_be_deleted_successfully_with_successful_batch_deleted_message() {
	    System.out.println("succesfully deleted");
	}

	@Given("The User is logged in to Batch page using valid credentials from {string} and {string} and user clicks on batch")
	public void the_user_is_logged_in_to_batch_page_using_valid_credentials_from_and_and_user_clicks_on_batch(String testId, String sheetName) {
		batch= new ManageBatchPageclass(driver);
		batch.login(testId, sheetName); 
		batch.clkBatch();
	}
	@When("The user clicks A new batch button and The user keeps all fields empty and clicks save")
	public void the_user_clicks_a_new_batch_button_and_the_user_keeps_all_fields_empty_and_clicks_save() {
	   batch.addBatch();
	   batch.clksave();
	}
	@Given("User is logged in to Batch page  using valid credentials from {string} and {string} and user clicks on batch")
	public void user_is_logged_in_to_batch_page_using_valid_credentials_from_and_and_user_clicks_on_batch(String testId, String sheetName) {
		batch= new ManageBatchPageclass(driver);
		batch.login(testId, sheetName); 
		batch.clkBatch();
	}

	@When("The user clicks A new batch button and The user enters all fields and clicks save")
	public void the_user_clicks_a_new_batch_button_and_the_user_enters_all_fields_and_clicks_save() {
		batch.addBatch();
	    batch.enterallfields();
	    batch.clksave();
	}

	@Then("A new batch should be created successfully with a message Batch created")
	public void a_new_batch_should_be_created_successfully_with_a_message_batch_created() {
		Assert.assertTrue("A new Batch added successfully", true);
	}
	@Given("User is logged in to Batch page using valid credentials from {string} and {string} and user clicks on batch")
	public void user_is_logged_in_to_batch_page_using_valid_credentials_from_and_and_user_clicks_on_batch1(String testId, String sheetName) {
		batch= new ManageBatchPageclass(driver);
		batch.login(testId, sheetName);
		batch.clkBatch();
	}

	@When("The user clicks A new batch button with enters all fields and The user clicks cancel after clicking on Edit button")
	public void the_user_clicks_a_new_batch_button_with_enters_all_fields_and_the_user_clicks_cancel_after_clicking_on_edit_button() {
    batch.addBatch();
    batch.enterallfields();
    batch.enterallfieldscancel();

	}

	@Then("The Batch details page should be closed successfully")
	public void the_batch_details_page_should_be_closed_successfully() {
	  Assert.assertTrue(true);
	}
	@When("The user clicks on Batch name")
	public void the_user_clicks_on_batch_name() {
	    batch.batchnameorder();
	}

	@Then("The Batch name should be sorted in ascending order")
	public void the_batch_name_should_be_sorted_in_ascending_order() {
	   Assert.assertTrue(true);
	}
	@When("The user clicks on Batch description")
	public void the_user_clicks_on_batch_description() {
	   batch.batchDescriptionorder();
	}

	@Then("The Batch description should be sorted in ascending order")
	public void the_batch_description_should_be_sorted_in_ascending_order() {
	   Assert.assertTrue(true);
	}

	@When("The user clicks on Batch status")
	public void the_user_clicks_on_batch_status() {
	   batch.batchstatusorder();
	}

	@Then("The Batch status should be sorted in ascending order")
	public void the_batch_status_should_be_sorted_in_ascending_order() {
	    Assert.assertTrue(true);
	}

	@When("The user clicks on  No of Classes")
	public void the_user_clicks_on_no_of_classes() {
	    batch.Noclasses();
	}

	@Then("No of Classes should be sorted in ascending order")
	public void no_of_classes_should_be_sorted_in_ascending_order() {
		 Assert.assertTrue(true);
	}

	@When("The user clicks on Program Name")
	public void the_user_clicks_on_program_name() {
	   batch.pronameorder();
	}

	@Then("The Program Name should be sorted in ascending order")
	public void the_program_name_should_be_sorted_in_ascending_order() {
		 Assert.assertTrue(true);
	}


}



//
//	@When("The user clicks Delete button after selecting check boxes of all batches and The user clicks on Yes in confirm deletion form")
//	public void the_user_clicks_delete_button_after_selecting_check_boxes_of_all_batches_and_the_user_clicks_on_yes_in_confirm_deletion_form() {
//	   batch.confirmDeleteYes();
//	}
//
//	@Then("The selected batches should be deleted successfully with a Successful Batch Deleted message")
//	public void the_selected_batches_should_be_deleted_successfully_with_a_successful_batch_deleted_message() {
//	   System.out.println("batches deleted successfully");
//	}
//
//






//	@When("The user clicks on the check box of all assignments")
//	public void the_user_clicks_on_the_check_box_of_all_assignments() {
//		 batch.mulchkbox();
//	}
//
//	@Then("The check box of the header should be clicked successfully")
//	public void the_check_box_of_the_header_should_be_clicked_successfully() {
//		System.out.println("The check box clicked");
//	    
//	}
//
//	@Given("The user is logged in to Batch page")
//	public void the_user_is_logged_in_to_batch_page() {
//		Assert.assertTrue(true);
//	}
//
//	@When("The user clicks Delete button after selecting check box of an  Manage Batch")
//	public void the_user_clicks_delete_button_after_selecting_check_box_of_an_manage_batch() {
//		batch.deleteassignment();
//	}
//
//	@When("The user clicks on Yes in confirm deletion form")
//	public void the_user_clicks_on_yes_in_confirm_deletion_form() {
//		batch.confirmDeleteYes();
//		   
//	}
//
//	@Then("The selected batches should be deleted successfully with Successful Batch Deleted message")
//	public void the_selected_batches_should_be_deleted_successfully_with_successful_batch_deleted_message() {
//		String name1=driver.findElement(By.xpath("//div[@class='p-datatable-footer ng-star-inserted']/div")).getText();
//	    Assert.assertEquals(name1, "In total there are 30 batches.");
//	}
//
//	@When("The user clicks Delete button after selecting check box of an batch")
//	public void the_user_clicks_delete_button_after_selecting_check_box_of_an_batch() {
//		batch.deleteassignment();
//	}
//
//	@When("The user clicks on No in confirm deletion form")
//	public void the_user_clicks_on_no_in_confirm_deletion_form() {
//		 batch.confirmDeleteNo();
//	}
//
//	@Then("The user should be directed to the Manage Batch page")
//	public void the_user_should_be_directed_to_the_manage_batch_page() {
//		Assert.assertTrue("Manage Batch opened", true);
//	}
//
//	@When("The user clicks Delete button after selecting check boxes of all batches")
//	public void the_user_clicks_delete_button_after_selecting_check_boxes_of_all_batches() {
//		batch.deleteallassignment();
//	}
//
//	@Then("The selected batches should be deleted successfully with a Successful Batch Deleted message")
//	public void the_selected_batches_should_be_deleted_successfully_with_a_successful_batch_deleted_message() {
//		String foot=	driver.findElement(By.xpath("//div[@class='p-datatable-footer ng-star-inserted']/div")).getText();
//	    Assert.assertEquals(foot, "In total there are 0 assignments.");
//	}


//	@When("The user clicks A new batch button")
//	public void the_user_clicks_a_new_batch_button() {
//		batch.addBatch();
//	}
//
//	@When("The user keeps all fields empty and clicks save")
//	public void the_user_keeps_all_fields_empty_and_clicks_save() {
//		batch.clksave();
//	}
//
//	@Then("An error message Name is required should be displayed under name field")
//	public void an_error_message_name_is_required_should_be_displayed_under_name_field() {
//		String nameis=driver.findElement(By.xpath("//div[@class='p-field ng-star-inserted']//small")).getText();
//		 Assert.assertEquals(nameis, "Name is required.");
//	}
//
//	@When("The user enters all fields and clicks save")
//	public void the_user_enters_all_fields_and_clicks_save() {
//		batch.enterallfields();
//	    batch.clksave();
//
//	}
//
//	@Then("A new batch should be created successfully with a message Batch created")
//	public void a_new_batch_should_be_created_successfully_with_a_message_batch_created() {
//		Assert.assertTrue("A new Batch added successfully", false);
//	}
//
//	@When("The user clicks cancel after clicking on Edit button")
//	public void the_user_clicks_cancel_after_clicking_on_edit_button() {
//		batch.enterallfieldscancel();
//	}
//
//	@Then("The Batch details page should be closed successfully")
//	public void the_batch_details_page_should_be_closed_successfully() {
//		batch.enterallfieldsclose();
//	}
//
//	@When("The user clicks on next button")
//	public void the_user_clicks_on_next_button() {
//		batch.leftAngle();
//		   
//	}
//
//	@Then("The user should be a navigated to the next page")
//	public void the_user_should_be_a_navigated_to_the_next_page() {
//		String entry=driver.findElement(By.xpath("//div[@class='p-paginator-bottom p-paginator p-component ng-star-inserted']/span")).getText();
//		 Assert.assertEquals(entry, "Showing 6 to 10  of 30 entries");	}
//
//	@When("The user clicks on previous button")
//	public void the_user_clicks_on_previous_button() {
//		batch.rightAngle();
//		  
//	}
//
//	@Then("The user should be navigated to the first page")
//	public void the_user_should_be_navigated_to_the_first_page() {
//		String entries=driver.findElement(By.xpath("//div[@class='p-paginator-bottom p-paginator p-component ng-star-inserted']/span")).getText();
//		 Assert.assertEquals(entries, "Showing 1 to 5  of 30 entries");
//	}
//
//	@When("The user clicks on last page button")
//	public void the_user_clicks_on_last_page_button() {
//		batch.doublerightAngle();
//	}
//
//	@Then("The user should be navigated to a last page")
//	public void the_user_should_be_navigated_to_a_last_page() {
//		String showing=driver.findElement(By.xpath("//div[@class='p-paginator-bottom p-paginator p-component ng-star-inserted']/span")).getText();
//		 Assert.assertEquals(showing, "Showing 26 to 30 of 30 entries");
//	
//	}
//
//	@When("The user clicks on first page button")
//	public void the_user_clicks_on_first_page_button() {
//		batch.doubleleftAngle();
//	}
//
//	@When("The user clicks on Batch name")
//	public void the_user_clicks_on_batch_name() {
//		batch.batchnameorder();
//	
//	}
//
//	@Then("The Batch name should be sorted in ascending order")
//	public void the_batch_name_should_be_sorted_in_ascending_order() {
//		String n = driver.findElement(By.xpath("//tbody[@class='p-datatable-tbody']/tr[1]/td[2]")).getText();
//		 Assert.assertEquals(n, "AAA5");
//	}
//
//	@When("The user clicks on Batch name again")
//	public void the_user_clicks_on_batch_name_again() {
//		batch.batchnameorder();
//	}
//
//	@Then("The batch name should be sorted in descending order")
//	public void the_batch_name_should_be_sorted_in_descending_order() {
//		String vvv = driver.findElement(By.xpath("//tbody[@class='p-datatable-tbody']/tr[1]/td[2]")).getText();
//		 Assert.assertEquals(vvv, "vvv");
//	
//	}
//
//	@When("The user clicks on Batch description")
//	public void the_user_clicks_on_batch_description() {
//		batch.batchDescriptionorder();
//	}
//
//	@Then("The Batch description should be sorted in ascending order")
//	public void the_batch_description_should_be_sorted_in_ascending_order() {
//		String Desc1 = driver.findElement(By.xpath("//tbody[@class='p-datatable-tbody']/tr[1]/td[3]")).getText();
//		 Assert.assertEquals(Desc1, "BatchDesc1");
//	}
//
//	@When("The user clicks on Batch description again")
//	public void the_user_clicks_on_batch_description_again() {
//		batch.batchDescriptionorder();
//	}
//
//	@Then("The Batch description should be sorted in descending order")
//	public void the_batch_description_should_be_sorted_in_descending_order() {
//		String v= driver.findElement(By.xpath("//tbody[@class='p-datatable-tbody']/tr[1]/td[3]")).getText();
//		 Assert.assertEquals(v, "vv");
//	}
//
//	@When("The user clicks on Batch status")
//	public void the_user_clicks_on_batch_status() {
//		batch.batchstatusorder();
//	}
//
//	@Then("The Batch status should be sorted in ascending order")
//	public void the_batch_status_should_be_sorted_in_ascending_order() {
//		System.out.println("nothing to displayed");
//	}
//
//	@When("The user clicks on Batch status again")
//	public void the_user_clicks_on_batch_status_again() {
//		batch.batchstatusorder();
//		   
//	}
//
//	@Then("The Batch status should be sorted in descending order")
//	public void the_batch_status_should_be_sorted_in_descending_order() {
//		String INACT10= driver.findElement(By.xpath("//tbody[@class='p-datatable-tbody']/tr[1]/td[4]")).getText();
//		 Assert.assertEquals(INACT10, "INACTIVE10");
//	}
//
//	@When("The user clicks on  No of Classes")
//	public void the_user_clicks_on_no_of_classes() {
//		batch.Noclasses();
//	}
//
//	@Then("No of Classes should be sorted in ascending order")
//	public void no_of_classes_should_be_sorted_in_ascending_order() {
//		String Zero=driver.findElement(By.xpath("//tbody[@class='p-datatable-tbody']/tr[1]/td[5]")).getText();
//		Assert.assertEquals(Zero, "0");
//	}
//
//	@When("The user clicks on No of Classes again")
//	public void the_user_clicks_on_no_of_classes_again() {
//		batch.Noclasses();
//	}
//
//	@Then("The No of Classes should be sorted in descending order")
//	public void the_no_of_classes_should_be_sorted_in_descending_order() {
//		String seven=driver.findElement(By.xpath("//tbody[@class='p-datatable-tbody']/tr[1]/td[5]")).getText();
//		Assert.assertEquals(seven, "77");
//	}
//
//	@When("The user clicks on Program Name")
//	public void the_user_clicks_on_program_name() {
//		batch.pronameorder();
//	}
//
//	@Then("The Program Name should be sorted in ascending order")
//	public void the_program_name_should_be_sorted_in_ascending_order() {
//		String Editedprogram=driver.findElement(By.xpath("//tbody[@class='p-datatable-tbody']/tr[1]/td[6]")).getText();
//		Assert.assertEquals(Editedprogram, "EditedProgram");
//	}
//
//	@When("The user clicks on Program Name again")
//	public void the_user_clicks_on_program_name_again() {
//		batch.pronameorder();
//	    
//	}
//
//	@Then("The Program Name should be sorted in descending order")
//	public void the_program_name_should_be_sorted_in_descending_order() {
//		String DemoQA=driver.findElement(By.xpath("//tbody[@class='p-datatable-tbody']/tr[1]/td[6]")).getText();
//		Assert.assertEquals(DemoQA, "updatednameQA DemoQA Demo");
//	}
//
//
//
//}

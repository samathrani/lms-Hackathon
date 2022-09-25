package stepDefinition;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageClasses.Assignmentpc;


public class Assignment {
	Excelsheet excel;
	Configreader reader;
	WebDriver driver = Hooks.driver;
	Assignmentpc assign;
	@Given("The user is logged in to program page using valid credentials from {string} and {string}")
	public void the_user_is_logged_in_to_program_page_using_valid_credentials_from_and(String testid, String sheetname) {
		assign = new Assignmentpc(driver);
		assign.login(testid, sheetname);
	}

	@When("The user clicks on Assignment")
	public void the_user_clicks_on_assignment() {
		assign.clickassignment();
	}



	@Then("The user should successfully see the header in the Assignment page")
	public void the_user_should_successfully_see_the_header_in_the_Assignment_page() {
	String j= driver.findElement(By.xpath("//div[@class='p-paginator-bottom p-paginator p-component ng-star-inserted']/span")).getText();
		Assert.assertEquals(j, "Showing 1 to 3 of 3 entries");
		}
	
	@Then("The user should successfully see a footer in the Assignment page")
	public void the_user_should_successfully_see_a_footer_in_the_Assignment_page() {
	String tot=driver.findElement(By.xpath("//mat-card-content//div[@class= 'p-datatable-footer ng-star-inserted']")).getText();
		 Assert.assertEquals(tot, "In total there are 3 assignments.");
		}
 
	
  @When("The user enters the text in the Search box")
	public void the_user_enters_the_text_in_the_search_box() {
	  reader=new Configreader();
	  assign.textinsearch();
	}

	@Then("The entries for the entered text should be displayed successfully")
	public void the_entries_for_the_entered_text_should_be_displayed_successfully() {
		String name=driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText();
	 assertEquals(name, "Dev Assignment");
	}
	@When("The user clicks on the check box of all assignments")
	public void the_user_clicks_on_the_check_box_of_an_assignment() {
		assign.checkboxclick();
	}

	@Then("The check box of the header should be clicked successfully")
	public void the_check_box_should_be_clicked_successfully() {
		assign.checkboxassert();
        
	}
	@Given("The user is in the Assignment page by logging with valid credentials from {string} and {string}")
	public void the_user_is_in_the_assignment_page_by_logging_with_valid_credentials_from_and(String testid, String sheetname) {
		assign=new Assignmentpc(driver);
		assign.logintoassignmentpage(testid, sheetname);
	}

	
	@When("The user edits all the fields in the Search box after clicking on Edit button")
	public void the_user_edits_all_the_fields_in_the_search_box_after_clicking_on_edit_button() {
		assign.editfields();
	}
	
	

	@Then("The fields should be edited successfully")
	public void the_fields_should_be_edited_successfully() {
		String name=driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText();
		  Assert.assertEquals(name, "Sql");
		
	  }
	@When("The user clicks cancel after clicking on Edit button")
	public void the_user_clicks_cancel_after_clicking_on_edit_button() {
		assign.clickcancel();
	}

	@Then("The assignment details page should be closed successfully")
	public void the_assignment_details_page_should_be_closed_successfully() {
	String tit=driver.findElement(By.xpath("//mat-card-title/div")).getText();
	 Assert.assertEquals(tit, "Manage Assignment");
	  
	}
	
	@When("The user clicks Delete button after selecting check box of an assignment")
	public void the_user_clicks_delete_button_after_selecting_check_box_of_an_assignment() {
		assign.deleteassignment();
	  
	}

	@When("The user clicks on Yes in confirm deletion form")
	public void the_user_clicks_on_yes_in_confirm_deletion_form() {
	  assign.yesconfirmdelete();
	}

	@Then("The selected assignments should be deleted successfully with Successful Assignment Deleted message")
	public void the_selected_assignment_should_be_deleted_successfully_with_Successful_Assignment_Deleted_message() {
	String name1=driver.findElement(By.xpath("//div[@class='p-datatable-footer ng-star-inserted']/div")).getText();
	    Assert.assertEquals(name1, "In total there are 2 assignments.");
	}
	
	@When("The user clicks on No in confirm deletion form")
	public void the_user_clicks_on_no_in_confirm_deletion_form() {
		 assign.noconfirmdelete();
	}

	@Then("The user should be directed to the {string} page")
	public void the_user_should_be_directed_to_the_page(String check) {
		assign.deletcheck(check);
		    Assert.assertEquals(check, "In total there are 2 assignments.");
	}

	@When("The user clicks Delete button after selecting check boxes of all assignments")
	public void the_user_clicks_delete_button_after_selecting_check_boxes_of_all_assignments() {
	  assign.deleteallassignments();
	   
	}

	@Then("The selected assignments should be deleted successfully with a Successful Assignment Deleted message")
	public void the_selected_assignments_should_be_deleted_successfully_with_a_Successful_Assignment_Deleted_message() {
	String foot=	driver.findElement(By.xpath("//div[@class='p-datatable-footer ng-star-inserted']/div")).getText();
		    Assert.assertEquals(foot, "In total there are 0 assignments.");
	}
	@Then("The user should be directed to the Assignment page")
	public void the_user_should_be_directed_to_the_assignment_page() {
	String title= driver.findElement(By.xpath("//mat-card-title/div")).getText();
		 Assert.assertEquals(title, "Manage Assignment");
	}
	@When("The user clicks A new assignment button")
	public void the_user_clicks_a_new_assignment_button() {
	  assign.newassignmentclick();
	}

	@When("The user keeps all fields empty and clicks save")
	public void the_user_keeps_all_fields_empty_and_clicks_save() {
		//System.out.println(By.xpath("//div[@class='p-dialog-footer ng-tns-c132-20 ng-star-inserted']/button[2]"));
	   assign.clicksave();
	}

	@Then("An error message Name is required should be displayed under name field")
	public void an_error_message_name_is_required_should_be_displayed_under_name_field() {
String nameis=driver.findElement(By.xpath("//div[@class='p-field ng-star-inserted']//small")).getText();
	 Assert.assertEquals(nameis, "Name is required.");
	}

	@When("The user enters all fields and clicks save")
	public void the_user_enters_all_fields_and_clicks_save() {
	 assign.entersfields();
	}

	@Then("A new assignment should be created successfully with a message Assignment created")
	public void a_new_assignment_should_be_created_successfully_with_a_message_Assignment_created() {
	String namemain = driver.findElement(By.xpath("//tbody/tr[4]/td[2]")).getText();
		  Assert.assertEquals(namemain, "Java");
	}

	@When("The user enters all fields and clicks cancel")
	public void the_user_enters_all_fields_and_clicks_cancel() {
		assign.entersfieldtocancel();
	}

	@Then("The {string} should be closed successfully")
	public void the_should_be_closed_successfully(String titl) {
		assign.pagetitle(titl);
		 Assert.assertEquals(titl, "Manage Assignment");
	}

	@When("The user enters all fields and clicks close button")
	public void the_user_enters_all_fields_and_clicks_close_button() {
		assign.entersfieldtoclose();
	}
	@When("The user clicks on Assignment name")
	public void the_user_clicks_on_assignment_name() {
		assign.assignmentnameclick();
		
	}

	@Then("The assignment name should be sorted in ascending order")
	public void the_assignment_name_should_be_sorted_in_ascending_order() {
		String n = driver.findElement(By.xpath("//tbody[@class='p-datatable-tbody']/tr[1]/td[2]")).getText();
		 Assert.assertEquals(n, "Dev Assignment");
	}

	@When("The user clicks on Assignment name again")
	public void the_user_clicks_on_assignment_name_again() {
		assign.assignmentnameclick();
	}

	@Then("The assignment name should be sorted in descending order")
	public void the_assignment_name_should_be_sorted_in_descending_order() {
		String sql = driver.findElement(By.xpath("//tbody[@class='p-datatable-tbody']/tr[1]/td[2]")).getText();
		 Assert.assertEquals(sql, "Sql Assignment");
	}

	@When("The user clicks on Assignment description")
	public void the_user_clicks_on_assignment_description() {
		 assign.assignmentdesclick();
	}

	@Then("The assignments description should be sorted in ascending order")
	public void the_assignments_description_should_be_sorted_in_ascending_order() {
	String dev = driver.findElement(By.xpath("//tbody[@class='p-datatable-tbody']/tr[1]/td[3]")).getText();
		 Assert.assertEquals(dev, "Dev Practice");
	}

	@When("The user clicks on Assignment description again")
	public void the_user_clicks_on_assignment_description_again() {
		 assign.assignmentdesclick();
	}

	@Then("The assignments description should be sorted in descending order")
	public void the_assignments_description_should_be_sorted_in_descending_order() {
		String sd= driver.findElement(By.xpath("//tbody[@class='p-datatable-tbody']/tr[1]/td[3]")).getText();
		 Assert.assertEquals(sd, "SQL Practice");
	}

	@When("The user clicks on Assignment due date")
	public void the_user_clicks_on_assignment_due_date() {
		assign.duedateclick();
	}

	@Then("The assignments should be sorted in a ascending order")
	public void the_assignments_should_be_sorted_in_a_ascending_order() {
	String asc1= driver.findElement(By.xpath("//tbody[@class='p-datatable-tbody']/tr[1]/td[4]")).getText();
		 Assert.assertEquals(asc1, "5/5/2022");
	}

	@When("The user clicks on Assignment due date again")
	public void the_user_clicks_on_assignment_due_date_again() {
		assign.duedateclick();
	}

	@Then("The assignments should be sorted in descending order")
	public void the_assignments_should_be_sorted_in_descending_order() {
	String date1=driver.findElement(By.xpath("//tbody[@class='p-datatable-tbody']/tr[1]/td[4]")).getText();
		 Assert.assertEquals(date1, "5/5/2022");
	}
	
	@Given("The user is in the first Assignment page by logging with valid credentials from {string} and {string}")
	public void the_user_is_in_the_first_assignment_page_by_logging_with_valid_credentials_from_and(String testid, String sheetname) {
		assign = new Assignmentpc(driver);
		assign.logintoassignmentpage(testid, sheetname);
	}

	@When("The user clicks on next button")
	public void the_user_clicks_on_next_button() {
	  assign.nextbutton();
	}

	@Then("The user should be a navigated to the next page")
	public void the_user_should_be_a_navigated_to_the_next_page() {
	String entry=driver.findElement(By.xpath("//div[@class='p-paginator-bottom p-paginator p-component ng-star-inserted']/span")).getText();
	 Assert.assertEquals(entry, "Showing 2 to 3 of 3 entries");
	}

	@When("The user clicks on previous button")
	public void the_user_clicks_on_previous_button() {
	  assign.clickpreviousbutton();
	}

	@Then("The user should be navigated to the first page")
	public void the_user_should_be_navigated_to_the_first_page() {
	String showing = driver.findElement(By.xpath("//div[@class='p-paginator-bottom p-paginator p-component ng-star-inserted']/span")).getText();
		 Assert.assertEquals(showing, "Showing 1 to 3 of 3 entries");
	}

	@When("The user clicks on last page button")
	public void the_user_clicks_on_last_page_button() {
	  assign.clicklastpage();
	}

	@Then("The user should be navigated to a last page")
	public void the_user_should_be_navigated_to_a_last_page() {
		String l=driver.findElement(By.xpath("//div[@class='p-paginator-bottom p-paginator p-component ng-star-inserted']/span")).getText();
		 Assert.assertEquals(l, "Showing 3 to 3 of 3 entries");
	}

	@When("The user clicks on first page button")
	public void the_user_clicks_on_first_page_button() {
	   assign.firstpage();
	}


	}









//td[3]












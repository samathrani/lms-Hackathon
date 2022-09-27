package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.lms.ui.factory.DriverFactory;
import com.lms.ui.pageobject.UserPageObject;
import com.lms.ui.pageobject.UserSearchPageObjects;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class UserSearchSteps {
	static WebDriver driver;
	static UserPageObject user;
	static UserSearchPageObjects search;


	public void initialise() {

		System.out.println("In Given");

		DriverFactory dr = new DriverFactory();
		driver = dr.initialiseDriver();
		user= new UserPageObject(driver);
		//		deleteuser= new UserPageDeleteIconPageObject(driver);
		//		userID = new UserIDPageObject(driver);
		//		editOrDelete = new UserEditOrDeletePageObject(driver);
		search = new UserSearchPageObjects(driver);
		user.enterLoginID();
		user.enterLoginPassword();
		user.clickLogin();
		user.clickUserTab();
	}
	
	@Given("User is on Manage user page for search")
	public void user_is_on_Manage_user_page_for_search() {
		user.clickUserTab();
	}

	@Then("User should see the Search input field after the delete icon")
	public void user_should_see_the_search_input_field_after_the_delete_icon() {
		initialise();
		Assert.assertTrue(search.isSearchBoxVisible());
	
	}
	
	@Then("User should see the search input field with search icon and text as\" Search…\"")
	public void user_should_see_the_search_input_field_with_search_icon_and_text_as_search() {
		initialise();
		Assert.assertTrue(search.checkPlaceHolderValueInSearch());

	}

	@When("User types Name to search")
	public void user_types_name_to_search() {
		search.enterSearchText("John Dove");
	}

	@Then("Rows with the name should be displayed")
	public void rows_with_the_name_should_be_displayed() {
		String actual = search.checkUserNameMAtchingTheSearch();
		String expected = "John Dove";
		Assert.assertEquals(expected,actual);
	}
	
	public void forSearchingRandomText() {
		DriverFactory dr = new DriverFactory();
		driver = dr.initialiseDriver();
		search = new UserSearchPageObjects(driver);
	}

	@When("User types random text in search field which has no matching entry")
	public void user_types_random_text_in_search_field_which_has_no_matching_entry() {
		initialise();
		String input = "affdf";
		search.enterSearchText(input);
		
	}

	@Then("No rows is displayed")
	public void no_rows_is_displayed() {
		Assert.assertTrue(search.checkIfNoResultsForSearch());
	}

}

package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.lms.ui.factory.DriverFactory;
import com.lms.ui.pageobject.UserDetailsPageObject;
import com.lms.ui.pageobject.UserIDPageObject;
import com.lms.ui.pageobject.UserPageDeleteIconPageObject;
import com.lms.ui.pageobject.UserPageObject;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserIDSteps {

	static WebDriver driver;
	static UserPageObject user;
	static UserPageDeleteIconPageObject deleteuser;
	static UserDetailsPageObject userDetails;
	static UserIDPageObject userID;
	
	@Before
	public void initialise() {
		System.out.println("In Given");
		
		DriverFactory dr = new DriverFactory();
		driver = dr.initialiseDriver();
		user= new UserPageObject(driver);
		deleteuser= new UserPageDeleteIconPageObject(driver);
		userID = new UserIDPageObject(driver);
		user.enterLoginID();
		user.enterLoginPassword();
		user.clickLogin();
		user.clickUserTab();
	}
	
	@When("User clicks ID in any row")
	public void user_clicks_id_in_any_row() {
		
	    userID.clickUserIDLinkInDataTable();
	}

	@Then("User details dialog box displayed with user information")
	public void user_details_dialog_box_displayed_with_user_information() {
	 Assert.assertTrue(userID.isUserDetailsOnUserIDLinkClickVisible());
	}

	

}

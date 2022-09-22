package stepDefinition;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.testng.Assert;

	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;

	public class Assignment {
		WebDriver driver = Hooks.driver;
		Excelsheet excel;
		@Given("The user is logged in to program page using valid credentials from {string} and {string}")
		public void the_user_is_logged_in_to_program_page_using_valid_credentials_from(String testid, String sheetname) {
			excel = new Excelsheet(testid, sheetname);
		   driver.findElement(By.id("username")).sendKeys(excel.readusername());
		   driver.findElement(By.id("password")).sendKeys(excel.readpassword());
		   driver.findElement(By.id("login")).click();
		}

		@When("The user clicks on Assignment")
		public void the_user_clicks_on_assignment() {
		   driver.findElement(By.xpath("//mat-toolbar//button[4]")).click();
		}

		@Then("The user should be navigated to the Assignment page")
		public void the_user_should_be_navigated_to_the_assignment_page() {
		 String title= driver.findElement(By.xpath("//mat-card-title/div")).getText();
		 Assert.assertEquals(title, "Manage Assignment");
		}

		@Then("The user should successfully see the header and footer in the Assignment page")
		public void the_user_should_successfully_see_the_header_and_footer_in_the_assignment_page() {
		  String footer =  driver.findElement(By.xpath("//mat-card-content//div[@class= 'p-datatable-footer ng-star-inserted']")).getText();
		  Assert.assertEquals(footer, "In total there are 3 assignments.");
		}
		
		@Given("The user is logged in to the Assignment page using valid credentials from {string} and {string}")
		public void the_user_is_logged_in_to_the_assignment_page_using_valid_credentials_from_and(String testid, String sheetname) {
			excel = new Excelsheet(testid, sheetname);
			   driver.findElement(By.id("username")).sendKeys(excel.readusername());
			   driver.findElement(By.id("password")).sendKeys(excel.readpassword());
			   driver.findElement(By.id("login")).click();
			   driver.findElement(By.xpath("//mat-toolbar//button[4]")).click();
		}
		@When("The user enters the text in the Search box")
		public void the_user_enters_the_text_in_the_search_box() {
		    driver.findElement(By.className("p-inputtext p-component")).sendKeys(null);
		    
		}


		@Then("The entries for the entered text should be displayed successfully")
		public void the_entries_for_the_entered_text_should_be_displayed_successfully() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		

		


	}

}

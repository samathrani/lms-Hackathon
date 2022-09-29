///Add new program
	@Given("User is on Program Details form to add new program after valid login with {string} and {string}")
	public void user_is_on_program_details_form_to_add_new_program(String testId, String sheetName) {
		newprogrampage=new AddNewProgramPage(driver);		
		newprogrampage.login("testId", "sheet1");
	}

	@When("User clicks {string} button")
	public void user_clicks_button(String string) {
		newprogrampage.clickAddNewProgramBtn();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	    
	}

	@Then("User lands on Program Details form to add new program.")
	public void user_lands_on_program_details_form_to_add_new_program() {
	    System.out.println("User should be navigated to Program detials window");
	    
	}

	@Given("User is on Program Details form for adding new program")
	public void user_is_on_program_details_form_for_adding_new_program() {
		newprogrampage =new AddNewProgramPage(driver);
		newprogrampage.login("testId", "sheet1");
		newprogrampage.clickAddNewProgramBtn();	    
	}
	@When("User clicks {string} button without entering data")
	public void user_clicks_button_without_entering_data(String string) {
	    newprogrampage.clickSavewithEmptyFiledValues();

	}
	@Then("User gets message {string}")
	public void user_gets_message(String alertMsg) {
	    newprogrampage.nameIsRequiredMsg(alertMsg);
	    Assert.assertEquals(alertMsg, "Name is required.");
	    System.out.println("pass");
  
	}
	
	@When("User enters {string} {string} and {string} and clicks {string} button")
	public void user_enters_Name_Description_and_Status_and_clicks_save_button(String s1,String s2, String s3, String s4) {
	    newprogrampage.addAllProgramDetailsSave(s1,s2,s3,s4);
	    
	}
	@Then("User can see {string} message on screen")
	public void user_can_see_message_on_screen(String string) {
	    //new program info should be added under programs table as the latest entry	
	    String namemain = driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText();
	    System.out.println("Success msg program updated should appear");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		  Assert.assertEquals(namemain, "SDET");
	    
}

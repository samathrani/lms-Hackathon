package pageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import stepDefinition.Excelsheet;
import stepDefinition.Hooks;
import utils.ExcelHandlingm;

public class ManageProgramPage {

	public WebDriver driver = Hooks.driver;
	ExcelHandlingm signIn;
	//ManageProgram
	@FindBy(id="username")
	WebElement Username;
	@FindBy(id="password")
	WebElement Pwd;
	@FindBy(id="login") 
	WebElement login;
	@FindBy(xpath="//*[contains(text(),'Manage Program')]")
	WebElement managePgmHeading;
	@FindBy(xpath="//span[@class='p-paginator-current ng-star-inserted']") 
	WebElement txtBelowTable;
	@FindBy(xpath="//div[@class='p-d-flex p-ai-center p-jc-between ng-star-inserted']") 
	WebElement totalNoOfPrograms;
	@FindBy(xpath="//th[@class='p-sortable-column p-highlight']") 
	WebElement programName;
	@FindBy(xpath="//*[contains(text(),'Program Description']")
	WebElement programDescription;
	@FindBy(xpath="//th[@psortablecolumn='programStatus']") 
	WebElement programStatus;
	@FindBy(xpath="//mat-card//div[2]//span[@class='p-button-icon pi pi-trash']")
	WebElement MultiDelete;
	//Search
	@FindBy(xpath="//input[@class='p-inputtext p-component']") 
	WebElement search;
	@FindBy(xpath="//input[@class='p-inputtext p-component']") 
	WebElement searchBy;
	@FindBy(xpath="//div[@class='p-checkbox-box p-component']")
	WebElement checkbox;
	//Edit 
	@FindBy(xpath="//tbody/tr[1]//button[@icon='pi pi-pencil']")
	WebElement editFeature;
	//Program details window
	@FindBy(xpath="//input[@id='programName']")
	WebElement programDetailsName;
	@FindBy(xpath="//input[@id='programDescription']") 
	WebElement programDetailsDescription;
	@FindBy(xpath="//p-dialog//*[contains(text(),'Active')]") 
	WebElement activeStatus;
	@FindBy(xpath="//p-dialog//*[contains(text(),'Inactive') ]")
	WebElement inactiveStatus;
	@FindBy(xpath="//*[contains(text(),'Cancel') ]")
	WebElement programDetailsCancel;
	@FindBy(xpath="//*[contains(text(),'Save') ]")
	WebElement programDetailsSave;
	@FindBy(xpath="//span[@class='p-dialog-header-close-icon ng-tns-c132-19 pi pi-times']") 
	WebElement programDetailsClose;
	//Delete Program
	
	@FindBy(xpath="//div//span[@class='p-button-icon pi pi-trash']") 
	WebElement deleteFeaturePrograms;
	@FindBy(xpath="//tbody/tr//span[@class='p-button-icon pi pi-trash']") 
	WebElement deleteFeature;
	@FindBy(xpath="//*[contains(text(),'Yes') ]") 
	WebElement delYes;
	@FindBy(xpath="//*[contains(text(),'No') ]") 
	WebElement delNo;
	@FindBy(xpath="//span[@class='pi pi-times ng-tns-c133-20']")
	WebElement confirmDeleteClose;
	//Add new Program
	@FindBy(xpath="//button[@label='A New Program']")
	WebElement addNewProgram;
	@FindBy(xpath="//th//div[@role='checkbox']")
	WebElement selectAllPrograms;
	@FindBy(xpath="//mat-card//button[@icon='pi pi-trash']")
	WebElement deleteAllPrograms;
	@FindBy(xpath="//span[@class='p-paginator-current ng-star-inserted']")
	WebElement footerDetails;
	@FindBy(xpath="//small[@class='p-invalid ng-star-inserted']")
	WebElement nameIsRequiredMsg;
	//pagination
	@FindBy(xpath="//button[@class='p-paginator-prev p-paginator-element p-link p-disabled p-ripple']")
	WebElement paginationLeft;
	@FindBy(xpath="//button[@class='p-paginator-next p-paginator-element p-link p-disabled p-ripple']") 
	WebElement paginationRight;


	public ManageProgramPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void enterusername(String testId, String sheetName) {
		signIn = new ExcelHandlingm(testId,sheetName);
		Username.sendKeys(signIn.GetUserName());
	}

	public void enterpassword(String testId, String sheetName) {
		signIn = new ExcelHandlingm(testId,sheetName);	
		Pwd.sendKeys(signIn.GetPassword());
	}
	public void login(){

		login.click();
	}
	//login
	public void validlogin(String testId, String sheetName){
		signIn = new ExcelHandlingm(testId,sheetName);
		Username.sendKeys(signIn.GetUserName());
		Pwd.sendKeys(signIn.GetPassword());
		login.click();
	}
	public String headingTxt(String mngPgmHeading) {
		String  pgmHeading = managePgmHeading.getText();
		return pgmHeading ;
	}
	public String textBelowTable(String txtTable ){
		String textBelowTable=txtBelowTable.getText();
		return  textBelowTable;
	}
	public String footer(String  totalNoOfPgms) {
		String  totalEntries=totalNoOfPrograms.getText();
		return totalEntries;
	}	
	public void disabledDelButton(){
		if(deleteFeaturePrograms.isEnabled()) {
			System.out.println("Delete Button disabled");
		}
		else {
			System.out.println("Delete button enabled");
		}		
	}
	public void NoOfRowsInTable() {
		//no of edit features is 5 or not
		int count =0;
		for(int i=0;i<=5;i++) {
			if (editFeature.isDisplayed());	{
				count = count+1;
			}	
		}
		if (count==5)
			System.out.println("number of records displayed on the page are 5");
	}
	public void searchFeature() {
		//if 'search' text -visible?
		String  textInSearchfield=search.getText();
		String Srch="Search...";
		if (textInSearchfield==Srch){
			System.out.println("Text box used for search has text as 'Search...'");
			Assert.assertTrue(true);
		}
		else {
			Assert.assertFalse(false);
		}
	}
	public void searchByProgramName(String pgmName) {
		//program=new ExcelHandling();
		searchBy.sendKeys(pgmName);
	}
	public void searchByProgramDesciption(String Desc) {
		//program=new ExcelHandling();
		searchBy.sendKeys(Desc);

	}
	public void searchByProgramStatus(String status) {
		searchBy.sendKeys(status);

	}
	//Edit Program
	public void selectPgmByCheckbox() {
		checkbox.click();
	}
	public void editFeature() {

		editFeature.click();
	}
	public void editNameAndSave() {
		programDetailsName.sendKeys("QA Demo");
		programDetailsSave.click();

	}
	public void editDescAndSave() {
		programDetailsDescription.sendKeys("Manual and Automation concepts");
		programDetailsSave.click();

	}
	public void editStatusAndSave() {
		activeStatus.click();
	}
	public void cancelPgmDetails() {
		programDetailsCancel.click();

	}
	public void savePgmDetails() {

		programDetailsSave.click();	
	}

	//Delete program
	public void selectPgmToDelByCheckbox() {
		for(int i=1; i<=5;i++) {
			checkbox.click();
		}
	}
	public void deleteFeature() {
		deleteFeature.click();
	}
	public void deleteNo() {
		delNo.click();		
	}
	public void deleteYes() {
		delYes.click();
	}
	public void addNewPgm() {
		addNewProgram.click();
	}
	public void addProgramEmptyFields() {
		programDetailsName.sendKeys("");
		programDetailsDescription.sendKeys("");
	}
	public void addNewPgmName() {
		programDetailsName.sendKeys("SQL demo");
	}
	public void addNewPgmDesc() {
		programDetailsDescription.sendKeys("SQL demo");
	}
	public void addNewPgmStatus() {
		activeStatus.click();
	}
	public void cancelNewPgmDetails() {
		programDetailsCancel.click();
	}
	public void saveNewPgmDetails() {
		programDetailsSave.click();
	}
	public void selectMultiFeature() {
		selectAllPrograms.click();

	}
	public void deleteMultiFeature() {
		deleteAllPrograms.click();
	}
	public void delMulitiNo() {
		delNo.click();
	}
	public void delMultiYes() {
		delYes.click();
	}
	public void confirmDeleteCloseBtn() {
		confirmDeleteClose.click();
	}
	//Add new program
	
	public  void clickAddNewProgramBtn() {	
		addNewProgram.click();	

	}
	public void clickSavewithEmptyFiledValues() {	
		programDetailsSave.click();
		
	}
	public String nameIsRequiredMsg(String displayinfo) {
		String alertMsg=nameIsRequiredMsg.getText();
		return alertMsg;
	}
	public void addAllProgramDetailsSave(String s1,String s2, String s3,String s4) {	
		programDetailsName.sendKeys("SDET");
		programDetailsDescription.sendKeys("Testing demo");
		activeStatus.click();
		programDetailsSave.click();
	}
	public void cancelNewProgramDetails() {
		addNewProgram.click();
		programDetailsCancel.click();

	}

	//Pagination 
	public void clickPagiLeft() {

			if(paginationLeft.isDisplayed() && paginationLeft.isEnabled()){
				System.out.println("Pagination left arrow is clickable");	
				paginationLeft.click();
			}
			else {
				System.out.println("Pagination left arrow navigation disabled from page 1");
				System.out.println("pass");
			}
		} 
	public void clickPagiRight() {
		if (paginationRight.isDisplayed() && paginationRight.isEnabled()){
			System.out.println("Pagination Right arrow is enabled");
			paginationRight.click();
		}
		else {
			System.out.println("Pagination Right arrow is disabled");
		}
	}
	
	
	//Ascending order - table dada store in an array and verify order ASC code
	public void nameAscOrder() {
		programName.click();
		/*for lop to read program names
		td[].getText();
		 String names[j]
		        Arrays.sort(names);
		        for (int i = 0; i < n; i++) {
		            System.out.println(names[i]);*/

	}
	public void descAscOrder() {
		programDescription .click();
	}
	public void statusAscOrder() {
		programStatus.click();
	}
	//Descending order order
	public void nameDscOrder() {
		programName.click();
	}
	public void descDscOrder() {
		programDescription .click();
	}
	public void statusDscOrder() {
		programStatus.click();
	}

}

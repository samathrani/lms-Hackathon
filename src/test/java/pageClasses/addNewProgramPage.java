package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.ExcelHandlingm;

public class AddNewProgramPage {
	ExcelHandlingm signIn;
	public static  WebDriver driver;

	public AddNewProgramPage(WebDriver driver) {
		AddNewProgramPage.driver = driver;
		PageFactory.initElements(driver, this);
	}
	//Login page
	@FindBy(id="username")
	WebElement username;
	@FindBy(id="password")
	WebElement password;
	@FindBy(id="login") 
	WebElement login;
	@FindBy(xpath="//button[@label='A New Program']")
	WebElement addNewProgram;

	//Program details window
	@FindBy(xpath="//input[@id='programName']")
	WebElement programDetailsName;
	@FindBy(xpath="//input[@id='programDescription']") 
	WebElement programDetailsDescription;
	//@FindBy(xpath="//p-dialog//*[contains(text(),'Active')]") 
	@FindBy(xpath="//p-radiobutton[@ng-reflect-input-id='Active']")
	WebElement activeStatus;
	@FindBy(xpath="//p-dialog//*[contains(text(),'Inactive') ]")
	WebElement inactiveStatus;
	@FindBy(xpath="//*[contains(text(),'Cancel') ]")
	WebElement programDetailsCancel;
	@FindBy(xpath="//*[contains(text(),'Save') ]")
	WebElement programDetailsSave;
	@FindBy(xpath="//span[@class='p-dialog-header-close-icon ng-tns-c132-19 pi pi-times']") 
	WebElement programDetailsClose;
	@FindBy(xpath="//small[@class='p-invalid ng-star-inserted']")
	WebElement nameIsRequiredMsg;
	
	
	public  void clickAddNewProgramBtn() {	
		addNewProgram.click();	

	}
	public void login(String testId, String sheetName) {
		signIn = new ExcelHandlingm(testId,sheetName);
		username.sendKeys(signIn.GetUserName());
		password.sendKeys(signIn.GetPassword());
		login.click();

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
	public void cancelNewPgmDetails() {
		addNewProgram.click();
		programDetailsCancel.click();

	}
	
}

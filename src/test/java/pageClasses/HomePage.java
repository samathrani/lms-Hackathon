package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepDefinition.Hooks;
import utils.ExcelHandling;

public class HomePage {
	
	public WebDriver driver = Hooks.driver;
	ExcelHandling signIn;
	@FindBy(xpath = "//*[@id='username']")
	WebElement username;
	@FindBy(xpath = "//*[@id='password']")
	WebElement password;
	@FindBy(xpath = "//*[@id='login']")
	WebElement login;
	@FindBy(xpath = "//span[contains(text(),' LMS - Learning Management System ')]")
	WebElement lmsTitle;
	@FindBy(xpath = "/html/body/app-root/app-header/mat-toolbar/button[1]")
	WebElement program;
	@FindBy(xpath = "/html/body/app-root/app-header/mat-toolbar/button[2]")
	WebElement batch;
	@FindBy(xpath = "/html/body/app-root/app-header/mat-toolbar/button[3]")
	WebElement user  ;
	@FindBy(xpath = "/html/body/app-root/app-header/mat-toolbar/button[4]")
	WebElement assignment;
	@FindBy(xpath = "/html/body/app-root/app-header/mat-toolbar/button[5]")
	WebElement attendance;
	@FindBy(xpath = "/html/body/app-root/app-header/mat-toolbar/button[6]")
	WebElement logout;
	
	///html/body/app-root/app-header/mat-toolbar/button[1]
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
		}
	
	public void enterusername(String testId, String sheetName) {
		signIn = new ExcelHandling(testId,sheetName);
		username.sendKeys(signIn.GetUserName());
		}
	
		public void enterpassword(String testId, String sheetName) {
			signIn = new ExcelHandling(testId,sheetName);	
		password.sendKeys(signIn.GetPassword()); }
	
	public void clicklogin() {
		login.click();
		}	
	

	public String LmsTitle (String LmsText) {

		String lms = lmsTitle.getText();
		return lms ;
	}
	public String programText (String programText) {

		String Program = program.getText();
		return Program ;
	}
	public String batchText (String batchText) {

		String  Batch= batch.getText();
		return Batch ;
	}
	public String userText (String userText) {

		String  User= user.getText();
		return  User;
	}
	public String assignmentText (String assignmentText) {

		String  Assignment= assignment.getText();
		return  Assignment;
	}
	public String attendanceText (String attendanceText) {

		String  Attendance= attendance.getText();
		return  Attendance;
	}
	public String logoutText (String logoutText) {

		String  Logout= logout.getText();
		return Logout ;
	}
}

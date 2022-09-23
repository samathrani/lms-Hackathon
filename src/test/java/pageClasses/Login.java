package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import stepDefinition.Hooks;
import utils.ExcelHandling;

public class Login {
	
public WebDriver driver = Hooks.driver;
ExcelHandling signIn;
	@FindBy(xpath = "//*[@id='username']")
	WebElement username;
	@FindBy(xpath = "//*[@id='password']")
	WebElement password;
	@FindBy(xpath = "//*[@id='login']/span[1]")
	WebElement login;
	
	public Login(WebDriver driver) {
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
	
}

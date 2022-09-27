package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepDefinition.Hooks;
import utils.ConfigReader;

public class RegisterPage {
	
public WebDriver driver = Hooks.driver;
ConfigReader config;
	
    @FindBy(xpath = "")
    WebElement registration ;
    @FindBy(xpath = "")
    WebElement register ;
    @FindBy(xpath = "//p[contains(text(),'Please login to LMS application')]")
    WebElement loginForm ;
	@FindBy(xpath = "")
	WebElement firstName ;
	@FindBy(xpath = "")
	WebElement lastName;
	@FindBy(xpath = "")
	WebElement address ;
	@FindBy(xpath = "")
	WebElement streetName;
	@FindBy(xpath = "")
	WebElement city;
	@FindBy(xpath = "")
	WebElement state;
    @FindBy(xpath = "")
	WebElement zip;
	@FindBy(xpath = "")
	WebElement  birthDate;
	@FindBy(xpath = "")
	WebElement userName;
	@FindBy(xpath = "")
	WebElement password ;
	@FindBy(xpath = "")
	WebElement phone ;
	@FindBy(xpath = "")
	WebElement email;
	@FindBy(xpath = "")
	WebElement signUp;
	@FindBy(xpath = "")
	WebElement login;
	@FindBy(xpath = "")
	WebElement warning;
	@FindBy(xpath = "")
	WebElement success;

	public RegisterPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
		}
	public String registration (String LmsText) {

		String Registration = registration.getText();
		return Registration ;
	}
	public String loginFormText (String LoginFormText ) {

		String LoginForm = loginForm.getText();
		return LoginForm ;
	}
	
	public String loginText (String loginText) {

		String Login = login.getText();
		return Login ;
	}
	
	public String signUpText (String signUpText) {

		String SignUp = signUp.getText();
		return SignUp ;
	}
	
	public String warningText (String warningText) {

		String Warning = warning.getText();
		return Warning ;
	}
	public String successText (String successText) {

		String Success = success.getText();
		return Success ;
	}
	public void clickregister() {
		register.click();
		}
public void firstName() {
		
	firstName.sendKeys(config.getfirstName());
	}
public void lastName() {
	
	lastName.sendKeys(config.getlastName());
	}

public void address () {
	
	address.sendKeys("config.getaddress()");
	}
public void streetName () {
	
	streetName.sendKeys(config.getstreetName());
	}
public void city () {
	
	city.sendKeys(config.getcity());
	}
public void registrationPage () {
	
}
public void LoginPage () {
	
}
public void invalidPhone () {
	
	}
public void invalidemail () {
	
}
public void invalidPassword () {
	
}
public void existingUser () {
	
}
public void birthDate () {
	
}
public void state() {
	
	state.sendKeys(config.getstate());
	}
public void zip() {
	
	zip.sendKeys("config.getzip()");
	}
public void  userName(){
	
	userName.sendKeys(config.getuserName());
	}
public void password() {
	
	password.sendKeys(config.getpassword());
	}

public void phone() {
	
	phone.sendKeys("config.getphone()");
	}
public void email() {
	
	email.sendKeys(config.getemail());
	}
public void signUp() {
	
	signUp.click();
}
public void login() {
	
	login.click();
}
}

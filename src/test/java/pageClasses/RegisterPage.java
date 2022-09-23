package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepDefinition.Hooks;

public class RegisterPage {
	
public WebDriver driver = Hooks.driver;
	
	@FindBy(xpath = "")
	WebElement firstName ;
	
	@FindBy(xpath = "")
	WebElement lastName;
	
	@FindBy(xpath = "")
	WebElement houseNo ;
	
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

	public RegisterPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
		}
public void firstName() {
		
	firstName.sendKeys("sam");
	}
public void lastName() {
	
	lastName.sendKeys("");
	}

public void houseNo () {
	
	houseNo.sendKeys("");
	}
public void streetName () {
	
	streetName.sendKeys("");
	}
public void city () {
	
	city.sendKeys("");
	}
public void state() {
	
	state.sendKeys("");
	}
public void zip() {
	
	zip.sendKeys("");
	}
public void  userName(){
	
	userName.sendKeys("");
	}
public void password() {
	
	password.sendKeys("");
	}

public void phone() {
	
	phone.sendKeys("");
	}
public void email() {
	
	email.sendKeys("");
	}
public void signUp() {
	
	signUp.click();
}
public void login() {
	
	login.click();
}
}

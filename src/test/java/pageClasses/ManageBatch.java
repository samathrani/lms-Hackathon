package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ManageBatch {
//public Webdriver driver=Hooks.driver;
	
	
	@FindBy(id="username") WebElement user;
	@FindBy(id="password") WebElement password;
	@FindBy(linkText="Login") WebElement login;
	@FindBy(linkText="Batch") WebElement Batch;
	@FindBy(xpath="//input[@placeholder='Search...']") WebElement Search;
	@FindBy(linkText="A New Batch") WebElement AddBatch;
	@FindBy(id="batchName")WebElement bthName;
	@FindBy(id="batchDescription") WebElement bthDescrip;
	//@FindBy(id=""
	//@FindBy()
	
	


	public void setUserName(String uname) {
	user.clear();
	user.sendKeys(uname);
	}
	public void setPassword(String pass) {
		password.clear();
		password.sendKeys(pass);
		
	}
    public void clkLogin() {
    	login.click();
    }
    public void clkBatch() {
    	Batch.click();
    }
    public void addBatch() {
    	AddBatch.click();
    }
    public void addBatchName() {
    	
    }
   
    public void searchBatch(String search) {
    	Search.clear();
    	Search.sendKeys(search);
    }
    public void editBatch() {
    	
    }
    public void deleteBatch() {
    	
    }
    
    
    
	}

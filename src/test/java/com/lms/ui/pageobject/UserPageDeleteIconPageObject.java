package com.lms.ui.pageobject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserPageDeleteIconPageObject {
	WebDriver driver;
	public UserPageDeleteIconPageObject(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//span[@class='p-button-icon pi pi-trash']")
	WebElement deleteIcon;
	
	@FindBy(xpath="//tbody/tr[@class='ng-star-inserted'][1]//span[@class='p-button-icon pi pi-trash']")
	WebElement deleteIconOnRight; 
	
	@FindBy(xpath="//div[@class='ng-trigger ng-trigger-animation ng-tns-c133-8 p-dialog p-confirm-dialog p-component ng-star-inserted']")
	WebElement confirmAlertBoxOnDelete;
	
	@FindBy(xpath="//button[@class='ng-tns-c133-8 p-confirm-dialog-reject p-ripple p-button p-component ng-star-inserted']")
	WebElement noButtonInConfirmAlert;
	
	@FindBy(xpath="//button[@class='ng-tns-c133-8 p-confirm-dialog-accept p-ripple p-button p-component ng-star-inserted']")
	WebElement yesButtonInConfirmAlert;
	
	@FindBy(xpath="//tbody/tr[@class='ng-star-inserted'][1]//span[@class='p-button-icon pi pi-trash']/ancestor::tr[@class='ng-star-inserted']")
	WebElement rowOnWhichDeletePerformed;
	
	public boolean isDeleteIconDisplayed() {
		WebDriverWait w = new WebDriverWait(driver, Duration.ofMillis(2000));
        w.until(ExpectedConditions.visibilityOf(deleteIcon) );
		return deleteIcon.isDisplayed();
	}

	public boolean isDeleteIconEnabled() {
		return deleteIcon.isEnabled();
	}
	public void clickDeleteIconOnRight() {
		 deleteIconOnRight.click();
	}
	public boolean checkConfirmAlertBoxPopUp() {
		return confirmAlertBoxOnDelete.isDisplayed();
	}
	public void clickNoButtonOnAlertBox() {
		noButtonInConfirmAlert.click();
	}
	public void clickYesButtonOnAlertBox() {
		yesButtonInConfirmAlert.click();
	}

}

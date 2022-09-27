package com.lms.ui.pageobject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserIDPageObject {
	
	WebDriver driver;
	public UserIDPageObject(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//span[@class='p-button-label ng-star-inserted']")
	WebElement userIDLinkInDataTable;
	
	@FindBy(xpath="//div[@class='ng-trigger ng-trigger-animation ng-tns-c132-7 p-fluid p-dialog p-component p-dialog-draggable p-dialog-resizable ng-star-inserted']")
	WebElement userDetailsOnUserIDLinkClick;
	
	public void clickUserIDLinkInDataTable() {
		userIDLinkInDataTable.click();
	}
	
	public boolean isUserDetailsOnUserIDLinkClickVisible() {
		WebElement element = new WebDriverWait(driver, Duration.ofSeconds(2000))
				.until(ExpectedConditions.elementToBeClickable(userDetailsOnUserIDLinkClick));
		boolean isVisible = element.isDisplayed();
		return isVisible;
	}

}

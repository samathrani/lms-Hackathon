package com.lms.ui.pageobject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserSearchPageObjects {
	WebDriver driver;
	public UserSearchPageObjects(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath="//input[@class='p-inputtext p-component']")
	WebElement searchBox;

//	@FindBy(xpath="//tbody//td[3][1]")
//	WebElement userNameOnTheResult;

	public boolean isSearchBoxVisible() {
		return searchBox.isDisplayed();
	}

	@FindBy(xpath="//table/tbody/tr[1]/td[3]")
	WebElement userNameOnTheResult;
	
	@FindBy(xpath="//span[@class='p-paginator-current ng-star-inserted']")
	WebElement footerOnNoResults;
	
	public boolean checkPlaceHolderValueInSearch() {
		String value = searchBox.getAttribute("placeholder");
		if(value.equals("Search..."))
			return true;
		else
			return false;
	}

	public void enterSearchText(String name) {
		//WebElement element = new WebDriverWait(driver, Duration.ofSeconds(2000))
		//		.until(ExpectedConditions.visibilityOf(searchBox));
		searchBox.sendKeys(name);

	}
	
	public String checkUserNameMAtchingTheSearch() {
		 return userNameOnTheResult.getText();
	}

	public boolean checkIfNoResultsForSearch() {
		return footerOnNoResults.isDisplayed();
	}
}

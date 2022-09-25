package com.lms.ui.pageobject;

import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.lms.ui.factory.DriverFactory;

import dev.failsafe.internal.util.Assert;

public class UserPageObject {
	WebDriver driver;
	public UserPageObject(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	@FindBy(id="username")
	WebElement loginId;

	@FindBy(id="password")
	WebElement loginPassword;

	@FindBy(id="login")
	WebElement loginButton; 

	@FindBy(xpath="//mat-toolbar[@class='mat-toolbar mat-primary mat-toolbar-single-row ng-star-inserted']/button[3]")
	WebElement clickUserTab; 

	@FindBy(xpath="//div[@class=\"box\"][1]")
	WebElement asserUserPage;

	//Paginations
	@FindBy(xpath="//table/tbody//tr")
	List<WebElement> assertPaginationWithLessRows;

	@FindBy(xpath="//button[@class=\"p-paginator-next p-paginator-element p-link p-disabled p-ripple\"]")
	WebElement findPaginationEnabled;

	@FindBy(xpath="//span[@class='p-paginator-icon pi pi-angle-right']")
	WebElement paginationNextPageButton;

	@FindBy(xpath="//table//tbody")
	WebElement dataTableInUser;

	@FindBy(xpath="//div[@class='p-d-flex p-ai-center p-jc-between ng-star-inserted']")
	WebElement nextPageHeadingName;

	//8
	@FindBy(xpath="//button[@class='p-paginator-last p-paginator-element p-link p-ripple ng-star-inserted']")
	WebElement lastPagePaginationButton;

	//Add New User 

	@FindBy(xpath="//button[@label='Add New User']")
	WebElement locateAddNewUser;

	@FindBy(xpath="//div[@class='ng-tns-c132-6 p-dialog-content']")
	WebElement dialogBoxUserDetails;

	//Table Header

	@FindBy(xpath="//thead//th[4]")
	WebElement tableHeader;

	@FindBy(xpath="//p-sorticon[@field='user_id']")
	WebElement sortButton;

	@FindBy(xpath="//span[@class='p-button-label ng-star-inserted']")
	List<WebElement>  listInDataTable;

	@FindBy(xpath="//div[@role='checkbox']")
	WebElement checkBox;

	//	@FindBy(xpath="//tbody//td//div[@class='p-checkbox p-component']")
	//	List<WebElement> allCheckBoxesOnThePage;


	@FindBy(xpath="//table//tbody//div[@role='checkbox']")
	List<WebElement> allCheckBoxesOnThePage;

	@FindBy(xpath="//thead/tr//p-tableheadercheckbox")
	WebElement checkBoxInHeader;

	public void enterLoginID() {
		loginId.sendKeys("lms");
	}

	public void enterLoginPassword() {
		loginPassword.sendKeys("lms");
	}
	public void clickLogin() {
		loginButton.click();
	}
	public void clickUserTab() {
		WebDriverWait w = new WebDriverWait(driver, Duration.ofMillis(2000));
        w.until(ExpectedConditions.visibilityOf(clickUserTab));
		clickUserTab.click();
	}
	public String assertUserPage() {
		String text = asserUserPage.getText();
		return text;

	}


	//Pagination
	public int findNoOfRecordsInDataTable() {
		int noOfRecords = assertPaginationWithLessRows.size();
		return noOfRecords;

	}

	public boolean findPaginationEnabled() {
		boolean paginationsIsEnabled = findPaginationEnabled.isEnabled();
		return paginationsIsEnabled;

	}



	public boolean checkDataTableIsPresent() {
		boolean isDataTablePresent = dataTableInUser.isDisplayed();
		return isDataTablePresent;
	}

	public boolean clickPaginationNextPageButton(){
		boolean isPaginationNextEnabled = paginationNextPageButton.isEnabled();
		if(isPaginationNextEnabled)
			paginationNextPageButton.click();
		return isPaginationNextEnabled;

	}
	public int nextPageEntriesOnPaginationRightClick() {

		System.out.println("here");
		int noOfEntries = Integer.parseInt(nextPageHeadingName.getText().replaceAll("[^0-9]", ""));
		return noOfEntries;
	}
	//8Scenario: Verify pagination next link after 

	public boolean isLastPageButtonOnPaginationEnabled() {
		return lastPagePaginationButton.isEnabled();
	}
	public void clickLastPageButtonOnPagination() {
		lastPagePaginationButton.click();
	}

	public boolean isPaginationNextPageButtonEnabled(){
		boolean paginationNextButton = paginationNextPageButton.isEnabled();
		return paginationNextButton;
	}
	//Table Footer
	public String getFooterContent() {
		return nextPageHeadingName.getText();

	}

	//Add New Page 

	public boolean checkPresenceOfAddNewUserButton() {
		return locateAddNewUser.isDisplayed();
	}

	public void clickAddNewUserButton() {
		locateAddNewUser.click();
	}
	public boolean checkUserDetailsDialogBox() {
		return dialogBoxUserDetails.isDisplayed();
	}

	public boolean checkTableHeader() {
		System.out.println(tableHeader.getText());
		return tableHeader.isDisplayed();
	}

	public void clickSortButton() {
		sortButton.click();
	}
	public List<WebElement> listofItemsInDataTable(){
		return listInDataTable;
	}

	public void clickCheckBoxInHeader() {

		WebElement element = new WebDriverWait(driver, Duration.ofSeconds(2000))
				.until(ExpectedConditions.elementToBeClickable(checkBoxInHeader));
		element.click();

				//checkBoxInHeader.click();
	}

	public boolean isAllCheckBoxesSelected() {
		int count=0;

		List<WebElement> elements = allCheckBoxesOnThePage;

		for(WebElement element : elements) {
			System.out.println("Webelement is selected :: "+element.getAttribute("aria-checked"));
			boolean isCheckBoxSelected = Boolean.valueOf(element.getAttribute("aria-checked"));
			if(isCheckBoxSelected) {
				count++;
			}
		}

		if(count==allCheckBoxesOnThePage.size())
			return true;
		else 
			return false;
	}

	//Delete User

	@FindBy(xpath="//span[@class='p-button-icon pi pi-trash']")
	WebElement deleteIcon;
	
	//button[@class='p-button-danger p-button p-component p-button-icon-only']
	@FindBy(xpath="//button[@class='p-button-danger p-button p-component p-button-icon-only']")
	WebElement ifDeleteIconIsDisabled;
	
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
		return deleteIcon.isEnabled();
	}

	
	
	public boolean isDeleteIconIsDisabled() {
		String value = ifDeleteIconIsDisabled.getAttribute("disabled");
		return value != null;
	}
	
	public boolean isDeleteIconEnabled() {
		return deleteIcon.isEnabled();
	}
	public void clickDeleteIconOnRight() {
		 deleteIconOnRight.click();
	}
	public boolean checkConfirmAlertBoxPopUp() {
		WebDriverWait w = new WebDriverWait(driver, Duration.ofMillis(2000));
        w.until(ExpectedConditions.visibilityOf(confirmAlertBoxOnDelete) );
		return confirmAlertBoxOnDelete.isDisplayed();
	}
	public void clickNoButtonOnAlertBox() {
		noButtonInConfirmAlert.click();
	}
	public void clickYesButtonOnAlertBox() {
		yesButtonInConfirmAlert.click();
	}

}
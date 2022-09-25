package pageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import stepDefinition.Excelsheet;
import stepDefinition.Hooks;

public class Assignmentpc {
	WebDriver driver = Hooks.driver;
	Excelsheet excel;
	@FindBy(xpath="//mat-toolbar//button[4]")
	WebElement Assignment;
	@FindBy(id="username")
	WebElement username;
	@FindBy(id="password")
	WebElement password;
	@FindBy(id="login")
	WebElement login;
	@FindBy(xpath="//mat-card-title/div")
	WebElement title;
	@FindBy(xpath="//div[@class='p-paginator-bottom p-paginator p-component ng-star-inserted']/span")
	WebElement footershowingentries;
	@FindBy(xpath="//mat-card-content//div[@class= 'p-datatable-footer ng-star-inserted']") 
	WebElement totalassignments;
	@FindBy(xpath="//input[@class='p-inputtext p-component']")
	WebElement searchbox;
	@FindBy(xpath="//tbody/tr[1]/td[2]")
	WebElement DevAssignment;
	@FindBy(xpath="//div[@aria-checked='true']")
	WebElement checkboxclick;
	@FindBy(xpath="//div[@class='ng-tns-c132-6 p-dialog-content']/div[1]/input")
	WebElement Assignmentname;
	@FindBy(xpath="//div[@class='ng-tns-c132-6 p-dialog-content']/div[3]/input")
	WebElement Assignmentgrade;
	@FindBy(xpath="//div[@class='ng-tns-c132-6 p-dialog-content']/div[4]//span/button")
	WebElement Assignmentduedate;
	@FindBy(xpath="//div[@class='ng-tns-c132-6 p-dialog-content']/div[4]//span//div//table//tr[3]/td[2]")
	WebElement date;
	@FindBy(xpath="//div[@class='p-dialog-footer ng-tns-c132-6 ng-star-inserted']/button[2]")
	WebElement save;
	@FindBy(xpath="//tbody/tr[1]/td[2]")
	WebElement namemainpage;
	@FindBy(xpath="//tbody/tr[2]/td[2]")
	WebElement descripmainpage;
	@FindBy(xpath="//tbody/tr[1]/td[4]")
	WebElement datemainpage;
	@FindBy(xpath="//div[@class='p-dialog-footer ng-tns-c132-6 ng-star-inserted']/button[1]/span[2]")
	WebElement cancel;
	@FindBy(xpath="//tbody/tr[1]/td[1]//div/div[2]")
	WebElement checkbxassignment;
	@FindBy(xpath="//tbody/tr[1]/td[6]//div/span[2]/button")
	WebElement sidedelete;
	@FindBy(xpath="//div[@class='p-dialog-footer ng-tns-c133-7 ng-star-inserted']/button[2]/span[2]")
	WebElement yesconfirmdelete;
	
	@FindBy(xpath="//div[@class='p-datatable-footer ng-star-inserted']/div")
	WebElement footertotalassignments; 
	@FindBy(xpath="//div[@class='p-dialog-footer ng-tns-c133-7 ng-star-inserted']/button[1]/span[2]")
	WebElement noconfirmdelete; 
	@FindBy(xpath="//thead/tr[1]//div/div[2]")
	WebElement assignmentnameheader; 
	@FindBy(xpath="//mat-card-title//button/span")
	WebElement headerdelete; 
	@FindBy(xpath="//div[@class='p-datatable-footer ng-star-inserted']/div")
	WebElement intotalanother; 
	@FindBy(xpath="//button[@label='A New Assignment']")
	WebElement newassignment; 
	@FindBy(xpath="//button[@label='Save']")
	WebElement savenewassignment; 
	@FindBy(xpath="//div[@class='p-field ng-star-inserted']//small")
	WebElement nameisrequired; 
	@FindBy(xpath="//div[@class='p-field ng-star-inserted'][1]/input")
	WebElement namenewassignment; 
	@FindBy(xpath="//div[@class='p-field ng-star-inserted'][2]/input")
	WebElement descnewassignment; 
	@FindBy(xpath="//div[@class='p-field ng-star-inserted'][3]/input")
	WebElement gradenewassignment; 
	@FindBy(xpath="//div[@class='p-field p-col-12 p-md-4 ng-star-inserted']//button")
	WebElement duedatenewassignment; 
	@FindBy(xpath="//tbody/tr[4]/td[2]")
	WebElement newassignmentnamemain; 
	@FindBy(xpath="//button[@label='Cancel']")
	WebElement cancelnewassignment; 
	@FindBy(xpath="//mat-card-title[@class='mat-card-title']/div[1]")
	WebElement titleanother; 
	@FindBy(xpath="//button[@tabindex='-1']")
	WebElement closenewassignment; 
	@FindBy(xpath="//th[2]")
	WebElement assignmentnameforsorting; 
	@FindBy(xpath="//tbody[@class='p-datatable-tbody']/tr[1]/td[2]")
	WebElement devassignment; 
	@FindBy(xpath="//tbody[@class='p-datatable-tbody']/tr[1]/td[2]")
	WebElement Sqlassignment; 
	@FindBy(xpath="//th[3]")
	WebElement assignmentdescforsorting; 
	@FindBy(xpath="//tbody[@class='p-datatable-tbody']/tr[1]/td[3]")
	WebElement devpractice; 
	@FindBy(xpath="//tbody[@class='p-datatable-tbody']/tr[1]/td[3]")
	WebElement Sqlpractice; 
	@FindBy(xpath="//th[4]")
	WebElement assignmentdateforsorting; 
	@FindBy(xpath="//tbody[@class='p-datatable-tbody']/tr[1]/td[4]")
	WebElement dateforassertsorting; 
	@FindBy(xpath="//button[@class='p-paginator-next p-paginator-element p-link p-disabled p-ripple']")
	WebElement paginationnextbutton; 
	@FindBy(xpath="//div[@class='p-paginator-bottom p-paginator p-component ng-star-inserted']/span")
	WebElement Showing2to3of3entries; 
	@FindBy(xpath="//button[@class='p-paginator-prev p-paginator-element p-link p-disabled p-ripple']")
	WebElement paginationprevbutton; 
	@FindBy(xpath="//button[@class='p-paginator-last p-paginator-element p-link p-disabled p-ripple ng-star-inserted']")
	WebElement paginationlastbutton; 
	@FindBy(xpath="//button[@class='p-paginator-first p-paginator-element p-link p-disabled p-ripple ng-star-inserted']")
	WebElement paginationfirstbutton; 
	

	public Assignmentpc(WebDriver driver ) {
	
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
	public void login(String testid, String sheetname) {
	excel = new Excelsheet(testid, sheetname);
	  username.sendKeys(excel.readusername());
	   password.sendKeys(excel.readpassword());
	   login.click();
	
}
	public void clickassignment() {
		Assignment.click();
}
	public String pagetitle(String titl) {
	 String titles= title.getText();
	 return titles;
	}
	
	public String showentry(String footer) {
	String footer1= footershowingentries.getText();
	return footer1;
	}
	
	public String totalassignments(String header) {
		String header1= totalassignments.getText();
		return header1;
		}
	
	public void textinsearch() {
		searchbox.sendKeys("Dev Assignment");
	}
	
	public String asserttext(String entr) {
		 String entry=DevAssignment.getText();
		 return entry;
	}
	 
	public void checkboxclick() {
		for(int i=1; i<=3;i++) {
		    driver.findElement(By.xpath("//tbody/tr["+i+"]/td[1]//div/div[2]")).click();
			}
	}
	
	
	public void checkboxassert() {
	WebElement checkbox= driver.findElement(By.xpath("//div[@aria-checked='true']"));
	 boolean isSelected = checkbox.isSelected();
	}
	
	public void logintoassignmentpage(String testid, String sheetname) {	
		excel = new Excelsheet(testid, sheetname);
		 username.sendKeys(excel.readusername());
		   password.sendKeys(excel.readpassword());
		   login.click();
		   Assignment.click();
	}
	
public void editfields() {
	for(int i=1; i<=3; i++) {
	   driver.findElement(By.xpath("//tbody/tr["+i+"]/td[6]//button")).click();

	   Assignmentname.clear();
	   Assignmentname.sendKeys("Sql");
	   Assignmentgrade.sendKeys("3");
	   Assignmentduedate.click();
	   date.click();			
	   save.click();
	   
	}
}

public String editfieldscheck(String field) {
	String text= namemainpage.getText();
	return text;
}

public void clickcancel() {
for(int i=1; i<=3; i++) {
	   driver.findElement(By.xpath("//tbody/tr["+i+"]/td[6]//button")).click();
	   cancel.click();
}
}
 
public String checkpageclose(String check) {
	String titlecheck=title.getText();
	return titlecheck;
}

public void deleteassignment() {
	checkbxassignment.click();
	sidedelete.click();
}

public void yesconfirmdelete() {
	yesconfirmdelete.click();
}


public String deletcheck(String asserttext) {
	 String texts=intotalanother.getText();
	 return texts;
}
public void noconfirmdelete() {
	noconfirmdelete.click();
}
public void deleteallassignments() {
	assignmentnameheader.click();
	headerdelete.click();
}
public String msgs(String msg) {
	 String texts=footertotalassignments.getText();
	 return texts;
}

public void newassignmentclick() {
	newassignment.click();
}

public void clicksave() {
	savenewassignment.click();
}

public String namerequiassert(String txt) {
	String warning = nameisrequired.getText();
	return warning;
}

public void entersfields() {

	namenewassignment.sendKeys("Java");
	descnewassignment.sendKeys("Script");
	gradenewassignment.sendKeys("3");
	duedatenewassignment.sendKeys("24/09/2022");
	savenewassignment.click();


}
public String newasscreated(String newmsg) {
	String text1= newassignmentnamemain.getText();
  return text1;
}


public void entersfieldtocancel() {
	namenewassignment.sendKeys("Java");
	descnewassignment.sendKeys("Script");
	gradenewassignment.sendKeys("3");
	duedatenewassignment.sendKeys("24/09/2022");
	cancelnewassignment.click();
}

public void entersfieldtoclose() {
	namenewassignment.sendKeys("Java");
	descnewassignment.sendKeys("Script");
	gradenewassignment.sendKeys("3");
	duedatenewassignment.sendKeys("24/09/2022");
	closenewassignment.click();

}

public void assignmentnameclick() {

	assignmentnameforsorting.click();


}

public String ascending(String sort) {

String sort5=devassignment.getText();
return sort5;
}

public String descending(String sorted) {

String sort4=Sqlassignment.getText();
return sort4;

}

public void assignmentdesclick() {

	assignmentdescforsorting.click();


}
public String descsortassert(String desc) {
String sort1=devpractice.getText();
return sort1;
}

public String descsortassertdes(String descde) {
String sort2=Sqlpractice.getText();
return sort2;
}

public void duedateclick() {
	assignmentdateforsorting.click();
}
public String ascendi(String asc) {
String news = dateforassertsorting.getText();
return news;
}

public String descendng(String assignment) {
	String sort3=dateforassertsorting.getText();
	return sort3;
	
}

public void clicklastpage() {
	paginationlastbutton.click();
}


public String lastpage(String lastpage) {
	String page= Showing2to3of3entries.getText();
	return page;
}


public void firstpage() {
	paginationfirstbutton.click();

}

public void nextbutton() {
	paginationnextbutton.click();
}

public String nextpageassert(String nextpageassert) {
String page= Showing2to3of3entries.getText();
return page;
}
public void clickpreviousbutton() {
	paginationprevbutton.click();
}
public String checkfirstpagenavigation(String pagination) {
	String page= Showing2to3of3entries.getText();
	return page;
}
}

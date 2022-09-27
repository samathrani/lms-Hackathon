
package pageClasses;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.Select;
	import stepDefinition.Excelsheet;
	import stepDefinition.Hooks;
import utils.ExcelHandling;
import utils.ExcelHandlingK;
	
public class ManageBatchPageclass {
	
		 WebDriver driver=Hooks.driver;
		 ExcelHandling excel;
		 
		    @FindBy(id="username") WebElement user;
			@FindBy(id="password") WebElement password;
			@FindBy(id="login") WebElement login;
			@FindBy(xpath="//*[contains(text(),'Batch')]") WebElement Batch;
			@FindBy(xpath="//*[contains(text(),' Manage Batch')]") WebElement ManageBatchTitle;
			@FindBy(xpath="//div[@class='p-d-flex p-ai-center p-jc-between ng-star-inserted']") WebElement TotalBatches;
			@FindBy(xpath="//input[@class='p-inputtext p-component']") WebElement clksearch;
			@FindBy(xpath="//tbody/tr[1]/td[2]") WebElement sdet666;
			@FindBy(xpath="//*[contains(text(),'Manage Batch')]") WebElement heading;
			@FindBy(xpath="//tbody/tr[1]/td[1]//div/div[2]") WebElement chkboxassignment;
			@FindBy(xpath="//tbody/tr[1]/td[7]//div/span[2]/button") WebElement sidedelete;
			@FindBy(xpath="//thead/tr[1]//div/div[2]") WebElement assignnameheader;
			@FindBy(xpath="//mat-card-title//button/span") WebElement headerdel;
			@FindBy(xpath="//*[contains(text(),'A New Batch')]") WebElement AddBatch;
			@FindBy(xpath="//button[@class='p-button-danger p-button p-component p-button-icon-only']") WebElement delall;
			@FindBy(xpath="//div[@class='p-field ng-star-inserted']//small") WebElement nameisrequired;
			@FindBy(id="batchName")WebElement bthName;
			@FindBy(id="batchDescription") WebElement bthDescrip;
			@FindBy(xpath="//span[@ng-reflect-ng-class= 'pi pi-chevron-down']") WebElement proNamedropdown;
			@FindBy(xpath="//div[@class='p-radiobutton-box']") WebElement actRadio;
			@FindBy(xpath="//input[@id='INACTIVE']") WebElement inActRadio;
			@FindBy(id="batchNoOfClasses") WebElement bthNoOfclasses;
			@FindBy(xpath="//*[contains(text(),'Save')]") WebElement savebtn;
			@FindBy(xpath="//span[@class= 'p-button-icon p-button-icon-left pi pi-times']") WebElement cancelbtn;
			@FindBy(xpath="//span[@ng-reflect-ng-class='pi pi-times']") WebElement closeform;
			@FindBy(xpath="//*[text()='3']") WebElement pagenum3;
			@FindBy(xpath="//*[text()='2']") WebElement pagenum2;
			@FindBy(xpath="//*[text()='11']") WebElement pagenumlast;
			@FindBy(xpath="//button[@pripple class='p-paginator-next  p-paginator-element  p-link  p-ripple p-disabled']") WebElement right;
			@FindBy(xpath="//span[@class='p-paginator-icon pi pi-angle-double-right']") WebElement Doubleright;
			@FindBy(xpath="//span[@class='p-paginator-icon pi pi-angle-left']") WebElement left;
			@FindBy(xpath="//span[@class='p-paginator-icon pi pi-angle-double-left']") WebElement Doubleleft;
			@FindBy(xpath="//button[@ng-reflect-icon='pi pi-trash'][+i+]") WebElement delete;
			@FindBy(xpath="//*[contains(text(),'No')]") WebElement confirmNo;
			@FindBy(xpath="//*[contains(text(),'Yes')]") WebElement confirmYes;
			@FindBy(xpath="//button[@ng-reflect-icon='pi pi-pencil'][+i+]") WebElement edit;
			@FindBy(xpath="//div[@class='p-checkbox-box']") WebElement multipleselchkbox;
			@FindBy(xpath="//*[contains(text(),'Batch Name')]") WebElement BatchNameOrder;
			@FindBy(xpath="//*[contains(text(),'Batch Description')]") WebElement BatchDescriptionorder;
			@FindBy(xpath="//*[contains(text(),'Batch Status')]") WebElement BatchStatusOrder;
			@FindBy(xpath="//*[contains(text(),'No Of Classes')]") WebElement NoOfClassesOrder;
			@FindBy(xpath="//*[contains(text(),'Program Name')]") WebElement proNameOrder;
			//@FindBy(xpath="//mat-card[@class='mat-card mat-focus-indicator']") WebElement table;
			@FindBy(xpath="//li[@aria-label='TestProgram']") WebElement TestProgram;
			public ManageBatchPageclass(WebDriver driver) {
				this.driver = driver;
				PageFactory.initElements(driver, this);
				}
			//login
			public void login(String testId,String sheetName) {
		    excel=new ExcelHandling(testId, sheetName);
			user.sendKeys(excel.GetUserName());
			password.sendKeys(excel.GetPassword());
			login.click();
			}
		    //clickBatch
		    public void clkBatch() {
		    	Batch.click();
		    }
		    public String pageTitle(String title1) {
		    	String titles=ManageBatchTitle.getText();
		    	return titles;
		    	  }
		  
		    public void batchsearchText() {
		    	clksearch.click();
		    	clksearch.sendKeys("sdet666");
		    }
		    public String asserttext(String entr) {
		   		 String entry=sdet666.getText();
		   		 return entry;
		    	 }
		    
		     //addbatch
		    public void addBatch() {
		    	AddBatch.click();
		    }
		    public String namerequiassert(String txt) {
		    	String warning = nameisrequired.getText();
		    	return warning;
		    }
		    
		    public void enterallfields() {
		    	bthName.clear();
		    	bthName.sendKeys("sdet55");
		    	bthDescrip.sendKeys("java with selenium");
		    	proNamedropdown.click();
		    	driver.findElement(By.xpath("//li[@aria-label='TestProgram']")).click();
		    	actRadio.click();
		    	bthNoOfclasses.sendKeys("8");
		    }
		    public void clksave() {
		    	savebtn.click();
		    	}		
		    public void enterallfieldscancel() {
		    	bthName.clear();
		    	bthName.sendKeys("sdet55");
		    	bthDescrip.sendKeys("java with selenium");
		    	proNamedropdown.click();
		    	driver.findElement(By.xpath("//li[@aria-label='TestProgram']")).click();
		    	actRadio.click();
		    	bthNoOfclasses.sendKeys("8");
		    	cancelbtn.click();
		    	}	
		    public void enterallfieldsclose() {
		    	bthName.clear();
		    	bthName.sendKeys("sdet55");
		    	bthDescrip.sendKeys("java with selenium");
		    	proNamedropdown.click();
		    	Select s=new Select(driver.findElement(By.xpath("//span[@ng-reflect-ng-class='pi pi-chevron-down']")));
		    	s.selectByVisibleText("Name");
		    	actRadio.click();
		    	bthNoOfclasses.sendKeys("8");
		    	closeform.click();
		    	}	
		    
		    public void inActiveRadioBtn() {
		    	inActRadio.click();
		    }
		    
		   
//		    //EditBatch
//		    public void editBatch() {
//		    	for(int i=1;i<=6;i++);
//		    	edit.click();
		  //  }
//		    //DeleteBatch
//		    public void deleteBatch() {
//		    	//for(int i=1; i<=5;i++) {
//		    	delete.click();
//		    	    System.out.println("deleted");
//		    		}//}
		    public void confirmDeleteYes() {
		    	
		    		confirmYes.click();
		    }
		    public void confirmDeleteNo() {		
		    		confirmNo.click();
		    		}
//		    public void deleteall() {
//		    	assignnameheader.click();;
//				 headerdel.click();
//		    	
//		    }
		    public void delallbatch() {
		    	delall.click();
		    }
		    	
		    
		    //Pagination
		    public void pagenumber3() {
		    	pagenum3.click();
		    }
		    public void pagenumber2() {
		    	pagenum2.click();
		    }
		    public void pagenumberlast() {
		    	pagenumlast.click();
		    }
		    public void nextbutton() {
		    	right.click();
		    }
		    
		    public void doublerightAngle() {
		    	Doubleright.click();
		    }
		    public void leftAngle() {
		    	left.click();
		    }
		    public void doubleleftAngle() {
		    	Doubleleft.click();
		    }
		    public void batchnameorder() {
		    	BatchNameOrder.click();
		    }
		    public void batchDescriptionorder() {
		    	BatchDescriptionorder.click();
		    }
		    public void batchstatusorder() {
		    	BatchStatusOrder.click();
		    }
		    public void Noclasses() {
		    	NoOfClassesOrder.click();
		    }
		    public void pronameorder() {
		    	proNameOrder.click();
		    }
		    public void mulchkbox(){
		    	 multipleselchkbox.click();
		    
		    
		    }
		  public void deleteassignment() {
			  chkboxassignment.click();
			  sidedelete.click();
			  
		  }
		    }







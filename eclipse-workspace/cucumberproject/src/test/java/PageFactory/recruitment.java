package PageFactory;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.baseTest;

public class recruitment extends baseTest {
public recruitment() {
		
		driver=baseTest.driver;
		PageFactory.initElements(driver, this);	
	}
@FindBy(xpath="//span[text()='Recruitment']")
WebElement recruit;
@FindBy(xpath="//*[text()=' Add ']")
WebElement Add;
@FindBy(xpath="//input[@placeholder='First Name']")
WebElement firstname;
@FindBy(xpath="//input[@placeholder='Last Name']")
WebElement lastname;
@FindBy(xpath="//div[@class='oxd-select-text oxd-select-text--active']")
WebElement vacancy;
@FindBy(xpath="//*[text()='Software Engineer']")
WebElement vacancysel;
@FindBy(xpath="//label[text()='Email']/../..//input")
WebElement email;
@FindBy(xpath="//label[text()='Contact Number']/../..//input")
WebElement contactnumber;
@FindBy(xpath="//input[@placeholder='Enter comma seperated words...']")
WebElement 
keyword;
@FindBy(xpath="//div[@class='oxd-date-input']//input")
WebElement dateinput;
@FindBy(xpath="//button[@type='submit']")
WebElement submit;
@FindBy(xpath="//button[text()=' Shortlist ']")
WebElement shortlist;
@FindBy(xpath="//button[text()=' Save ']")
WebElement save;
@FindBy(xpath="//button[text()=' Schedule Interview ']")
WebElement schedule;
@FindBy(xpath="//label[text()='Interview Title']/../..//input")
WebElement inttitle;
@FindBy(xpath="//label[text()='Interviewer']/../..//input")
WebElement interviewer;
@FindBy(xpath="//label[text()='Date']/../..//input")
WebElement Date;
@FindBy(xpath="//label[text()='Time']/../..//input")
WebElement Time;
@FindBy(xpath="//*[text()=' Save ']")
WebElement Save;
@FindBy(xpath="//button[text()=' Mark Interview Passed ']")
WebElement Pass;
@FindBy(xpath="//button[text()=' Save ']")
WebElement savebutton;
@FindBy(xpath=" //button[text()=' Offer Job ']")
WebElement Job;
@FindBy(xpath="//button[text()=' Hire ']")
WebElement hire;
@FindBy(xpath="//i[@class='oxd-icon bi-caret-down-fill']")
WebElement cand;
//@FindBy(xpath="//div[@class='oxd-table']/div/div[1]")
//WebElement candhis1;
@FindBy(xpath="//div[@class='oxd-table']/div[@class='oxd-table-body']/div[@class='oxd-table-card']")
List<WebElement> canditateHistoryList;
@FindBy(css=".oxd-table-cell:nth-child(1)")
List<WebElement> canditateHistoryList1;
@FindBy(css=".oxd-table-cell:nth-child(2)")
List<WebElement> canditateHistoryList2;


public void clickrecruitment() throws InterruptedException
{
	Thread.sleep(3000);
	recruit.click();;
}

public void addrecruit()
{
	Add.click();
}

public void enterdetails() throws InterruptedException
{
	firstname.sendKeys("Candidate2");
	lastname.sendKeys("R1");
	vacancy.click();
	vacancysel.click();
	email.sendKeys("abc@gmail.com");
	contactnumber.sendKeys("6272728861");
	keyword.sendKeys("account");
	dateinput.clear();
	//dateinput.sendKeys("2023-07-11");
	save.click();
	Thread.sleep(3000);
	shortlist.click();
	Save.click();
	schedule.click();
	inttitle.sendKeys("QAlead");
	interviewer.sendKeys("john");
	Thread.sleep(3000);
	Actions action = new Actions(driver);
	action.keyDown(interviewer,Keys.DOWN).perform();
	action.keyDown(interviewer,Keys.ENTER).perform();
	//interviewer.sendKeys("john");
	Date.sendKeys("2023-07-11");
	Save.click();
	Thread.sleep(3000);
	Pass.click();
	savebutton.click();
	Thread.sleep(3000);
	Job.click();
	savebutton.click();
	hire.click();
	savebutton.click();
	
	
}
public void searchcandidate()
{
	cand.click();
}
public void printcandhistory()
{
	/*
	String hist=candhis1.getText();
	System.out.println(hist);
	return hist;
	*/
/*	
	for(WebElement canditateHis : canditateHistoryList)
	{
	System.out.println("Performance Date :: " +canditateHis.canditateHistoryList1.getText());
	System.out.println("Performance Description :: "+canditateHis.canditateHistoryList2.getText());
	}
*/
	
}
public void savedetails()
{
	submit.click();
}


}

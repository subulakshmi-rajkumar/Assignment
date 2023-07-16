package PageFactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v112.indexeddb.model.Key;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.baseTest;

public class Contacts extends baseTest{
	
	public Contacts() {
		//super();
		driver=baseTest.driver;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//span[text()='My Info']")
	WebElement info;
	@FindBy(xpath="//a[text()='Contact Details']")
	WebElement contact;
	@FindBy(xpath="//div[@class='oxd-grid-item oxd-grid-item--gutters']/div/div[2]/input")
	WebElement street1;
	@FindBy(xpath="/div[@class='oxd-grid-3 orangehrm-full-width-grid']/div[3]//input")
	WebElement city;
	@FindBy(xpath="//div[@class='oxd-grid-3 orangehrm-full-width-grid']/div[4]//input")
	WebElement state;
	@FindBy(xpath="//div[@class='oxd-grid-3 orangehrm-full-width-grid']/div[5]//input")
	WebElement zip;
	@FindBy(xpath="//div[@class='oxd-select-text-input']")
	WebElement country;
	@FindBy(xpath="//form[@class='oxd-form']/div[2]//input")
	WebElement home;
	@FindBy(xpath="//form[@class='oxd-form']/div[3]//input")
	WebElement email;
	@FindBy(xpath="//button[@type='submit']")
	WebElement save;
	@FindBy(id="oxd-toaster_1")
	WebElement successmsg;
	
	
	public WebDriver driver;
	
	

	

	public void clickmyinfo()
	{
		info.click();
	}

	public void clickcontactdetails()
	{
		
		contact.click();
	}

	public void entercontactdetails() throws InterruptedException
	{
		//street1.sendKeys("rodeodr");
		//String s = Keys.chord(Keys.CONTROL, "a");
		//street1.sendKeys(Keys.DELETE);
		//Thread.sleep(2000);
		street1.sendKeys("rodeodr");
		//city.sendKeys("irv");
		//state.clear();
		state.sendKeys("TX");
	//	zip.clear();
	    zip.sendKeys("6778");
	    email.clear();
		//email.sendKeys("subu@yahoo.com");
	    save.click();
	String msg=successmsg.getText();
	System.out.println(msg);
	}
	


}

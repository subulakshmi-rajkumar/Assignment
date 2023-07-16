package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.baseTest;

public class EmergencyContacts extends baseTest {
	public EmergencyContacts() {
		//super();
		driver=baseTest.driver;
		PageFactory.initElements(driver, this);	
	}

	@FindBy(xpath="//a[text()='Emergency Contacts']")
	WebElement econt;
	@FindBy(xpath="//div[@class='orangehrm-edit-employee-content']//div[1]//button//i[1]")
	WebElement add;
	
	@FindBy(xpath="//*[contains(text(),'Name')]//following::input[1]")
	WebElement name;
	@FindBy(xpath="//*[contains(text(),'Name')]//following::input[2]")
	WebElement rel;

	@FindBy(xpath="//*[contains(text(),'Name')]//following::input[3]")
	WebElement tel1;
	@FindBy(xpath="//*[contains(text(),'Name')]//following::input[4]")
	WebElement tel2;
	@FindBy(xpath="//*[contains(text(),'Name')]//following::input[5]")
	WebElement tel3;
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	
	
	public WebDriver driver;
	


	public void clickemergencycontacts() throws InterruptedException
	{
		econt.click();
		Thread.sleep(3000);
		add.click();
	}

	public void enteremergencycontacts()
	{
		name.sendKeys("tom");
		rel.sendKeys("grandson");
		tel1.sendKeys("5678");
		tel2.sendKeys("4567");
		tel3.sendKeys("3456");
	}

	public void saveemergency()
	{
		submit.click();
	}
	


}




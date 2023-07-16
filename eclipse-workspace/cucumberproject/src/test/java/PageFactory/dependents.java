package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseClass.baseTest;

public class dependents extends baseTest {
	public dependents() {
		
		driver=baseTest.driver;
		PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath="//a[text()='Dependents']")
	WebElement depen;
	@FindBy(xpath="//div[@class='orangehrm-edit-employee-content']//div[1]//i[1]")
	WebElement adddepen;
	@FindBy(xpath="//label[text()='Name']//following::input[1]")
	WebElement name;
	@FindBy(xpath="//div[contains(@class,'oxd-select-text oxd-select-text--active')]/div[2]")
	WebElement relation;
	@FindBy(xpath="//*[text()='Child']")
	WebElement child;
	
	@FindBy(xpath="//label[text()='Name']//following::i[2]")
	WebElement Date;
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	public WebDriver driver;
	
	public void clickdependents()
	{
		depen.click();
	}
	public void clickadd()
	{
		adddepen.click();
	}
	public void enterdependents() throws InterruptedException
	{
		name.sendKeys("Tomsis");
		//Select relationship=new Select(relation);
		//relationship.selectByVisibleText("Child");
		Thread.sleep(3000);

		relation.click();
       child.click();
		// Date.sendKeys("1984-08-17");
	}
	public void clicksubmit()
	{
		submit.click();
	}



}

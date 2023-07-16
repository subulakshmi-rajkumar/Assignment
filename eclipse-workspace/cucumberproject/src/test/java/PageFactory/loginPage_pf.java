package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.baseTest;

public class loginPage_pf extends baseTest {
	
	public WebDriver driver;
	
	
	public loginPage_pf() {
		//super();
		//driverinitiation();
		driver=baseTest.driver;
		PageFactory.initElements(driver,this);//this=new loginPage_pf
		// TODO Auto-generated constructor stub
	}

	@FindBy(name="username") WebElement uname;
	@FindBy(name="password") WebElement pword;
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
	WebElement login;
    //public static WebDriver driver;
	
	
	public void enterusername()
	{
		uname.sendKeys("Admin");
	}

	public void enterpassword() {
		pword.sendKeys("admin123");
		
	}

	public void clicklogin()
	{
		login.click();
		
	}
	
	public void print()
	{
		System.out.println("Login Successful");
	}

	
	
}

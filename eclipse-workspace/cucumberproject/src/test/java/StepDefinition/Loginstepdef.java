package StepDefinition;

import org.openqa.selenium.WebDriver;

import BaseClass.baseTest;
import PageFactory.loginPage_pf;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginstepdef extends loginPage_pf {
	
/*
	public Loginstepdef(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public WebDriver driver; */
	//loginPage_pf lpage;
	//TestContextSetup testcontextsetup;

	
	/*
	public OrangeHRM2(TestContextSetup testcontextsetup)
	{
		this.testcontextsetup=testcontextsetup;
	}
	*/
	
	loginPage_pf lpage;   
	baseTest bt;
	
	@SuppressWarnings("deprecation")
	@Given("User in login page")
	public void user_in_login_page() {
		
		//bt = new baseTest();
		//bt.driverinitiation();
		
	/*
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\subul\\eclipse-workspace\\Hello-selenium\\src\\test\\resources\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		//this.driver=driver;
		 
		 */
		}

	@When("User enters username and password")
	public void user_enters_username_and_password() throws InterruptedException {
	    lpage=new loginPage_pf();
		Thread.sleep(2000);
		lpage.enterusername();
	    lpage.enterpassword();
	 
	}


	

	@When("User clicks login")
	public void user_clicks_login() {
		
          lpage.clicklogin();
	    
	}

	@Then("User is on Home Page")
	public void user_is_on_home_page() {
		
	    lpage.print();
	}
	

}

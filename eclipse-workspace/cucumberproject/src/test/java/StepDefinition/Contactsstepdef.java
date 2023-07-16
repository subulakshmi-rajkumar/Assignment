package StepDefinition;

import org.openqa.selenium.WebDriver;

import BaseClass.baseTest;
import PageFactory.Contacts;
import PageFactory.loginPage_pf;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Contactsstepdef extends Contacts {
	
		Contacts conts;
	
	

	@Given("User in Myinfo Page")
	public void user_in_myinfo_page() {
	   conts=new PageFactory.Contacts();
	   conts.clickmyinfo();
			   
	}

	@When("User Clicks Contact Details")
	public void user_clicks_contact_details() throws InterruptedException {
		Thread.sleep(2000);
		conts.clickcontactdetails();
	    
	}

	@When("User enters Contact Details and clicks save")
	public void user_enters_contact_details_and_clicks_save() throws InterruptedException {
		Thread.sleep(2000);
		conts.entercontactdetails();
	    
	}

	@Then("User verifies success message and entered details")
	public void user_verifies_success_message_and_entered_details() {
	   
	}



}

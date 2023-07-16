package StepDefinition;

import org.openqa.selenium.WebDriver;

import BaseClass.baseTest;
import PageFactory.EmergencyContacts;
import PageFactory.loginPage_pf;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Emergencycontstepdef extends EmergencyContacts {


	//public WebDriver driver;
	//loginPage_pf lpage;
	//PageFactory.Contacts conts;
	EmergencyContacts econts;
	
	@Given("User on Emergency Contacts Page")
	public void user_on_emergency_contacts_page() {
		econts=new PageFactory.EmergencyContacts();
	}

	@When("User clicks Emergency Contacts")
	public void user_clicks_emergency_contacts() throws InterruptedException {
		Thread.sleep(3000); 
		econts.clickemergencycontacts();
	}

	@When("User Enters Emergency Contacts")
	public void user_enters_emergency_contacts() throws InterruptedException {
		Thread.sleep(3000);
	    econts.enteremergencycontacts();
	}

	@Then("User saves verifies success")
	public void user_saves_verifies_success() {
		econts.saveemergency();
      
	}



}

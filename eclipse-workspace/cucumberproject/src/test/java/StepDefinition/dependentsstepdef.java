package StepDefinition;

import PageFactory.dependents;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class dependentsstepdef extends dependents {
	
	dependents dep;
	@Given("User on Myinfo Page")
	public void user_on_myinfo_page() {
		dep=new PageFactory.dependents();
	    
	}

	@When("User clicks dependents")
	public void user_clicks_dependents() {
	  dep.clickdependents();
	  dep.clickadd();
	}

	@When("User Enters dependents details")
	public void user_enters_dependents_details() throws InterruptedException {
	    dep.enterdependents();
	}

	@Then("User saves dependent details")
	public void user_saves_dependent_details() {
	    dep.clicksubmit();
	}



}

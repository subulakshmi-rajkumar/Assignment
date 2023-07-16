package StepDefinition;

import PageFactory.recruitment;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class recruitmentstepdef extends recruitment {
	recruitment rec;
	@Given("User on recruitment page")
	public void user_on_recruitement_page() {
		rec=new PageFactory.recruitment();
	}

	@When("User clicks recruitment link")
	public void user_clicks_recruitment_link() throws InterruptedException {
	    rec.clickrecruitment();
	    rec.addrecruit();
	}

	@When("User enters details")
	public void user_enters_details() throws InterruptedException {
	    rec.enterdetails();
	}

	@Then("User adds candidate")
	public void user_adds_candidate() {
	//	rec.savedetails();
	    
	}
	@And("User search candidate")
	public void user_search_candidate() throws InterruptedException {
		rec.printcandhistory();
		rec.clickrecruitment();
		rec.searchcandidate();
	    
	}




}

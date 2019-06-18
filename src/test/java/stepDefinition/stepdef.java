package stepDefinition;



import Cucumber1.Automate.Base;
import Cucumber1.Automate.Loginpage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdef extends Base {
	
	

	@Given("^User is on salesforce login page$")
	public void user_is_on_salesforce_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver=Intializedriver();
		driver.get("https://test.salesforce.com/");
	}

	/*@When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_login_into_application_with_and(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Loginpage Lpage = new Loginpage(driver);
		Lpage.Usernameenter("icc.wholesale08@accenture.sitiw08");
		Lpage.Passwordenter("INS$123");
		Lpage.LoginClick();
		Thread.sleep(10);
	
	}*/

	
	
	@Then("^User is on field service page$")
	public void user_is_on_field_service_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User is on field service page");
	}

	@And("^All the tabs will be displayed$")
	public void all_the_tabs_will_be_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
	    driver.close();
	}


}

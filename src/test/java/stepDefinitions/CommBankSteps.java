package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.ContextHelper;
import pageObjects.CommBankPage;

public class CommBankSteps {

	ContextHelper contextHelper;
	WebDriver driver;
	CommBankPage commbankPage;
	
public CommBankSteps(ContextHelper context) {
		
		contextHelper = context;
		commbankPage = contextHelper.getPageObjectManager().getCommBankPage();
		
	}
@Given("^I choose configurations from config file$")
public void i_choose_configurations_from_config_file() throws Throwable {

}
@When("^I open Commbank Page$")
public void i_open_Commbank_Page() throws Throwable {

	commbankPage.navigateToCommBankPage();
}

@When("^I navigate to the Travel money overseas section$")
public void i_navigate_to_the_Travel_money_overseas_section() throws Throwable {
	
	commbankPage.clickOnTravelProducts();
}

@Then("^I verify whether the subtopic exists$")
public void i_verify_whether_the_subtopic_exists() throws Throwable {
	
	Assert.assertEquals(commbankPage.verifyPageSubTopic(), true);
}

@Then("^I scroll down and click on NetBank login$")
public void i_scroll_down_and_click_on_NetBank_login() throws Throwable {
	
	commbankPage.clickOnLogonButton();
}

@Then("^NetBank page should be opened up$")
public void netbank_page_should_be_opened_up() throws Throwable {
	
	Assert.assertEquals(commbankPage.verifyUsernameFieldDisplayed(), true);
	Assert.assertEquals(commbankPage.verifyPasswordFieldDisplayed(), true);
}

@Then("^I close the browser$")
public void i_close_the_browser() throws Throwable {
	
	commbankPage.closeBrowser();
}

}

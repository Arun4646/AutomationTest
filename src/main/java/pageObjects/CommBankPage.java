package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CommBankPage {

	WebDriver _driver;
	public CommBankPage (WebDriver driver) {
		
		_driver = driver;
		PageFactory.initElements(_driver, this);
	}
	
	@FindBy(how= How.XPATH, using = "//*[@class='carditem']/div[8]")
	private WebElement _travelProducts;
	
	@FindBy(how= How.XPATH, using = "//*[@class='banner']//h1")
	private WebElement _subTopic;
	
	@FindBy(how= How.PARTIAL_LINK_TEXT, using = "Log on")
	private WebElement _logonButton;
	
	@FindBy(how= How.ID, using = "txtMyClientNumber_field")
	private WebElement _userNameField;
	
	@FindBy(how= How.ID, using = "txtMyPassword_field")
	private WebElement _passwordField;

	public void navigateToCommBankPage() {
		
		_driver.navigate().to("https://www.commbank.com.au");
		_driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	}
	
	public void clickOnTravelProducts() {
		
		_travelProducts.click();
	}
	
	public boolean verifyPageSubTopic() {
		
		return _subTopic.getText().contains("Travelling overseas or in Australia");
	}
	
	public void clickOnLogonButton() {
		
		_logonButton.click();
	}
	
	public boolean verifyUsernameFieldDisplayed() {
		
		_driver.switchTo().frame(0);
		return _userNameField.isDisplayed();
	}
	
	public boolean verifyPasswordFieldDisplayed() {
		
		return _passwordField.isDisplayed();
	}
	
	public void closeBrowser() {
		
		_driver.quit();
	}
}

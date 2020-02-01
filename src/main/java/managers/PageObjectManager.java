package managers;

import org.openqa.selenium.WebDriver;

import pageObjects.CommBankPage;

public class PageObjectManager {

	private WebDriver driver;
	private CommBankPage commbankPage;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	
public CommBankPage getCommBankPage() {
		
		return (commbankPage ==null) ? commbankPage = new CommBankPage(driver) : commbankPage;
	}
}

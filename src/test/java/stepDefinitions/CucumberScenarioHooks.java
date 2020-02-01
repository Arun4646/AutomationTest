package stepDefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import helper.ContextHelper;

public class CucumberScenarioHooks {

	ContextHelper contextHelper;
	String ExecutingFolderName;
	
	public CucumberScenarioHooks (ContextHelper context) {
		contextHelper = context;
	}
	
	@Before
	public void BeforeSteps(Scenario scenario) {

		String ExecutingFolderName = scenario.getName()+"_" + contextHelper.getWebDriverManager().getDriverConfigName();
		contextHelper.getScreenshotUtility().createExecutingFolder(ExecutingFolderName);
	}
	
	@After
	public void CloseBrowser() {
		
		contextHelper.getWebDriverManager().closeDriver();
	}
}

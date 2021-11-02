package stepdefs;
import org.openqa.selenium.WebDriver;

import com.auto.frmwrk.BrowserSetup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ToolsQAEleMentsUT {
	
	WebDriver toolsQAElementsUT_Driver = null;
	
	
	
	
	@Given("user launches application toolsqa in {string} browser")
	public void user_launches_application_toolsqa_in_browser(String pr_browser_Nme) {
	        System.out.println("Write code for : user_launches_application_toolsqa_in_browser");
	        toolsQAElementsUT_Driver = BrowserSetup.getInstance().initWebDriver(pr_browser_Nme);	        
	        
	}

	@When("user clicks on function elements")
	public void user_clicks_on_function_elements() {
	 System.out.println("Write code for : user clicks on function elements");
	}

	@Then("user lands on {string} page")
	public void user_lands_on_page(String string) {
	System.out.println("Write Code for : user lands on {string} page");
	}

}

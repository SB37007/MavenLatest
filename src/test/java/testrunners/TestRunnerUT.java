package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		         features = "./src/test/resources/features/bankapp/unit_testing",
		         glue =  "stepdefs",
		         tags = "@toolsqa_ut and not @high",
		         monochrome = true,		         
		         plugin = {"pretty" ,
		        		    
		        		    "html:Reports/HTML/cucumber-report.html" ,
		                    "json:Reports/JSON/cucumber.json" ,
		                    "junit:Reports/XML/cucumber.xml",
		                    "usage:Reports/USAGE/usage.json"
		                   }         
)

public class TestRunnerUT {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

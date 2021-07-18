package RunnerFile;

import org.junit.runner.RunWith;


import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@cucumber.api.CucumberOptions(
		features= {"src/test/resources/Features/LoginDemo.feature"},
		glue= {"StepDefinations"},
		monochrome = true,
		plugin= {"pretty",
				"json:target/MyReports/report.json",
                "junit:target/MyReports/report.xml",
		        "html:target/MyReports/cucumber",
		        "rerun:target/failedrerun.txt"}
		//tags= {"@smoketest"}
		        
		)

public class TestRunner {
	
	

}

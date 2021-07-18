package RunnerFile;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@cucumber.api.CucumberOptions(
		features= {"src/test/resources/HooksDemo/HooksDemo.feature"},
		glue= {"StepsFor_Hooks"},
		monochrome = true,
		plugin= {"pretty",
				"json:target/MyReports/report.json",
                "junit:target/MyReports/report.xml",
		        "html:target/MyReports/cucumber",
		        "rerun:target/failedrerun.txt"}
	       	//tags= {"@Smoke , @Regresion"} // OR Tags
		  // tags= {"@Smoke","@Regresion"} //And Tags
		 // tags= {"~@Smoke","@Regresion"}
		        
		)
public class TestRunnerfor_Hooks {

}

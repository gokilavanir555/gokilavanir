package Runner;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "src//main//java//Features",
			 glue={"StepDef"},
			 dryRun=false,
			 strict = true,
			 monochrome = true
			 			)
			
	public class RunnerClass {	
		
	
}

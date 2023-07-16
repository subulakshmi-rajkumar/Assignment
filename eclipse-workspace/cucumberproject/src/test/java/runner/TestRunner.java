package runner;
import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.junit.Cucumber;
	
//@RunWith(Cucumber.class) //Junit execution

	@CucumberOptions(
			plugin = {"pretty", "html:target/cucumbertest.html"}, //reporting purpose
			monochrome=false,  //console output color
			//tags = "@First or @Second or @Third", //tags from feature file
			tags = "@First or @Second or @Third or @Verify or @Verify1", //tags from feature file
			features = {"src/test/resources/Features"}, //location of feature files
			glue= "StepDefinition") //location of step definition files

public class TestRunner extends AbstractTestNGCucumberTests{
		
		@Override
	    @DataProvider(parallel = false)
	    public Object[][] scenarios() {
					
			return super.scenarios();
	    }
		


}

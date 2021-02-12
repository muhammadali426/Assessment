package cucumberOptions;


import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;



@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
      
        plugin = {"pretty"},
        features = "src/test/resources/features",
        glue="stepDefinitions"
)
public class TestRunner {
	
}
package pie.auto;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features="E://Adeetha//selenium//auto//src//test//resources",
		glue = { "pie.auto" }
		)

public class Runner {

}

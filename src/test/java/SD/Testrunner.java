package SD;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Feature",glue= {"SD"},
monochrome	= true,
plugin = {"pretty","html:target/htmlreport.html",
		"json:target/Jsonreport.json",
		"junit:target/htmlreport.xml"}
		)


public class Testrunner {

}

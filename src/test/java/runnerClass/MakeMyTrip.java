package runnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="./src/test/resources/makeMyTrip.feature", glue="stepDefination", dryRun = false, monochrome = true)
public class MakeMyTrip {

}

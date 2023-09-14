package runnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".\\src\\test\\resources\\login_Scenarios_BackGrounKeyword.feature", glue = "stepDefination", dryRun = false, monochrome = false)
public class RunnerClass_BackgroundKeyword {

}

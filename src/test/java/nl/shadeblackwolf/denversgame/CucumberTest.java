package nl.shadeblackwolf.denversgame;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"}, features = {"src/test/gherkin"})
public class CucumberTest {
}


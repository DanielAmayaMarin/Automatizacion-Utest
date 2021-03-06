package co.com.automation.utest.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/registro_utest.feature",
        tags = "@utest",
        glue = "co.com.automation.utest.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class RunnerTags {
}

package co.com.pruebas.automation.exito.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "co.com.pruebas.automation.exito.stepDefinitions",
        features = "src/test/resources/features/validate_discount.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class ValidateDiscount {
}

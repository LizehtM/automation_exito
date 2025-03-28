package co.com.pruebas.automation.exito.stepDefinitions;

import co.com.pruebas.automation.exito.questions.CompareValues;
import co.com.pruebas.automation.exito.tasks.SelectProduct;
import co.com.pruebas.automation.exito.utils.Url;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

import static co.com.pruebas.automation.exito.utils.Url.*;

public class ValidateDiscountStepDefinitions {

    @Given("the user opens the exito page")
    public void theUserOpensTheExitoPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(url));

    }
    @When("the user selects a product")
    public void theUserSelectsAProduct() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectProduct.selectProduct());

    }
    @Then("the user validates the discount")
    public void theUserValidatesTheDiscount() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CompareValues.compareValues()));

    }

}

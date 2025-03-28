package co.com.pruebas.automation.exito.tasks;

import co.com.pruebas.automation.exito.userinterfaces.SearchProduct;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.Keys;

public class SelectProduct implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("celulares").into(SearchProduct.INPUT_SEARCH).thenHit(Keys.ENTER),
                Click.on(SearchProduct.COOKIES),
                Click.on(SearchProduct.SELECT_PRODUCT),
                Click.on(SearchProduct.ADD_BUTTON),
                Click.on(SearchProduct.SHOPPING_CART),
                Click.on(SearchProduct.VIEW_CART));
    }

    public static SelectProduct selectProduct(){
        return Tasks.instrumented(SelectProduct.class);
    }
}


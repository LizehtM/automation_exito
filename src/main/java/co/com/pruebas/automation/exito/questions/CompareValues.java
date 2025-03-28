package co.com.pruebas.automation.exito.questions;

import co.com.pruebas.automation.exito.userinterfaces.SearchProduct;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

    public class CompareValues implements Question {
        @Override
        public Object answeredBy(Actor actor) {

            int  sub = Integer.parseInt(SearchProduct.SUBTOTAL.resolveFor(actor).getText().replace("$","").replace(".","").replace(" ",""));
            int desc = Integer.parseInt(SearchProduct.DESC_PRODUCTS.resolveFor(actor).getText().replace("$","").replace("-","").replace(".","").replace(" ",""));
            int total = sub - desc;
            String resultado = String.format("$ %,d", total);
            String totalProd = SearchProduct.TOTAL_PRODUCT.resolveFor(actor).getText();

            System.out.println(resultado);
            System.out.println(totalProd);

            return resultado.equals(totalProd);
    }

    public static CompareValues compareValues(){
        return new CompareValues();
         }

    }


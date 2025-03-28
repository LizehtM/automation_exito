package co.com.pruebas.automation.exito.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchProduct {

    public static final Target INPUT_SEARCH  = Target.the("Input search").located(By.xpath("//div/form/input[@placeholder='Buscar en exito.com']"));
    public static final Target COOKIES  = Target.the("Cookies").located(By.xpath("//div/button[text()='Acepto']"));
    public static final Target SELECT_PRODUCT  = Target.the("Select product").located(By.xpath("//div/a/div/h3[text()='Celular SAMSUNG Galaxy A35 5G 256 GB 8 GB RAM Lila']"));
    public static final Target ADD_BUTTON  = Target.the("Add button").located(By.xpath("(//div/button/span[text()='Agregar'])[7]"));
    public static final Target SHOPPING_CART  = Target.the("shopping cart").located(By.xpath("//div/button/span[text()='Carrito']"));
    public static final Target VIEW_CART  = Target.the("view cart ").located(By.xpath("//div/footer/button[text()='Ver carrito/ Ir a pagar']"));
    public static final Target SUBTOTAL  = Target.the("subtotal").located(By.xpath("//span[text()='Subtotal:']/following::span[1]"));
    public static final Target DESC_PRODUCTS  = Target.the("Desc products").located(By.xpath("//span[text()='Descuento en productos:']/following::span[1]"));
    public static final Target TOTAL  = Target.the("Total").located(By.xpath("//span[text()='Total']/following::span[1]"));
    public static final Target TOTAL_PRODUCT  = Target.the("Total product").located(By.xpath("//span[text()='SAMSUNG']/following::span[2]"));

}

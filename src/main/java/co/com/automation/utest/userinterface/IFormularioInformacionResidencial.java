package co.com.automation.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IFormularioInformacionResidencial {
    public static final Target INPUT_CIUDAD = Target.the("City").located(By.cssSelector("#city"));
    public static final Target INPUT_CODIGOPOSTAL = Target.the("Postal Code").located(By.cssSelector("#zip"));
    public static final Target BUTTON_CONTINUAR = Target.the("birth Day").located(By.cssSelector("a[role='button']"));

}

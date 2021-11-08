package co.com.automation.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IFormularioSeguridad {

    public static final Target CONTRASENA1 = Target.the("Password 1").located(By.id("password"));
    public static final Target CONTRASENA2 = Target.the("Password 2").located(By.id("confirmPassword"));
    public static final Target TERMINOS = Target.the("term").located(By.name("termOfUse"));
    public static final Target PRIVACIDAD = Target.the("privacy").located(By.name("privacySetting"));
    public static final Target TITULO = Target.the("titulo The last step").located(By.xpath("//body[1]/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/h1[1]/span[2]"));

}

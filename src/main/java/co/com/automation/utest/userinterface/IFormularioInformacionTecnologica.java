package co.com.automation.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IFormularioInformacionTecnologica {

    public static final Target COMPUTADOR = Target.the("Your Computer").located(By.xpath("//body[1]/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]"));
    public static final Target VERSION = Target.the("Version").located(By.xpath("//body[1]/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/span[1]"));
    public static final Target LENGUAJE = Target.the("Language").located(By.xpath("//body[1]/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[3]/div[2]/div[1]/div[1]/span[1]"));
    public static final Target MOVIL = Target.the("Your Mobile Device").located(By.xpath("//body[1]/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/span[1]"));
    public static final Target MODELO = Target.the("Model").located(By.xpath("//body[1]/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[2]/div[2]/div[1]/div[1]/span[1]"));
    public static final Target SISTEMA = Target.the("Operating System").located(By.xpath("//body[1]/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[3]/div[2]/div[1]/div[1]/span[1]"));
    public static final Target BUTTON_CONTINUAR = Target.the("birth Day").located(By.cssSelector("a[role='button']"));

    public static Target seleccionarOpcion(String opcion){
        return Target.the("opcion seleccionada").located(By.xpath("//div[text()='"+opcion+"']"));
    }


}

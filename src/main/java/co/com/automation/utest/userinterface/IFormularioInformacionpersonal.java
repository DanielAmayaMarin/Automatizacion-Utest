package co.com.automation.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IFormularioInformacionpersonal {

    public static final Target INPUT_NOMBRE = Target.the("first name").located(By.cssSelector("#firstName"));
    public static final Target INPUT_APELLIDO = Target.the("last name").located(By.cssSelector("#lastName"));
    public static final Target INPUT_CORREO = Target.the("email").located(By.cssSelector("#email"));
    public static final Target INPUT_MES = Target.the("birth Month").located(By.cssSelector("#birthMonth"));
    public static final Target INPUT_DIA = Target.the("birth Day").located(By.cssSelector("#birthDay"));
    public static final Target INPUT_ANO = Target.the("birth Year").located(By.cssSelector("#birthYear"));
    public static final Target INPUT_IDIOMA = Target.the("languages").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[3]/div[5]/div[2]/div[1]/input[1]"));
    public static final Target BUTTON_CONTINUAR = Target.the("birth Day").located(By.cssSelector("a[role='button']"));


}

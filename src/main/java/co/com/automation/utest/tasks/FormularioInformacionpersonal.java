package co.com.automation.utest.tasks;

import co.com.automation.utest.model.UtestFomularioModel;
import static co.com.automation.utest.userinterface.IFormularioInformacionpersonal.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

public class FormularioInformacionpersonal implements Task {

    private UtestFomularioModel datos;

    public FormularioInformacionpersonal(UtestFomularioModel datos) {
        this.datos = datos;
    }

    public static Performable informacion(UtestFomularioModel datos) {
        return Tasks.instrumented(FormularioInformacionpersonal.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(datos.getNombre()).into(INPUT_NOMBRE),
                Enter.theValue(datos.getApellido()).into(INPUT_APELLIDO),
                Enter.theValue(datos.getCorreo()).into(INPUT_CORREO),
                SelectFromOptions.byVisibleText(datos.getMesnacimiento()).from(INPUT_MES),
                SelectFromOptions.byVisibleText(datos.getDianacimiento()).from(INPUT_DIA),
                SelectFromOptions.byVisibleText(datos.getAnonacimiento()).from(INPUT_ANO),
                Enter.theValue(datos.getIdiomas()).into(INPUT_IDIOMA).thenHit(Keys.ENTER),
                Click.on(BUTTON_CONTINUAR)
        );
    }
}

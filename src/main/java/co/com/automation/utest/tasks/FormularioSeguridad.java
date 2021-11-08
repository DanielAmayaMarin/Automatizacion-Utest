package co.com.automation.utest.tasks;

import co.com.automation.utest.model.UtestFomularioModel;
import static co.com.automation.utest.userinterface.IFormularioSeguridad.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;

public class FormularioSeguridad implements Task {

    private UtestFomularioModel datos;

    public FormularioSeguridad(UtestFomularioModel datos) {
        this.datos = datos;
    }

    public static FormularioSeguridad informacion(UtestFomularioModel datos) {
        return Tasks.instrumented(FormularioSeguridad.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(datos.getContrasena()).into(CONTRASENA1),
                Enter.theValue(datos.getContrasena()).into(CONTRASENA2),
                Check.whether(datos.isTerminos()).andIfSo(Click.on(TERMINOS)),
                Check.whether(datos.isPrivacidad()).andIfSo(Click.on(PRIVACIDAD))
        );
    }
}

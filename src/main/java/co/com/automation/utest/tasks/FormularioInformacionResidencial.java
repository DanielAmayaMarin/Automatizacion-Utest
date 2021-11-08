package co.com.automation.utest.tasks;

import co.com.automation.utest.interactions.Esperar;
import co.com.automation.utest.model.UtestFomularioModel;
import static co.com.automation.utest.userinterface.IFormularioInformacionResidencial.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class FormularioInformacionResidencial implements Task {

    private UtestFomularioModel datos;

    public FormularioInformacionResidencial(UtestFomularioModel datos) {
        this.datos = datos;
    }

    public static FormularioInformacionResidencial informacion(UtestFomularioModel datos) {
        return Tasks.instrumented(FormularioInformacionResidencial.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                Esperar.milisegundos(1000),
                Enter.theValue(datos.getCiudad()).into(INPUT_CIUDAD),
                Enter.theValue(datos.getPostal()).into(INPUT_CODIGOPOSTAL),
                Click.on(BUTTON_CONTINUAR)

        );
    }
}

package co.com.automation.utest.tasks;

import co.com.automation.utest.model.UtestFomularioModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class RegistrarFormulario implements Task {

    private UtestFomularioModel datos;

    public RegistrarFormulario(UtestFomularioModel datos) {
        this.datos = datos;
    }

    public static RegistrarFormulario informacion(UtestFomularioModel datos) {
        return Tasks.instrumented(RegistrarFormulario.class, datos) ;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                FormularioInformacionpersonal.informacion(datos),
                FormularioInformacionResidencial.informacion(datos),
                FormularioInformacionTecnologica.informacion(datos),
                FormularioSeguridad.informacion(datos)
        );
    }
}

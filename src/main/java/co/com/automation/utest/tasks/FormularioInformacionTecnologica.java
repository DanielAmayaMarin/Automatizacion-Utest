package co.com.automation.utest.tasks;

import co.com.automation.utest.interactions.Esperar;
import co.com.automation.utest.model.UtestFomularioModel;
import static co.com.automation.utest.userinterface.IFormularioInformacionTecnologica.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;


public class FormularioInformacionTecnologica implements Task {

    private UtestFomularioModel datos;

    public FormularioInformacionTecnologica(UtestFomularioModel datos) {
        this.datos = datos;
    }

    public static FormularioInformacionTecnologica informacion(UtestFomularioModel datos) {
        return Tasks.instrumented(FormularioInformacionTecnologica.class,datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Esperar.milisegundos(1000),
                Click.on(COMPUTADOR),
                Click.on(seleccionarOpcion(datos.getComputador())),
                Click.on(VERSION),
                Click.on(seleccionarOpcion(datos.getVersion())),
                Click.on(LENGUAJE),
                Click.on(seleccionarOpcion(datos.getLenguaje())),
                Click.on(MOVIL),
                Click.on(seleccionarOpcion(datos.getMovil())),
                Click.on(MODELO),
                Click.on(seleccionarOpcion(datos.getModelo())),
                Click.on(SISTEMA),
                Click.on(seleccionarOpcion(datos.getSistema())),
               Click.on(BUTTON_CONTINUAR)


        );
    }
}

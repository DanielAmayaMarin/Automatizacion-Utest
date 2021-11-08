package co.com.automation.utest.tasks;

import co.com.automation.utest.userinterface.UtestPagina;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AbrirFormulario implements Task {

    public static Performable formularioInscripcion() {
        return Tasks.instrumented(AbrirFormulario.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UtestPagina.BOTTON_REGISTRO)
        );
    }
}

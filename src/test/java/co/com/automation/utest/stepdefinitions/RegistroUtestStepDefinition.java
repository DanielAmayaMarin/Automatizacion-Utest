package co.com.automation.utest.stepdefinitions;

import co.com.automation.utest.model.UtestFomularioModel;
import co.com.automation.utest.tasks.AbrirPagina;
import co.com.automation.utest.tasks.AbrirFormulario;
import co.com.automation.utest.tasks.RegistrarFormulario;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static co.com.automation.utest.questions.RegistroFormularioQuestion.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegistroUtestStepDefinition {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que (.*) esta en el formulario de inscripcion$")
    public void que_Daniel_esta_en_el_formulario_de_inscripcion(String daniel) throws Exception {
        theActorCalled(daniel).wasAbleTo(
                AbrirPagina.pagina(),
                AbrirFormulario.formularioInscripcion()
        );
    }


    @Cuando("^rellene todos los pasos del registro$")
    public void rellene_todos_los_pasos_del_registro() throws Exception {
        UtestFomularioModel datosFormulario = new UtestFomularioModel();
        theActorInTheSpotlight().attemptsTo(
            RegistrarFormulario.informacion(datosFormulario)
        );
    }

    @Entonces("^valida el titulo que sea igual a (.*)$")
    public void valida_el_titulo_que_sea_igual_a_The_last_step(String titulo) {
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(validacion(titulo))
        );

    }





}

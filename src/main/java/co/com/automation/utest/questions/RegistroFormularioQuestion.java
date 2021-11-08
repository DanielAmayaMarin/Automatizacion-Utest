package co.com.automation.utest.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.automation.utest.userinterface.IFormularioSeguridad.*;

public class RegistroFormularioQuestion implements Question<Boolean> {

    private String question;

    public RegistroFormularioQuestion(String question) {
        this.question = question;
    }

    public static RegistroFormularioQuestion validacion(String question){
        return new RegistroFormularioQuestion(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String title = Text.of(TITULO).viewedBy(actor).asString();
        return question.equals(title);
    }
}

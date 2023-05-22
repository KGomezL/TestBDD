package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterfaces.GoogleTraductor.RESULTADO;

public class ValidateResult implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return RESULTADO.resolveFor(actor).getText().equals("welcome");
    }

    public static ValidateResult isCorrect() {
        return new ValidateResult();
    }
}

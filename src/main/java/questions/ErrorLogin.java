package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterfaces.GoogleTraductor.RESULTADO;
import static userinterfaces.uTest.ERROR;

public class ErrorLogin implements Question<Boolean> {

    public String TEXT1 = "Invalid username or password.";

    @Override
    public Boolean answeredBy(Actor actor) {

        return ERROR.resolveFor(actor).getText().equals(TEXT1);
    }

    public static ErrorLogin errorLogin() {
        return new ErrorLogin();
    }
}
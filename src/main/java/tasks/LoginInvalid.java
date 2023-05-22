package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.uTest.EMAIL;
import static userinterfaces.uTest.PASSWORD;

public class LoginInvalid implements Task {

    public String TXT_EMAIL = "tucorreo.com";
    public String TXT_PASS = "ASDASFADSF";

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(TXT_EMAIL).into(EMAIL),
                Enter.theValue(TXT_PASS).into(PASSWORD)
        );
    }

    public static LoginInvalid loginInvalid() {
        return instrumented(LoginInvalid.class);
    }
}
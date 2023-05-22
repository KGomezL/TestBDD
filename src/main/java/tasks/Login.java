package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.uTest.EMAIL;
import static userinterfaces.uTest.PASSWORD;

public class Login implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(EMAIL),
                Click.on(PASSWORD)
        );
    }

    public static Login login() {
        return instrumented(Login.class);
    }
}
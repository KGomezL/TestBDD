package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.GoogleTraductor.CAMPO_DE_TEXTO;
import static userinterfaces.GoogleTraductor.INGLES;

public class Traducir implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //Click.on(CAMPO_DE_TEXTO),
                Enter.theValue("Bienvenido").into(CAMPO_DE_TEXTO),
                Click.on(INGLES)
        );
    }

    public static Traducir bienvenido() {
        return instrumented(Traducir.class);
    }
}
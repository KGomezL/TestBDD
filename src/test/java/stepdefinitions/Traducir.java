package stepdefinitions;


import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.ValidateResult;

import java.io.IOException;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static tasks.Traducir.bienvenido;

public class Traducir {

    @Before
    public void preparation() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("que ingrese a la url de Google Traductor")
    public void queIngreseALaUrlDeGoogleTraductor() {
        theActorCalled("Usuario")
                .wasAbleTo(Open.url("https://translate.google.com/?hl=es"));
    }

    @When("introduzca la palabra bienvenido en el campo de texto")
    public void introduzcaLaPalabraBienvenidoEnElCampoDeTexto() {
        theActorInTheSpotlight().attemptsTo(
                bienvenido()
        );
    }

    @Then("deberia ver la palabra welcome en la salida")
    public void deberiaVerLaPalabraWelcomeEnLaSalida() {
        theActorInTheSpotlight().should(
                seeThat(ValidateResult.isCorrect()));
    }
}
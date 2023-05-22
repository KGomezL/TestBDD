package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.io.IOException;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static questions.ErrorLogin.errorLogin;
import static tasks.IniciarSesion.boton;
import static tasks.Login.login;
import static tasks.LoginInvalid.loginInvalid;

public class Login {
    @Before
    public void preparation() throws IOException {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Usuario")
                .wasAbleTo(Open.url("https://prod-auth.cloud.utest.com/auth/realms/applause/protocol/openid-connect/auth/?client_id=utestv2&redirect_uri=https%3A%2F%2Fwww.utest.com%2Foauth-login%2F&response_type=code"));
    }

    @When("deje los campos vacios o en blanco")
    public void deje_los_campos_vacios_o_en_blanco() {
        theActorInTheSpotlight().attemptsTo(
                login()
        );
    }

    @And("de clic en el boton Sign in")
    public void de_clic_en_el_boton_sign_in() {
        theActorInTheSpotlight().attemptsTo(
                boton()
        );
    }

    @Then("debo ver un mensaje de error")
    public void debo_ver_un_mensaje_de_error() {
        theActorInTheSpotlight().should(
                seeThat(errorLogin()));
    }

    @When("introduzca credenciales invalidas")
    public void introduzca_credenciales_invalidas() {
        theActorInTheSpotlight().attemptsTo(
                loginInvalid()
        );
    }
}
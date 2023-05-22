package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

import java.net.URL;

import static org.openqa.selenium.By.xpath;

public class uTest {
    public static final Target BOTON_LOGIN = Target.the("Boton login").
            located(xpath("//a[@class='unauthenticated-nav-bar__link']"));
    public static final Target EMAIL = Target.the("Campo de texto para correo").
            located(xpath("//input[@id='username']"));
    public static final Target PASSWORD = Target.the("Campo de texto para contraseña").
            located(xpath("//input[@id='password']"));

    public static final Target BOTON_SIGN_IN = Target.the("Boton para iniciar sesión").
            located(xpath("//button[@name='login']"));

    public static final Target ERROR = Target.the("Mensaje de error").
            located(xpath("//span[contains(text(),'Invalid username or password.')]"));

    public static final Target OLVIDO_PASSWORD = Target.the("Olvidaste contraseña?").
            located(xpath("//a[contains(text(),'Forgot Password?')]"));

    public static final Target EMAIL_RECUP = Target.the("Email para recuperar contraseña").
            located(xpath("//input[@id='username']"));

    public static final Target BOTON_RESET_PASS = Target.the("Boton de recuperar contraseña").
            located(xpath("//button[contains(text(),'Reset password')]"));

    public static final Target MSJ_ERROR = Target.the("Mensaje de error inesperado").
            located(xpath("//div[contains(text(),'We are sorry...')]"));
}
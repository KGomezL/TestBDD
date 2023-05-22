package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;


public class GoogleTraductor {
    public static final Target CAMPO_DE_TEXTO = Target.the("Campo de texto").
            located(xpath("//textarea[@class='er8xn']"));
    public static final Target RESULTADO = Target.the("Resultado traducción").
            located(xpath("//span[@class='ryNqvb']"));
    public static final Target INGLES = Target.the("Botón para cambiar el idioma a Ingles").
            located(xpath("(//button[@jscontroller='t1sulf'])[6]"));
}

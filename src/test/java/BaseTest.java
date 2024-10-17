import Utils.RestClient;
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {

    @BeforeAll
    public static void setup() {
        // Настройка базового URL
        RestAssured.useRelaxedHTTPSValidation(); // Отключить проверку SSL
        RestAssured.baseURI = "https://seller-loans-ingress-controller.seller-loans.k8s.stage-xc/bank-statements-processor";

    }
}

import TestData.PaymentPurpose;
import TestData.StatementTestDataGenerator;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Main {
    public static void main(String[] args) {

        /*   RestAssured.useRelaxedHTTPSValidation(); // Отключить проверку SSL

        RestAssured.baseURI = "https://seller-loans-ingress-controller.seller-loans.k8s.stage-xc";
        String json1 = StatementTestDataGenerator.updateStatement(PaymentPurpose.BANK_COMISSION.getPaymentPurpose());

        System.out.println(json1);


        Response response = given()
                .header("Content-Type", "application/json")
                .body(json1)
                .when()
                .post("/bank-statements-processor/v1/statements")
                .then()
                .extract()
                .response();

        System.out.println(response);

        int statusCode = response.getStatusCode();
        System.out.println(statusCode);

         */
    }
}



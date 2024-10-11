package Utils;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class RestClient {
    public final String BASE_URL ="https://seller-loans-ingress-controller.seller-loans.k8s.stage-xc/bank-statements-processor";
    //Базовая спецификация для всех запросов
    //Content-type всегда application/json
    //URL всегда BASE_URL
    protected RequestSpecification getBaseSpec(){
        return new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .setBaseUri(BASE_URL)
                .build();
    }
}

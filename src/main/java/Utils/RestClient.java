package Utils;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class RestClient {
    public static final String BASE_URL ="https://seller-loans-ingress-controller.seller-loans.k8s.stage-xc/bank-statements-processor";

    //Метод отправки POST-запроса
    public Response sendPostRequest(String contentTypeKey, String contentTypeValue, String body, String url){
    return (Response) given()
            .header(contentTypeKey, contentTypeValue)
            .and()
            .body(body)
            .when()
            .post(url);
    }

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

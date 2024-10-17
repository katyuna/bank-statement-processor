import TestData.PaymentPurpose;
import TestData.StatementTestDataGenerator;
import Utils.RestClient;
import io.restassured.response.Response;
import org.junit.Test;

import static Utils.RestClient.BASE_URL;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreateStatementsStatusCodeTest extends BaseTest{

    public final String STATEMENT_PATH = BASE_URL + "/v1/statements";
    @Test
    public void testCreateStatement(){
        String json1 = StatementTestDataGenerator.updateStatement(PaymentPurpose.BANK_COMISSION.getPaymentPurpose());
        RestClient restClient = new RestClient();
        Response response = restClient.sendPostRequest("Content-Type", "application/json", json1,STATEMENT_PATH);

        // Проверка, что статус код ответа равен 200
        int statusCode = response.getStatusCode();
        assertEquals(200, statusCode, "Статус код ответа должен быть 200");

    }








    //для каждого PaymentPurpose отправить запрос на создание выписки
    //при этом каждый раз сохранить operationId
    //и проверить что код 200

























    /* Метод для отправки запросов с разными paymentDescription
    public void sendRequestsForAllPaymentPurposes() {
        for (PaymentPurpose purpose : PaymentPurpose.values()) {
            String updatedJson = testDataGenerator.updateStatement(purpose.getPaymentPurpose());
            sendStatementCreatorRequest("/bank-statements-processor/v1/statements", updatedJson);
        }
    }

     */


}

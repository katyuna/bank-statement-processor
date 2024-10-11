package Requests;

import TestData.SratementTestDataGenerator;

public class StatementCreatorRequest {
    ///bank-statements-processor/v1/statements
    SratementTestDataGenerator testDataGenerator = new SratementTestDataGenerator();
    String requestJson = testDataGenerator.updateStatement();

    public String getRequestJson() {
        return requestJson;
    }

public void sendStatementCreatorRequest(String url, String body){

}


        //Пополнение баланса заемщика НДС не облагается


    }

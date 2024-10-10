package Requests;

import Utils.SratementTestDataGenerator;

public class StatementCreator {
    ///bank-statements-processor/v1/statements
    SratementTestDataGenerator testDataGenerator = new SratementTestDataGenerator();
    String requestJson = testDataGenerator.updateStatement();

    public String getRequestJson() {
        return requestJson;
    }

    public void printStatement(String str){
        System.out.println(str);


        //Пополнение баланса заемщика НДС не облагается


    }

}

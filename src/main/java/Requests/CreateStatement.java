package Requests;

import Utils.SratementTestDataGenerator;

public class CreateStatement {
    ///bank-statements-processor/v1/statements
    SratementTestDataGenerator testDataGenerator = new SratementTestDataGenerator();
    String requestJson = testDataGenerator.updateStatement();

}

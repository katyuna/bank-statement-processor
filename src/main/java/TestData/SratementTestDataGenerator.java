package TestData;

import Utils.PojoJsonParser;
import com.google.gson.Gson;
import models.Operation;
import models.Statement;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SratementTestDataGenerator {

        String json ="\n" +
            "  {\n" +
            "    \"sourceId\": 2,\n" +
            "    \"statementId\": 676281,\n" +
            "    \"statementBankAccount\": \"40701810400000008890\",\n" +
            "    \"statementCreateDt\": \"2024-09-17T00:19:10.52853Z\",\n" +
            "    \"sinceDate\": \"2024-09-17T03:00:00Z\",\n" +
            "    \"untilDate\": \"2024-09-17T03:00:00Z\",\n" +
            "    \"saldoIn\": 14997716.9,\n" +
            "    \"incomeSum\": 324,\n" +
            "    \"outcomeSum\": 0,\n" +
            "    \"saldoOut\": 14998040.9,\n" +
            "    \"operations\": [\n" +
            "      {\n" +
            "        \"operationId\": 187984281,\n" +
            "        \"isDeleted\": false,\n" +
            "        \"docNumber\": 323281,\n" +
            "        \"docDate\": \"2024-09-17T00:19:10.585307\",\n" +
            "        \"docTypeId\": 1,\n" +
            "        \"transactionDate\": \"2024-09-17\",\n" +
            "        \"expenseTypeId\": 2,\n" +
            "        \"docAmount\": 75001,\n" +
            "        \"companyInn\": \"383701469780\",\n" +
            "        \"companyBankBik\": \"042202603\",\n" +
            "        \"companyKpp\": null,\n" +
            "        \"companyBankAccount\": \"40701810400000008890\",\n" +
            "        \"companyBankCorsAccount\": \"30101810900000000603\",\n" +
            "        \"companyName\": \"ПАО СБЕРБАНК//Дождикова Светлана Алексеевна//1907484764653//356137, РОССИЯ, СТАВРОПОЛЬСКИЙ КРАЙ, ИЗОБИЛЬНЕНСКИЙ Р-Н, С МОСКОВСКОЕ, УЛ ГАГАРИНА, Д 13//\",\n" +
            "        \"companyBankName\": \"ВОЛГО-ВЯТСКИЙ БАНК ПАО СБЕРБАНК\",\n" +
            "        \"recipientInn\": \"383701469780\",\n" +
            "        \"recipientBankBik\": \"044525974\",\n" +
            "        \"recipientKpp\": null,\n" +
            "        \"recipientBankAccount\": \"40701810400000008890\",\n" +
            "        \"recipientBankCorsAccount\": \"30101810145250000974\",\n" +
            "        \"recipientName\": \"ООО МКК ВБ Финанс\",\n" +
            "        \"recipientBankName\": \"АО \\\"ТБАНК\\\"\",\n" +
            "        \"paymentDescription\": \"Комиссия банка\"\n" +
            "      }\n" +
            "    ]\n" +
            "  }\n";

    public String updateStatement(){
        Statement statement = PojoJsonParser.parseToPojo (json);

        int currentStatementId = statement.getStatementId();
        int currentOperationId = statement.getOperations().get(0).getOperationId();
        int currentDocNumber = statement.getOperations().get(0).getDocNumber();

       statement.setStatementId(++currentStatementId); // Обновляем StatementId

        for (Operation operation : statement.getOperations()) {
            operation.setOperationId(++currentOperationId);  // Обновляем OperationId
            operation.setDocNumber(++currentDocNumber);        // Обновляем Number
        }

        // Устанавливаем текущее время в формате ISO-8601
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSSSS'Z'");
        String currentDateTime = LocalDateTime.now().format(formatter);
        statement.setStatementCreateDt(currentDateTime);
        statement.setSinceDate(currentDateTime);
        statement.setUntilDate(currentDateTime);

        // Устанавливаем формат YYYYMMDD для docDate
        DateTimeFormatter docDateFormatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        String currentDateDoc = LocalDateTime.now().format(docDateFormatter);

        // Устанавливаем дату для transactionDate в operations
        for (Operation operation : statement.getOperations()) {
            operation.setTransactionDate(currentDateTime);  // Обновляем transactionDate
            operation.setDocDate(currentDateDoc);        // Обновляем docDate
        }

        // Convert updated statement back to JSON
        Gson gson = new Gson();
        return gson.toJson(statement);
    }
}

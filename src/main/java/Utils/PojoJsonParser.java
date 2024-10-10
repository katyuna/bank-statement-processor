package Utils;

import com.google.gson.Gson;
import models.Statement;

public class PojoJsonParser {

    public static Statement parseToPojo(String json){
        Gson gson = new Gson();
        Statement statement = gson.fromJson(json, Statement.class);
        return statement;
    };
    public String parseToJson(Statement statement) {
        Gson gson = new Gson();
        String jsonString = gson.toJson(statement);
        return jsonString;
    }
}

import Requests.StatementCreatorRequest;

public class Main {
    public static void main(String[] args) {

        StatementCreatorRequest statementCreator = new StatementCreatorRequest();
        System.out.println(statementCreator.getRequestJson());

        }
    }



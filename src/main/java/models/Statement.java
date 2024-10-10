package models;

import java.util.ArrayList;

public class Statement {
    public int sourceId;
    public int statementId;
    public String statementBankAccount;
    public String statementCreateDt;
    public String sinceDate;
    public String untilDate;
    public double saldoIn;
    public int incomeSum;
    public int outcomeSum;
    public double saldoOut;
    public ArrayList<Operation> operations;

    public int getStatementId() {
        return statementId;
    }

    public String getStatementCreateDt() {
        return statementCreateDt;
    }

    public String getSinceDate() {
        return sinceDate;
    }

    public String getUntilDate() {
        return untilDate;
    }

    public void setStatementId(int statementId) {
        this.statementId = statementId;
    }

    public void setStatementCreateDt(String statementCreateDt) {
        this.statementCreateDt = statementCreateDt;
    }

    public void setSinceDate(String sinceDate) {
        this.sinceDate = sinceDate;
    }

    public void setUntilDate(String untilDate) {
        this.untilDate = untilDate;
    }

    public ArrayList<Operation> getOperations() {
        return operations;
    }

    @Override
    public String toString() {
        return "Statement{" +
                "sourceId=" + sourceId +
                ", statementId=" + statementId +
                ", statementBankAccount='" + statementBankAccount + '\'' +
                ", statementCreateDt=" + statementCreateDt +
                ", sinceDate=" + sinceDate +
                ", untilDate=" + untilDate +
                ", saldoIn=" + saldoIn +
                ", incomeSum=" + incomeSum +
                ", outcomeSum=" + outcomeSum +
                ", saldoOut=" + saldoOut +
                ", operations=" + operations +
                '}';
    }
}

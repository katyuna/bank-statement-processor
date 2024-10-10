package models;

public class Operation {
    public int operationId;
    public boolean isDeleted;
    public int docNumber;
    public String docDate;
    public int docTypeId;
    public String transactionDate;
    public int expenseTypeId;
    public int docAmount;
    public String companyInn;
    public String companyBankBik;
    public Object companyKpp;
    public String companyBankAccount;
    public String companyBankCorsAccount;
    public String companyName;
    public String companyBankName;
    public String recipientInn;
    public String recipientBankBik;
    public Object recipientKpp;
    public String recipientBankAccount;
    public String recipientBankCorsAccount;
    public String recipientName;
    public String recipientBankName;
    public String paymentDescription;

    public int getOperationId() {
        return operationId;
    }

    public int getDocNumber() {
        return docNumber;
    }

    public String getDocDate() {
        return docDate;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setOperationId(int operationId) {
        this.operationId = operationId;
    }

    public void setDocNumber(int docNumber) {
        this.docNumber = docNumber;
    }

    public void setDocDate(String docDate) {
        this.docDate = docDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }


    @Override
    public String toString() {
        return "Operation{" +
                "operationId=" + operationId +
                ", isDeleted=" + isDeleted +
                ", docNumber=" + docNumber +
                ", docDate=" + docDate +
                ", docTypeId=" + docTypeId +
                ", transactionDate='" + transactionDate + '\'' +
                ", expenseTypeId=" + expenseTypeId +
                ", docAmount=" + docAmount +
                ", companyInn='" + companyInn + '\'' +
                ", companyBankBik='" + companyBankBik + '\'' +
                ", companyKpp=" + companyKpp +
                ", companyBankAccount='" + companyBankAccount + '\'' +
                ", companyBankCorsAccount='" + companyBankCorsAccount + '\'' +
                ", companyName='" + companyName + '\'' +
                ", companyBankName='" + companyBankName + '\'' +
                ", recipientInn='" + recipientInn + '\'' +
                ", recipientBankBik='" + recipientBankBik + '\'' +
                ", recipientKpp=" + recipientKpp +
                ", recipientBankAccount='" + recipientBankAccount + '\'' +
                ", recipientBankCorsAccount='" + recipientBankCorsAccount + '\'' +
                ", recipientName='" + recipientName + '\'' +
                ", recipientBankName='" + recipientBankName + '\'' +
                ", paymentDescription='" + paymentDescription + '\'' +
                '}';
    }
}

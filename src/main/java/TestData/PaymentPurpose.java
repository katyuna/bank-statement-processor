package TestData;

public enum PaymentPurpose {
    REPLRNISHMENT_BORROWERS_BALANCE("Пополнение  баланса заемщика НДС не облагается\n"),
    BANK_COMISSION("Комиссия банка"),
    RECEIPT_OF_ISSUED_LOANS("Поступление по займам выданным");

    private final String description;

    //Конструктор и геттер, которые позволяют получить строковое значение
    PaymentPurpose(String description) {
        this.description = description;
    }
    public String getPaymentPurpose() {
        return description;
    }
}

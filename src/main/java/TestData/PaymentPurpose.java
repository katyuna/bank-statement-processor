package TestData;

public enum PaymentPurpose {
    REPLRNISHMENT_BORROWERS_BALANCE("Пополнение  баланса заемщика НДС не облагается\n"),
    USER("Комиссия банка"),
    GUEST("Поступление по займам выданным");


    private final String description;

    //Конструктор и геттеh, которые позволяют получить строковое значение
    PaymentPurpose(String description) {
        this.description = description;
    }
    public String getPaymentPurpose() {
        return description;
    }
}

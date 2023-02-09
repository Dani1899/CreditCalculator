public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int amountOfCredit = 1_000_000;//Сумма кредита
        double yearInterestRate = 9.99;//Годовая процентная ставка
        int amountOfMonths = 12;//Количество месяцев
        int amountOfMonths2 = 24;//Количество месяцев
        int amountOfMonths3 = 36;//Количество месяцев
        double annuityPayment = service.calculate(1_000_000, 9.99, 12);
        double annuityPayment2 = service.calculate(1_000_000, 9.99, 24);
        double annuityPayment3 = service.calculate(1_000_000, 9.99, 36);
        System.out.println("Ежемесячный платёж:" + annuityPayment + " ₽");
        System.out.println("Ежемесячный платёж:" + annuityPayment2 + " ₽");
        System.out.println("Ежемесячный платёж:" + annuityPayment3 + " ₽");
    }
}
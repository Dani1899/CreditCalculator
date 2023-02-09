public class CreditPaymentService {
    public double calculate(int amountOfCredit, double yearInterestRate, int amountOfMonths) {
        double monthInterestRate = yearInterestRate / (100 * 12);
        return amountOfCredit * ((monthInterestRate * Math.pow(1 + monthInterestRate, amountOfMonths)) / (Math.pow(1 + monthInterestRate, amountOfMonths) - 1));
    }
}
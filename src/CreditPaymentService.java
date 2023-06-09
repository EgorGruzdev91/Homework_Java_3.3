public class CreditPaymentService {
    public int calculate (int loanAmount, int periodInYear, double procent) {
        double procentMounth = procent / 12 / 100;
        int periodMounth = periodInYear * 12;
        double payment = loanAmount * procentMounth * Math.pow(1 + procentMounth, periodMounth) / ( Math.pow(1 + procentMounth, periodMounth) - 1);
        return (int) payment;
    }
}

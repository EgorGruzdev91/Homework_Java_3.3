public class CreditPaymentService {
    public int calculate (int loan_amount, int period_in_year, double procent) {
        double procent_mounth = procent / 12 / 100;
        int period_mounth = period_in_year * 12;
        double payment = loan_amount * procent_mounth * Math.pow(1 + procent_mounth, period_mounth) / ( Math.pow(1 + procent_mounth, period_mounth) - 1);
        return (int) payment;
    }
}

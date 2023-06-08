import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
// Первый расчет
        int loan_amount = 1_000_000; //изменяется в заявке
        int period_in_year = 1; //изменяется в заявке
        double procent = 9.99; // для расчета
        int payment = service.calculate(loan_amount, period_in_year, procent);
        System.out.println("Сумма кредита: " + loan_amount + " руб.");
        System.out.println("Срок кредита: " + period_in_year + " год(а)/лет");
        System.out.println("Ваш ежемесячный платеж составит " + payment + " руб.");
        System.out.println("Процентная ставка: " + procent + "%");
        System.out.println("");

// Второй расчет
        loan_amount = 1_000_000; //изменяется в заявке
        period_in_year = 2; //изменяется в заявке
        procent = 9.99; // для расчета
        payment = service.calculate(loan_amount, period_in_year, procent);
        System.out.println("Сумма кредита: " + loan_amount + " руб.");
        System.out.println("Срок кредита: " + period_in_year + " год(а)/лет");
        System.out.println("Ваш ежемесячный платеж составит " + payment + " руб.");
        System.out.println("Процентная ставка: " + procent + "%");
        System.out.println("");

//Третий расчет
        loan_amount = 1_000_000; //изменяется в заявке
        period_in_year = 3; //изменяется в заявке
        procent = 9.99; // для расчета
        payment = service.calculate(loan_amount, period_in_year, procent);
        System.out.println("Сумма кредита: " + loan_amount + " руб.");
        System.out.println("Срок кредита: " + period_in_year + " год(а)/лет");
        System.out.println("Ваш ежемесячный платеж составит " + payment + " руб.");
        System.out.println("Процентная ставка: " + procent + "%");
    }
    }
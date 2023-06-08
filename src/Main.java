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
        int loan_amount2 = 1_000_000; //изменяется в заявке
        int period_in_year2 = 2; //изменяется в заявке
        double procent2 = 9.99; // для расчета
        int payment2 = service.calculate(loan_amount2, period_in_year2, procent2);
        System.out.println("Сумма кредита: " + loan_amount2 + " руб.");
        System.out.println("Срок кредита: " + period_in_year2 + " год(а)/лет");
        System.out.println("Ваш ежемесячный платеж составит " + payment2 + " руб.");
        System.out.println("Процентная ставка: " + procent2 + "%");
        System.out.println("");

//Третий расчет
        int loan_amount3 = 1_000_000; //изменяется в заявке
        int period_in_year3 = 3; //изменяется в заявке
        double procent3 = 9.99; // для расчета
        int payment3 = service.calculate(loan_amount3, period_in_year3, procent3);
        System.out.println("Сумма кредита: " + loan_amount3 + " руб.");
        System.out.println("Срок кредита: " + period_in_year3 + " год(а)/лет");
        System.out.println("Ваш ежемесячный платеж составит " + payment3 + " руб.");
        System.out.println("Процентная ставка: " + procent3 + "%");
    }
    }
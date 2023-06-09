import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
// Первый расчет
        int loanAmount = 1_000_000; //изменяется в заявке
        int periodInYear = 1; //изменяется в заявке
        double procent = 9.99; // для расчета
        int payment = service.calculate(loanAmount, periodInYear, procent);
        System.out.println("Сумма кредита: " + loanAmount + " руб.");
        System.out.println("Срок кредита: " + periodInYear + " год(а)/лет");
        System.out.println("Ваш ежемесячный платеж составит " + payment + " руб.");
        System.out.println("Процентная ставка: " + procent + "%");
        System.out.println("");

// Второй расчет
        loanAmount = 1_000_000; //изменяется в заявке
        periodInYear = 2; //изменяется в заявке
        procent = 9.99; // для расчета
        payment = service.calculate(loanAmount, periodInYear, procent);
        System.out.println("Сумма кредита: " + loanAmount + " руб.");
        System.out.println("Срок кредита: " + periodInYear + " год(а)/лет");
        System.out.println("Ваш ежемесячный платеж составит " + payment + " руб.");
        System.out.println("Процентная ставка: " + procent + "%");
        System.out.println("");

//Третий расчет
        loanAmount = 1_000_000; //изменяется в заявке
        periodInYear = 3; //изменяется в заявке
        procent = 9.99; // для расчета
        payment = service.calculate(loanAmount, periodInYear, procent);
        System.out.println("Сумма кредита: " + loanAmount + " руб.");
        System.out.println("Срок кредита: " + periodInYear + " год(а)/лет");
        System.out.println("Ваш ежемесячный платеж составит " + payment + " руб.");
        System.out.println("Процентная ставка: " + procent + "%");
    }
    }
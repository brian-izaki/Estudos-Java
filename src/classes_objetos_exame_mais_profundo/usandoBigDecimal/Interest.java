package classes_objetos_exame_mais_profundo.usandoBigDecimal;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class Interest {
    public static void main(String[] args) {
        BigDecimal principal = BigDecimal.valueOf(1000.0);
        BigDecimal rate = BigDecimal.valueOf(0.05);

        System.out.printf("%s%20s\n", "Year", "Amount on deposit");

        for(int year = 1; year <= 10; year++){
            BigDecimal amount = principal.multiply(rate.add(BigDecimal.ONE).pow(year));

            System.out.printf("%4d%20s\n", year, NumberFormat.getCurrencyInstance().format(amount));
        }

        System.out.println();
        System.out.println("valores aritméticos");
        try{
            BigDecimal n1 = BigDecimal.valueOf(3);
            BigDecimal n2 = BigDecimal.ONE;

            System.out.printf("\n%.1f", n2.divide(n1));
        } catch(ArithmeticException e) {
            System.out.printf("\n%s", e);
        }
    }
}

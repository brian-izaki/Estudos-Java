package tratamento_de_excecao.divisao_por_zero;

import java.util.Scanner;

public class DivideByZeroNoExceptionHandling {

    public static int quotient(int numerator, int denominator) {
        return numerator / denominator; // chances de haver divisão por zero.
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite um numerador inteiro:");
        int numerator = scanner.nextInt();
        System.out.println("Por favor, digite um inteiro denominador");
        int denominator = scanner.nextInt();

        int result = quotient(numerator, denominator);
        System.out.printf("\nResult: %d / %d = %d\n", numerator, denominator, result);
    }
}

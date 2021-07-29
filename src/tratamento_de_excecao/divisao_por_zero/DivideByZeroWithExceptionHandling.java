package tratamento_de_excecao.divisao_por_zero;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroWithExceptionHandling {

    public static int quotient(int numerator, int denominator) throws ArithmeticException {
        return numerator / denominator; // chances de haver divisão por zero.
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;

        do {
            try {
                System.out.print("Por favor, digite um numerador inteiro: ");
                int numerator = scanner.nextInt();
                System.out.print("Por favor, digite um inteiro denominador: ");
                int denominator = scanner.nextInt();

                int result = quotient(numerator, denominator);
                System.out.printf("\nResult: %d / %d = %d\n", numerator, denominator, result);
                continueLoop = false;
            } catch (InputMismatchException inputMismatchException) {
                System.err.printf("\nExceção: %s\n", inputMismatchException);
                scanner.nextLine(); // descarta entrada para usuário tentar novamente.
                System.out.println("Você deve digitar números inteiros. Por favor, tente novamente.\n\n");
            } catch (ArithmeticException arithmeticException) {
                System.err.printf("\nExceção %s\n", arithmeticException);
                System.out.println("\nZero é um denominador inválido. Tente novamente.\n");
            }
        } while (continueLoop);
    }
}

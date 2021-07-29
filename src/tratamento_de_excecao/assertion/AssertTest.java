package tratamento_de_excecao.assertion;

import java.util.Scanner;

public class AssertTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero entre 0 e 10: ");
        int number = input.nextInt();

        // para  que o assert funcione é necessário passar o parâmetro -ea no comando de execução
        assert (number >= 0 && number <= 10) : "número errado: " + number;

        System.out.printf("Você digitou: %d\n", number);
    }
}

package entradaSaida.entradaDeDados;

import java.util.Scanner;

public class Comparison {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int number1;
		int number2;

		System.out.print("Digite o primeiro numero: ");
		number1 = input.nextInt(); // faz leitura do numero digitado pelo usuario

		System.out.print("Digite o segundo numero: ");
		number2 = input.nextInt();

		if (number1 == number2)
			System.out.printf("%d � igual a %d\n", number1, number2);

		if (number1 != number2)
			System.out.printf("%d � diferente a %d\n", number1, number2);

		if (number1 < number2)
			System.out.printf("%d � menor a %d\n", number1, number2);

		if (number1 > number2)
			System.out.printf("%d � maior a %d\n", number1, number2);

		if (number1 <= number2)
			System.out.printf("%d � menor ou igual a %d\n", number1, number2);

		if (number1 >= number2)
			System.out.printf("%d � maior ou igual a %d\n", number1, number2);

	}
}

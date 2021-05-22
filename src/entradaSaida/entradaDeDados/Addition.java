package entradaSaida.entradaDeDados;

import java.util.Scanner;

public class Addition {
	
	public static void main(String[] args) {
		// system.in permite a leitura de bytes digitados pelo usuario. 
		// o scanner converte os bytes em inteiros para utilizar no programa.
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		int sum;
		
		System.out.print("Digite o primeiro numero: ");
		number1 = input.nextInt(); // faz leitura do numero digitado pelo usuario

		System.out.print("Digite o segundo numero: ");
		number2 = input.nextInt();
		
		sum = number1 + number2;
		
		System.out.printf("A soma é: %d", sum);
	}
}
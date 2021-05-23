package instrucoes_de_controle.ClassAverage;

import java.util.Scanner;

public class ClassAverageSentinela {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Utilizando a repetição por sentinela, deve-se notar o uso
        // da condicional no while.
        int total = 0;
        int gradeCounter = 0;

        System.out.print("digite a nota ou -1 para sair: ");
        int grade = input.nextInt();

        while (grade != -1) {

            total = total + grade;
            gradeCounter ++;

            System.out.print("digite a nota ou -1 para sair: ");
            grade = input.nextInt();
        }

        if (gradeCounter != 0) {
            double average = (double) total / gradeCounter;

            System.out.printf("\nDe %d notas a soma total é %d\n", gradeCounter, total);
            System.out.printf("média da classe é %.2f\n", average);

        } else {
            System.out.println("Nenhuma nota foi inserida");

        }


    }
}

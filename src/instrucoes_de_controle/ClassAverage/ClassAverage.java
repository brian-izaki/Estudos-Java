package instrucoes_de_controle.ClassAverage;

import java.util.Scanner;

public class ClassAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Utilizando a repetição controlada, deve-se notar o uso
        // da variável gradeCounter.
        int total = 0;
        int gradeCounter = 1;

        while (gradeCounter <= 10) {

            System.out.print("digite a nota: ");
            int grade = input.nextInt();

            total = total + grade;
            gradeCounter ++;
        }

        int average = total / 10;

        System.out.printf("\nTotal de todos os 10 é %d\n", total);
        System.out.printf("média da classe é %d\n", average);

    }
}

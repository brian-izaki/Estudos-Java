package instrucoes_de_controle.sobreSwitch;

import java.util.Scanner;

public class LetterGrades {

    public static void main(String[] args) {
        int total = 0;
        int gradeCounter = 0;
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        int fCount = 0;

        Scanner input = new Scanner(System.in);

        System.out.printf("%s\n%s\n  %s\n  %s\n",
                "Digite o numero da nota entre 0-100",
                "Para indicar que terminou de digitar as notas digite:",
                "No UNIX/Linux/MAC OS <CTRL> d e então ENTER",
                "No Windows <CTRL> z e então ENTER");

        while(input.hasNext()) {
            int nota = input.nextInt();
            total += nota;
            ++gradeCounter;

            switch (nota / 10) {
                case 9:
                case 10:
                    ++aCount;
                    break;
                case 8:
                    ++bCount;
                    break;
                case 7:
                    ++cCount;
                    break;
                case 6:
                    ++dCount;
                    break;
                default:
                    ++fCount;
                    break;
            }

            // Switch aprimorado.
            /*switch (nota / 10) {
                case 9, 10 -> ++aCount;
                case 8 -> ++bCount;
                case 7 -> ++cCount;
                case 6 -> ++dCount;
                default -> ++fCount;
            }*/
        }

        System.out.println("\nRelatório das Notas:\n");

        if (gradeCounter != 0) {
            double average = (double) total / gradeCounter;
            System.out.printf("Total de %d notas digitadas é %d \n", gradeCounter, total);
            System.out.printf("Média da classe é: %.2f\n", average);

            System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
                    "Numero de estudantes de acordo com suas notas:",
                    "A: ", aCount,
                    "B: ", bCount,
                    "C: ", cCount,
                    "D: ", dCount,
                    "F: ", fCount);
        } else {
            System.out.println("Não foi digitado nenhuma nota");
        }
    }

}

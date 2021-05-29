package instrucoes_de_controle.student_approved;

import java.util.Scanner;

public class ApprovedStudent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int studentCounter = 0;
        int aprovados = 0;
        int reprovados = 0;

        while (studentCounter < 10) {
            System.out.print("Inserir resultado: ");
            int aprovacao = input.nextInt();

            if (aprovacao == 1)
                aprovados += 1;
            else
                reprovados += 1;

            studentCounter ++;
        }

        System.out.printf("Passaram: %d\n", aprovados);
        System.out.printf("Reprovaram: %d\n", reprovados);

        if (aprovados >= 8)
            System.out.println("Bonus to instructor!");
        else
            System.out.println("Without a bonus");
    }
}

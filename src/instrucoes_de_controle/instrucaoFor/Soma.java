package instrucoes_de_controle.instrucaoFor;

public class Soma {

    public static void main(String[] args){
        int total = 0;

        for (int number = 2; number <= 20; number += 2) {
            total += number;
        }

        System.out.printf("total é: %d", total);
    }

}

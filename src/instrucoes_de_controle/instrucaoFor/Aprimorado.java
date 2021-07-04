package instrucoes_de_controle.instrucaoFor;

public class Aprimorado {

    public static void main(String[] args) {
        int[] numbers = {1, 5, 33, 21};
        int total = 0;

        for(int number : numbers) {
            total += number;
        }

        System.out.println(total);
    }
}

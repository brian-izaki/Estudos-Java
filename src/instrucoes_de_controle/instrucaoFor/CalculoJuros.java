package instrucoes_de_controle.instrucaoFor;

public class CalculoJuros {

    public static void main(String[] args) {
        // PARA CALCULOS MONETÁRIOS NÃO É RECOMENDADO O USO DO TIPO DOUBLE.
        double amount;
        double principal = 1000;
        double rate = 0.05;

        System.out.printf("%5s%30s %n", "ano", "Quantididade no depósito");

        for (int year = 1; year <= 10; year++) {

            amount = principal * Math.pow(1 + rate, year);

            System.out.printf("%4d%,20.2f\n", year, amount);
        }

    }

}

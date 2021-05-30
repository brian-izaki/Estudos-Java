package metodos_exame_mais_profundo;

public class Calculadora {
    public static void main(String[] args) {

        System.out.println("Usando métodos estáticos de Math");

        System.out.printf(" abs(-2.43): %.2f \n" +
                        " ceil(2.43): %.2f \n" +
                        " floor(2.43): %.2f\n" +
                        " max(2, 3): %d \n" +
                        " min(2, 3): %d",
                Math.abs(-2.43),
                Math.ceil(2.43),
                Math.floor(2.43),
                Math.max(2, 3),
                Math.min(2, 3));

    }
}

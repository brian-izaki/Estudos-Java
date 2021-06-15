package metodos_exame_mais_profundo;

import java.security.SecureRandom;

public class RandomSecure {

    public static void main(String[] args) {
        SecureRandom randomNumber = new SecureRandom();

        for (int i = 0; i < 20; i++) {
            // gera o valor inteiro aleatório
            int face = 1 + randomNumber.nextInt(6);

            System.out.printf("%d ", face);

            if ((i + 1) % 5 == 0)
                System.out.println();
        }
    }

}

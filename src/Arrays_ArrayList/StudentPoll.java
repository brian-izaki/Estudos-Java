package Arrays_ArrayList;

public class StudentPoll {

    public static void main(String[] args) {
        // toma como base que não haverá o valor 0(zero) apenas de 1 a 5
        int[] responses = {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14};

        // sao os valores da nota que é de 1 a 5
        int[] frequency = new int[6];

        for (int answer = 0; answer < responses.length; answer++) {
            try {
                // realiza o incremento dentro dos elementos no array.
                ++frequency[responses[answer]];
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: " + e);
                System.out.printf("     responses[%d] = %d\n\n", answer, responses[answer]);
            }
        }

        System.out.printf("%s%10s\n", "Rating", "Frequency");

        for (int rating = 1; rating < frequency.length; rating++) {
            System.out.printf("%6d%10d\n", rating, frequency[rating]);
        }
    }

}

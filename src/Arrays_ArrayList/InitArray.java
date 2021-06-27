package Arrays_ArrayList;

public class InitArray {
    public static void main(String[] args) {
        arrayBase();
        System.out.println();
        System.out.println("com valores");
        arrayComValores();
        System.out.println();
        System.out.println("Tabuada do 2");
        tabuadaDois();
    }

    public static void arrayBase() {
        int[] array = new int[10];

        System.out.printf("%s%8s\n", "Index", "Value");

        for (int counter = 0; counter < array.length; counter++) {
            System.out.printf("%5d%8d\n", counter, array[counter]);
        }
    }

    public static void arrayComValores() {
        int[] array = {23, 11, 21, 52, 53, 33, 65, 1};

        System.out.printf("%s%8s\n", "Indice", "Valor");

        for (int counter = 0; counter < array.length; counter++) {
            System.out.printf("%6d%8d\n", counter, array[counter]);
        }
    }

    private static void tabuadaDois() {
        final int ARRAY_LENGTH = 10;
        int[] array = new int[ARRAY_LENGTH];

        for (int counter = 0; counter < array.length; counter++) {
            array[counter] = 2 + 2 * counter;
        }

        System.out.printf("%s%8s\n", "indice", "valor");

        for (int counter = 0; counter < array.length; counter++) {
            System.out.printf("%5d%8d\n", counter, array[counter]);
        }
    }
}

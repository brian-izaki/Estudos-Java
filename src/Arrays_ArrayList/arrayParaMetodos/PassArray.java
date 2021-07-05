package Arrays_ArrayList.arrayParaMetodos;

public class PassArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.print("Efeito de passar um array de inteiros:\n Os valores do array original são: \n");

        for (int value : array) {
            System.out.printf("  %d", value);
        }

        modifyArray(array);
        System.out.print("\n\n os valores da array modificada são:\n");

        for (int value : array) {
            System.out.printf("  %d", value);
        }

        System.out.printf("\n\nEfeito ao passar valor do elemento do array: %d\n", array[3]);

        modifyElement(array[3]);
        System.out.printf("array[3] depois do modifyElement: %d\n", array[3]);
    }

    public static void modifyArray(int[] array2) {
        for (int counter = 0; counter < array2.length; counter++) {
            array2[counter] *= 2;
        }
    }

    public static void modifyElement(int element) {
        element *= 2;
        System.out.printf("Valor do elemento no modifyElement: %d\n", element);
    }
}

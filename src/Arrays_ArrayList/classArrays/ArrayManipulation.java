package Arrays_ArrayList.classArrays;

import java.util.Arrays;

public class ArrayManipulation {
    public static void main(String[] args) {
        double[] doubleArray = {8.4, 9.3, 0.2, 7.9, 3.4};
        Arrays.sort(doubleArray);
        System.out.print("\ndoubleArray .sort: ");

        for (double value : doubleArray)
            System.out.printf("%.1f ", value);

        int[] filledIntArray = new int[10];
        Arrays.fill(filledIntArray, 7);
        displayArray(filledIntArray, "filledIntArray");

        int[] intArray = {1, 2, 3, 4, 5, 6};
        int[] intArrayCopy = new int[intArray.length];
        System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
        displayArray(intArray, "intArray");
        displayArray(intArrayCopy, "intArrayCopy");

        boolean b = Arrays.equals(intArray, intArrayCopy);
        System.out.printf("\n\nintArray %s intArrayCopy\n", (b ? "==" : "!="));

        b = Arrays.equals(intArray, filledIntArray);
        System.out.printf("\nintArray %s fillentIntArray\n", (b ? "==" : "!="));

        int location = Arrays.binarySearch(intArray, 5);
        if(location >= 0)
            System.out.printf("Encontrado 5 no elemento %d em intArray\n", location);
        else
            System.out.println("5 não foi encontrado em intArray\n");

        location = Arrays.binarySearch(intArray, 8763);
        if (location >= 0)
            System.out.printf("Encontrado 8763 no elemento %d em intArray", location);
        else
            System.out.println("8763 não foi encontrado no intArray");

    }

    private static void displayArray(int[] array, String description) {
        System.out.printf("\n%s: ", description);

        for (int value : array)
            System.out.printf("%d ", value);
    }
}

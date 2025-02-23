package ed.lab;
import java.util.Random;
import java.util.Arrays;

public class Main {
    private static final ArrayGenerator<Integer> sortedArrayGenerator =lenght -> {
        Integer[] array =  new Integer[lenght]; // Reemplácelo por una función lambda
        for (int i = 0; i < lenght; i++) {
        array[i] = i+1;}
        return array;
    };
    private static final ArrayGenerator<Integer> invertedArrayGenerator = lenght -> {
        Integer[] array =  new Integer[lenght];
        for (int i = 0; i < lenght; i++) {
            array[i] = lenght-i;
        }
        return array;
    }; // Reemplácelo por una función lambda

    private static final ArrayGenerator<Integer> randomArrayGenerator = length -> {
        Integer[] array = new Integer[length];
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = rand.nextInt(100);
        }
        return array;
    }; // Reemplácelo por una función lambda

    private static final QuickSort<Integer> highPivotQuickSort = null; // Reemplácelo por una referencia a un método

    private static final QuickSort<Integer> lowPivotQuickSort = null; // Reemplácelo por una referencia a un método

    private static final QuickSort<Integer> randomPivotQuickSort = null; // Reemplácelo por una referencia a un método

    public static QuickSort<Integer> getHighPivotQuickSort() {
        return highPivotQuickSort;
    }

    public static QuickSort<Integer> getLowPivotQuickSort() {
        return lowPivotQuickSort;
    }

    public static QuickSort<Integer> getRandomPivotQuickSort() {
        return randomPivotQuickSort;
    }

    public static ArrayGenerator<Integer> getSortedArrayGenerator() {
        return sortedArrayGenerator;
    }

    public static ArrayGenerator<Integer> getInvertedArrayGenerator() {
        return invertedArrayGenerator;
    }

    public static ArrayGenerator<Integer> getRandomArrayGenerator() {
        return randomArrayGenerator;
    }

    public static void main(String[] args) {
        final SortingTester<Integer> tester = new SortingTester<>();

        System.out.println("Ordenando un arreglo ordenado:");
        System.out.println("\tUtilizando el último elemento como pivote: ");
        tester.testSorting(sortedArrayGenerator, highPivotQuickSort);
        System.out.println("\tUtilizando el primer elemento como pivote: ");
        tester.testSorting(sortedArrayGenerator, lowPivotQuickSort);
        System.out.println("\tUtilizando un elemento aleatorio como pivote: ");
        tester.testSorting(sortedArrayGenerator, randomPivotQuickSort);
        System.out.println("================================");

        System.out.println("Ordenando un arreglo invertido:");
        System.out.println("\tUtilizando el último elemento como pivote: ");
        tester.testSorting(invertedArrayGenerator, highPivotQuickSort);
        System.out.println("\tUtilizando el primer elemento como pivote: ");
        tester.testSorting(invertedArrayGenerator, lowPivotQuickSort);
        System.out.println("\tUtilizando un elemento aleatorio como pivote: ");
        tester.testSorting(invertedArrayGenerator, randomPivotQuickSort);
        System.out.println("================================");

        System.out.println("Ordenando un arreglo aleatorio:");
        System.out.println("\tUtilizando el último elemento como pivote: ");
        tester.testSorting(randomArrayGenerator, highPivotQuickSort);
        System.out.println("\tUtilizando el primer elemento como pivote: ");
        tester.testSorting(randomArrayGenerator, lowPivotQuickSort);
        System.out.println("\tUtilizando un elemento aleatorio como pivote: ");
        tester.testSorting(randomArrayGenerator, randomPivotQuickSort);
        System.out.println("================================");
    }
}
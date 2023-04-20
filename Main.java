import java.util.Arrays;
import java.util.Random;

import sort.BubbleSort;
import sort.CombSort;
import sort.HeapSort;
import sort.QuickSort;
import sort.Sort;

public class Main {
    private static final Sort heapSort = new HeapSort();
    private static final Sort bubbleSort = new BubbleSort();
    private static final Sort combSort = new CombSort();
    private static final Sort quickSort = new QuickSort();

    private static void showArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int n = 1000;

        int[] array1 = new int[n];
        int[] array2 = new int[n];
        int[] array3 = new int[n];
        int[] array4 = new int[n];
        int[] array5 = new int[n];
        for(int i = 0; i < n; i++) {
            int rand = new Random().nextInt(10001) - 5000;
            array1[i] = rand;
            array2[i] = rand;
            array3[i] = rand;
            array4[i] = rand;
            array5[i] = rand;
        }

        System.out.println("Ilość elementów: " + n);

        System.out.print("BubbleSort:\t");
        long start = System.nanoTime();
        bubbleSort.sort(array2);
        long stop = System.nanoTime();
        System.out.println((stop - start) / 1000 + " us");

        System.out.print("CombSort:\t");
        start = System.nanoTime();
        combSort.sort(array3);
        stop = System.nanoTime();
        System.out.println((stop - start) / 1000 + " us");

        System.out.print("QuickSort:\t");
        start = System.nanoTime();
        quickSort.sort(array4);
        stop = System.nanoTime();
        System.out.println((stop - start) / 1000 + " us");

        System.out.print("HeapSort:\t");
        start = System.nanoTime();
        heapSort.sort(array1);
        stop = System.nanoTime();
        System.out.println((stop - start) / 1000 + " us");

        System.out.print("Arrays.sort():\t");
        start = System.nanoTime();
        Arrays.sort(array5);
        stop = System.nanoTime();
        System.out.println((stop - start) / 1000 + " us");

        //showArray(array);
    }
}

package session_9_arrays.practice;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[]numbers = {14, 24, 12, -4, 13};
        //index          0   1   2   3   4

        //printArraysAverage(numbers); //apelam metoda la sfarsit

        String[][] names = {  {"Ms.", "Mr."}, {"Alice", "John"} };
        //index             names[0][0]-Ms.

        printSortedArray(numbers);
        printSearchIndexValue(numbers, 12);
    }

    public static void printSearchIndexValue(int[] array, int searchKey) {
        Arrays.sort(array);
        System.out.println(Arrays.binarySearch(array, searchKey));
    }

    public static void printSortedArray(int[] array) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

    }

    public static void printMultidimensionalArray(String [][] inputArray) {
        for (int index = 0; index < inputArray.length; index++) {
            for (int index2 = 0; index2 < inputArray[index].length; index2++) {
                System.out.println(inputArray[index2][index] + " ");
            }
        }
            System.out.println();
    }

    public static void printArraysAverage(int[] inputArray) {
        double sum = 0;

        for (int value : inputArray) {
            sum += value; // sum = sum + value
        }

        System.out.println("Array average: " + (sum / inputArray.length));
    }
}
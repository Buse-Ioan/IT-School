package session_5_advanced_flow_control.challenge;

//3. Counting Negative Numbers
//Given an array of integers, write a program to count and print the number of negative integers in the array.

public class Challenge_3_CountNegativeNumbers {
    public static void main(String[] args) {
        int[] arrayNumber = {-1, 2, -3, 4, 0, -5};
        int count = countNegativeNumbers(arrayNumber);
        System.out.println("Number of negative numbers in the array: " + count);
    }

    public static int countNegativeNumbers(int[] arrayNumber) {
        int count = 0;
        for (int index = 0; index < arrayNumber.length; index++) {
            if (arrayNumber[index] < 0) {
                count++;
            }
        }
        return count;
    }
}
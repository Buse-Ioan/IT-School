package session_4_java_operators_and_loops.practice;

public class ForStatement {
    public static void main(String[] args) {
        printNumbers(10);

        int[] array = {1, 7, 3, 9, 34};
        // index value fiecare element din array are un index 0(pt 1) 1(pt 7) 2 3 4
        printArray(array);
    }

    public static void  printNumbers(int number) {
        for (int index = 0; index < number; index++) {
            System.out.println(index); //System.out.print(index) - simplu nu prinlt printeaza in continuare, nu pe o linie noua
        }
    }

    public static void printArray(int[] numberArray) {
        // numbersArray = {1, 7, 3, 9, 34}
        for (int number : numberArray) {
            System.out.println(number);
        }
    }
}

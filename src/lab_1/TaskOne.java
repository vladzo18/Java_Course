package lab_1;

import java.util.Random;
import java.util.Scanner;

public class TaskOne {

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int[][] array;
        byte size;

        System.out.print("Enter size of matrix: ");
        size = scaner.nextByte();
        array = new int[size][size];

        fillArrayRandomValues(array, 0, 9);
        printArray(array);
        System.out.println("");
        printSideDiagonalsEvenNumbers(array);
    }

    private static void fillArrayRandomValues(int[][] arr, int begin, int end) {
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = random.nextInt(end - begin + 1) + begin;
            }
        }
    }

    private static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }

    private static void printSideDiagonalsEvenNumbers(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][arr.length - (i + 1)] + " ");
        }
    }

}

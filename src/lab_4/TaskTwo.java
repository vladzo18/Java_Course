package lab_4;

import java.util.*;

public class TaskTwo {

    public static void main(String[] args) {
        System.out.print("Enter size of Array: ");
        int size = (new Scanner(System.in)).nextInt();
        int[] arr = new int[size];
        fillArrayRandomValues(arr, 0, 9);
        printArray(arr);

        OptionalDouble result = Arrays.stream(arr)
                .filter(item -> item % 2 == 0)
                .average();

        System.out.println(result.getAsDouble());
    }

    private static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + ", ");
        }
        System.out.println();
    }

    private static void fillArrayRandomValues(int[] arr, int begin, int end) {
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(end - begin + 1) + begin;
        }
    }
}

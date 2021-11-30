package lab_5;
import java.util.ArrayList;
import java.util.Collections;

public class TaskTwo {

    public static void main(String[] args) {
        int[] testArr = new int[] {5, 3, 2, 8, 1, 4};
        printArray(testArr);
        printArray(sortArray(testArr));
    }

    private static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + ", ");
        }
        System.out.println();
    }

    private static int[] sortArray(int[] array) {
        int[] targetArray = array;

        ArrayList<Integer> evenNumbers = new  ArrayList<Integer>();
        ArrayList<Integer> evenNumbersIxdexes = new  ArrayList<Integer>();

        for (int i = 0; i < targetArray.length; i++) {
            if (targetArray[i] % 2 != 0) {
                evenNumbers.add(targetArray[i]);
                evenNumbersIxdexes.add(i);
            }
        }

        Collections.sort(evenNumbers);

        for (int i = 0; i < evenNumbers.size(); i++) {
            targetArray[evenNumbersIxdexes.get(i)] = evenNumbers.get(i);
        }

        return targetArray;
    }

}

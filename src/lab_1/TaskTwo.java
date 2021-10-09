package lab_1;

public class TaskTwo {

    public static void main(String[] args) {
        int[] someArray = fillArray(0, 10, 2);
        printArray(someArray);

        int[] someArray_2 = fillArray(0, 25, 4);
        printArray(someArray_2);

        int[] someArray_3 = fillArray(-5, 19, 3);
        printArray(someArray_3);
    }

    private static int[] fillArray(int begin, int end, int step) {
        int size = begin > end ? ( (begin - end) / step ) + 1 : ( (end - begin) / step) + 1;
        int arr[] = new int[size];
        int currentValue = begin;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = currentValue;
            currentValue += step;
        }

        return arr;
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

}

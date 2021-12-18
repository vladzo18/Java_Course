package lab_6;

public class TaskTwo {

    public static void main(String[] args) {
        int[] arr = fillArrayFromCenter(new int[21]);

        for (int item : arr) {
            System.out.print(item + " ");
        }
    }

    private static int[] fillArrayFromCenter(int[] array) {
        int[] targetArray = array.clone();
        int center = targetArray.length / 2;
        boolean isEven = targetArray.length % 2 == 0;

        for (int i = 0; i < center; i++) {
            int currentItem = isEven ? center - (i + 1) : center - i;

            targetArray[i] = currentItem;
            targetArray[(targetArray.length - i) - 1] = currentItem;
        }

        return targetArray;
    }

}

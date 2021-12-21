package lab_5;

public class TaskOne {

    public static void main(String[] args) {

        try {
            System.out.println(findUniq(new double[] {1, 1, 1, 1, 1, 7, 1, 1, 1, 1, 1}));
            System.out.println(findUniq(new double[] {0, 0, 0.55, 0, 0}));
            System.out.println(findUniq(new double[] {8, 1, 1, 1, 1, 1}));
            System.out.println(findUniq(new double[] {1, 6, 1, 1, 1, 1}));
            System.out.println(findUniq(new double[] {1, 1, 4}));
            System.out.println(findUniq(new double[] {1, 1, 1, 2, 1, 1}));
            System.out.println(findUniq(new double[] {1, 1, 1, -1, 1, 1}));
        } catch (Exception e) { }

    }

    private static double findUniq(double[] array) throws Exception {
        if (array.length <= 2) throw new Exception("Але, массив слишком мелкий,)");

        if (array[0] != array[1] && array[0] != array[2]) {
            return array[0];
        }

        for (int i = 0; i < array.length; i++) {
            if (array[0] != array[i]) return array[i];
        }

        return array[0];
    }

}

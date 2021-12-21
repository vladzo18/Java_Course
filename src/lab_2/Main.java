package lab_2;

import java.io.Serializable;

public class Main {
    public static void main(String[] args)  {
       LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(6);
        list.add(7);

        printArray(list.toArray());
        System.out.println("");
        System.out.println(list.contains(9));
        System.out.println(list.contains(-5));
        list.remove(70);
        printArray(list.toArray());

        ArrayList<Double> arrayList = new ArrayList<Double>();
        arrayList.add(3.0);
        arrayList.add(8.0);
        arrayList.add(7.0);
        arrayList.add(10.0);
        arrayList.add(3.0);
        arrayList.add(8.0);
        arrayList.add(7.0);


        System.out.println("");
        printArray(arrayList.toArray());
        System.out.println("");
        arrayList.remove(10.0);
        printArray(arrayList.toArray());
        System.out.println("");
        System.out.println(arrayList.contains(7.0));

        TestClass tc = new TestClass();
        byte[] bytes = SerializationUtil.serialize(tc);
        TestClass deserelizedTestClas = (TestClass) SerializationUtil.deserialize(bytes);
        System.out.print(deserelizedTestClas.name + " " + deserelizedTestClas.age);
    }

    private static <T> void printArray(T[] arr) {
        for (T elem : arr) {
            System.out.print(elem + " ");
        }
    }
}

class TestClass implements Serializable {
    public final String name = "Vlad";
    public final byte age = 19;
}

package lab_4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TaskOne {

    public static void main(String[] args) {
        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");

        Stream<String> myStream = myList.stream()
                .map((item) -> {
                    return item.toUpperCase();
                })
                .sorted((a, b) -> {
                    return a.charAt(0) == b.charAt(0) && a.charAt(1) > b.charAt(1) ? 1 : -1;
                });

        myList = myStream.collect(Collectors.toList());
        printListStrings(myList);
    }

    private static void printListStrings(List<String> list) {
        for (String item : list) {
            System.out.print(item + ", ");
        }
        System.out.println();
    }

}

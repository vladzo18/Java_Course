package lab_4;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TaskThree {

    private static final char START_RANGE = 'h';
    private static final char END_RANGE = 't';

    public static void main(String[] args) {
        String str = "sjdhgfsjkavchjwagehf";

        String resultStr  = Stream.of(str.split("")).map(item -> {
            if (item.charAt(0) >= START_RANGE && item.charAt(0) <= END_RANGE) {
                return item.toUpperCase();
            }
            return item;
        }).collect(Collectors.joining());

        System.out.println(str);
        System.out.println(resultStr);
    }

}

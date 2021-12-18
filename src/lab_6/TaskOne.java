package lab_6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskOne {

    private static final String NUMBER_REGX = "\\d+";
    private static final String NOT_NUMBER_REGX = "\\D{1}";
    private static final String EXPRESSION_REGX = "\\d+\\D{1}\\d+";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter_expression>> ");
        String expression = scanner.nextLine();

        System.out.print("The result: ");
        System.out.println(calculateExpressionFromString(expression));
    }

    private static int calculateExpressionFromString(String string) {
        String expression = string;

        Pattern pattern = Pattern.compile(EXPRESSION_REGX);
        Matcher mather = pattern.matcher(expression);

        while (mather.find()) {
            String simpleExpression = mather.group();

            int targetResult = calculateSimpleExpressionFromString(simpleExpression);
            expression = expression.replaceFirst(EXPRESSION_REGX, Integer.toString(targetResult));

            mather = pattern.matcher(expression);
        }

        return Integer.parseInt(expression);
    }

    private static int calculateSimpleExpressionFromString(String string) {
        int firstNumber = Integer.parseInt(string.split(NOT_NUMBER_REGX)[0]);
        int secondeNumber = Integer.parseInt(string.split(NOT_NUMBER_REGX)[1]);
        String operator = Pattern.compile(NUMBER_REGX).matcher(string).replaceAll("");

        switch (operator) {
            case "+":
                return firstNumber + secondeNumber;
            case "-":
                return firstNumber - secondeNumber;
            case "*":
                return firstNumber * secondeNumber;
            case "/":
                return firstNumber / secondeNumber;
            default:
                return -1;
        }
    }

}

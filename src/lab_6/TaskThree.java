package lab_6;

import java.util.Scanner;

public class TaskThree {

    private static final String _notify =
            "1 – ввести нове значення \n" +
            "2 – вивести на екран всі введені слова через кому \n" +
            "3 – вихід з програми \n";

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        boolean isWorking = true;

        StringCollection stringCollection = new  StringCollection(", ");

        while (isWorking) {
            System.out.println(_notify);

            System.out.print("Enter>> ");
            int input = scaner.nextInt();;

            switch (input) {
                case 1:
                    System.out.print("Enter_value>> ");
                    String str = scaner.next();

                    if (str.charAt(0) == '+') {
                        stringCollection.AddValue(str.substring(1));
                    } else if (str.charAt(0) == '-') {
                        try {
                            stringCollection.RemoveValue(str.substring(1));
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    } else {
                        System.out.println("Некоректний ввід!!!");
                    }
                    break;
                case 2:
                    System.out.println(stringCollection.GetStringCollection());
                    break;
                case 3:
                    isWorking = false;
                    break;
                default:
                    System.out.println("Некоректний ввід!!!");
                    break;
            }
        }

    }

}
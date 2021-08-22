package EX_4;

import java.util.Scanner;

/*
Даны строки разной длины (длина - четное число),
необходимо вернуть ее два средних знака. Например, если дана строка "string"  результат будет "ri",
для строки "code" результат "od",  для "Practice" результат "ct".
*/

public class EX_4 {
    static Scanner scanner = new Scanner(System.in);
    static String answer;

    public static void addNewWord() {

        System.out.println("Enter some word");
        answer = scanner.nextLine();
        while (answer.length() % 2 != 0) {
            System.out.println("You should enter a word with an even numbers of letters");
            answer = scanner.nextLine();
        }
    }

    public static void findCentre() {
       int middleFirst = answer.length()/2;
       answer = answer.substring(middleFirst-1,middleFirst+1);
    }

    public static void main(String[] args) {
        addNewWord();
        findCentre();
        System.out.println(answer);
    }
}

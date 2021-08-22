package EX_1;

/*
1) Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”.

2) Распечатать последний символ строки. Используем метод String.charAt().

3) Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().

4) Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().

5) Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().

6) Найти позицию подстроки “Java” в строке “I like Java!!!”.

7) Заменить все символы “а” на “о”.

8) Преобразуйте строку к верхнему регистру.

9) Преобразуйте строку к нижнему регистру.

10) Вырезать строку Java c помощью метода String.substring().

*/


public class EX_1 {
    public static void first() {
        String s = "I like Java!!!";
        System.out.println(s);
        System.out.println();
    }

    public static void second() {
        String s = "I like Java!!!";
        char last = s.charAt(s.length() - 1);
        System.out.println(last);
        System.out.println();
    }

    public static void third() {
        String s = "I like Java!!!";
        boolean end = s.endsWith("!!!");
        System.out.println(end);
        System.out.println();
    }

    public static void forth() {
        String s = "I like Java!!!";
        boolean begin = s.startsWith("I like");
        System.out.println(begin);
        System.out.println();
    }

    public static void fifth() {
        String s = "I like Java!!!";
        boolean middle = s.contains("Java");
        System.out.println(middle);
        System.out.println();
    }

    public static void sixth() {
        String s = "I like Java!!!";
        int index = s.indexOf("Java");
        System.out.println(index);
        System.out.println();
    }

    public static void seventh() {
        String s = "I like Java!!!";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                s = s.substring(0, i) + "o" + s.substring(i + 1);
            }
        }
        System.out.println(s);
        System.out.println();
    }

    public static void seventhAgain() {
        String s = "I like Java!!!";
        s = s.replace("a", "o");
        System.out.println(s);
        System.out.println();
    }

    public static void eighth() {
        String s = "I like Java!!!";
        s = s.toUpperCase();
        System.out.println(s);
        System.out.println();
    }

    public static void ninth() {
        String s = "I like Java!!!";
        s = s.toLowerCase();
        System.out.println(s);
        System.out.println();
    }

    public static void tenth() {
        String s = "I like Java!!!";
        s = s.substring(0,5);
        System.out.println(s);
        System.out.println();
    }

    public static void main(String[] args) {
        first();
        second();
        third();
        forth();
        fifth();
        sixth();
        seventh();
        seventhAgain();
        eighth();
        ninth();
        tenth();
    }


}

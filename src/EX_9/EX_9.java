package EX_9;
/*

Дана строка “Versions: Java  5, Java 6, Java   7, Java 8, Java 12.”  Найти все подстроки "Java X" и распечатать их.

*/

public class EX_9 {
    static String s = "Versions: Java  5, Java 6, Java   7, Java 8, Java 12.";

    public static void findJava(String s) {
        int i = 0;
        while (i < s.length()-9) {
            int firstIndex = s.indexOf("Java", i);
            i=s.indexOf(',',i);
            System.out.println(s.substring(firstIndex,i));
            i++;
        }
        i=s.indexOf('J',i);
        System.out.println(s.substring(i,s.length()-1));

    }

    public static void main(String[] args) {
        findJava(s);
    }
}

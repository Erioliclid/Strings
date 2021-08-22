package EX_2;
/*
1) Дано два числа, например 3 и 56, необходимо составить следующие строки:
3 + 56 = 59
3 – 56 = -53
3 * 56 = 168.
Используем метод StringBuilder.append().

2) Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(), StringBuilder.deleteCharAt().

3) Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
 */
public class EX_2 {
    static int a=3;
    static int b=56;

    public static void first(){
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        System.out.println(sb1.append(a).append(" + ").append(b).append(" = ").append(a+b));
        System.out.println(sb2.append(a).append(" - ").append(b).append(" = ").append(a-b));
        System.out.println(sb3.append(a).append(" * ").append(b).append(" = ").append(a*b));
        System.out.println();
        System.out.println();
    }

    public static void second(){
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();

        sb1=sb1.append(a).append(" + ").append(b).append(" = ").append(a+b);
        sb1.deleteCharAt(7);
        sb1.insert(7,"равно");

        sb2=sb2.append(a).append(" - ").append(b).append(" = ").append(a-b);
        sb2.deleteCharAt(7);
        sb2.insert(7,"равно");

        sb3=sb3.append(a).append(" * ").append(b).append(" = ").append(a*b);
        sb3.deleteCharAt(7);
        sb3.insert(7,"равно");

        System.out.println(sb1);
        System.out.println(sb2);
        System.out.println(sb3);
        System.out.println();
        System.out.println();
    }

    public static void third(){
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();

        sb1=sb1.append(a).append(" + ").append(b).append(" = ").append(a+b);
        sb1.replace(7,8,"равно");

        sb2=sb2.append(a).append(" - ").append(b).append(" = ").append(a-b);
        sb2.replace(7,8,"равно");

        sb3=sb3.append(a).append(" * ").append(b).append(" = ").append(a*b);
        sb3.replace(7,8,"равно");

        System.out.println(sb1);
        System.out.println(sb2);
        System.out.println(sb3);
        System.out.println();
        System.out.println();
    }

    public static void main(String[] args) {
        first();
        second();
        third();
    }
}

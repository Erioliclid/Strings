package EX_3;

/*Напишите метод, заменяющий в строке каждое второе вхождение«object-oriented programming» (не учитываем регистр символов) на «OOP».
Например, строка
"Object-oriented programming is a programming language model organized around objects rather than "actions"
and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla."
должна быть преобразована в
"Object-oriented programming is a programming language model organized around objects rather
than "actions" and data rather than logic. OOP blabla. Object-oriented programming bla."*/

public class EX_3 {
    static StringBuilder sb = new StringBuilder();
    static StringBuilder text = new StringBuilder();
    static int temp = 0;


    public static void addSb() {
        sb.append("Object-oriented programming is a programming language model organized around objects rather than actions " +
                "and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla.");
        text.append("Object-oriented programming");
    }

    public static void change() {

        for (int i = 0; i < sb.length(); i++) {

            if (sb.indexOf("Object-oriented programming",i) == i) {
                temp++;

                if (temp % 2 == 0) {
                    sb.replace(i + 0, i + 27, "OOP");
                }
            }
            System.out.println(temp);
        }

    }

    public static void main(String[] args) {
        addSb();
        change();
        System.out.println(sb);
    }
}



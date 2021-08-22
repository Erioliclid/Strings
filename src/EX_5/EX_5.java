package EX_5;

/*
Создать строку, используя форматирование: Студент [Фамилия] получил [оценка] по [предмету].
Форматирование и вывод строки на консоль написать в отдельном методе, который принимает фамилию, оценку и название предмета в качестве параметров.
Выделить под фамилию 15 символов, под оценку 3 символа, под предмет – 10.

Пример вывода:

Студент Иванов          получил 5   по Математике

Студент Петрова         получил 4   по Физике

Студент Сидорова        получил 3   по Программированию
*/

import java.util.Scanner;

public class EX_5 {
   static Scanner scanner = new Scanner(System.in);

    String name;
    String subject;
    String mark;


    public EX_5() {
        System.out.print("Enter surname: ");
        this.name = scanner.nextLine();
        while(name.length()>15) {
            System.out.println("Surname is too long");
            System.out.print("Enter surname: ");
            this.name = scanner.nextLine();
        }
        System.out.print("Enter subject: ");
        this.subject = scanner.nextLine();
        while(subject.length()>10) {
            System.out.println("subject is too long");
            System.out.print("Enter subject: ");
            this.subject = scanner.nextLine();
        }
        System.out.print("Enter mark: ");
        this.mark = scanner.nextLine();
        while(mark.length()>3) {
            System.out.println("mark is too long");
            System.out.print("Enter mark: ");
            this.mark = scanner.nextLine();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Студент " + name + " получил " + mark + " по " + subject;
    }

    public static void main(String[] args) {
        EX_5 st1 = new EX_5();
        EX_5 st2 = new EX_5();
        EX_5 st3 = new EX_5();

        System.out.println(st1);
        System.out.println();
        System.out.println(st2);
        System.out.println();
        System.out.println(st3);
        System.out.println();
    }
}

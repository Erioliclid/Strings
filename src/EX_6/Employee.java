package EX_6;

/*
1) Создать класс Employee, у которого есть переменные класса - fullname, salary.

2) Создать массив содержащий несколько объектов этого типа.

3) Создать класс Report  со статическим методом generateReport, в котором выводится информация о зарплате всех сотрудников.

4) Используйте форматирование строк.
   Пусть salary будет выровнено по правому краю, десятичное значение имеет 2 знака после запятой и можете добавить что-нибудь свое.
*/

public class Employee {

    String fullName;
    double salary;
    static Employee[] stuff = new Employee[5];

    public Employee(String fullName, double salary) {
        this.fullName = fullName;
        this.salary = salary;
    }



    public static void addStuff(){
        stuff[0]= new Employee("Steven",150.15);
        stuff[1]= new Employee("Carl",170.50);
        stuff[2]= new Employee("John",120.05);
        stuff[3]= new Employee("Kate",200.95);
        stuff[4]= new Employee("Celestia",80.26);

    }
    public static void report(Employee[]stuff){
        for (Employee emp:stuff){
            System.out.printf("%.2f"+"\n",emp.salary);
        }
    }

    public static void main(String[] args) {
        addStuff();
        report(stuff);

    }
}

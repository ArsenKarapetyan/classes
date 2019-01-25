package akarapetyan.lesson_8;

public class Executor {

    public static void main(String[] args) {

        Address add0 = new Address("Moscovyan", "Yerevan", "Yerevan", "0009");
        Address add1 = new Address("Baghramyan", "Yerevan", "Yerevan", "0009");
        Address add2 = new Address("Saryan", "Yerevan", "Yerevan", "0009");

        Address [] add = new Address [3];
        add [0] = add0;
        add [1] = add1;
        add [2] = add2;

        Person person1 = new Person("Arsen", "Karapetyan", "Samvelovich", (short)43, add);
        System.out.println(person1.toString());
        Employee employee1 = new Employee(1000, person1);
        System.out.println(employee1.toString());

        System.out.println();

        Person person2 = new Person("Arsen", "Karapetyan", "Samvelovich", (short)25, add);
        System.out.println(person2.toString());
        Employee employee2 = new Employee(700, person2);
        System.out.println(employee2.toString());

        Employee [] employee = new Employee[2];
        employee [0] = employee1;
        employee [1] = employee2;


        Department department = new Department("Accounting", employee, employee1, 1500 );
        System.out.println(department.toString());

    }
}


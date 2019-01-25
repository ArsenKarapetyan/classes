package akarapetyan.lesson_8;

public class Executor {

    public static void main(String[] args) {

        Address add0 = new Address("Moscovyan", "Yerevan", "Yerevan", "0009");
        Address add1 = new Address("Moscovyan", "Yerevan", "Yerevan", "0009");
        Address add2 = new Address("Moscovyan", "Yerevan", "Yerevan", "0009");

        Address [] add = new Address [3];
        add [0] = add0;
        add [1] = add1;
        add [2] = add2;

        Person person = new Person("Arsen", "Karapetyan", "Samvelovich", (short)43, add);
        System.out.println(person.toString());

    }
}


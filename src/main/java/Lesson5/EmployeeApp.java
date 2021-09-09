package Lesson5;

import java.util.Arrays;

public class EmployeeApp {

    public static void main(String[] args) {
        Employee[] employee = new Employee[5];
        employee[0] = new Employee("Ivanov Ivan", "Engineer", "ivanov123@mail.ru", "89007934112", 1300, 31);
        employee[1] = new Employee("Fedorov Mikhail", "Programmer", "Fed121@mail.ru", "89307938121", 1400, 42);
        employee[2] = new Employee("Makarov Alexey", "Builder", "Makarov@mail.ru", "89187731812", 1330, 34);
        employee[3] = new Employee("Chiganov Alex", "Cook", "Chiganov@mail.ru", "89007931712", 1200, 54);
        employee[4] = new Employee("Pulkov Artem", "Programmer", "Pulkov@mail.ru", "89007991812", 1350, 27);
        employee[0].info();
        employee[1].info();
        employee[2].info();
        employee[3].info();
        employee[4].info();
        System.out.println();
        System.out.println();

for (int i=0; i< employee.length; i++) {
    employee[i].getAge();
}
    }
}

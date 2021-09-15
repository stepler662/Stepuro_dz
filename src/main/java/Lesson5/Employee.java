package Lesson5;

import java.util.Arrays;

public class Employee {
   private String fio;
   private String position;
 private String email;
 private String number;
 private int salary;
 public int age;

 public Employee(String fio, String position, String email, String number, int salary, int age){
     this.fio = fio;
     this.position = position;
     this.email = email;
     this.number = number;
     this.salary = salary;
     this.age = age;
 }

  public void info() {
      System.out.println("fio = " + fio + " , " + "position = " + position + " , " + "email = " + email + " , " +
              "number = " + number + " , " + "salary = " + salary + " , "+ "age = " + age);
  }

    //Вывод (с помощью цикла) информацию только о сотрудниках старше 40 лет:
    public int getAge() {

            if (this.age > 40) {
                System.out.println("fio = " + fio + " , " + "position = " + position + " , " + "email = " + email + " , " +
                        "number = " + number + " , " + "salary = " + salary + " , " + "age = " + age);

        }return age;
    }
}

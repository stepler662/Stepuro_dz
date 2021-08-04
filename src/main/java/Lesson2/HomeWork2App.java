package Lesson2;

public class HomeWork2App {
    public static void main(String[] args) {
        System.out.println(checkSum1(7,13));
        checkPositiveOrNegative(-5);
        System.out.println(checkPositiveOrNegative2(3));
        method4("Строка", 7);
    }
    // Задача №1
    public static boolean checkSum1(int a, int b) {
      int sum = a + b;
      return (sum > 10) && (sum<=20);
    }
    // Задача №2
      public static void checkPositiveOrNegative(int a) {
        if (a>=0){
            System.out.println("Число " + a + " положительно");
        } else {
            System.out.println("Число " + a + " отрицательное");
        }
      }
    // Задача №3
     public static boolean checkPositiveOrNegative2(int a){
         return (a < 0);
     }
    //Задача №4
    public static void method4(String str, int a) {
        for(int i=1; i<a; i++){
            System.out.println(str);
        }
    }
}

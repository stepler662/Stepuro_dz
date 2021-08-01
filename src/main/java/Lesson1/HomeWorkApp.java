package Lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        // Задание №2

        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
        checkSumSign();
        printColor();
        compareNumbers();
    }
        // Задание №3

        public static void checkSumSign() {
            int a = 7;
            int b = 4;
            int c = a + b;
            if (c >= 0) {
                System.out.println("Сумма положительная");
            } else {
                System.out.println("Сумма отрицательная");
            }
        }
        // Задание №4
      public static void printColor(){
            int value = 37;
            if (value <=0){
                System.out.println("Красный");
            }  if (0< value && value <=100){
              System.out.println("Жёлтый");
          }  else {
              System.out.println("Зелёный");
          }
            }

           // Задание №5

      public static void compareNumbers(){
        int a = 31;
        int b = 54;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }

      }



}

package Lesson6;


public class HomeWork6App {
    public static void main(String[] args) {
   Animals animals = new Animals();
   Cats cat = new Cats("Барсик");
   Cats cat1 = new Cats("Пушок");
   Cats cat2 = new Cats("Симба");

   Dogs dog = new Dogs("Рекс");
   Dogs dog1 = new Dogs("Мухтар");
   Dogs dog2 = new Dogs("Оливер");

   cat.DistRun(120);
   cat1.DistRun(0);
   cat2.DistRun(255);
   dog.DistRun(77);
   dog1.DistRun(417);
   dog2.DistRun(37);
       cat.DistSwim(0);
       cat1.DistSwim(11);
       cat2.DistSwim(10);
       dog.DistSwim(7);
       dog1.DistSwim(0);
       dog2.DistSwim(10);
    }

}

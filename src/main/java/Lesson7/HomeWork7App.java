package Lesson7;

public class HomeWork7App {
    public static void main(String[] args) {

     Cat[] cat = new Cat[2];
     cat[0] = new Cat("Барсик", 20, false);
     cat[1] = new Cat("Мурзик", 15,false);
     Plate[] plate = new Plate[2];
     plate[0] = new Plate(15);
     plate[1] = new Plate(25);

        while (!cat[0].isSatiety()){
            for (int i = 0; i<plate.length; i++){
                cat[0].eat(plate[i]);
                if(plate[i].getAmountOfFood() == 0){
                    plate[i].fellPlate();
                }
            }
        }
        while(!cat[1].isSatiety()){
            for(int i = 0; i<plate.length; i++){
                cat[1].eat(plate[i]);

                if(plate[i].getAmountOfFood() == 0){
                    plate[i].fellPlate();
                }
            }
        }

    }

}

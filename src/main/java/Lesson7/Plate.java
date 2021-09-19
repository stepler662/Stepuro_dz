package Lesson7;

public class Plate {
private int amountOfFood;

    public Plate(int amountOfFood) {
        this.amountOfFood = amountOfFood;
    }

    public void amount(int amount){
        if (amountOfFood >= amount) {
            this.amountOfFood -= amount;
        }else amount =0;
    }
    public void fellPlate(){
        if(amountOfFood == 0 ){
            amountOfFood =+30;
        }
    }
    public int getAmountOfFood() {
        return amountOfFood;
    }

    public void setAmountOfFood(int amountOfFood) {
        this.amountOfFood = amountOfFood;
    }

    public void info(){
        System.out.println("Plate = " + amountOfFood);
    }



    @Override
    public String toString() {
        return "Plate{" +
                "amountOfFood=" + amountOfFood +
                '}';
    }
}

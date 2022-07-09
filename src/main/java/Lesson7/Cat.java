package Lesson7;

public class Cat {

    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSatiety(){
        return satiety;
    }
    private void catsSatiety(int plate){
        if(this.appetite>plate){
            appetite-=plate;
            this.satiety = false;
        }else {
            this.appetite = 0;
            this.satiety = true;
        }
    }
    /**
     * Даём коту тарелку и он из неё ест
     * @param plate тарелка откуда поесть
     */
    public void eat(Plate plate) {
        if (this.satiety == true) {
            System.out.println(name + " Кот не наелся");
            return;
        }

       int untilSatiety = plate.getAmountOfFood();
        if(plate.getAmountOfFood()>=appetite) {
            plate.amount(appetite);
            catsSatiety((untilSatiety));
            System.out.println(name + " поел. В миске осталось: " + plate.getAmountOfFood());
        }else if (plate.getAmountOfFood() == 0) {
            System.out.println("Миска пуста." + name + " не наелся");
        }else {
            plate.amount(appetite);
            catsSatiety(untilSatiety);
            System.out.println(name + " не наелся");
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                '}';
    }
}

package Lesson6;

public class Cats extends Animals {

    public Cats(String name) {
        this.name =  name;
    }


@Override
    public void DistSwim(int distSwim){
    System.out.println("Кот не умеет плавать");
    }

    @Override
    public void DistRun(int distRun){
        if (distRun > 0 && distRun <= 200) {
            System.out.println(name + " пробежал " + distRun + " м");
        } if(distRun <=0) {
            System.out.println(name + " не добежал");
        } if(distRun >200){
            System.out.println(name + " перебежал");
        }

    }


}

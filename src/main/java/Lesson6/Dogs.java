package Lesson6;

public class Dogs  extends Animals{


public Dogs(){

}

    public Dogs(String name) {
        this.name =  name;
    }

    @Override
    public void DistSwim(int distSwim){
        if(distSwim >0 && distSwim <=10){
            System.out.println(name + " проплыл " + distSwim + " м");
        }else {
            System.out.println(name + " не проплыл");
        }
    }


    @Override
    public void DistRun(int distRun){
        if (distRun > 0 && distRun <= 500) {
            System.out.println(name + " пробежал " + distRun + " м");
        }
        if (distRun <= 0) {
            System.out.println(name + " не добежал");
        }
        if (distRun > 500) {
            System.out.println(name + " перебежал");
        }
    }
}

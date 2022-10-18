package Java2_lesson1;

public class Java2_lesson1 {
 private int id;
 private String name;

 public Java2_lesson1(int id, String name) {
     this.id = id;
     this.name = name;

 }
public Java2_lesson1(int id){
    this(id, "default name" );
}

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Java2_lesson1() {

    }
}

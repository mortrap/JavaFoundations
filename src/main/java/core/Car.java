package core;

public class Car {
    final String name;
    static String color;
    final static int WHEELS_COUNT = 4;

    public Car(String name, String color) {
        this.name = "VAZ";
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

//    public void setName(String name) {
//        this.name = name;
//    }


    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
}

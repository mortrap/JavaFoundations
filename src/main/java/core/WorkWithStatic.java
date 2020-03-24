package core;

public class WorkWithStatic {
    public static void main(String[] args) {

        Car lamborgini = new Car("Lamborgini", "Yellow");
        System.out.println(lamborgini.getName() + " " + lamborgini.getColor());
        lamborgini.setColor("Black");
        System.out.println(lamborgini.getName() + " " + lamborgini.getName());
        Car ferrari = new Car ("ferrari", "Red");
        System.out.println(ferrari.getName() + " " + ferrari.getColor());

    }
}


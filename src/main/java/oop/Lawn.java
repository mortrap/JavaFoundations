package oop;

public class Lawn {
    public static void main(String[] args) throws CloneNotSupportedException {
//        Cow zorka = new Cow();
        Cow zorka = new Cow();
        zorka.talk();
        Cow saintCow = new Cow();
        saintCow.eat();
        Duck duckLeader = new Duck("Evilfearmurderking", "Gold", true, 45);
        Duck duckShuga = new Duck("Sweety", "Pink", true, 7);
        duckLeader.talk();
        System.out.println("duckLeader.clone() = " + duckLeader.clone());
        duckLeader.fly();
        duckLeader.swim();
        System.out.println("duckLeader.breathHold() = " + duckLeader.breathHold());
        duckShuga.fly();
        duckShuga.swim();
        System.out.println("duckShuga.breathHold() = " + duckShuga.breathHold());
    }
}

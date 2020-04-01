package oop;

public class WorkWithObject {
    public static void main(String[] args)throws CloneNotSupportedException {
        Object obj = new Object();
        System.out.println("obj.getString() = " + obj.toString());
        System.out.println("obj.getClass() = " + obj.getClass());
        obj.equals(new Object());
        Duck duck = new Duck ("Alpha", "Red", true, 6 );
        duck.clone();
    }
}

package oop;

public interface Flyable {
     void fly();
     default void runningJump(){
         System.out.println("Ready! Study! Go!");
     }
}

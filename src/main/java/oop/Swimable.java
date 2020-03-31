package oop;

public interface Swimable {
    void swim();
    int breathHold();
    default boolean isDrown(){
        System.out.println("The crawfish will take care of him");
        return true;
    }
}

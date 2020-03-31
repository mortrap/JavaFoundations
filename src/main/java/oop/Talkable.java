package oop;

public interface Talkable {
    void talk();

    default boolean silence() {
        return true;
    }
}

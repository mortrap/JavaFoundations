package oop;

public class Cow implements Talkable, Eatable {
    @Override
    public void talk() {
        System.out.println("Muuu");
    }

    @Override
    public void eat() {
        System.out.println("Tasty, Omnomnom");
    }
}

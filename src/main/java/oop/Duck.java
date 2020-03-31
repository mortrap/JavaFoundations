package oop;

public class Duck implements Flyable, Talkable, Cloneable, Swimable {
    private String name;
    private String color;
    private boolean isDrake;
    private double weight;

    public Duck(String name, String color, boolean isDrake, double weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.isDrake = isDrake;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getIsDrake() {
        return isDrake;
    }

    public void setIsDrake(boolean isDrake) {
        this.isDrake = isDrake;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Duck duck = (Duck) o;

        if (isDrake != duck.isDrake) return false;
        if (Double.compare(duck.weight, weight) != 0) return false;
        if (name != null ? !name.equals(duck.name) : duck.name != null) return false;// тернарный if
        return color != null ? color.equals(duck.color) : duck.color == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return getName();
    }

    @Override
    public void fly() {
        runningJump();
        System.out.println("Follow the Leader, Ducks");
    }

    @Override
    public void talk() {
        System.out.println("Krya!");
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public void swim() {
        if (this.weight < 10 || this.name.equals("Evilfearmurderking")) {
            System.out.println("I'm a great swimmer!!");
            if (this.name.equals("Evilfearmurderking")) {
                System.out.println("Follow the Leader");
            }
        } else {
            isDrown();
        }
    }

    @Override
    public int breathHold() {
        if (this.name.equals("Evilfearmurderking")) {
            return 100;
        } else if (!isDrown()&&this.weight > 8) {
            return 5;
        } else {
            isDrown();
            return 0;
        }
    }
}

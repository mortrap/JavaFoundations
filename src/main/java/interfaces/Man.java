package interfaces;

public class Man implements Comparable<Man> {
    private String name;
    private int age;

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Man o) {
        if (!this.name.equals(o.name)) {
            return this.name.compareTo(o.name);
        } else {
            return this.age - o.age;
        }
    }


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                '}';
    }
}
